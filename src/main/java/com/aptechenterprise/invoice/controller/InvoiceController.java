package com.aptechenterprise.invoice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InvoiceController {

    @GetMapping("/")
    public String getlandingPage() {
        return "landingPage";
    }

    @GetMapping("/aptechenterprise/v1/invoice")
    public String getInvoicePage() {
        return "index";
    }

    @GetMapping("/aptechenterprise/v1/certificate")
    public String getCertficatePage() {
        return "certificate";
    }

}
