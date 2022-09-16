import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/nextStation.csv")
    public void nextTest(int amountStation, int setStat, int actual) {
        Radio radio = new Radio(amountStation);
        radio.setStation(setStat);
        radio.next();
        int expected = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/prevStation.csv")
    public void prevTest(int amountStation, int setStat, int actual) {
        Radio radio = new Radio(amountStation);
        radio.setStation(setStat);
        radio.prev();
        int expected = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/increaseVolume.csv")
    public void increaseVolumeTest(int setVol, int actual) {
        Radio radio = new Radio();
        radio.setVolume(setVol);
        radio.increaseVolume();
        int expected = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/downVolume.csv")
    public void downVolumeTest(int setVol, int actual) {
        Radio radio = new Radio();
        radio.setVolume(setVol);
        radio.downVolume();
        int expected = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}