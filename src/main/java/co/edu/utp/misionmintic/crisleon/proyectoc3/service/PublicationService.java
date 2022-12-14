package co.edu.utp.misionmintic.crisleon.proyectoc3.service;

import java.util.List;
import co.edu.utp.misionmintic.crisleon.proyectoc3.controller.dto.PublicationDto;

public interface PublicationService {

    List<PublicationDto> getPublications();

    List<PublicationDto> getPublicationsByCategoryId(Integer categoryId);

    void createPublication(PublicationDto publication);
    
    List<PublicationDto> getPublicationsByUserEmail(String userEmail);
    
}
