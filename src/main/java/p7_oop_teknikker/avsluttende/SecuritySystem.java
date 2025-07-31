package p7_oop_teknikker.avsluttende;

/**
 * Implement a concrete observer class that monitors security events called SecuritySystem
 * 
 * The expected methods for this class and their behaviour is detailed
 * in the below JavaDoc
 * 
 * The SecuritySystem class must be in the package p7_oop_teknikker.avsluttende
 * 
 * This class demonstrates the OBSERVER pattern from p7_oop_teknikker:
 * - Implements EventListener interface (observer)
 * - Responds to events from SmartHomeSystem (subject/observable)
 * - Maintains its own state based on observed events
 * - Demonstrates loose coupling - doesn't need to know about SmartHomeSystem internals
 * 
 * The SecuritySystem acts as a specialized observer that focuses on security-related
 * events and device status changes that might affect security.
 * 
 * @see EventListener
 * @see SmartHomeSystem
 * @see SecuritySystemTests
 */
public class SecuritySystem implements EventListener {

    // TODO Add any necessary private instance fields here
    // Hints: You'll need to track:
    // - System name/ID
    // - Security status (armed/disarmed)
    // - Alert level
    // - Counters for different types of events
    // - Lists of triggered devices or events

    /**
     * Constructs a SecuritySystem with the specified system ID.
     *
     * @param systemId the ID of this security system, must not be null or blank
     * @throws IllegalArgumentException if systemId is null or blank
     */
    public SecuritySystem(String systemId) {
        // TODO Implement the constructor
        // Initialize all necessary fields
        // Set initial security status to "DISARMED"
        // Set initial alert level to "GREEN"
    }

    /**
     * Returns the system ID of this security system.
     *
     * @return the system ID
     */
    public String getSystemId() {
        // TODO Implement the method getSystemId
        return null;
    }

    /**
     * Returns the current security status.
     *
     * @return the security status ("ARMED_HOME", "ARMED_AWAY", "ARMED_NIGHT", "DISARMED")
     */
    public String getSecurityStatus() {
        // TODO Implement the method getSecurityStatus
        return null;
    }

    /**
     * Returns the current alert level.
     *
     * @return the alert level ("GREEN", "YELLOW", "RED")
     */
    public String getAlertLevel() {
        // TODO Implement the method getAlertLevel
        return null;
    }

    /**
     * Returns the number of security events received.
     *
     * @return the number of security events
     */
    public int getSecurityEventCount() {
        // TODO Implement the method getSecurityEventCount
        return 0;
    }

    /**
     * Returns the number of device status changes received.
     *
     * @return the number of device status changes
     */
    public int getDeviceEventCount() {
        // TODO Implement the method getDeviceEventCount
        return 0;
    }

    /**
     * Returns the number of high-severity events received.
     *
     * @return the number of high-severity events
     */
    public int getHighSeverityEventCount() {
        // TODO Implement the method getHighSeverityEventCount
        return 0;
    }

    /**
     * Manually sets the security status.
     * This can be used to arm or disarm the system.
     *
     * @param newStatus the new security status, must be valid
     * @throws IllegalArgumentException if newStatus is not a valid security status
     */
    public void setSecurityStatus(String newStatus) {
        // TODO Implement the method setSecurityStatus
        // Validate that newStatus is one of: "ARMED_HOME", "ARMED_AWAY", "ARMED_NIGHT", "DISARMED"
        // Update the security status
        // Print a message about the status change
    }

    /**
     * Resets all event counters and alert level.
     * This can be used to clear the system state.
     */
    public void resetCounters() {
        // TODO Implement the method resetCounters
        // Reset all counters to 0
        // Set alert level back to "GREEN"
    }

    // Implementation of EventListener interface methods:

    /**
     * Responds to device status changes.
     * This demonstrates the observer pattern - the SecuritySystem responds to
     * notifications from the SmartHomeSystem.
     * 
     * Security-relevant status changes:
     * - Any device changing to "ERROR" or "OFFLINE" should increase alert level
     * - SENSOR devices changing to "TRIGGERED" should be treated as high priority
     * - DOOR/WINDOW devices changing to "OPEN" when system is armed should trigger alerts
     *
     * @param deviceId the ID of the device that changed
     * @param deviceType the type of device
     * @param oldStatus the previous status
     * @param newStatus the new status
     */
    @Override
    public void onDeviceStatusChanged(String deviceId, String deviceType, String oldStatus, String newStatus) {
        // TODO Implement the onDeviceStatusChanged method
        // Increment device event counter
        // Check for security-relevant status changes
        // Update alert level based on the type of change
        // Print relevant security messages
    }

    /**
     * Responds to security events.
     * This demonstrates the observer pattern - the SecuritySystem responds to
     * security-specific notifications.
     * 
     * Response logic:
     * - "SYSTEM_ARM" events should update the security status
     * - "SYSTEM_DISARM" events should set security status to "DISARMED"
     * - "INTRUSION" events should set alert level to "RED"
     * - "ALARM" events should be logged and alert level adjusted
     * - High severity events should increment the high severity counter
     *
     * @param eventType the type of security event
     * @param deviceId the device that triggered the event
     * @param severity the severity level
     * @param message the event message
     */
    @Override
    public void onSecurityEvent(String eventType, String deviceId, String severity, String message) {
        // TODO Implement the onSecurityEvent method
        // Increment security event counter
        // Handle different event types appropriately
        // Update alert level based on severity
        // Increment high severity counter if severity is "HIGH"
        // Print security alerts and messages
    }

    /**
     * Responds to energy updates.
     * This demonstrates the observer pattern, even for events that might not
     * be directly security-related.
     * 
     * Energy-related security considerations:
     * - Unusually high energy usage might indicate unauthorized devices
     * - Sudden drops in energy usage might indicate device failures
     * - This method should log energy events but not change security status
     *
     * @param deviceId the device reporting energy usage
     * @param currentUsage the current energy usage
     * @param totalUsage the total energy usage
     */
    @Override
    public void onEnergyUpdate(String deviceId, double currentUsage, double totalUsage) {
        // TODO Implement the onEnergyUpdate method
        // Log energy updates for security monitoring
        // Check for unusual energy patterns (very high usage might be suspicious)
        // Print energy monitoring messages
    }

    /**
     * Private helper method to update alert level based on events.
     * This demonstrates encapsulation of alert level logic.
     *
     * Alert level rules:
     * - GREEN: Normal operation
     * - YELLOW: Minor issues or warnings
     * - RED: Critical security events or multiple issues
     *
     * @param reason the reason for the alert level change
     */
    private void updateAlertLevel(String reason) {
        // TODO Implement the private method updateAlertLevel
        // Implement logic to escalate alert levels based on accumulated events
        // Consider factors like high severity event count, security status, etc.
        // Print alert level changes with reasons
    }

    /**
     * Private helper method to check if the system is currently armed.
     * This demonstrates encapsulation of status checking logic.
     *
     * @return true if system is armed in any mode, false if disarmed
     */
    private boolean isArmed() {
        // TODO Implement the private method isArmed
        // Return true if security status is any armed mode, false if disarmed
        return false;
    }

    /**
     * Generates a security report.
     * This demonstrates how observers can provide summaries of what they've observed.
     *
     * @return a formatted string with security system status and statistics
     */
    public String generateSecurityReport() {
        // TODO Implement the method generateSecurityReport
        // Return a formatted report including:
        // - System ID and current status
        // - Alert level
        // - Event counters
        // - Any other relevant security information
        return null;
    }

    /**
     * Returns a string representation of the security system.
     * Format: "SecuritySystem[id=ID, status=STATUS, alertLevel=LEVEL]"
     *
     * @return a string representation of this security system
     */
    @Override
    public String toString() {
        // TODO Implement the toString method
        return null;
    }
}