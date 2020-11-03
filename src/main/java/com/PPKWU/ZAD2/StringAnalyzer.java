package com.PPKWU.ZAD2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringAnalyzer {
    @RequestMapping(path = "/analyze")
    public String Analyze(@RequestParam(value = "input", required = false)String entryText)
    {
        return "";
    }

}
