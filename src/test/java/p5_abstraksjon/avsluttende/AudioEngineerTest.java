package p5_abstraksjon.avsluttende;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

class AudioEngineerTest {

    private AudioEngineer engineer;
    private ByteArrayOutputStream outputStream;
    private PrintStream originalOut;

    @BeforeEach
    void setUp() {
        engineer = new AudioEngineer();
        // Capture System.out for testing console output
        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void tearDown() {
        // Restore original System.out
        System.setOut(originalOut);
    }

    @Test
    void testAudioDevicesShouldCallPlaySoundOnAllDevices() {
        Headset headset = new Headset("Test Headset");
        Speaker speaker = new Speaker("Test Speaker");
        List<AudioDevice> devices = Arrays.asList(headset, speaker);

        engineer.testAudioDevices(devices);

        String output = outputStream.toString();
        assertTrue(output.contains("Playing sound sound.mp3 on the headset Test Headset"));
        assertTrue(output.contains("Playing sound sound.mp3 on the speakerTest Speaker"));
    }

    @Test
    void prepareStudioShouldChargeWirelessDevicesBelow80Percent() {
        Headset headset1 = new Headset("Headset1");
        Headset headset2 = new Headset("Headset2");
        
        // Set battery levels below 80%
        headset1.charge(50); // 50% battery
        headset2.charge(70); // 70% battery
        
        Speaker speaker = new Speaker("Speaker1");
        List<AudioDevice> devices = Arrays.asList(headset1, headset2, speaker);

        engineer.prepareStudio(devices);

        // After preparation, wireless devices should be at 100%
        assertEquals(100, headset1.getBatteryLevel());
        assertEquals(100, headset2.getBatteryLevel());
    }

    @Test
    void prepareStudioShouldNotChargeWirelessDevicesAbove80Percent() {
        Headset headset = new Headset("Test Headset");
        headset.charge(85); // 85% battery
        
        List<AudioDevice> devices = Arrays.asList(headset);

        engineer.prepareStudio(devices);

        // Battery should remain unchanged
        assertEquals(85, headset.getBatteryLevel());
    }

    @Test
    void prepareStudioShouldSetSpeakerVolumeToTen() {
        Speaker speaker = new Speaker("Test Speaker");
        List<AudioDevice> devices = Arrays.asList(speaker);

        engineer.prepareStudio(devices);

        assertEquals(10, speaker.getVolume());
    }

    @Test
    void prepareStudioShouldSetHeadsetVolumeToSeven() {
        Headset headset = new Headset("Test Headset");
        List<AudioDevice> devices = Arrays.asList(headset);

        engineer.prepareStudio(devices);

        assertEquals(7, headset.getVolume());
    }

    @Test
    void prepareStudioShouldPrintCorrectFormatting() {
        Headset headset = new Headset("Test Headset");
        Speaker speaker = new Speaker("Test Speaker");
        List<AudioDevice> devices = Arrays.asList(headset, speaker);

        engineer.prepareStudio(devices);

        String output = outputStream.toString();
        
        // Check for the expected formatting
        assertTrue(output.contains("=================================================="));
        assertTrue(output.contains("Preparing studio..."));
        assertTrue(output.contains("Studio prepared"));
        assertTrue(output.contains("Starting audio test..."));
        assertTrue(output.contains("Audio test completed"));
    }

    @Test
    void prepareStudioShouldHandleMixedDeviceTypes() {
        Headset headset1 = new Headset("Headset1");
        Headset headset2 = new Headset("Headset2");
        Speaker speaker1 = new Speaker("Speaker1");
        Speaker speaker2 = new Speaker("Speaker2");
        
        // Set some initial battery levels
        headset1.charge(30);
        headset2.charge(90); // This one shouldn't be charged
        
        List<AudioDevice> devices = Arrays.asList(headset1, headset2, speaker1, speaker2);

        engineer.prepareStudio(devices);

        // Check wireless devices
        assertEquals(100, headset1.getBatteryLevel()); // Should be charged
        assertEquals(90, headset2.getBatteryLevel());  // Should not be charged
        
        // Check volumes
        assertEquals(7, headset1.getVolume());
        assertEquals(7, headset2.getVolume());
        assertEquals(10, speaker1.getVolume());
        assertEquals(10, speaker2.getVolume());
    }

    @Test
    void prepareStudioShouldHandleEmptyList() {
        List<AudioDevice> devices = Arrays.asList();

        assertDoesNotThrow(() -> engineer.prepareStudio(devices));

        String output = outputStream.toString();
        assertTrue(output.contains("Preparing studio..."));
        assertTrue(output.contains("Studio prepared"));
        assertTrue(output.contains("Starting audio test..."));
        assertTrue(output.contains("Audio test completed"));
    }

    @Test
    void testAudioDevicesShouldHandleEmptyList() {
        List<AudioDevice> devices = Arrays.asList();

        assertDoesNotThrow(() -> engineer.testAudioDevices(devices));
    }

    @Test
    void prepareStudioShouldCallTestAudioDevices() {
        Headset headset = new Headset("Test Headset");
        List<AudioDevice> devices = Arrays.asList(headset);

        engineer.prepareStudio(devices);

        String output = outputStream.toString();
        // The output should contain the test sound being played
        assertTrue(output.contains("Playing sound sound.mp3"));
    }

    @Test
    void prepareStudioWithExactMainMethodDevices() {
        // Test with the exact devices from the main method
        Headset headset1 = new Headset("Sony WH-1000XM5");
        Headset headset2 = new Headset("AirPods Max");
        Speaker speaker1 = new Speaker("Genelec 8030C");
        Speaker speaker2 = new Speaker("KRK Rokit 5");
        
        List<AudioDevice> devices = Arrays.asList(headset1, headset2, speaker1, speaker2);

        assertDoesNotThrow(() -> engineer.prepareStudio(devices));

        // Verify all volumes are set correctly
        assertEquals(7, headset1.getVolume());
        assertEquals(7, headset2.getVolume());
        assertEquals(10, speaker1.getVolume());
        assertEquals(10, speaker2.getVolume());

        // Verify all wireless devices are fully charged
        assertEquals(100, headset1.getBatteryLevel());
        assertEquals(100, headset2.getBatteryLevel());
    }

    @Test
    void prepareStudioShouldHandleDevicesAtExactly80PercentBattery() {
        Headset headset = new Headset("Test Headset");
        headset.charge(80); // Exactly 80%
        
        List<AudioDevice> devices = Arrays.asList(headset);

        engineer.prepareStudio(devices);

        // Device at exactly 80% should not be charged
        assertEquals(80, headset.getBatteryLevel());
    }

    @Test
    void prepareStudioShouldChargeDevicesAtExactly79PercentBattery() {
        Headset headset = new Headset("Test Headset");
        headset.charge(79); // Just below 80%
        
        List<AudioDevice> devices = Arrays.asList(headset);

        engineer.prepareStudio(devices);

        // Device below 80% should be charged to 100%
        assertEquals(100, headset.getBatteryLevel());
    }
}