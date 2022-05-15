package com.onejava.services.impl;

import com.onejava.constants.TypeReferenceConstants;
import com.onejava.dtos.GuestDto;
import com.onejava.entities.Guest;
import com.onejava.exceptions.GuestNotFoundException;
import com.onejava.modelMapper.ModelMapper;
import com.onejava.repositories.GuestRepository;
import com.onejava.repositories.models.Filter;
import com.onejava.repositories.specifications.GuestSpecification;
import com.onejava.services.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GuestServiceImpl implements GuestService {
    @Autowired
    GuestRepository guestRepository;

    @Autowired
    GuestSpecification guestSpecification;

    @Override
    public List<GuestDto> readAllGuests() {
        List<Guest> guests = this.guestRepository.findAll();
        return ModelMapper
                .convert(guests, TypeReferenceConstants.LIST_OF_GUEST_DTO_TYPE_REFERENCE);
    }

    @Override
    public GuestDto readGuest(Long id) {
        Optional<Guest> guest = this.guestRepository.findById(id);
        if (guest.isPresent()) {
            return ModelMapper.convert(guest.get(), GuestDto.class);
        }
        throw new GuestNotFoundException("Guest not found with id: " + id);
    }

    @Override
    public List<GuestDto> filterGuests(List<Filter> filters) {
        List<Guest> guests = this.guestSpecification.getFilterQueryResult(filters);
        return ModelMapper
                .convert(guests, TypeReferenceConstants.LIST_OF_GUEST_DTO_TYPE_REFERENCE);
    }

}
