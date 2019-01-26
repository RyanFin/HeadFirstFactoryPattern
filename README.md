# HeadFirstFactoryPattern

Practising the factory design pattern from [Head First Design Patterns](http://shop.oreilly.com/product/9780596007126.do). 

## Factory Pattern (Factory Method)
The factory pattern is useful for instantiating many objects from a single factory with different types. The factory pattern relies on inheritance as object creation is delegated to subclasses, which implement the factory method to create objects.

The Factory superclasses are abstractions (either interfaces **or** abstract classes) that do not contain any concrete implementation values, therefore allowing the application to decouple client code. The factory method is key to encapsulating knowledge in parallel class hierarchies.

In this example the Factory pattern is used to ensure that products vary by region. With the factory method, each region gets its own concrete factory that knows how to make pizzas that are appropriate for the area.

### Project Generation
- Maven
	- Maven Script: $ mvn archetype:generate -DgroupId=com.headfirst -DartifactId=FactoryProject
	- Check project directory structure with [tree](http://macappstore.org/tree/)
