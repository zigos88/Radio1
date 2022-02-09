package ru.netology.domain;

public class Radio {
    private int currentVolume;
    private int currentStation;

    public void setCurrentStation(int newStation) {
        int minStation = 0;
        int maxStation = 9;
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
        int maxStation = 9;
        int minStation = 0;
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        int maxStation = 9;
        int minStation = 0;
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void setCurrentVolume(int newVolume) {
        int minVolume = 0;
        int maxVolume = 10;
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
        int maxVolume = 10;
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        int minVolume = 0;
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }
}
