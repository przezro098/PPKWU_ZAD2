package com.PPKWU.ZAD2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringAnalyzer {
    @RequestMapping(path = "/analyze")
    public String Analyze(@RequestParam(value = "input", required = false)String entryText)
    {
        int upperCase=0, lowerCase=0, digits=0, specialChar=0;
        for (int i = 0; i < entryText.length(); i++) {

            if (Character.isUpperCase(entryText.charAt(i)))
                upperCase++;
            if (Character.isLowerCase(entryText.charAt(i)))
                lowerCase++;
            if (Character.isDigit(entryText.charAt(i)))
                digits++;
            if(!Character.isLetterOrDigit(entryText.charAt(i)))
                specialChar++;
        }
        return "Lowercase letters : " + String.valueOf(lowerCase)
               + ", uppercase letters : " + String.valueOf(upperCase)
               + ", digits : " + String.valueOf(digits)
               + ", special characters : " + String.valueOf(specialChar);

    }

}
