package com.accenture.restservice.service;

import com.accenture.restservice.DTO.UserDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class RestServiceUsr {
    RestTemplate restTemplate=new RestTemplate();

    @GetMapping("/findall")
    public List<UserDTO> findAllUsers(){
        UserDTO[]o=restTemplate.getForObject("http://localhost:8080/findall",UserDTO[].class);
       return Arrays.asList(o);
    }
}
