package org.example;

//  10.09.2022 Описать класс Train, потомок класса Transport из модуля 2.
//  10.09.2022 Описать свойства String id, int carriageCount, boolean isExpress.
//  13.10.2022 Использовать аннотации Lombok для добавления всех геттеров, сеттеров, метода toString() и конструктора со всеми аргументами

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor // Пришлось добавить пустой конструктор в Transport

public class Train extends Transport {

    // Чтобы их подхватил Lombok нужны все свойства.
    // Порядок объявления влияет на порядок в ломбочном конструкторе.
    private String id;
    private String name;
    private boolean isExpress;
    private int capacity;
    private int carriageCount;
    private int speed;
    private float costOfKm;



    // Доломбочный конструктор
    /*public Train(String id, String name, boolean isExpress, int capacity, int carriageCount, int speed, float costOfKm) {

        super(name, capacity, speed, costOfKm);
        this.id = id;
        this.isExpress = isExpress;
        this.carriageCount = carriageCount;

    }*/



    @Override
    public float getPrice(City city) {
        return this.getCostOfKm() * (float)city.getDistanceKm();
    }


}
