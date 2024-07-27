# Light Control Command Pattern

## Overview
Demonstration of the Command design pattern using a simple light control system. It shows how to encapsulate requests as objects, allowing for parameterization of clients with different requests, queue or log requests, and support undoable operations.

## Design Pattern: Command
The Command pattern is a behavioral design pattern that turns a request into a stand-alone object containing all information about the request. This transformation allows you to pass requests as method arguments, delay or queue a request's execution, and support undoable operations.

## Structure
This use case consists of the following components:

1. Command (Interface)
   - Declares the execute method for performing an action

2. Concrete Commands
   - LightOnCommand: Implements the Command interface to turn the light on
   - LightOffCommand: Implements the Command interface to turn the light off

3. Light (Receiver)
   - Performs the actual actions (turning on/off)

4. RemoteControl (Invoker)
   - Asks the command to carry out the request

5. Main (Client)
   - Creates concrete Command objects and sets them on the Invoker

## How It Works
1. The client creates a receiver object and concrete command objects, associating the receiver with the commands
2. The client creates an invoker object and associates it with specific commands
3. The client calls the execute method on the invoker, which in turn calls the execute method on the command object
4. The concrete command executes the corresponding operation on the receiver

## Key Features
- Decouples the object that invokes the operation from the one that knows how to perform it
- Allows you to construct a sequence of commands by adding multiple commands to the invoker
- Easy to add new commands without changing existing code

## Use Case
This pattern is particularly useful when:
- You need to parameterize objects by an action to perform
- You want to queue operations, schedule their execution, or execute them remotely
- You need to implement reversible operations

## Benefits
- Single Responsibility Principle: You can decouple classes that invoke operations from classes that perform these operations
- Open/Closed Principle: You can introduce new commands into the app without breaking existing client code
- You can implement undo/redo functionality
- You can assemble complex commands from simpler ones