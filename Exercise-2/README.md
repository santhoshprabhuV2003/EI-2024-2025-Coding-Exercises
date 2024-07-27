# Satellite Command System

## Overview
Demonstration of the Command design pattern in a satellite control system. It allows for flexible and extensible control of a satellite's operations through encapsulated command objects.

## Design Pattern: Command
The Command pattern is a behavioral design pattern that turns a request into a stand-alone object containing all information about the request. This transformation allows for parameterization of clients with different requests, queue or log requests, and support undoable operations.

## Structure
This use case consists of the following components:

1. Satellite (Receiver)
   - Represents the satellite with its state and operations

2. Command (Interface)
   - Declares the execute method for performing an action

3. Concrete Commands
   - RotateCommand: Rotates the satellite
   - ActivatePanelsCommand: Activates solar panels
   - DeactivatePanelsCommand: Deactivates solar panels
   - CollectDataCommand: Collects data from the satellite

4. CommandExecutor (Invoker)
   - Executes the commands

5. Main (Client)
   - Creates concrete Command objects and uses the CommandExecutor to run them

## How It Works
1. The Satellite class maintains its state and defines operations
2. Each command encapsulates a specific action on the satellite
3. The CommandExecutor receives and executes commands
4. The client creates command objects and passes them to the executor

## Key Features
- Decouples the object that invokes the operation from the one that performs it
- Allows for easy addition of new commands without changing existing code
- Provides a uniform way to issue commands to the satellite

## Use Case
This pattern is particularly useful for:
- Implementing remote control systems
- Supporting undo/redo functionality
- Queueing and executing commands at different times
- Structuring a system around high-level operations built on primitive operations