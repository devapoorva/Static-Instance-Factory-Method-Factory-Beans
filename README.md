# Spring Core Concept
- [Static Factory Method Instantiation](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-class-static-factory-method)
- Instance Factory Method Instantiation
- Factory Beans

### Static Factory Method Instantiation
  When defining a bean that you create with a static factory method, use the class attribute to specify the class that contains the static factory method and an attribute named factory-method to specify the name of the factory method itself.
  
`<bean id="clientService"
  class="examples.ClientService"
  factory-method="createInstance"/>`

