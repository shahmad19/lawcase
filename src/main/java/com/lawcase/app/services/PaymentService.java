package com.lawcase.app.services;

import com.lawcase.app.model.Payment;
import com.lawcase.app.model.Profile;
import com.lawcase.app.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public void savePayment(Payment payment){
        paymentRepository.save(payment);
    }

    public List<Payment> getAllPayment(){
        List<Payment> paymentList = new ArrayList<>();

        paymentRepository.findAll().forEach(paymentList::add);
        return paymentList;
    }


}
