package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.model.Bootcamp;
import org.academiadecodigo.bootcamp.model.CodeCadet;
import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.utils.Gender;

import java.util.Date;

public class Main2 {

    public static void main(String[] args) {

        Bootcamp bootcamp = new Bootcamp(1,"Praia da Vitória",new Date(30-10-2017),new Date(6-2-2017));

        User user = new User("barcelosangelo","barcelos.angelo@gmail.com","angelo");
        CodeCadet codeCadet = new CodeCadet(user, Gender.MALE,"Praia da Vitória","Praia da Vitória","918839452",bootcamp,new Date(6-11-1977));
        User user1 = new User("diogobrandao,","brandao@gmail.com","brandao");
        CodeCadet codeCadet1 = new CodeCadet(user1,Gender.MALE,"Angra","Angra","966444999",bootcamp,new Date(10-10-1991));
        bootcamp.addCadet(codeCadet1);
        bootcamp.addCadet(codeCadet1);

        bootcamp.addCadet(codeCadet);

        System.out.println(codeCadet);
        System.out.println(codeCadet1);
        System.out.println(codeCadet1);
        System.out.println(user);
        System.out.println(user1);
    }


}
