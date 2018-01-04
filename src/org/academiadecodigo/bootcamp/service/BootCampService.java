package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.Bootcamp;

public interface BootCampService {

    Bootcamp findById(int id);

    void addBootcamp(Bootcamp bootcamp);


}
