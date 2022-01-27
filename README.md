# Homework 05

## Exceptions. Lambdas. Streams

This homework contains only two tasks.

## Task 01

In this task, you will use the standard and create the custom `exceptions.` 

You need to improve the class [Account](src/main/java/com/softserveinc/task01/Account.java) 
in package [com.softserveinc.task01](src/main/java/com/softserveinc/task01).

The class [Account](src/main/java/com/softserveinc/task01/Account.java) contains two methods
`deposit()` and `withdraw()`. Both get as parameter amount of money.

In the methods `deposit()` and `withdraw()` you need to check if amount is negative. If so you should
throw the exception [IllegalArguemntException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/IllegalArgumentException.html).

Also, you should check the method `withdraw()`. If the amount is higher than the balance then throw the exception `NotMoneyEnoughException`.

You need create this exception in package [com.softserveinc.task01](src/main/java/com/softserveinc/task01).

**Note: pay attention to the comments marked TODO:**

## Task 02

The second task dedicated [Stream API](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html).

In the class [Task02](src/main/java/com/softserveinc/task02/Task02.java) you can find static
final field `EMPLOYEE`. It is the list of objects [Employee](src/main/java/com/softserveinc/task02/Employee.java) type.

You have 6 exercise (see the methods `ex01(), ex02(), ex03() etc`) in the class [Task02](src/main/java/com/softserveinc/task02/Task02.java).

Use the [Stream API](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html) to solve all of them:

1. Find and return list of all male employee with aged 18 to 27 (inclusive)
2. Compute the average age of all male
3. Count how many employees are male aged 18 to 60 and women aged 18 to 55
4. Return the list of employees was sort employee by name in descending order
5. Find and return the oldest employee
6. Find and return the youngest employee

**Note: pay attention to the comments marked TODO:**



