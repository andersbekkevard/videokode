package p7_oop_teknikker.avsluttende;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implement a class that manages a smart home system called SmartHomeSystem
 * 
 * The expected methods for this class and their behaviour is detailed
 * in the below JavaDoc
 * 
 * The SmartHomeSystem class must be in the package p7_oop_teknikker.avsluttende
 * 
 * This exercise focuses specifically on p7_oop_teknikker concepts:
 * - Delegation pattern (delegating specialized tasks to expert objects)
 * - Observer pattern (notifying listeners of state changes)
 * - Event-driven programming
 * - Loose coupling between components
 * - Separation of concerns
 * 
 * The SmartHomeSystem demonstrates both design patterns:
 * - DELEGATION: Complex operations are delegated to specialized components
 * - OBSERVER: Event listeners are notified when system state changes
 * 
 * @see EventListener
 * @see DeviceController
 * @see SmartHomeSystemTests
 */
public class SmartHomeSystem {

    // TODO Add any necessary private instance fields here
    // Hints: You'll need:
    // - A list of EventListener objects (for observer pattern)
    // - A DeviceController object (for delegation pattern)
    // - A map to store device information
    // - Fields to track system state

    /**
     * Constructs a SmartHomeSystem with the specified system name.
     * This should initialize all necessary components including the DeviceController.
     *
     * @param systemName the name of the smart home system, must not be null or blank
     * @throws IllegalArgumentException if systemName is null or blank
     */
    public SmartHomeSystem(String systemName) {
        // TODO Implement the constructor
        // Initialize the DeviceController (delegation pattern)
        // Initialize the list of listeners (observer pattern)
        // Initialize the device registry
    }

    /**
     * Returns the name of the smart home system.
     *
     * @return the system name
     */
    public String getSystemName() {
        // TODO Implement the method getSystemName
        return null;
    }

    /**
     * Adds an event listener to receive notifications.
     * This demonstrates the observer pattern - listeners register to be notified of events.
     *
     * @param listener the event listener to add, must not be null
     * @throws IllegalArgumentException if listener is null
     */
    public void addEventListener(EventListener listener) {
        // TODO Implement the method addEventListener
        // Add the listener to the list if not already present
    }

    /**
     * Removes an event listener from receiving notifications.
     * This demonstrates the observer pattern - listeners can unregister.
     *
     * @param listener the event listener to remove
     * @return true if the listener was removed, false if it was not found
     */
    public boolean removeEventListener(EventListener listener) {
        // TODO Implement the method removeEventListener
        return false;
    }

    /**
     * Returns the number of registered event listeners.
     *
     * @return the number of event listeners
     */
    public int getListenerCount() {
        // TODO Implement the method getListenerCount
        return 0;
    }

    /**
     * Adds a device to the smart home system.
     * This demonstrates delegation - the actual device management is delegated to DeviceController.
     *
     * @param deviceId the unique identifier for the device, must not be null or blank
     * @param deviceType the type of device (e.g., "LIGHT", "SENSOR", "THERMOSTAT"), must not be null or blank
     * @param initialStatus the initial status of the device, must not be null or blank
     * @throws IllegalArgumentException if any parameter is null or blank
     * @throws IllegalStateException if a device with the same ID already exists
     */
    public void addDevice(String deviceId, String deviceType, String initialStatus) {
        // TODO Implement the method addDevice
        // Use delegation pattern: delegate to DeviceController
        // Notify listeners of the device addition (observer pattern)
    }

    /**
     * Removes a device from the smart home system.
     * This demonstrates delegation to the DeviceController.
     *
     * @param deviceId the ID of the device to remove
     * @return true if the device was removed, false if it was not found
     */
    public boolean removeDevice(String deviceId) {
        // TODO Implement the method removeDevice
        // Use delegation pattern: delegate to DeviceController
        // Notify listeners if device was removed (observer pattern)
        return false;
    }

    /**
     * Changes the status of a device.
     * This demonstrates both delegation and observer patterns.
     *
     * @param deviceId the ID of the device to update
     * @param newStatus the new status for the device, must not be null or blank
     * @throws IllegalArgumentException if newStatus is null or blank
     * @throws IllegalStateException if device does not exist
     */
    public void updateDeviceStatus(String deviceId, String newStatus) {
        // TODO Implement the method updateDeviceStatus
        // Use delegation pattern: delegate to DeviceController
        // Use observer pattern: notify all listeners of the status change
    }

    /**
     * Gets the current status of a device.
     * This demonstrates delegation to the DeviceController.
     *
     * @param deviceId the ID of the device
     * @return the current status of the device
     * @throws IllegalStateException if device does not exist
     */
    public String getDeviceStatus(String deviceId) {
        // TODO Implement the method getDeviceStatus
        // Use delegation pattern: delegate to DeviceController
        return null;
    }

    /**
     * Gets the type of a device.
     * This demonstrates delegation to the DeviceController.
     *
     * @param deviceId the ID of the device
     * @return the type of the device
     * @throws IllegalStateException if device does not exist
     */
    public String getDeviceType(String deviceId) {
        // TODO Implement the method getDeviceType
        // Use delegation pattern: delegate to DeviceController
        return null;
    }

    /**
     * Returns a list of all device IDs in the system.
     * This demonstrates delegation to the DeviceController.
     *
     * @return a list of all device IDs
     */
    public List<String> getAllDeviceIds() {
        // TODO Implement the method getAllDeviceIds
        // Use delegation pattern: delegate to DeviceController
        return null;
    }

    /**
     * Returns the number of devices in the system.
     * This demonstrates delegation to the DeviceController.
     *
     * @return the number of devices
     */
    public int getDeviceCount() {
        // TODO Implement the method getDeviceCount
        // Use delegation pattern: delegate to DeviceController
        return 0;
    }

    /**
     * Triggers a security event in the system.
     * This demonstrates the observer pattern - all listeners are notified.
     *
     * @param eventType the type of security event, must not be null or blank
     * @param deviceId the ID of the device that triggered the event
     * @param severity the severity level ("LOW", "MEDIUM", "HIGH"), must not be null or blank
     * @param message a descriptive message, must not be null or blank
     * @throws IllegalArgumentException if any parameter is null or blank
     */
    public void triggerSecurityEvent(String eventType, String deviceId, String severity, String message) {
        // TODO Implement the method triggerSecurityEvent
        // Use observer pattern: notify all listeners of the security event
    }

    /**
     * Reports energy consumption for a device.
     * This demonstrates the observer pattern - listeners are notified of energy updates.
     *
     * @param deviceId the ID of the device reporting energy usage
     * @param currentUsage the current energy usage in watts, must be non-negative
     * @param totalUsage the total energy usage since last reset, must be non-negative
     * @throws IllegalArgumentException if usage values are negative
     * @throws IllegalStateException if device does not exist
     */
    public void reportEnergyUsage(String deviceId, double currentUsage, double totalUsage) {
        // TODO Implement the method reportEnergyUsage
        // Verify device exists using delegation to DeviceController
        // Use observer pattern: notify all listeners of energy update
    }

    /**
     * Arms the security system.
     * This demonstrates how the system can trigger events for different operations.
     *
     * @param armingMode the arming mode ("HOME", "AWAY", "NIGHT"), must not be null or blank
     * @throws IllegalArgumentException if armingMode is null or blank
     */
    public void armSecuritySystem(String armingMode) {
        // TODO Implement the method armSecuritySystem
        // Trigger a security event using the observer pattern
    }

    /**
     * Disarms the security system.
     * This demonstrates how the system can trigger events for different operations.
     */
    public void disarmSecuritySystem() {
        // TODO Implement the method disarmSecuritySystem
        // Trigger a security event using the observer pattern
    }

    /**
     * Performs a system-wide device scan.
     * This demonstrates delegation for complex operations.
     * 
     * The scan checks all devices and reports their status.
     * Any devices that are offline or in error state trigger security events.
     *
     * @return a map of device IDs to their current status
     */
    public Map<String, String> performSystemScan() {
        // TODO Implement the method performSystemScan
        // Use delegation pattern: delegate device operations to DeviceController
        // Use observer pattern: trigger events for any problematic devices
        return null;
    }

    /**
     * Shuts down the smart home system.
     * This demonstrates proper cleanup and final notifications.
     * 
     * All devices are set to "OFF" status and listeners are notified.
     */
    public void shutdown() {
        // TODO Implement the method shutdown
        // Use delegation pattern: delegate device operations to DeviceController
        // Use observer pattern: notify listeners of each device being turned off
        // Clear the listener list after notifications
    }

    /**
     * Returns a summary of the smart home system.
     * This demonstrates delegation for gathering information.
     * 
     * Format: "SmartHomeSystem[name=NAME, devices=COUNT, listeners=COUNT]"
     *
     * @return a string representation of the system
     */
    @Override
    public String toString() {
        // TODO Implement the toString method
        // Use delegation to get device count from DeviceController
        return null;
    }

    // Private helper method for notifying listeners (demonstrates encapsulation)
    
    /**
     * Private helper method to notify all listeners of device status changes.
     * This demonstrates encapsulation and the observer pattern implementation.
     *
     * @param deviceId the ID of the device that changed
     * @param deviceType the type of the device
     * @param oldStatus the previous status
     * @param newStatus the new status
     */
    private void notifyDeviceStatusChanged(String deviceId, String deviceType, String oldStatus, String newStatus) {
        // TODO Implement the private method notifyDeviceStatusChanged
        // Iterate through all listeners and call their onDeviceStatusChanged method
    }

    /**
     * Private helper method to notify all listeners of security events.
     * This demonstrates encapsulation and the observer pattern implementation.
     *
     * @param eventType the type of security event
     * @param deviceId the device that triggered the event
     * @param severity the severity level
     * @param message the event message
     */
    private void notifySecurityEvent(String eventType, String deviceId, String severity, String message) {
        // TODO Implement the private method notifySecurityEvent
        // Iterate through all listeners and call their onSecurityEvent method
    }

    /**
     * Private helper method to notify all listeners of energy updates.
     * This demonstrates encapsulation and the observer pattern implementation.
     *
     * @param deviceId the device reporting energy usage
     * @param currentUsage the current energy usage
     * @param totalUsage the total energy usage
     */
    private void notifyEnergyUpdate(String deviceId, double currentUsage, double totalUsage) {
        // TODO Implement the private method notifyEnergyUpdate
        // Iterate through all listeners and call their onEnergyUpdate method
    }
}