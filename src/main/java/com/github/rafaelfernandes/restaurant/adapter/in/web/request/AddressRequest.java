package com.github.rafaelfernandes.restaurant.adapter.in.web.request;

import com.github.rafaelfernandes.common.enums.State;
import io.swagger.v3.oas.annotations.media.Schema;

public record AddressRequest(

        @Schema(minimum = "10", maximum = "150")
        String street,

        @Schema(minProperties = 1)
        Integer number,

        @Schema(nullable = true, maximum = "150")
        String addittionalDetails,

        @Schema(minimum = "3", maximum = "30")
        String neighborhood,

        @Schema(minimum = "3", maximum = "60")
        String city,

        @Schema(implementation = State.class)
        String state
) {
}
