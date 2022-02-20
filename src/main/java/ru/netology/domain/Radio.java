package ru.netology;

public class Radio {
    private int currentVolume;
    private int currentStation;
    private int countStation = 10; //количество радиостанций
    private int minStation = 0;
    private int maxStation = countStation-1;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int countStation) {
        this.countStation = countStation;
        this.maxStation = countStation-1;
    }

    public Radio() {
    }

    public void setCurrentStation(int newStation) {
        if (newStation < minStation) {
            return;
        }
        if (newStation > maxStation) {
            return;
        }
        currentStation = newStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        currentVolume = newVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }
}