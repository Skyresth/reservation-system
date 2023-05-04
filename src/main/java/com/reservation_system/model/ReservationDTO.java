package com.reservation_system.model;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ReservationDTO {

    private Long id;

    @NotNull
    private LocalDate reservationDate;

    @NotNull
    private LocalDateTime initialDate;

    @NotNull
    private LocalDateTime finalDate;

    @NotNull
    private Long user;

}
