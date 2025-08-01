package p5_abstraksjon.avsluttende;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HeadsetTest {

    private Headset headset;

    @BeforeEach
    void setUp() {
        headset = new Headset("Sony WH-1000XM5");
    }

    @Test
    void constructorShouldInitializeModelNameAndBatteryLevel() {
        assertEquals("Sony WH-1000XM5", headset.getModelName());
        assertEquals(0, headset.getBatteryLevel());
        assertEquals(0, headset.getVolume());
    }

    @Test
    void getMaxVolumeShouldReturn10() {
        assertEquals(10, headset.getMaxVolume());
    }

    @Test
    void setVolumeShouldAcceptValidVolume() {
        headset.setVolume(5);
        assertEquals(5, headset.getVolume());

        headset.setVolume(0);
        assertEquals(0, headset.getVolume());

        headset.setVolume(10);
        assertEquals(10, headset.getVolume());
    }

    @Test
    void setVolumeShouldThrowExceptionForNegativeVolume() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            headset.setVolume(-1);
        });
        assertEquals("Volume must be between 0 and 10", exception.getMessage());
    }

    @Test
    void setVolumeShouldThrowExceptionForVolumeAboveMax() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            headset.setVolume(11);
        });
        assertEquals("Volume must be between 0 and 10", exception.getMessage());
    }

    @Test
    void getBatteryLevelShouldReturnCurrentBatteryLevel() {
        assertEquals(0, headset.getBatteryLevel());
        
        headset.charge(50);
        assertEquals(50, headset.getBatteryLevel());
    }

    @Test
    void chargeShouldIncreaseBatteryLevel() {
        headset.charge(30);
        assertEquals(30, headset.getBatteryLevel());

        headset.charge(20);
        assertEquals(50, headset.getBatteryLevel());
    }

    @Test
    void chargeShouldNotExceed100Percent() {
        headset.charge(80);
        headset.charge(30);
        assertEquals(100, headset.getBatteryLevel());
    }

    @Test
    void chargeShouldCapAt100PercentExactly() {
        headset.charge(60);
        headset.charge(50);
        assertEquals(100, headset.getBatteryLevel());
    }

    @Test
    void chargeShouldThrowExceptionForNegativePercentage() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            headset.charge(-1);
        });
        assertEquals("Charge must be positive", exception.getMessage());
    }

    @Test
    void chargeShouldAcceptZeroPercentage() {
        int initialBattery = headset.getBatteryLevel();
        headset.charge(0);
        assertEquals(initialBattery, headset.getBatteryLevel());
    }

    @Test
    void playSoundShouldPrintCorrectMessage() {
        // This test verifies the output format based on the finished implementation
        // The actual testing of console output would require system output capturing
        // For now, we test that the method exists and can be called without exception
        assertDoesNotThrow(() -> headset.playSound("test.mp3"));
    }

    @Test
    void getModelNameShouldReturnModelName() {
        assertEquals("Sony WH-1000XM5", headset.getModelName());
    }

    @Test
    void setModelNameShouldUpdateModelName() {
        headset.setModelName("AirPods Max");
        assertEquals("AirPods Max", headset.getModelName());
    }

    @Test
    void headsetShouldImplementWirelessInterface() {
        assertTrue(headset instanceof Wireless);
    }

    @Test
    void headsetShouldExtendAudioDevice() {
        assertTrue(headset instanceof AudioDevice);
    }

    @Test
    void multipleBatteryOperationsShouldWork() {
        headset.charge(25);
        assertEquals(25, headset.getBatteryLevel());
        
        headset.charge(25);
        assertEquals(50, headset.getBatteryLevel());
        
        headset.charge(60);
        assertEquals(100, headset.getBatteryLevel());
    }

    @Test
    void volumeAndBatteryOperationsShouldBeIndependent() {
        headset.setVolume(7);
        headset.charge(80);
        
        assertEquals(7, headset.getVolume());
        assertEquals(80, headset.getBatteryLevel());
        
        headset.setVolume(3);
        assertEquals(3, headset.getVolume());
        assertEquals(80, headset.getBatteryLevel());
    }
}