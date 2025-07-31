package p7_oop_teknikker.avsluttende;

import java.util.List;
import java.util.Map;

/**
 * Implement a class that handles device management for a smart home system called DeviceController
 * 
 * The expected methods for this class and their behaviour is detailed
 * in the below JavaDoc
 * 
 * The DeviceController class must be in the package p7_oop_teknikker.avsluttende
 * 
 * This class demonstrates the DELEGATION pattern from p7_oop_teknikker:
 * - The SmartHomeSystem delegates all device management tasks to this expert class
 * - This class is the "expert" that knows how to manage devices
 * - Separation of concerns: SmartHomeSystem focuses on coordination, DeviceController focuses on device operations
 * - Single Responsibility Principle: This class has one job - managing devices
 * 
 * The DeviceController encapsulates all device-related operations and data structures,
 * providing a clean interface for the SmartHomeSystem to use.
 * 
 * @see SmartHomeSystem
 * @see DeviceControllerTests
 */
public class DeviceController {

    // TODO Add any necessary private instance fields here
    // Hints: You'll need data structures to store device information
    // Consider using Maps to store device properties (id -> type, id -> status, etc.)

    /**
     * Constructs a DeviceController.
     * This should initialize all necessary data structures for device management.
     */
    public DeviceController() {
        // TODO Implement the constructor
        // Initialize data structures for storing device information
    }

    /**
     * Adds a device to the controller.
     * This method encapsulates the logic for device registration.
     *
     * @param deviceId the unique identifier for the device, must not be null or blank
     * @param deviceType the type of device, must not be null or blank
     * @param initialStatus the initial status of the device, must not be null or blank
     * @throws IllegalArgumentException if any parameter is null or blank
     * @throws IllegalStateException if a device with the same ID already exists
     */
    public void addDevice(String deviceId, String deviceType, String initialStatus) {
        // TODO Implement the method addDevice
        // Validate parameters
        // Check if device already exists
        // Store device information in appropriate data structures
    }

    /**
     * Removes a device from the controller.
     * This method encapsulates the logic for device deregistration.
     *
     * @param deviceId the ID of the device to remove
     * @return true if the device was removed, false if it was not found
     */
    public boolean removeDevice(String deviceId) {
        // TODO Implement the method removeDevice
        // Remove device from all data structures
        // Return true if device existed and was removed, false otherwise
        return false;
    }

    /**
     * Checks if a device exists in the controller.
     * This method encapsulates the device existence check logic.
     *
     * @param deviceId the ID of the device to check
     * @return true if the device exists, false otherwise
     */
    public boolean deviceExists(String deviceId) {
        // TODO Implement the method deviceExists
        return false;
    }

    /**
     * Updates the status of a device.
     * This method encapsulates the device status update logic.
     *
     * @param deviceId the ID of the device to update
     * @param newStatus the new status for the device, must not be null or blank
     * @return the previous status of the device
     * @throws IllegalArgumentException if newStatus is null or blank
     * @throws IllegalStateException if device does not exist
     */
    public String updateDeviceStatus(String deviceId, String newStatus) {
        // TODO Implement the method updateDeviceStatus
        // Validate parameters
        // Check if device exists
        // Get old status, update to new status, return old status
        return null;
    }

    /**
     * Gets the current status of a device.
     * This method encapsulates the device status retrieval logic.
     *
     * @param deviceId the ID of the device
     * @return the current status of the device
     * @throws IllegalStateException if device does not exist
     */
    public String getDeviceStatus(String deviceId) {
        // TODO Implement the method getDeviceStatus
        return null;
    }

    /**
     * Gets the type of a device.
     * This method encapsulates the device type retrieval logic.
     *
     * @param deviceId the ID of the device
     * @return the type of the device
     * @throws IllegalStateException if device does not exist
     */
    public String getDeviceType(String deviceId) {
        // TODO Implement the method getDeviceType
        return null;
    }

    /**
     * Returns a list of all device IDs.
     * This method encapsulates the device enumeration logic.
     *
     * @return a list of all device IDs (defensive copy)
     */
    public List<String> getAllDeviceIds() {
        // TODO Implement the method getAllDeviceIds
        // Return a defensive copy to prevent external modification
        return null;
    }

    /**
     * Returns the number of devices managed by this controller.
     * This method encapsulates the device counting logic.
     *
     * @return the number of devices
     */
    public int getDeviceCount() {
        // TODO Implement the method getDeviceCount
        return 0;
    }

    /**
     * Returns devices filtered by type.
     * This method encapsulates the device filtering logic.
     *
     * @param deviceType the type of devices to return
     * @return a list of device IDs of the specified type
     * @throws IllegalArgumentException if deviceType is null or blank
     */
    public List<String> getDevicesByType(String deviceType) {
        // TODO Implement the method getDevicesByType
        return null;
    }

    /**
     * Returns devices filtered by status.
     * This method encapsulates the device status filtering logic.
     *
     * @param status the status of devices to return
     * @return a list of device IDs with the specified status
     * @throws IllegalArgumentException if status is null or blank
     */
    public List<String> getDevicesByStatus(String status) {
        // TODO Implement the method getDevicesByStatus
        return null;
    }

    /**
     * Gets all device information as a map.
     * This method encapsulates the device information aggregation logic.
     * 
     * The returned map has device IDs as keys and device info strings as values.
     * Device info format: "TYPE:STATUS" (e.g., "LIGHT:ON", "SENSOR:ACTIVE")
     *
     * @return a map of device IDs to device information strings
     */
    public Map<String, String> getAllDeviceInfo() {
        // TODO Implement the method getAllDeviceInfo
        // Return a map where key is deviceId and value is "TYPE:STATUS"
        return null;
    }

    /**
     * Updates multiple devices to the same status.
     * This method encapsulates bulk device operations.
     *
     * @param deviceIds the list of device IDs to update
     * @param newStatus the new status for all devices, must not be null or blank
     * @throws IllegalArgumentException if newStatus is null or blank, or if deviceIds is null
     * @throws IllegalStateException if any device does not exist
     */
    public void updateMultipleDevices(List<String> deviceIds, String newStatus) {
        // TODO Implement the method updateMultipleDevices
        // Validate parameters
        // Check all devices exist before updating any
        // Update all devices to the new status
    }

    /**
     * Resets all devices to a default "OFF" status.
     * This method encapsulates the system reset logic.
     * 
     * @return a map of device IDs to their previous statuses (before reset)
     */
    public Map<String, String> resetAllDevices() {
        // TODO Implement the method resetAllDevices
        // Store previous statuses, set all devices to "OFF", return previous statuses
        return null;
    }

    /**
     * Validates device parameters.
     * This is a private helper method that encapsulates validation logic.
     *
     * @param deviceId the device ID to validate
     * @param parameter the parameter name (for error messages)
     * @throws IllegalArgumentException if deviceId is null or blank
     */
    private void validateDeviceId(String deviceId, String parameter) {
        // TODO Implement the private method validateDeviceId
        // Check if deviceId is null or blank, throw appropriate exception
    }

    /**
     * Validates string parameters.
     * This is a private helper method that encapsulates validation logic.
     *
     * @param value the string value to validate
     * @param parameter the parameter name (for error messages)
     * @throws IllegalArgumentException if value is null or blank
     */
    private void validateStringParameter(String value, String parameter) {
        // TODO Implement the private method validateStringParameter
        // Check if value is null or blank, throw appropriate exception
    }

    /**
     * Returns a string representation of the device controller.
     * Format: "DeviceController[devices=COUNT]"
     *
     * @return a string representation of this controller
     */
    @Override
    public String toString() {
        // TODO Implement the toString method
        return null;
    }
}