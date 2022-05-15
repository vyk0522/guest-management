package com.onejava.services;

import com.onejava.dtos.GuestDto;
import com.onejava.repositories.models.Filter;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface GuestService {
    List<GuestDto> readAllGuests();

    GuestDto readGuest(Long id);

    List<GuestDto> filterGuests(List<Filter> filters);
}
