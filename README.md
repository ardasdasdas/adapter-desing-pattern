## Logger Adapter Pattern Example

This project demonstrates the use of the Adapter design pattern in Java, specifically using the Class Adapter approach. The Adapter pattern is used to allow incompatible interfaces to work together. In this example, we have an old logging system and a new logging system, and we want to use the new logging system without changing the existing code that relies on the old logging system.

### Project Structure
* OldLogger: The existing logging system that uses the logMessage method.
* NewLogger: The new logging system that uses the writeLog method.
* NewLoggerAdapter: The adapter class that allows the NewLogger to be used where OldLogger is expected.
* Main: The class that demonstrates the usage of the adapter.
