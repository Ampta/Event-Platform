package com.ampta.tickets.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTicketTypeRequestDto {

    @NotBlank(message = "Ticket type name is required")
    private String name;

    @NotBlank(message = "Price is required")
    @PositiveOrZero(message = "Price must be zero or greater")
    private Double price;

    private String description;

    private Integer totalAvailable;
}
