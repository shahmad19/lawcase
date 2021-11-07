package com.lawcase.app.controllers;

import com.lawcase.app.model.Payment;
import com.lawcase.app.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping("/savepayment")
    private void savePayment(@RequestBody Payment profile)
    {
        paymentService.savePayment(profile);
    }

    @GetMapping("/getpayments")
    private List<Payment> getCases(){
        List<Payment> allPayment = paymentService.getAllPayment();
        return allPayment;
    }
}
