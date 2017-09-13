## Factory Method

This pattern may remind some abstract factory questions, but it is in a method and acts with a subclass. It creates a product while an abstract factory creates a product family. Sometimes you do not know the concrete classes that will be needed to create at runtime,

It is simple, it can be used in conjunction with most patterns, such as abstract factory, builder, among others. It eliminates the creation / attachment of additional classes when you specify too much flexibility.

> problems:
It is a pattern that hardly has cons, but if the creation is to cover some classes that have little use it does not make much sense to use.
