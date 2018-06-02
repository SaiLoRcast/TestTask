package com.polygalov.service;

import org.springframework.transaction.annotation.Transactional;

import com.polygalov.dao.WorkerMapper;
import com.polygalov.model.Worker;

import java.util.List;

@Transactional
public class AppService {
    private WorkerMapper workerMapper;

    public void setWorkerMapper(WorkerMapper workerMapper) {
        this.workerMapper = workerMapper;
    }

     public List<Worker> getAllCountries(){
        return workerMapper.getAll();
    }
}
