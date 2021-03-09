package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void upChannel() {
        Radio radio = new Radio(8,9);
        radio.upChannel();
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    public void downChannel() {
        Radio radio = new Radio(8, 9);
        radio.downChannel();
        assertEquals(7, radio.getCurrentChannel());
    }

    @Test
    public void upVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.upVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void downVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.downVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void upVolumeFromMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.upVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void downVolumeFromMin() {
        Radio radio = new Radio();
        radio.downVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void downChannelFromMin() {
        Radio radio = new Radio(9, 90, 0, 100, 9, 20);
        radio.downChannel();
        assertEquals(90, radio.getCurrentChannel());
    }

    @Test
    public void upChannelFromMax() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.upChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void upVolumeAsValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(250);
        radio.upVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void downVolumeAsValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(250);
        radio.downVolume();
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void upChannelFromValue() {
        Radio radio = new Radio();
        radio.setCurrentChannel(20);
        radio.upChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void downChannelFromValue() {
        Radio radio = new Radio();
        radio.setCurrentChannel(20);
        radio.downChannel();
        assertEquals(8, radio.getCurrentChannel());
    }

    @Test
    public void previousChannelFromMinus() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-20);
        radio.downChannel();
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    public void downVolumeFromMinus() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-10);
        radio.downVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}

