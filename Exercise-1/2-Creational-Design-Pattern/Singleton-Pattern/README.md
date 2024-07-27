# Database Connection Singleton

## Overview
Demonstration of the Singleton design pattern using a database connection example. It ensures that only one instance of the database connection is created and used throughout the application.

## Design Pattern: Singleton
The Singleton pattern restricts the instantiation of a class to a single instance and provides a global point of access to that instance.

## Structure
This use case consists of two main components:

1. DatabaseConnection (Singleton Class)
   - Manages the single instance of the database connection
   - Provides a method to get the instance
   - Stores and returns the connection string

2. Application (Main Class)
   - Demonstrates the usage of the Singleton

## How It Works
1. The DatabaseConnection class uses double-checked locking for thread-safe lazy initialization
2. The getInstance() method ensures only one instance is created
3. The connection string is simulated in the private constructor
4. The Application class shows that multiple calls to getInstance() return the same instance

## Key Features
- Thread-safe implementation using synchronized block
- Lazy initialization: the instance is created only when first requested
- Private constructor prevents direct instantiation
- Static method provides global access point to the instance

## Use Case
This pattern is useful in scenarios where:
- Exactly one instance of a class is needed throughout the application
- Strict control over global state or resources is required
- You want to avoid the overhead of creating multiple instances

## Benefits
- Ensures a class has only one instance
- Provides a global access point to that instance
- Lazy initialization improves performance by creating the instance only when needed
- Thread-safe implementation ensures correct behavior in multi-threaded environments