public class Radio {
    private int station;
    private int volume;
    private int amountStation;

    public Radio() {
        this.amountStation = 30;
    }

    public Radio(int amountStation) {
        this.amountStation = amountStation - 1;
    }

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        this.station = station;
    }

    public void next() {
        if (station < amountStation) {
            station = station + 1;
        } else station = 0;
    }

    public void prev() {
        if (station > 0) {
            station = station - 1;
        } else station = amountStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public void increaseVolume() {
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void downVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}
