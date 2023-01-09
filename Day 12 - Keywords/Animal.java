/*
 * Class that models an animal, contains animal related data
 * 
 * General best practices:
 * We do not add static or final unless it is a logical fit
 * We keep fields private and write getters/setters - best practice
 */

public class Animal {

    // Species should not be changed
    public final String species;

    // We decided that developers should not have direct access to age, because changing it may break some functionality
    private int age;

    // We decided it's okay for developers to change the name that this will not break any logic - public
    private String name;

    public Animal(String species){
        this.species = species;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

/*
 * Access modifiers: Changes the visibility of variables, methods, and classes
 * Private - restricts everything from outside the class (encapsulation)
 * Default - not visible outside of package or subclasses
 * Protected - not visible outside of package, but visible in subclasses outside package
 * Public - we've seen on all our classes and methods
 * 
 * Having access modifiers allows us to communicate, both to developers, and the complier, if other classes
 * should be given permission to modify the variable or run the method
 */

 /*
  * Non-access modifiers:
  * Static - related to OOP - variables and methods belong to the class rather than an object
  * Final - for variables, the variable cannot be changed
  */