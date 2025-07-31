package p7_oop_teknikker.avsluttende;

import java.util.List;
import java.util.Map;

/**
 * Implement a concrete observer class that monitors energy consumption called EnergyMonitor
 * 
 * The expected methods for this class and their behaviour is detailed
 * in the below JavaDoc
 * 
 * The EnergyMonitor class must be in the package p7_oop_teknikker.avsluttende
 * 
 * This class demonstrates the OBSERVER pattern from p7_oop_teknikker:
 * - Implements EventListener interface (observer)
 * - Responds to events from SmartHomeSystem (subject/observable)
 * - Maintains its own state and calculations based on observed events
 * - Demonstrates how different observers can have different focuses
 * 
 * The EnergyMonitor acts as a specialized observer that focuses on energy-related
 * events and tracks energy consumption patterns across the smart home system.
 * 
 * @see EventListener
 * @see SmartHomeSystem
 * @see EnergyMonitorTests
 */
public class EnergyMonitor implements EventListener {

    // TODO Add any necessary private instance fields here
    // Hints: You'll need to track:
    // - Monitor name/ID
    // - Total energy consumption
    // - Energy consumption per device (Map)
    // - Number of energy updates received
    // - Peak usage values
    // - Lists of high-consumption devices

    /**
     * Constructs an EnergyMonitor with the specified monitor name.
     *
     * @param monitorName the name of this energy monitor, must not be null or blank
     * @throws IllegalArgumentException if monitorName is null or blank
     */
    public EnergyMonitor(String monitorName) {
        // TODO Implement the constructor
        // Initialize all necessary fields
        // Initialize collections for tracking device energy consumption
    }

    /**
     * Returns the name of this energy monitor.
     *
     * @return the monitor name
     */
    public String getMonitorName() {
        // TODO Implement the method getMonitorName
        return null;
    }

    /**
     * Returns the total energy consumption across all devices.
     *
     * @return the total energy consumption in watts
     */
    public double getTotalEnergyConsumption() {
        // TODO Implement the method getTotalEnergyConsumption
        return 0.0;
    }

    /**
     * Returns the number of energy updates received.
     *
     * @return the number of energy updates
     */
    public int getEnergyUpdateCount() {
        // TODO Implement the method getEnergyUpdateCount
        return 0;
    }

    /**
     * Returns the number of unique devices that have reported energy usage.
     *
     * @return the number of monitored devices
     */
    public int getMonitoredDeviceCount() {
        // TODO Implement the method getMonitoredDeviceCount
        return 0;
    }

    /**
     * Returns the energy consumption for a specific device.
     *
     * @param deviceId the ID of the device
     * @return the total energy consumption for the device, or 0.0 if not found
     */
    public double getDeviceEnergyConsumption(String deviceId) {
        // TODO Implement the method getDeviceEnergyConsumption
        return 0.0;
    }

    /**
     * Returns the peak energy usage recorded across all devices.
     *
     * @return the peak energy usage in watts
     */
    public double getPeakEnergyUsage() {
        // TODO Implement the method getPeakEnergyUsage
        return 0.0;
    }

    /**
     * Returns the average energy consumption per device.
     *
     * @return the average energy consumption, or 0.0 if no devices monitored
     */
    public double getAverageEnergyConsumption() {
        // TODO Implement the method getAverageEnergyConsumption
        return 0.0;
    }

    /**
     * Returns a list of device IDs with high energy consumption (above threshold).
     *
     * @param threshold the energy consumption threshold in watts
     * @return a list of device IDs with consumption above the threshold
     * @throws IllegalArgumentException if threshold is negative
     */
    public List<String> getHighConsumptionDevices(double threshold) {
        // TODO Implement the method getHighConsumptionDevices
        return null;
    }

    /**
     * Returns a map of all device energy consumptions.
     *
     * @return a defensive copy of the device energy consumption map
     */
    public Map<String, Double> getAllDeviceConsumptions() {
        // TODO Implement the method getAllDeviceConsumptions
        // Return a defensive copy to prevent external modification
        return null;
    }

    /**
     * Resets all energy consumption data.
     * This clears all tracked consumption data and counters.
     */
    public void resetEnergyData() {
        // TODO Implement the method resetEnergyData
        // Clear all energy consumption data
        // Reset counters and peak values
    }

    // Implementation of EventListener interface methods:

    /**
     * Responds to device status changes.
     * The EnergyMonitor is primarily interested in device status for context,
     * but doesn't need to take specific actions for most status changes.
     * 
     * Relevant status changes:
     * - Devices going "OFFLINE" might affect energy calculations
     * - Devices being "REMOVED" should be noted
     *
     * @param deviceId the ID of the device that changed
     * @param deviceType the type of device
     * @param oldStatus the previous status
     * @param newStatus the new status
     */
    @Override
    public void onDeviceStatusChanged(String deviceId, String deviceType, String oldStatus, String newStatus) {
        // TODO Implement the onDeviceStatusChanged method
        // Log relevant device status changes
        // Handle devices going offline or being removed
        // Print energy monitoring context messages
    }

    /**
     * Responds to security events.
     * The EnergyMonitor might be interested in security events that could
     * affect energy consumption patterns.
     * 
     * Relevant security events:
     * - System arming/disarming might change energy patterns
     * - Intrusion events might indicate unauthorized energy usage
     *
     * @param eventType the type of security event
     * @param deviceId the device that triggered the event
     * @param severity the severity level
     * @param message the event message
     */
    @Override
    public void onSecurityEvent(String eventType, String deviceId, String severity, String message) {
        // TODO Implement the onSecurityEvent method
        // Log security events that might affect energy patterns
        // Print energy monitoring context messages
    }

    /**
     * Responds to energy updates.
     * This is the primary method for the EnergyMonitor - it tracks and
     * analyzes energy consumption data.
     * 
     * Processing logic:
     * - Update total energy consumption with the totalUsage value
     * - Track per-device energy consumption
     * - Update peak usage if currentUsage is higher than recorded peak
     * - Increment energy update counter
     * - Log significant energy events (high usage, new devices, etc.)
     *
     * @param deviceId the device reporting energy usage
     * @param currentUsage the current energy usage in watts
     * @param totalUsage the total energy usage since last reset
     */
    @Override
    public void onEnergyUpdate(String deviceId, double currentUsage, double totalUsage) {
        // TODO Implement the onEnergyUpdate method
        // Update energy consumption tracking
        // Update peak usage if necessary
        // Increment counters
        // Store per-device consumption data
        // Print energy monitoring messages for significant events
    }

    /**
     * Calculates the energy efficiency rating of the system.
     * This demonstrates how observers can perform calculations based on collected data.
     * 
     * Rating scale:
     * - "EXCELLENT": Average consumption < 50 watts per device
     * - "GOOD": Average consumption < 100 watts per device
     * - "FAIR": Average consumption < 200 watts per device
     * - "POOR": Average consumption >= 200 watts per device
     *
     * @return the energy efficiency rating
     */
    public String getEnergyEfficiencyRating() {
        // TODO Implement the method getEnergyEfficiencyRating
        // Calculate average energy consumption per device
        // Return rating based on average consumption
        return null;
    }

    /**
     * Generates an energy consumption report.
     * This demonstrates how observers can provide summaries of what they've observed.
     *
     * @return a formatted string with energy consumption statistics
     */
    public String generateEnergyReport() {
        // TODO Implement the method generateEnergyReport
        // Return a formatted report including:
        // - Monitor name and update count
        // - Total energy consumption
        // - Number of monitored devices
        // - Peak usage and average consumption
        // - Energy efficiency rating
        // - List of high-consumption devices (if any)
        return null;
    }

    /**
     * Private helper method to format energy values for display.
     * This demonstrates encapsulation of formatting logic.
     *
     * @param watts the energy value in watts
     * @return a formatted string with appropriate units
     */
    private String formatEnergyValue(double watts) {
        // TODO Implement the private method formatEnergyValue
        // Format energy values with appropriate precision
        // Consider using different units for very large values (kW, MW)
        return null;
    }

    /**
     * Private helper method to check if a consumption value is considered high.
     * This demonstrates encapsulation of threshold logic.
     *
     * @param consumption the energy consumption value
     * @return true if the consumption is considered high
     */
    private boolean isHighConsumption(double consumption) {
        // TODO Implement the private method isHighConsumption
        // Define what constitutes "high" energy consumption
        // Return true if consumption exceeds the threshold
        return false;
    }

    /**
     * Returns a string representation of the energy monitor.
     * Format: "EnergyMonitor[name=NAME, totalConsumption=VALUE, devices=COUNT]"
     *
     * @return a string representation of this energy monitor
     */
    @Override
    public String toString() {
        // TODO Implement the toString method
        return null;
    }
}