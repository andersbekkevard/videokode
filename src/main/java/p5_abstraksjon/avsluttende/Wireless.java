package p5_abstraksjon.avsluttende;

/**
 * Interface representing wireless functionality for audio devices.
 * This interface defines the contract for devices that operate on battery power
 * and can be charged wirelessly or with cables.
 * 
 * Classes implementing this interface must provide battery management
 * functionality, including checking battery level and charging the device.
 * 
 */
public interface Wireless {

    /**
     * Gets the current battery level of this wireless device.
     * The battery level represents the percentage of charge remaining.
     * 
     * @return the current battery level as a percentage (0-100)
     */
    int getBatteryLevel();

    /**
     * Charges this wireless device by the specified percentage.
     * 
     * This method increases the battery level by the given percentage,
     * but won't let it go above 100%. If you try to charge with a
     * negative percentage, it will throw an IllegalArgumentException.
     * 
     * For example, if the battery is at 60% and you charge by 30%,
     * it will end up at 90%. If you charge by 50%, it will cap at 100%.
     * 
     * @param percentage the amount to charge as a percentage (must be positive)
     * @throws IllegalArgumentException if percentage is negative
     */
    void charge(int percentage);
}