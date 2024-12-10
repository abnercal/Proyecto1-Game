package com.example.game_service_api.commons.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ErrorResponse {
    private Integer codeStatus;
    private String message;
}
