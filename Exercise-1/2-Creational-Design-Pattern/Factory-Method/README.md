# Vehicle Factory Method Pattern

## Overview
Demonstration of the Factory Method design pattern using a vehicle manufacturing system. It showcases how to create different types of vehicles (car and bike) without specifying their exact classes in the client code.

## Design Pattern: Factory Method
The Factory Method pattern is a creational pattern that provides an interface for creating objects in a superclass, allowing subclasses to alter the type of objects that will be created.

## Structure
This use case consists of the following components:

1. Vehicle (Interface)
   - Defines the common interface for all concrete vehicles

2. Concrete Vehicles
   - Car: Implements the Vehicle interface for cars
   - Bike: Implements the Vehicle interface for bikes

3. VehicleFactory (Abstract Class)
   - Declares the factory method that returns a Vehicle object
   - Includes a template method for testing the vehicle

4. Concrete Factories
   - CarFactory: Creates Car objects
   - BikeFactory: Creates Bike objects

5. VehicleDemo (Main Class)
   - Demonstrates the usage of the Factory Method pattern

## How It Works
1. The abstract VehicleFactory class declares the factory method (createVehicle)
2. Concrete factory classes (CarFactory, BikeFactory) override the factory method to produce specific vehicle types
3. The client code (VehicleDemo) works with factories and products through abstract interfaces

## Key Features
- Encapsulates object creation logic in separate factory classes
- Allows for easy extension to new vehicle types without modifying existing code
- Promotes loose coupling between client code and concrete classes

## Use Case
This pattern is particularly useful when:
- A class can't anticipate the type of objects it needs to create
- A class wants its subclasses to specify the objects it creates
- Classes delegate responsibility to one of several helper subclasses, and you want to localize the knowledge of which helper subclass is the delegate

## Benefits
- Provides flexibility in creating different types of objects
- Eliminates the need to bind application-specific classes into the code
- Promotes the principle of "coding to an interface, not an implementation"
- Supports the Open/Closed Principle by allowing new types of products to be added without breaking existing client code