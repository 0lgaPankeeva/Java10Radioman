package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void setCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);

        int actual = radio.getCurrentStation();
        int expected = 7;

        assertEquals(expected, actual);
    }



    @Test
    public void increaseVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);


        int actual = radio.getCurrentVolume();
        int expected = 100;

        assertEquals(expected, actual);

    }



    @Test
    public void increaseVolume5() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }


    @Test
    public void setCurrentVolume () {
        Radio radio = new Radio();

        radio.setCurrentVolume(3);

        int actual = radio.getCurrentVolume();
        int expected = 3;

        assertEquals(expected, actual);

    }
}

