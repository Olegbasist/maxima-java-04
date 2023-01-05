package org.example;

// TODO: 10.09.2022 Описать класс Train, потомок класса Transport из модуля 2.
// TODO: 10.09.2022 Описать свойства String id, int carriageCount, boolean isExpress.

import org.example.Transport;

public class Train extends Transport {

    private String id;
    private int carriageCount;
    private boolean isExpress;

    public Train(String id, String name, boolean isExpress, int capacity, int carriageCount, int speed, float costOfKm) {
        super(name, capacity, speed, costOfKm);
        this.id = id;
        this.isExpress = isExpress;
        this.carriageCount = carriageCount;

    }



    @Override
    public float getPrice(City city) {
        return this.getCostOfKm() * (float)city.getDistanceKm();
    }


}
