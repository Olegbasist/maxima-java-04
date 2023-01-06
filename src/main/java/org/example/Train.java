package org.example;

//  10.09.2022 Описать класс Train, потомок класса Transport из модуля 2.
//  10.09.2022 Описать свойства String id, int carriageCount, boolean isExpress.
// TODO: 13.10.2022 Использовать аннотации Lombok для добавления всех геттеров, сеттеров, метода toString() и конструктора со всеми аргументами

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Train extends Transport {

    private String id;
    private int carriageCount;
    private boolean isExpress;

    // Остальные свойства пришлось добавить, чтобы их подцепил Lombok
    private String name;
    private int capacity;
    private int speed;
    private float costOfKm;


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
