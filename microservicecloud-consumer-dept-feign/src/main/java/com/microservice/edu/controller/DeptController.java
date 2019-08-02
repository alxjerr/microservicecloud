package com.microservice.edu.controller;

import com.microservice.edu.entities.Dept;
import com.microservice.edu.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping
public class DeptController implements DeptClientService {

    private final DeptClientService deptClientService;

    @Autowired
    public DeptController(DeptClientService deptClientService) {
        this.deptClientService = deptClientService;
    }

    @Override
    public Dept get(long id) {
        return deptClientService.get(id);
    }

    @Override
    public List<Dept> list() {
        return deptClientService.list();
    }

    @Override
    public boolean add(Dept dept) {
        return deptClientService.add(dept);
    }
}
