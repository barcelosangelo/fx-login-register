package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.Bootcamp;
import org.academiadecodigo.bootcamp.model.CodeCadet;
import org.academiadecodigo.bootcamp.model.User;

import java.util.HashMap;
import java.util.Map;

public class MockBootCampService implements BootCampService{

    private Map<Integer, Bootcamp>  bootcamps;

    public MockBootCampService() {
        this.bootcamps= new HashMap<>();
    }


    @Override
    public Bootcamp findById(int id) {

        return null;
    }

    @Override
    public void addBootcamp(Bootcamp bootcamp) {
        if(!bootcamps.containsKey(bootcamp.getId())){
            bootcamps.put(bootcamp.getId(),bootcamp);
        }

    }



    @Override
    public void addCodeCadet(CodeCadet codeCadet, int id) {
        Bootcamp bootcamp = (bootcamps.get(id));
        bootcamp.addCadet(codeCadet);
        }




    @Override
    public void findCodeCadet(CodeCadet codeCadet) {

    }


}
