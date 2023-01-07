package org.example;

import org.junit.Test;
import static org.junit.Assert.*;


public class TrainTest {

    @Test
    public void shouldAnswerWithTrue (){

        City city = new City("City",1);
        Transport train = new Train("1","Train", true, 1,1,1,1);

        assertEquals(1,train.getPrice(city),0);

    }

}
