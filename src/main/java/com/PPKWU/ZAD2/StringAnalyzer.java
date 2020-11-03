package com.PPKWU.ZAD2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringAnalyzer {
    @RequestMapping(path = "/analyze")
    public String Analyze(String entryText)
    {
        return "";
    }

}
