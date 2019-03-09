package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CropDusterTest {

    @Test
    public void testmakeNoise() {
        //Given
        CropDuster cropDuster = new CropDuster();
        String expectedResult ="Woooosh";

        //When
        String actualResult = cropDuster.makeNoise();

        //Then
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testfertilize() {
        //Given
        CropRow cropRow = new CropRow();
        boolean expectedResult = true;

        //When
        cropRow.setHasFertilized(true);
        boolean actualResult = cropRow.getHasFertilized();

        //Then
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testfly() {
    }
}