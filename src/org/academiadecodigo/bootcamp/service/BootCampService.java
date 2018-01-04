package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.Bootcamp;
import org.academiadecodigo.bootcamp.model.CodeCadet;

public interface BootCampService {

    Bootcamp findById(int id);

    void addBootcamp(Bootcamp bootcamp);

    void addCodeCadet(CodeCadet codeCadet);

    void findCodeCadet(CodeCadet codeCadet);




}
