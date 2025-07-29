# Delegation Pattern Example

This example demonstrates the **Delegation Pattern** in object-oriented programming, showing how objects can delegate responsibilities to other objects instead of implementing everything themselves.

## What is Delegation?

Delegation means that an object doesn't do a task itself, but instead asks another object to do it. This follows the principle of **"Don't ask me, ask the expert"**.

## The Example: Shop with Multi-Currency Pricing

### Classes and Their Responsibilities

1. **Currency** - Simple enum (no logic)
   - Just defines currency types: USD, GBP, NOK
   - No fields, no methods, no logic
   - Used as data by other classes

2. **Item** - Simple data carrier (no logic)
   - Stores item name, price, and currency
   - Only has getter methods
   - No business logic, just holds data
   - Used as data by other classes

3. **PriceCalculator** - The expert on pricing
   - Handles ALL currency conversion logic
   - Handles ALL price calculation logic
   - Contains exchange rates and conversion methods
   - The object that other classes delegate to

4. **Shop** - Manages inventory and business logic
   - Stores inventory and handles shop operations
   - **DELEGATES all price calculations to PriceCalculator**
   - Doesn't know how to convert currencies or calculate prices
   - Focuses on inventory management

### Delegation Chain

When you call `shop.getInventoryValue()`:

```
Shop.getInventoryValue()
    ↓ (delegates to)
PriceCalculator.calculateTotalPrice()
    ↓ (handles all logic internally)
Returns calculated total
```

### Key Delegation Points

- **Shop → PriceCalculator**: Shop delegates ALL pricing to PriceCalculator
- **No delegation from PriceCalculator**: It handles everything internally
- **Item and Currency**: Just data carriers, no delegation involved

### Benefits of This Delegation Pattern

1. **Single Responsibility**: Each class has one clear purpose
2. **Separation of Concerns**: Shop focuses on inventory, PriceCalculator on pricing
3. **Maintainability**: Currency conversion logic is in one place
4. **Testability**: Each component can be tested independently
5. **Simplicity**: Clear delegation chain (Shop → PriceCalculator)

### Running the Examples

```bash
# Run the main shop example
mvn exec:java -Dexec.mainClass="p7_oop_teknikker.s1_delegering.v2.Shop"

# Run the step-by-step demonstration
mvn exec:java -Dexec.mainClass="p7_oop_teknikker.s1_delegering.v2.DelegationDemo"
```

### Key Learning Points

- **Ask the expert**: Shop doesn't know how to calculate prices, it asks PriceCalculator
- **Simple data carriers**: Item and Currency are just data, no logic
- **Single delegation point**: Only Shop delegates to PriceCalculator
- **Clear responsibilities**: Each class has a well-defined role

### Real-World Applications

This pattern is used when:
- A class needs functionality it doesn't have
- You want to separate concerns (business logic vs. calculations)
- You want to make code more modular and testable
- You want to avoid duplicating complex logic

Examples:
- Database access (delegating to connection objects)
- File operations (delegating to file system objects)
- UI components (delegating to specialized calculators)
- Business logic (delegating to service objects) 