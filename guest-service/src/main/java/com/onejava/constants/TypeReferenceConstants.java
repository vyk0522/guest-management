package com.onejava.constants;

import com.fasterxml.jackson.core.type.TypeReference;
import com.onejava.dtos.GuestDto;

import java.util.List;

public final class TypeReferenceConstants {
    public static final TypeReference<List<GuestDto>> LIST_OF_GUEST_DTO_TYPE_REFERENCE = new TypeReference<>() {};
}
