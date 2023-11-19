# sdp

Name of project: Package delivery system
Group: SE-2219
Team members: Abidzhanov Ilyas, Aitkozha Arshat
Project overview:
The Package delivery system is designed to streamline the process of package delivery by incorporating various delivery strategies, options, and notifications. The system aims to provide flexibility in choosing delivery methods, adding options, and notifying users about their packages. The primary goal is to enhance the overall delivery experience for both users and delivery personnel.

Main body:
1. Factory Method Pattern
Classes: AirDeliveryFactory, RoadDeliveryFactory, DeliveryFactory
Description: The Factory Method Pattern is used to create instances of delivery strategies, allowing flexibility in selecting the type of delivery.
2. Strategy Pattern
Classes: AirDeliveryStrategy, RoadDeliveryStrategy, DeliveryStrategy
Description: The Strategy Pattern is implemented to define a family of algorithms (delivery strategies) and make them interchangeable. It enables selecting a delivery strategy dynamically.
3. Decorator Pattern
Classes: ExpressDeliveryDecorator, InsuranceDecorator, DeliveryDecorator
Description: Decorator Pattern is employed to add optional features to the delivery process dynamically. For example, adding express delivery or insurance options.
4. Observer Pattern
Classes: DeliveryObserver, EmailNotification, SMSNotification
Description: The Observer Pattern is used for implementing a notification system. Observers (notification types) are notified when a package's status changes.
5. Adapter Pattern
Classes: Transport, TransportAdapter
Description: The Adapter Pattern is implemented to adapt the Transport class into the DeliveryStrategy interface, providing a seamless integration of specialized transport in the delivery process.
6. Singleton Pattern
Classes: WarehouseManager
Description: The Singleton Pattern ensures that there is a single instance of the WarehouseManager, providing centralized management of warehouses.

UML diagram:
 ![image](https://github.com/ilich956/sdp/assets/125411778/059ece85-58c9-45ee-b196-1288a4834345)

Conclusion:
•	Key Points:
The project successfully implements various design patterns to achieve flexibility, extensibility, and maintainability in the delivery management system.
Design patterns such as Factory Method, Strategy, Decorator, Observer, and Adapter are utilized to address specific requirements.
•	Outcomes and Challenges:
Challenges were faced in integrating different design patterns seamlessly.
The project successfully provides a modular and extensible solution for package delivery.
•	Future Improvements:
Enhance user interface for better user experience.
Integrate real-time tracking features for packages.
Implement additional delivery strategies and options.
