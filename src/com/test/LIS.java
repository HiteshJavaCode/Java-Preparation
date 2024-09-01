package com.test;

/*
1. Local Variables:
        Definition: They are variables that are defined within the scope of a method, constructor, or block and are used for temporary storage of data.
        Accessibility: They are accessible only within the method, constructor, or block in which they are declared.
        Modification: They can be modified only within the method, constructor, or block in which they are declared.
        Access from the Same Class: Local variables can be accessed and modified only within the same method, constructor, or block.
        Access from Different Class: Local variables cannot be accessed from other classes.
        Scope: Local variables are declared within a method, constructor, or block and are only accessible within that method, constructor, or block.

2. Instance Variables:
        Scope: Instance variables are declared within a class but outside any method, constructor, or block. They are accessible to all methods within the class and can have different values for each instance (object) of the class.
        Definition: They are variables that are associated with instances (objects) of a class and hold data that is specific to each instance.
        Accessibility: They are accessible to all methods of the class.
        Modification: They can be modified by any method of the class.
        Access from the Same Class: Instance variables can be accessed and modified directly within any method of the same class using the instance (object) of the class.
        Access from Different Class: Instance variables can be accessed and modified from other classes by creating an object of the class and using dot notation (object.variable).

3. Static Variables:
        Scope: Static variables, also known as class variables, are declared with the static keyword within a class but outside any method, constructor, or block. They are accessible to all methods within the class and have only one copy shared among all instances of the class.
        Definition: They are variables that are associated with the class itself rather than with any specific instance of the class and hold data that is shared among all instances.
        Accessibility: They are accessible to all methods of the class.
        Modification: They can be modified by any method of the class.
        Access from the Same Class: Static variables can be accessed and modified directly within any method of the same class using the class name.
        Access from Different Class: Static variables can be accessed and modified from other classes using the class name and dot notation (ClassName.variable).

4. Local Methods:
        Definition: They are methods defined within the scope of another method and are used to organize code and improve readability.
        Scope: Methods declared within a class but outside any other method, constructor, or block.
        Accessibility: They are accessible only within the same class.
        Modification: They can access and modify local variables declared within the same method.
        Access from the Same Class: Local methods can be accessed and invoked directly within any other method of the same class.
        Access from Different Class: Local methods cannot be accessed from other classes.

5. Instance Methods:
        Definition: They are methods associated with instances (objects) of a class and can access and modify instance variables directly.
        Scope: Methods associated with instances (objects) of the class.
        Accessibility: They are accessible to all methods of the class and can access instance variables directly and static variables indirectly.
        Modification: They can modify instance variables directly and static variables indirectly.
        Access from the Same Class: Instance methods can be accessed and invoked directly within any other method of the same class using the instance (object) of the class.
        Access from Different Class: Instance methods can be accessed and invoked from other classes by creating an object of the class and using dot notation (object.method()).

6. Static Methods:
        Definition: They are methods associated with the class itself rather than with any specific instance and cannot access instance variables directly.
        Scope: Methods associated with the class itself rather than with any specific instance (object) of the class.
        Accessibility: They are accessible to all methods of the class and can access static variables directly.
        Modification: They can modify static variables directly.
        Access from the Same Class: Static methods can be accessed and invoked directly within any other method of the same class using the class name.
        Access from Different Class: Static methods can be accessed and invoked from other classes using the class name and dot notation (ClassName.method()).
*/



public class LIS {
    public int getInstanceVar() {
        return instanceVar;
    }

    // Instance variables
    private int instanceVar;
    private int instanceVar2;

    public static int getStaticVar() {
        staticVar = 500;
        return staticVar;
    }

    private static int staticVar;

    // Constructor to initialize instance variable
    public LIS(int instanceVar) {
        this.instanceVar = instanceVar;
    }

    // Instance method to modify instance variable
    public void instanceMethod() {
        int localVar = 5;
        // Local variable
        instanceVar += localVar; // Modifying instance variable using local variable
        System.out.println("Inside instanceMethod: instanceVar = " + instanceVar);
    }

    public void instanceMethod1() {
        int localVar = 95;
        // Local variable
        instanceVar += localVar; // Modifying instance variable using local variable
        System.out.println("Inside instanceMethod: instanceVar = " + instanceVar);
    }

    // Static method to modify static Variable
    public static void staticMethod() {
        int localVar = 30; // Local variable
        staticVar += localVar;// Modifying static variable using local variable
        System.out.println("Inside staticMethod: staticVar = " + staticVar);
    }

    public static  void stat(int x)
    {
         x= x+x;
         System.out.println(x);
    }

    public static void staticMethod1(LIS obj) {
        int localVar = 45; // Local variable
        staticVar += localVar;
        int x= 20+ obj.instanceVar2;
        System.out.println("Inside staticMethod: instancevar2 = " + staticVar+ "---"+ obj.instanceVar);
        // Modifying static variable using local variable
        System.out.println("Inside staticMethod: staticVar = " + staticVar+ "---"+ obj.instanceVar);
    }

    // Main method
    public static void main(String[] args) {
        // Creating an instance of Example class
        LIS obj = new LIS(20);
        LIS obj1 = new LIS(30);

        // Accessing instance method
        obj.instanceMethod();
        obj1.instanceMethod1();

        // Accessing static method
        staticMethod();
        staticMethod1(obj1);
        stat(staticVar);
    }
}
