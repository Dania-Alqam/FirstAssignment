package com.example.firstassignment.model;

import java.util.ArrayList;
import java.util.List;

public class DA implements Interface{
    ArrayList<String> gender=new ArrayList<>();
    ArrayList<nutritionst> nn=new ArrayList<>();
    ArrayList<gym> gym=new ArrayList<>();

    public DA() {
        gender.add("male");
        gender.add("female");
        nn.add(new nutritionst("Mahdi tariq"));
        gym.add(new gym("Fitness Complex"));
        nn.add(new nutritionst("Haneen Altaweel"));
        nn.add(new nutritionst("Duaa Nakhleh"));
        gym.add(new gym("Z club"));
        gym.add(new gym("Golden gym"));

    }

    @Override
    public List<String> getGender() {
        return gender;
    }

    @Override
    public List<nutritionst> getAll() {
        return nn;
    }

    @Override
    public List<gym> getGym() {
        return gym;
    }


}
