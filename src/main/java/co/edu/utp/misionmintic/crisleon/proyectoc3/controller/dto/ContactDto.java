package co.edu.utp.misionmintic.crisleon.proyectoc3.controller.dto;

import lombok.Data;

@Data
public class ContactDto {
    private String name;
    private String email;
    private String subject;
    private String message;
    private String country;
}
