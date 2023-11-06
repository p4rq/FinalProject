# FinalProject

# Project Structure
The project is organized into several packages and classes:

- Adapter: Contains classes related to the adapter pattern.
- Decorator: Holds classes implementing the decorator pattern.
- Factory: Includes classes for implementing the factory pattern.
- Observer: Contains classes implementing the observer pattern.
- Singleton: Holds the singleton pattern implementation.
- Strategy: Contains classes associated with the strategy pattern.

## Design Patterns Used

### Singleton Pattern
- **Purpose**: Ensures a class has only one instance and provides a global point of access to it.
- **Implementation**: Used in the creation of the main application controller to manage the global state throughout the application lifecycle.

### Factory Method Pattern
- **Purpose**: Defines an interface for creating an object, but lets subclasses alter the type of objects that will be created.
- **Implementation**: Divides Astana into several districts(Almaty, Esil, Nura) and .

### Strategy Pattern
- **Purpose**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
- **Implementation**: Employed to provide various algorithms or strategies for processing data, which can be selected and applied at runtime depending on the current context or user preferences.

### Observer Pattern
- **Purpose**: Allows a subject to notify an array of observers about changes in its state.
- **Implementation**: Utilized to implement event handling where various parts of the application listen for and react to specific events, such as user actions or system events.

### Decorator Pattern
- **Purpose**: Attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
- **Implementation**: Used to add additional behaviors to objects at runtime without altering the code of the underlying classes.

### Adapter Pattern
- **Purpose**: Allows incompatible interfaces to work together. This is done by wrapping the otherwise incompatible object in an adapter to give it a compatible interface.
- **Implementation**: Used to integrate external libraries or services with incompatible interfaces into the application without modifying the original code.

These patterns are instrumental in ensuring that the project's codebase is easy to maintain, extend, and scale as new requirements emerge. Each pattern is applied following the principles of good software design to address specific issues within the project's context.

## Contributions

Please feel free to submit pull requests or create issues if you have suggestions or find a bug.

## License

This project is licensed under the [MIT License](LICENSE).
