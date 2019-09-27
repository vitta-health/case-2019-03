package com.vitta.doctorprescription.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {
    "com.vitta.doctorprescription.controller",
    "com.vitta.doctorprescription.prescription.bo"
})
public class WebConfig {
}