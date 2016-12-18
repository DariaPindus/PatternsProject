package com.daria.university.kursovaya.members;

public class Site {
    private static Site instance;

    private Site(){}

    public static Site getInstance(){
        if (instance == null)
            instance = new Site();
        return instance;
    }


}
