package com.marufotomasyon.marketing_app.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

        @GetMapping("/ping")
        public String ping() {
            return "TEK PARCAAA TEK PARCA GERCEEEK";
        }

}


