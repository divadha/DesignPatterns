# DesignPatterns
# Examples of Design Patterns on Java
Here I have a some examples of Desaing Patterns


Types of DESIGN PATTERN?
Creational, structural and behavioral

What is CREATIONAL design patterns?
Singleton, builder, prototype, factory method and abstract factory

What is a Singleton?
A singleton class controls object creation, limiting the number to one, that means that there is a single object per class.

What is Builder?
It is used to construct a complex object step by step and the final step will return the object

What is Prototype?
It’s copy an existing object instead of creating a new instance from scratch, this pattern is used when the creation of a new object is more expensive

What is Factory method?
It creates an object base in specifics parameters without specifying the exact class, using a common interface

What is Abstract Factory?
It is a super-factory which creates other factories

What is STRUCTURAL design patterns?
Proxy, decorator, facade, adapter, flyweight and bridge

What is a Proxy?
It’s a separate piece of code like (EJB) that takes care of all the external communications, for example, bank validation.
 
What is Decorator?
Add responsibilities dynamically without modifying the structure
Example, car, different engine, color, transmission and accessories
 
What is Facade?
The Facade design pattern is often used when a system is very complex or difficult to understand because the system has a large number of dependent classes
A good example is: Online shopping, Enter a Shipping Address, Enter Payment Method, Review Items and Shipping, Place Order

What is an Adapter?
Convert the interface of a class into another interface that clients expect. Adapter lets classes work together when they are not compatible.
Example: Convert a List to a JSON

What is Flyweight?
It is used to reduce the number of objects created and to decrease memory footprint and increase performance, In other words, it means the reuse the existing object as a cache with the purpose of don’t spend resources creating a new one

What is Bridge?
It’s allows you to separate the abstraction from the implementation, which can be developed independently of each other
Example: TV and Remote Control, the relationship between them is the bridge

What is Composite?
It’s used where we need to treat a group of objects in a similar way as a single object

What is BEHAVIORAL design patterns?
Chain of responsibility, iterator, state, strategy, observer, visitor, template, command, memento and mediator

What is Chain of responsibility?
It’s a series of processing objects, each processing object in the chain is responsible for a certain type of actions if the process is done, it passes the request to the next processor in the chain
Example: Java Exception, throw the ex to the above method so on and so forth, recording the chain of exceptions
