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
- **Implementation**: We've declared a volatile static instance of CLIrunner that will hold the lazily-initialized Singleton instance. The volatile keyword ensures that changes to the instance are visible to all threads.

### Factory Method Pattern
- **Purpose**: Defines an interface for creating an object, but lets subclasses alter the type of objects that will be created.
- **Implementation**: Divides Astana into several districts(Almaty, Esil, Nura) and shows the name of district.

### Strategy Pattern
- **Purpose**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
- **Implementation**: Calculates the price per n square meter, specific company and class

### Observer Pattern
- **Purpose**: Allows a subject to notify an array of observers about changes in its state.
- **Implementation**: Receives by e-mail the price of the ordered square meter

### Decorator Pattern
- **Purpose**: Attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
- **Implementation**: ....

### Adapter Pattern
- **Purpose**: Allows incompatible interfaces to work together. This is done by wrapping the otherwise incompatible object in an adapter to give it a compatible interface.
- **Implementation**: Adapter pattern converts the sum of price of "n" square metres into several(Dollar, Euro, Ruble) currencies.

These patterns are instrumental in ensuring that the project's codebase is easy to maintain, extend, and scale as new requirements emerge. Each pattern is applied following the principles of good software design to address specific issues within the project's context.

## Contributions

Please feel free to submit pull requests or create issues if you have suggestions or find a bug.

## License

This project is licensed under the [MIT License](LICENSE).
