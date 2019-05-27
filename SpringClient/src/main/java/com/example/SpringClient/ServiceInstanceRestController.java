package com.example.SpringClient;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceInstanceRestController {
        @Autowired
        @Lazy
        private EurekaClient eurekaClient;

        @Value("client")
        private String name;

}
