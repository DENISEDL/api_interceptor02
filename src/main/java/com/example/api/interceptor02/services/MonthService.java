package com.example.api.interceptor02.services;

import com.example.api.interceptor02.entities.Month;
import com.example.api.interceptor02.repositories.MonthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MonthService {


    private ArrayList<Month> months = new ArrayList<>();


    public Month findMonthByNumber(Integer monthNumber) {
        for (Month month : months) {
            if (month.getMonthNumber().equals(monthNumber)){
                return month;
            }
        }
        return null;
    }


}
