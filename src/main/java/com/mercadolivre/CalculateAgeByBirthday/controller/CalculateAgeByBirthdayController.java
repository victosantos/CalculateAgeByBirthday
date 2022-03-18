package com.mercadolivre.CalculateAgeByBirthday.controller;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Period;

@RestController
public class CalculateAgeByBirthdayController {
    @GetMapping("/{day}/{mounth}/{year}")
    public int CalculateAgeByBirthday(@PathVariable int day,@PathVariable int mounth,@PathVariable int year){
        return CalculateAgeByBirthdayController.getAge(day,mounth,year);
    }

    public static int getAge(int day, int mounth, int year){
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, mounth, day);
        return Period.between(birthday, today).getYears();
    }
}
