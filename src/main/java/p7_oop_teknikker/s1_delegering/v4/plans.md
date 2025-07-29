# Delegation Pattern - Simple Examples for v4

This document outlines 3 different simple delegation implementations suitable for first-year students. Each example uses 2-3 classes with clear delegation relationships.

## Option 1: Calculator/Math Teacher
**Classes:**
- `MathOperation.java` - Data carrier (operation type, two numbers)
- `Calculator.java` - Does the actual math calculations 
- `MathTeacher.java` - Delegates calculations to Calculator, focuses on teaching

**Delegation Pattern:**
- MathTeacher receives math problems from students
- Instead of doing math itself, MathTeacher delegates to Calculator
- Calculator handles all computation logic
- MathTeacher focuses on presentation and student interaction

**Educational Benefits:**
- Very relatable (everyone knows teachers and calculators)
- Clear separation: teacher teaches, calculator calculates
- Shows "I don't do X, I ask the expert" pattern
- Simple one-to-one delegation relationship

---

## Option 2: Writer/Printer
**Classes:**
- `Document.java` - Data carrier (title, content, format)
- `Printer.java` - Handles all printing logic and formatting
- `Writer.java` - Delegates to Printer, focuses on writing

**Delegation Pattern:**
- Writer creates documents but doesn't know how to print
- Writer delegates all printing tasks to Printer
- Printer handles formatting, page layout, and output
- Writer focuses only on content creation

**Educational Benefits:**
- Familiar real-world analogy (writers don't operate printers)
- Shows how objects can focus on their main responsibility
- Clear "separation of concerns" demonstration
- Easy to understand who does what

---

## Option 3: Student/Alarm Clock
**Classes:**
- `Task.java` - Data carrier (task name, deadline, priority)
- `AlarmClock.java` - Handles timing and reminder alerts
- `Student.java` - Delegates reminders to AlarmClock, focuses on studying

**Delegation Pattern:**
- Student has many tasks with deadlines
- Student doesn't manage time internally, delegates to AlarmClock
- AlarmClock knows when to send reminders
- Student focuses on completing tasks, not tracking time

**Educational Benefits:**
- Highly relatable to student audience
- Shows practical use of delegation in daily life
- Demonstrates single responsibility principle
- Clear example of "let the specialist handle it"

---

## Option 4: Chef/Oven
**Classes:**
- `Recipe.java` - Data carrier (dish name, temperature, cooking time)
- `Oven.java` - Handles all cooking logic and temperature control
- `Chef.java` - Delegates cooking to Oven, focuses on food preparation

**Delegation Pattern:**
- Chef prepares ingredients but doesn't cook directly
- Chef delegates all cooking tasks to Oven
- Oven handles temperature control and timing
- Chef focuses on recipe preparation and presentation

**Educational Benefits:**
- Universal real-world example (everyone understands cooking)
- Clear role separation: chef prepares, oven cooks
- Shows delegation in everyday activities
- Simple "tool usage" delegation pattern

---

## Option 5: Driver/GPS
**Classes:**
- `Destination.java` - Data carrier (address, distance, traffic info)
- `GPS.java` - Handles navigation logic and route calculation
- `Driver.java` - Delegates navigation to GPS, focuses on driving

**Delegation Pattern:**
- Driver knows where to go but not the best route
- Driver delegates route planning to GPS
- GPS handles all navigation calculations
- Driver focuses on safe driving

**Educational Benefits:**
- Modern, relatable technology example
- Shows how we delegate complex tasks to specialists
- Clear "I drive, GPS navigates" separation
- Demonstrates trust in delegation

---

## Option 6: Customer/ATM
**Classes:**
- `Transaction.java` - Data carrier (amount, account, transaction type)
- `ATM.java` - Handles all banking operations and security
- `Customer.java` - Delegates banking to ATM, focuses on their needs

**Delegation Pattern:**
- Customer wants money but can't access bank vault
- Customer delegates transaction to ATM
- ATM handles security, verification, and money dispensing
- Customer just provides instructions

**Educational Benefits:**
- Familiar banking example
- Shows delegation for security and complexity
- Clear "I request, ATM executes" pattern
- Demonstrates trust and specialization

---

## Option 7: Gamer/Controller
**Classes:**
- `GameAction.java` - Data carrier (action type, direction, intensity)
- `Controller.java` - Handles input processing and game communication
- `Gamer.java` - Delegates input to Controller, focuses on strategy

**Delegation Pattern:**
- Gamer decides what to do but doesn't communicate directly with game
- Gamer delegates input handling to Controller
- Controller translates button presses to game commands
- Gamer focuses on gameplay strategy

**Educational Benefits:**
- Highly relatable to young students
- Shows delegation in entertainment/technology
- Clear "I decide, controller executes" pattern
- Demonstrates interface abstraction

---

## Option 8: Patient/Doctor
**Classes:**
- `Symptom.java` - Data carrier (description, severity, duration)
- `Doctor.java` - Handles diagnosis and treatment logic
- `Patient.java` - Delegates medical decisions to Doctor, focuses on healing

**Delegation Pattern:**
- Patient has symptoms but lacks medical expertise
- Patient delegates diagnosis to Doctor
- Doctor handles all medical analysis and treatment
- Patient focuses on following treatment plan

**Educational Benefits:**
- Universal healthcare example
- Shows delegation based on expertise
- Clear "I describe, doctor diagnoses" pattern
- Demonstrates importance of specialization

---

## Recommendation
All eight options are simple and educational. **Option 1 (Calculator/Math Teacher)** might be the most universally understood, while **Option 3 (Student/Alarm Clock)** and **Option 7 (Gamer/Controller)** would be most relatable to the target audience.