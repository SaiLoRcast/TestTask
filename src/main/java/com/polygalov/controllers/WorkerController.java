package com.polygalov.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import com.polygalov.service.AppService;
import com.polygalov.model.Worker;

import java.util.List;

@Controller
public class WorkerController {
    static Logger log = Logger.getLogger(WorkerController.class);

    @Autowired
    private AppService appService;

    @RequestMapping(value = {"/listAll", "/"}, method = RequestMethod.GET)
    public String populateCountryTable(ModelMap model) {
        List<Worker> allWorkers =  appService.getAllCountries();
        System.out.println("in WorkerController getAllWorkers().size = " + allWorkers.size());
        log.debug("in WorkerController.getAllWorkers().size = " + allWorkers.size() );
        model.addAttribute("workers", allWorkers);
        return "workerList";
    }

}