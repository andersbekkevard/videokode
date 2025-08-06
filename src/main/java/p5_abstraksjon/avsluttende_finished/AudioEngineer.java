package p5_abstraksjon.avsluttende_finished;

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

	public void prepareStudio(List<AudioDevice> devices) {
		System.out.println("=".repeat(50));
		System.out.println("Preparing studio...");
		for (AudioDevice device : devices) {
			if (device instanceof Wireless wirelessDevice) {
				chargeWirelessDevice(wirelessDevice);
			}
			if (device instanceof Speaker speaker) {
				setSpeakerVolume(speaker);
			}
			if (device instanceof Headset headset) {
				setHeadsetVolume(headset);
			}
		}
		System.out.println("Studio prepared");
		System.out.println("=".repeat(50));
		System.out.println("\n" + "=".repeat(50));
		System.out.println("Starting audio test...");
		testAudioDevices(devices);
		System.out.println("Audio test completed");
		System.out.println("=".repeat(50));
	}

	public void testAudioDevices(List<AudioDevice> devices) {
		for (AudioDevice device : devices) {
			device.playSound(TEST_SOUND);
		}
	}

	private void chargeWirelessDevice(Wireless device) {
		int battery = device.getBatteryLevel();
		if (battery < 80) {
			device.charge(100 - battery);
		}
	}

	private void setSpeakerVolume(Speaker device) {
		device.setVolume(10);
	}

	private void setHeadsetVolume(Headset device) {
		device.setVolume(7);
	}

	public static void main(String[] args) {
		AudioEngineer engineer = new AudioEngineer();
		engineer.prepareStudio(List.of(
				new Headset("Sony WH-1000XM5"),
				new Headset("AirPods Max"),
				new Speaker("Genelec 8030C"),
				new Speaker("KRK Rokit 5")));
	}
}

/**
 * Rekkefølge
 * 
 * - AudioDevice
 * - Speaker
 * - Wireless -> Headset
 * 
 * - AudioEngineer
 * 
 */
