# Differences Between Current Implementation and NTNU Wiki Approach

## Overview
This document compares the current association implementations with the methodologies described in the NTNU TDT4100 wiki pages.

## 1-1 Associations

### Current Implementation (Guest/SingleHotelRoom)
```java
// Guest.java
public void assignRoom(SingleHotelRoom room) {
    if (this.room != null) {
        this.room.setGuest(null);
    }
    if (room.getGuest() != null) {
        room.getGuest().room = null;
    }
    this.room = room;
    room.setGuest(this);
}
```

### Wiki Approach
```java
// Recommended setter pattern
public void setAssociatedObject(OtherClass newObject) {
    if (this.associatedObject == newObject) {
        return;  // Early return if already linked
    }
    
    OtherClass oldObject = this.associatedObject;
    this.associatedObject = newObject;
    
    if (oldObject != null && oldObject.getThisObject() == this) {
        oldObject.setThisObject(null);
    }
    
    if (this.associatedObject != null) {
        this.associatedObject.setThisObject(this);
    }
}
```

### Key Differences
1. **Method Naming**: Current uses `assignRoom()`, wiki uses standard `setX()` pattern
2. **Early Return**: Wiki includes early return for same-object assignment
3. **Variable Management**: Wiki stores old reference before assignment
4. **Logic Flow**: Wiki follows a more structured three-step process
5. **Field Access**: Current directly accesses fields (`room = null`), wiki uses setters

### Pedagogical Impact
- **Wiki Advantage**: More standardized setter pattern, easier to generalize
- **Current Advantage**: More explicit business logic through method naming

## 1-n Associations

### Current Implementation (Owner/Dog)
```java
// Owner.java
public void addDog(Dog dog) {
    if (!dogs.contains(dog)) {
        if (dog.getOwner() != null) {
            dog.getOwner().removeDog(dog);
        }
        dogs.add(dog);
        dog.setOwner(this);
    }
}

public void removeDog(Dog dog) {
    dogs.remove(dog);
    dog.setOwner(null);
}
```

### Wiki Approach
```java
// Recommended pattern focuses on simpler add/remove
public void addRolle2(Rolle2Klasse rolle2) {
    if (!roller2.contains(rolle2)) {
        roller2.add(rolle2);
        rolle2.setRolle1(this);  // Simple reciprocal link
    }
}

public void removeRolle2(Rolle2Klasse rolle2) {
    if (roller2.contains(rolle2)) {
        roller2.remove(rolle2);
        rolle2.setRolle1(null);
    }
}
```

### Key Differences
1. **Ownership Transfer**: Current handles complex ownership transfer, wiki focuses on simple add/remove
2. **Validation**: Current includes comprehensive validation, wiki uses basic contains() checks
3. **Collection Management**: Current uses immutable collection returns, wiki doesn't specify
4. **Error Handling**: Current prevents duplicates proactively, wiki assumes proper usage

### Pedagogical Impact
- **Wiki Advantage**: Simpler pattern, easier to understand and remember
- **Current Advantage**: More robust, handles real-world scenarios better

## n-n Associations

### Current Implementation (Student/Course)
```java
// Student.java
public void addCourse(Course c) {
    if (!courses.contains(c)) {
        courses.add(c);
        c.addParticipants(this);
    }
}

// Course.java
public void addParticipants(Student s) {
    if (!participants.contains(s)) {
        participants.add(s);
        s.addCourse(this);
    }
}
```

### Wiki Approach
```java
// Emphasizes reciprocal linking consistency
public void addRolle2(Rolle2Klasse rolle2) {
    if (!roller2.contains(rolle2)) {
        roller2.add(rolle2);
        // Ensure reciprocal link exists
        if (!rolle2.hasRolle1(this)) {
            rolle2.addRolle1(this);
        }
    }
}
```

### Key Differences
1. **Reciprocal Check**: Wiki includes explicit check for reciprocal link existence
2. **Method Naming**: Current uses domain-specific names, wiki uses generic role names
3. **Helper Methods**: Wiki suggests `hasRolle1()` helper methods for checking
4. **Symmetry**: Both approaches maintain symmetry but with different validation strategies

### Pedagogical Impact
- **Wiki Advantage**: More explicit about reciprocal relationship checking
- **Current Advantage**: Cleaner code with domain-specific method names

## Hierarchical/Recursive Associations

### Current Implementation (Person)
```java
public void setPredecessor(Person predecessor) {
    this.predecessor = predecessor;
    if (predecessor != null && predecessor.successor != this) {
        predecessor.setSuccessor(this);
    }
}

public boolean isDescendantOf(Person p) {
    Person current = this.predecessor;
    while (current != null) {
        if (current == p) {
            return true;
        }
        current = current.predecessor;
    }
    return false;
}
```

### Wiki Approach
The wiki doesn't specifically address hierarchical associations, but based on the patterns, it would likely follow the standard setter approach with reciprocal linking.

### Key Differences
1. **Traversal Methods**: Current includes sophisticated traversal methods
2. **Utility Functions**: Current provides business logic methods like `isDescendantOf()`
3. **Complexity**: Current handles tree-like structures more comprehensively

## Overall Comparison Summary

### Philosophy Differences
| Aspect | Current Implementation | Wiki Approach |
|--------|----------------------|---------------|
| **Complexity** | Handles edge cases and real-world scenarios | Focuses on core concept teaching |
| **Naming** | Domain-specific method names | Generic, pattern-based naming |
| **Validation** | Comprehensive error prevention | Basic validation for learning |
| **Robustness** | Production-ready code | Educational demonstration code |

### Pedagogical Trade-offs

#### Current Implementation Strengths
- More realistic and applicable to real projects
- Handles complex scenarios students will encounter
- Demonstrates defensive programming practices
- Shows how associations work in practice

#### Wiki Approach Strengths
- Simpler patterns that are easier to learn and remember
- More consistent across different association types
- Focuses on core concepts without distraction
- Provides clear templates that students can follow

### Recommendations

1. **For Initial Learning**: Wiki approach is better - simpler, more consistent patterns
2. **For Advanced Students**: Current approach is better - more realistic and comprehensive
3. **For Exam Preparation**: Wiki approach aligns better with course expectations
4. **For Project Work**: Current approach provides better foundation for real applications

### Synthesis Approach
The ideal educational approach might combine both:
1. Start with wiki-style simple patterns for concept introduction
2. Progress to current-style robust implementations for practical application
3. Explicitly teach the evolution from simple to complex patterns