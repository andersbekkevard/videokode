package p5_abstraksjon.avsluttende;

import java.util.List;

/**
 * An audio engineer is responsible for preparing the studio for a recording
 * session.
 * 
 * The engineer needs to:
 *
 * - Test all audio devices
 * - Set the volume of the speakers
 * - Charge the wireless devices (if needed)
 * 
 * Requirements:
 * 
 * - All devices must have < 80% battery
 * - Headsets shall have 7 in volume
 * - Speakers shall have 10 in volume
 */
public class AudioEngineer {

    private static final String TEST_SOUND = "sound.mp3";

    /**
     * Prepares the studio for a recording session by setting up all audio devices.
     * This method coordinates the entire preparation process including charging
     * wireless devices, setting volume levels for speakers and headsets, and
     * performing audio tests on all devices.
     * 
     * The method handles different types of audio devices appropriately:
     * - Wireless devices are charged
     * - Speakers have their volume levels configured
     * - Headsets have their volume levels configured
     * - All devices are tested for proper functionality
     * 
     * @param devices list of audio devices to prepare for the studio session
     */
    public void prepareStudio(List<AudioDevice> devices) {
        // TODO: Implement studio preparation process following the exact format above
    }

    /**
     * Tests all audio devices by playing a test sound on each device.
     * This method demonstrates polymorphism by working with AudioDevice
     * abstractions without needing to know the specific device types.
     * 
     * @param devices list of audio devices to test
     */
    public void testAudioDevices(List<AudioDevice> devices) {
        // TODO: Test each device by calling playSound with TEST_SOUND
    }

    /**
     * Main method to demonstrate the audio engineer functionality.
     * Creates sample devices and runs a complete studio preparation.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        AudioEngineer engineer = new AudioEngineer();
        // engineer.prepareStudio(List.of(
        // new Headset("Sony WH-1000XM5"),
        // new Headset("AirPods Max"),
        // new Speaker("Genelec 8030C"),
        // new Speaker("KRK Rokit 5")));
    }
}