package com.onejava.controllers;

import com.onejava.dtos.GuestDto;
import com.onejava.repositories.models.Filter;
import com.onejava.services.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<GuestDto> getAllGuests() {
        return guestService.readAllGuests();
    }

    @GetMapping("/{id}")
    public GuestDto getAGuest(@PathVariable @Min(1) Long id) {
        return guestService.readGuest(id);
    }

    @PostMapping("/filter")
    public List<GuestDto> filterGuests(@RequestBody List<Filter> filters) {
        return guestService.filterGuests(filters);
    }

}
