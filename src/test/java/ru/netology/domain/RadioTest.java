package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio rad = new Radio(10);

    @Test
    void shouldStation() {
        rad.setCurrentStation(4);
        int expected = 4;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxStation() {
        rad.setCurrentStation(30);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldMinStation() {
        rad.setCurrentStation(-25);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStation() {
        rad.setCurrentStation(6);
        rad.nextStation();
        int expected = 7;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSchaltenMax() {
        rad.setCurrentStation(9);
        rad.nextStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStation() {
        rad.setCurrentStation(8);
        rad.prevStation();
        int expected = 7;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSchaltenMin() {
        rad.setCurrentStation(0);
        rad.prevStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldVolume() {
        rad.setCurrentVolume(3);
        int expected = 3;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxVolume() {
        rad.setCurrentVolume(102);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldMinVolume() {
        rad.setCurrentVolume(-15);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldAddVolume() {
        rad.setCurrentVolume(8);
        rad.increaseVolume();
        int expected = 9;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxAddVolume() {
        rad.setCurrentVolume(100);
        rad.increaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldReduceVolume() {
        rad.setCurrentVolume(5);
        rad.decreaseVolume();
        int expected = 4;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldMinReduceVolume() {
        rad.setCurrentVolume(0);
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }
}