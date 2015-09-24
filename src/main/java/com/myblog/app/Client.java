package com.myblog.app;

import java.util.ArrayList;

/**
 * Created by 1 on 21.09.2015.
 */
public class Client {
    private  String clientName;

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    private final ArrayList<Pet> petList = new ArrayList<Pet>();

    public Client(final String clientName, final Pet pet){
        this.clientName = clientName;
        this.petList.add(pet);
    }

    public void addPet (final Pet pet) {
        this.petList.add(pet);
    }

    public void deletePet (final Pet pet) {
        this.petList.remove(pet);
    }

    public void deletePet (final String name) {

        for (Pet pet:petList) {
            if (pet.getName().equals(name)) petList.remove(pet);
        }
    }
    public ArrayList<Pet> getPets () {
        return petList;
    }
}
