# Audio Device Exercise - Abstraction and Interfaces

This exercise demonstrates key concepts from Chapter 5 (Abstraction) including abstract classes, interfaces, inheritance, and polymorphism through an audio device management system.

## Learning Objectives

After completing this exercise, you will understand:
- How to create and use abstract classes
- How to define and implement interfaces
- The difference between abstract classes and interfaces
- How inheritance works with both classes and interfaces
- How to use polymorphism and instanceof checks
- How to design class hierarchies using abstraction

## Exercise Overview

You will implement a system for managing different types of audio devices in a recording studio. The system includes:

1. **AudioDevice** - Abstract base class for all audio devices
2. **Wireless** - Interface for battery-powered devices
3. **Headset** - Concrete class that extends AudioDevice and implements Wireless
4. **Speaker** - Concrete class that extends AudioDevice (wired, no battery)
5. **AudioEngineer** - Utility class that manages and prepares audio devices

## Implementation Requirements

### AudioDevice (Abstract Class)
- Manages common properties: modelName, volume
- Provides concrete methods: getVolume(), setVolume(), getModelName(), setModelName()
- Defines abstract methods: getMaxVolume(), playSound()
- Volume validation must enforce device-specific maximum volumes

### Wireless (Interface)
- Defines contract for battery management
- Methods: getBatteryLevel(), charge(int percentage)
- Charging logic must handle percentage validation and 100% maximum

### Headset (Concrete Class)
- Extends AudioDevice and implements Wireless
- Maximum volume: 10 (for hearing protection)
- Has battery management capabilities
- Plays sound with headset-specific message format

### Speaker (Concrete Class)
- Extends AudioDevice only (no wireless capabilities)
- Maximum volume: 20 (higher than headsets for room sound)
- No battery management needed
- Plays sound with speaker-specific message format

### AudioEngineer (Utility Class)
- Demonstrates polymorphism by working with AudioDevice abstractions
- Uses instanceof checks for device-specific operations
- Prepares studio by charging wireless devices and setting volumes
- Standard volumes: Headsets = 7, Speakers = 10
- Charges wireless devices if battery < 80%