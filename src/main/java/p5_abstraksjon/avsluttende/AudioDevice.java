package p5_abstraksjon.avsluttende;

/**
 * Abstract base class representing an audio device that can play sound.
 * This class demonstrates the concept of abstraction by providing a common
 * interface for all audio devices while allowing concrete implementations
 * to define device-specific behavior.
 * 
 * The AudioDevice class manages common properties like model name and volume,
 * while concrete subclasses must implement device-specific methods like
 * getMaxVolume() and playSound().
 * 
 * This class is extended by concrete audio device classes such as Speaker
 * and Headset, which provide their own implementations of the abstract methods.
 */
public abstract class AudioDevice {

    protected String modelName;
    protected int volume;

    /**
     * Constructs a new AudioDevice with the specified model name.
     * The volume is initialized to 0 by default.
     * 
     * @param modelName the name/model of the audio device, must not be null
     */
    public AudioDevice(String modelName) {
        // TODO: Initialize the audio device with the given model name
    }

    /**
     * Gets the current volume level of this audio device.
     * 
     * @return the current volume level, between 0 and getMaxVolume()
     */
    public int getVolume() {
        // TODO: Return the current volume level
        return 0;
    }

    /**
     * Sets the volume level of this audio device.
     * The volume must be within the valid range for this device type.
     * 
     * Functional requirements:
     * - Volume must be between 0 (inclusive) and getMaxVolume() (inclusive)
     * if not, throw an IllegalArgumentException
     * 
     * @param volume the new volume level to set
     * @throws IllegalArgumentException if volume is outside the valid range
     */
    public void setVolume(int volume) {
        // TODO: Validate volume is within range [0, getMaxVolume()] and set volume
    }

    /**
     * Gets the maximum volume level supported by this audio device.
     * Different types of audio devices have different maximum volume levels.
     * This method must be implemented by concrete subclasses.
     * 
     * @return the maximum volume level for this device type
     */
    public abstract int getMaxVolume();

    /**
     * Gets the model name of this audio device.
     * 
     * @return the model name of this device
     */
    public String getModelName() {
        // TODO: Return the model name
        return null;
    }

    /**
     * Sets the model name of this audio device.
     * 
     * @param modelName the new model name to set
     */
    public void setModelName(String modelName) {
        // TODO: Set the modelName field to the new value
    }

    /**
     * Plays a sound track on this audio device.
     * The specific behavior depends on the type of audio device.
     * This method must be implemented by concrete subclasses.
     * 
     * @param track the name/path of the track to play
     */
    public abstract void playSound(String track);
}