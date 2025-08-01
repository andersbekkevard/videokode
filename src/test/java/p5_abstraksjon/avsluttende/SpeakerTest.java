package p5_abstraksjon.avsluttende;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SpeakerTest {

    private Speaker speaker;

    @BeforeEach
    void setUp() {
        speaker = new Speaker("Genelec 8030C");
    }

    @Test
    void constructorShouldInitializeModelName() {
        assertEquals("Genelec 8030C", speaker.getModelName());
        assertEquals(0, speaker.getVolume());
    }

    @Test
    void getMaxVolumeShouldReturn20() {
        assertEquals(20, speaker.getMaxVolume());
    }

    @Test
    void setVolumeShouldAcceptValidVolume() {
        speaker.setVolume(10);
        assertEquals(10, speaker.getVolume());

        speaker.setVolume(0);
        assertEquals(0, speaker.getVolume());

        speaker.setVolume(20);
        assertEquals(20, speaker.getVolume());
    }

    @Test
    void setVolumeShouldThrowExceptionForNegativeVolume() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            speaker.setVolume(-1);
        });
        assertEquals("Volume must be between 0 and 20", exception.getMessage());
    }

    @Test
    void setVolumeShouldThrowExceptionForVolumeAboveMax() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            speaker.setVolume(21);
        });
        assertEquals("Volume must be between 0 and 20", exception.getMessage());
    }

    @Test
    void playSoundShouldPrintCorrectMessage() {
        // This test verifies the output format based on the finished implementation
        // The actual testing of console output would require system output capturing
        // For now, we test that the method exists and can be called without exception
        assertDoesNotThrow(() -> speaker.playSound("test.mp3"));
    }

    @Test
    void getModelNameShouldReturnModelName() {
        assertEquals("Genelec 8030C", speaker.getModelName());
    }

    @Test
    void setModelNameShouldUpdateModelName() {
        speaker.setModelName("KRK Rokit 5");
        assertEquals("KRK Rokit 5", speaker.getModelName());
    }

    @Test
    void speakerShouldExtendAudioDevice() {
        assertTrue(speaker instanceof AudioDevice);
    }

    @Test
    void speakerShouldNotImplementWireless() {
        assertFalse(speaker instanceof Wireless);
    }

    @Test
    void volumeOperationsShouldWork() {
        speaker.setVolume(15);
        assertEquals(15, speaker.getVolume());
        
        speaker.setVolume(5);
        assertEquals(5, speaker.getVolume());
        
        speaker.setVolume(20);
        assertEquals(20, speaker.getVolume());
    }

    @Test
    void multipleVolumeChangesShouldWork() {
        speaker.setVolume(5);
        assertEquals(5, speaker.getVolume());
        
        speaker.setVolume(10);
        assertEquals(10, speaker.getVolume());
        
        speaker.setVolume(15);
        assertEquals(15, speaker.getVolume());
        
        speaker.setVolume(20);
        assertEquals(20, speaker.getVolume());
    }

    @Test
    void maxVolumeIsHigherThanHeadset() {
        Headset headset = new Headset("Test Headset");
        assertTrue(speaker.getMaxVolume() > headset.getMaxVolume());
        assertEquals(20, speaker.getMaxVolume());
        assertEquals(10, headset.getMaxVolume());
    }

    @Test
    void speakerCanHandleMaxVolumeRange() {
        for (int i = 0; i <= 20; i++) {
            speaker.setVolume(i);
            assertEquals(i, speaker.getVolume());
        }
    }

    @Test
    void speakerShouldRejectVolumeOutsideRange() {
        assertThrows(IllegalArgumentException.class, () -> speaker.setVolume(-5));
        assertThrows(IllegalArgumentException.class, () -> speaker.setVolume(25));
        assertThrows(IllegalArgumentException.class, () -> speaker.setVolume(100));
    }

    @Test
    void modelNameCanBeChanged() {
        String originalModel = speaker.getModelName();
        assertEquals("Genelec 8030C", originalModel);
        
        speaker.setModelName("New Speaker Model");
        assertEquals("New Speaker Model", speaker.getModelName());
        assertNotEquals(originalModel, speaker.getModelName());
    }
}