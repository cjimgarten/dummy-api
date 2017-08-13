package com.cjimgarten.dummy.controller;

import com.cjimgarten.dummy.model.data.DummyDao;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by chris on 8/3/17.
 */
@RestController
@RequestMapping(value = "dummy")
public class DummyApiController {

    @Autowired
    private DummyDao dao;

    @RequestMapping(value = "findAll", method = RequestMethod.GET)
    public Object findAll() {
        return dao.findAll();
    }

    @RequestMapping(value = "findById/{id}", method = RequestMethod.GET)
    public Object findByIdPathVariable(@PathVariable int id) {
        return dao.findOne(id);
    }

    @RequestMapping(value = "findByIdRequest", method = RequestMethod.GET)
    public Object findByIdRequest(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        return dao.findOne(id);
    }

    @RequestMapping(value = "findByIdParam", method = RequestMethod.GET)
    public Object findByIdParam(@RequestParam(value = "id") int id) {
        return dao.findOne(id);
    }
}
