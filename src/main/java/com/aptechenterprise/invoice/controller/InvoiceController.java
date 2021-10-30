package com.aptechenterprise.invoice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/aptechenterprise/v1")
public class InvoiceController {

    @GetMapping("/invoice")
    public String getInvoicePage() {
        return "index";
    }

}
