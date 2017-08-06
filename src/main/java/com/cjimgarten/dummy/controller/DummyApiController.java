package com.cjimgarten.dummy.controller;

import com.cjimgarten.dummy.model.Dummy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chris on 8/3/17.
 */
@RestController
@RequestMapping(value = "dummy")
public class DummyApiController {

    @RequestMapping(value = "")
    public Dummy index() {
        return new Dummy();
    }
}
