package com.onejava.controllers;

import com.onejava.dtos.GuestDto;
import com.onejava.services.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;
import java.util.List;

/*
http://localhost:8081/api/v1/guests
 */
@RestController
@RequestMapping("/api/v1/guests")
public class GuestController {
    @Autowired
    public GuestService guestService;

    @GetMapping
    public List<GuestDto> getAllGuests(){
        return guestService.readAllGuests();
    }

    @GetMapping("/{id}")
    public GuestDto getAGuest(@PathVariable @Min(1) Long id){
        return guestService.readGuest(id);
    }

}
