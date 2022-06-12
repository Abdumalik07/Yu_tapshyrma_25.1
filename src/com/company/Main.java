package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Map<Car,CarInformation> carData=new HashMap();
        carData.put(new Car(1234,33423),new CarInformation(2022,"Subaru",20000,"white"));
        carData.put(new Car(2234,33423),new CarInformation(2021,"Subaru",19000,"black"));
        carData.put(new Car(3234,33423),new CarInformation(2020,"Subaru",18000,"blue"));
        carData.put(new Car(4234,33423),new CarInformation(2019,"Subaru",17000,"red"));

        for ( Map.Entry a:carData.entrySet()) {
            System.out.println(a.getKey()+" "+a.getValue());
        }
    }
}
