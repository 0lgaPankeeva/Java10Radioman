package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int MaxStation = 9;
    private int MinStation = 0;
    private int currentStation = MinStation;


    private int MaxVolume = 100;
    private int MinVolume = 0;
    private int currentVolume = MinVolume;

    public Radio(int MinStation, int MaxStation) {
        this.MinStation = MinStation;
        this.MaxStation = MaxStation;
        this.currentStation = MinStation;

    }




    public int getMaxStation() {

        return MaxStation;
    }

    public int getMinStation() {

        return MinStation;
    }

    public void next() {
        if (currentStation < MaxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > MinStation) {
            currentStation--;
        } else {
            currentStation = MaxStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < MinStation) {
            return;
        }
        if (currentStation > MaxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseVolume() {
        if (currentVolume < MaxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {

        if (currentVolume > MinVolume) {
            currentVolume = currentVolume - 1;
        }

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < MinVolume) {
            return;
        }
        if (currentVolume > MaxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

}

