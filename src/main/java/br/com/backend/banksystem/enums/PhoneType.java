package br.com.backend.banksystem.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {
    MOBILE("Celular"),
    RESIDENTIAL("Residencial");
    private final String Description;
}
