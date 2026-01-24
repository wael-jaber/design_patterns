### **Structural Design Patterns in Go**

Structural design patterns focus on composing objects and interfaces into larger structures while keeping these structures flexible, efficient, and easy to maintain.

This directory contains idiomatic **Go** implementations of structural design patterns, leveraging composition, interfaces, and clear separation of responsibilities.

- [Adapter](#adapter)
- [Bridge](#bridge)
- [Composite](#composite)
- [Decorator](#decorator)
- [Facade](#facade)
- [Proxy](#proxy)

---

## **Adapter**

The **Adapter** pattern allows objects with incompatible interfaces to work together by wrapping an existing class with a new interface.

### Implementation Files

- [target.go](./adapter/target.go)
- [adaptee.go](./adapter/adaptee.go)
- [adapter.go](./adapter/adapter.go)

### Test Files

- [target_test.go](./adapter/target_test.go)
- [adaptee_test.go](./adapter/adaptee_test.go)
- [adapter_test.go](./adapter/adapter_test.go)

---

## **Bridge**

The **Bridge** pattern decouples an abstraction from its implementation so that the two can vary independently.

### Implementation Files

- [renderer.go](./bridge/renderer.go)
- [vector_renderer.go](./bridge/vector_renderer.go)
- [raster_renderer.go](./bridge/raster_renderer.go)
- [shape.go](./bridge/shape.go)
- [circle.go](./bridge/circle.go)
- [square.go](./bridge/square.go)

### Test Files

- [renderer_test.go](./bridge/renderer_test.go)
- [vector_renderer_test.go](./bridge/vector_renderer_test.go)
- [raster_renderer_test.go](./bridge/raster_renderer_test.go)
- [shape_test.go](./bridge/shape_test.go)
- [circle_test.go](./bridge/circle_test.go)
- [square_test.go](./bridge/square_test.go)

---

## **Composite**

The **Composite** pattern lets clients treat individual objects and compositions of objects uniformly.

### Implementation Files

- [node.go](./composite/node.go)
- [file.go](./composite/file.go)
- [folder.go](./composite/folder.go)

### Test Files

- [node_test.go](./composite/node_test.go)
- [file_test.go](./composite/file_test.go)
- [folder_test.go](./composite/folder_test.go)

---

## **Decorator**

The **Decorator** pattern attaches additional responsibilities to an object dynamically.

### Implementation Files

- [notifier.go](./decorator/notifier.go)
- [email_notifier.go](./decorator/email_notifier.go)
- [sms_decorator.go](./decorator/sms_decorator.go)
- [slack_decorator.go](./decorator/slack_decorator.go)

### Test Files

- [notifier_test.go](./decorator/notifier_test.go)
- [email_notifier_test.go](./decorator/email_notifier_test.go)
- [sms_decorator_test.go](./decorator/sms_decorator_test.go)
- [slack_decorator_test.go](./decorator/slack_decorator_test.go)

---

## **Facade**

The **Facade** pattern provides a simplified interface to a complex subsystem.

### Implementation Files

- [amplifier.go](./facade/amplifier.go)
- [dvd_player.go](./facade/dvd_player.go)
- [projector.go](./facade/projector.go)
- [home_theater_facade.go](./facade/home_theater_facade.go)

### Test Files

- [amplifier_test.go](./facade/amplifier_test.go)
- [dvd_player_test.go](./facade/dvd_player_test.go)
- [projector_test.go](./facade/projector_test.go)
- [home_theater_facade_test.go](./facade/home_theater_facade_test.go)

---

## **Proxy**

The **Proxy** pattern provides a surrogate or placeholder for another object to control access to it.

### Implementation Files

- [service.go](./proxy/service.go)
- [real_service.go](./proxy/real_service.go)
- [proxy_service.go](./proxy/proxy_service.go)

### Test Files

- [service_test.go](./proxy/service_test.go)
- [real_service_test.go](./proxy/real_service_test.go)
- [proxy_service_test.go](./proxy/proxy_service_test.go)

---

## **Conclusion**

This directory demonstrates idiomatic Go implementations of structural design patterns, with a strong focus on:

- Composition over inheritance
- Interface-based design
- Loose coupling between components
- Clear separation of concerns
- Comprehensive unit testing
