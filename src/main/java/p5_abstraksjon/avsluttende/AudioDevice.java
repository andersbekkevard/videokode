package p5_abstraksjon.avsluttende;

/**
 * Abstract base class representing an audio device that can play sound.
 * 
 * This class provides a common foundation for all audio devices by managing
 * shared properties like model name and volume. Concrete subclasses must
 * implement device-specific behavior for maximum volume and sound playback.
 * 
 * This class demonstrates abstraction by defining what all audio devices
 * can do while letting each device type handle the details differently.
 */
public abstract class AudioDevice {

    protected String modelName;
    protected int volume;

    /**
     * Creates a new audio device with the given model name.
     * 
     * The volume starts at 0 by default. You need to initialize the
     * modelName field with the provided parameter.
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
     * 
     * The volume must be within the valid range for this device type.
     * If you try to set a volume outside the range [0, getMaxVolume()],
     * it should throw an IllegalArgumentException.
     * 
     * @param volume the new volume level to set
     * @throws IllegalArgumentException if volume is outside the valid range
     */
    public void setVolume(int volume) {
        // TODO: Validate volume is within range [0, getMaxVolume()] and set volume
    }

    /**
     * Gets the maximum volume level supported by this audio device.
     * 
     * Different types of audio devices have different maximum volume levels.
     * This method must be implemented by concrete subclasses to return
     * the appropriate maximum for their device type.
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
     * 
     * The specific behavior depends on the type of audio device.
     * This method must be implemented by concrete subclasses to show
     * how their device type plays sound.
     * 
     * @param track the name or path of the track to play
     */
    public abstract void playSound(String track);
}