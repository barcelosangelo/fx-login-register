package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.Bootcamp;
import org.academiadecodigo.bootcamp.model.CodeCadet;

import java.util.Map;

public class MockBootCampService implements BootCampService{

    private Map<Integer, Bootcamp>  id;


    @Override
    public Bootcamp findById(int id) {
        return null;
    }

    @Override
    public void addBootcamp(Bootcamp bootcamp) {

    }

    @Override
    public void addCodeCadet(CodeCadet codeCadet) {

    }

    @Override
    public void finCodeCadet(CodeCadet codeCadet) {

    }
}
