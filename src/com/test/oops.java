package com.test;

/*
oops concept refers to object oriented programming, which revolves around the concept of objects.
it deals with object which have both data(param) and behavior(methods) to maintain the code in re-usable manner.


In summary, Object-Oriented Programming (OOP) is a programming paradigm based on the concepts of classes and objects, encapsulation, inheritance, polymorphism, and abstraction.
OOP promotes code re-usability, modularity, and maintainability by organizing code into self-contained and reusable components.


Class:
A class is a blueprint or template for creating objects. It defines the attributes (data) and methods (behavior) that all objects of that class will have.
Classes serve as a blueprint for creating multiple instances (objects) that share the same structure and behavior.

Object:
An object is an instance of a class. It represents a real-world entity that has both state (attributes) and behavior (methods).
Objects are created from classes using the new keyword and can interact with each other by invoking methods or accessing attributes.

Encapsulation:
Encapsulation is the bundling of data (attributes) and methods (behavior) that operate on the data into a single unit called a class.
It allows for data hiding, where the internal state of an object is hidden from the outside world and can only be accessed through public methods.
Encapsulation helps in achieving information hiding, abstraction, and modularity, which improve code maintainability and reusability.

public class Car {
    // Private instance variables
    private String make;
    private String model;
    private int year;

    // Constructor
    public Car(String make) {
        this.make = make;
          }

    // Getter methods
    public String getMake() {
        return make;
    }

    // Setter methods
    public void setMake(String make) {
        this.make = make;
    }

Encapsulation in Java is achieved by declaring the instance variables of a class as private and providing public getter and setter methods to access and modify these variables.
By encapsulating the data and controlling access to it through methods, we ensure data integrity and promote code maintainability.
}




Inheritance:
Inheritance is a mechanism by which a class can inherit attributes and methods from another class, known as the superclass or parent class.
It promotes code reuse by allowing new classes (subclasses or derived classes) to inherit the properties and behavior of existing classes (superclasses).
Subclasses can extend the functionality of their parent class by adding new attributes or methods or by overriding existing ones.

Example:

class SUV extends Car {
    void offRoad() {
        // Method implementation
    }
}

Abstraction:

Abstraction is another important OOP concept, closely related to encapsulation but distinct in its purpose.
Abstraction refers to the process of hiding the implementation details of a class and only showing the essential features of the object.
In other words, abstraction focuses on what an object does rather than how it does it.
Abstraction in Java is often achieved through abstract classes and interfaces.
Abstract classes define abstract methods (methods without implementation) that must be implemented by subclasses.
Interfaces define a contract specifying the methods that implementing classes must provide.


Polymorphism:
Polymorphism in Java refers to the ability of objects of different classes to be treated as objects of a common superclass.
It allows a single method or function to operate on different types of objects in a uniform manner.
There are two main types of polymorphism in Java: compile-time polymorphism (method overloading) and runtime polymorphism (method overriding).


The word “polymorphism” means having many forms.
In simple words, we can define polymorphism as the ability of a message to be displayed in more than one form.
So the same person exhibits different behavior in different situations.




Compile-Time Polymorphism (Method Overloading):
Method overloading allows a class to have multiple methods with the same name but different parameters.
The compiler determines which method to call based on the number and types of arguments passed to it at compile time.
Example:

class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}


Method overriding allows a subclass to provide a specific implementation of a method that is already defined in its superclass.
The decision on which method to execute is made at runtime based on the actual object type.
Example:

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
In this example, the Dog class overrides the sound method defined in the Animal class with its own implementation.
Polymorphism allows for more flexible and dynamic code, as it enables the same code to work with objects of different classes without knowing their specific types at compile time.
It promotes code reusability, extensibility, and modularity in object-oriented programming.



When you use @Override before a method in a subclass, you're explicitly indicating to the compiler that you intend to override a method from the superclass. This annotation serves as a safety measure to prevent accidental mistakes during development:

Intention to Override:

By using @Override, you clearly communicate your intention to override a method from the superclass.
It acts as a signal to both the compiler and other developers that the method in the subclass is supposed to override an existing method from the superclass.
Compile-Time Check:

The @Override annotation triggers a compile-time check by the compiler to ensure that the annotated method is indeed overriding a method from the superclass.
If the method in the subclass with @Override doesn't match any method in the superclass (due to differences in the method signature), the compiler will generate a compilation error.
Preventing Accidental Creation of New Methods:

Without @Override, it's possible to mistakenly create a new method in the subclass with the same name as a method in the superclass, but with a different method signature.
This accidental creation of a new method instead of overriding an existing one can lead to unexpected behavior and bugs in the code.
By using @Override, you reduce the chances of accidentally creating a new method instead of overriding an existing one in the superclass.
It serves as a safety measure to catch errors early in the development process and ensures that the intended method overriding is done correctly.
In summary, @Override is a safety measure in Java that helps prevent accidental mistakes during development by ensuring that methods in subclasses are correctly overriding methods from superclasses. It improves code quality, reduces potential bugs, and enhances readability by clearly indicating the intention to override a method.






A covariant return type refers to the ability of a derived class method to return a more specific type than the return type of the base class method it overrides.
This feature allows for more flexibility and precision in object-oriented programming.
Following are the advantages of the covariant return type.

1)Reduced Casting:Covariant return types can help reduce the need for explicit type casting in client code.
Since the overridden method in the derived class returns a more specific type, you can directly assign the result to a variable of that type without casting.

2) Covariant return types can improve code readability by making the intent of overridden methods clearer.
When you see a method overridden with a more specific return type, it immediately indicates that the subclass provides additional functionality or specificity.

3) Flexibility: Covariant return types provide flexibility in designing class hierarchies by allowing derived classes to refine the return type of methods defined in their base classes.
This can lead to more expressive and intuitive APIs.

 */
public class oops {
}
