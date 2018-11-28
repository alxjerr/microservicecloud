package com.microservice.edu.service;

public interface DeptService {


    public boolean add(Dept dept);
    public Dept    get(Long id);
    public List<Dept> list();


}
