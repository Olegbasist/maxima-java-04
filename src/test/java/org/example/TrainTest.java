package org.example;

import org.junit.Test;
import static org.junit.Assert.*;


public class TrainTest {

    @Test
    public void trainExistence (){

        Transport train = new Train("1","Train", true, 1,1,1,1);
        System.out.println(train);


    }

}
