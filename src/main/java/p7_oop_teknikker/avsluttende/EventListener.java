package p7_oop_teknikker.avsluttende;

/**
 * Interface for listening to events in a smart home system.
 * 
 * This interface demonstrates the Observer pattern from p7_oop_teknikker:
 * - Observer pattern implementation
 * - Event-driven programming
 * - Loose coupling between components
 * 
 * Implementing classes should respond to different types of events
 * in the smart home system.
 * 
 * @see SmartHomeSystem
 * @see SecuritySystem
 * @see EnergyMonitor
 */
public interface EventListener {

    /**
     * Called when a device's status changes in the smart home system.
     * This demonstrates the observer pattern where listeners are notified
     * of state changes in the observed object.
     *
     * @param deviceId the ID of the device that changed
     * @param deviceType the type of device (e.g., "LIGHT", "SENSOR", "THERMOSTAT")
     * @param oldStatus the previous status of the device
     * @param newStatus the new status of the device
     */
    void onDeviceStatusChanged(String deviceId, String deviceType, String oldStatus, String newStatus);

    /**
     * Called when a security event occurs in the smart home system.
     * This demonstrates event-driven programming and the observer pattern.
     *
     * @param eventType the type of security event (e.g., "INTRUSION", "ALARM", "SYSTEM_ARM")
     * @param deviceId the ID of the device that triggered the event
     * @param severity the severity level of the event ("LOW", "MEDIUM", "HIGH")
     * @param message a descriptive message about the event
     */
    void onSecurityEvent(String eventType, String deviceId, String severity, String message);

    /**
     * Called when energy consumption data is updated.
     * This demonstrates how observers can receive different types of notifications.
     *
     * @param deviceId the ID of the device reporting energy usage
     * @param currentUsage the current energy usage in watts
     * @param totalUsage the total energy usage since last reset
     */
    void onEnergyUpdate(String deviceId, double currentUsage, double totalUsage);
}