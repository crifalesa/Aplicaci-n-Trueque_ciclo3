package co.edu.utp.misionmintic.crisleon.proyectoc3.service;

import co.edu.utp.misionmintic.crisleon.proyectoc3.controller.dto.UserDto;

public interface SecurityService {  

    UserDto validateUser(String username, String password);

    void createUser(UserDto user);        
}
