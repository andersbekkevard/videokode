package p5_abstraksjon.avsluttende;

import java.util.List;

/**
 * AudioDeviceTest
 *
 * This program simulates an audio testing session in a professional music
 * studio.
 *
 * The studio has various types of audio devices - both headphones and speakers
 * - that
 * are used during recording sessions.
 * Before a session starts, we need to verify that all devices are working as
 * expected:
 *
 * - Play a test sound on all devices (e.g., "Test sound.mp3")
 * - If the device is wireless, check if it's connected
 * - Show battery level for wireless devices, and give warning for low battery
 * (< 20%)
 * - For speakers, show what volume they are set to
 *
 * The purpose is to demonstrate inheritance, abstract classes and interfaces in
 * a
 * realistic and practical context.
 */
public class Main {
	public static void main(String[] args) {
		List<AudioDevice> devices = List.of(
				new Headset("Sony WH-1000XM5"),
				new Headset("AirPods Max"),
				new Speaker("Genelec 8030C"),
				new Speaker("KRK Rokit 5"));

		String testTrack = "Test sound.mp3";
		System.out.println("Starting audio test with track: \"" + testTrack + "\"\n");

		for (AudioDevice device : devices) {
			System.out.println("Testing: " + device.getModelName());
			device.playSound(testTrack);

			if (device instanceof Wireless wirelessDevice) {
				int battery = wirelessDevice.getBatteryLevel();
				System.out.println("   - Wireless device");
				System.out.println("   - Battery level: " + battery + "%");
				if (battery < 20)
					System.out.println("   Warning: Low battery level! Consider charging.");
			}
			System.out.println("   - Volume: " + device.getVolume());

			System.out.println();
		}

		System.out.println("Audio test completed.");
	}
}
