package com.cjimgarten.dummy.controller;

import com.cjimgarten.dummy.model.data.DummyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chris on 8/3/17.
 */
@RestController
@RequestMapping(value = "dummy")
public class DummyApiController {

    @Autowired
    private DummyDao dao;

    @RequestMapping(value = "findAll")
    public Object findAll() {
        return dao.findAll();
    }

    @RequestMapping(value = "findById/{id}")
    public Object findById(@PathVariable int id) {
        return dao.findOne(id);
    }
}
