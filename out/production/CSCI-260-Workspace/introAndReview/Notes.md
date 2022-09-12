## CSCI 260 09-08-2022

### Types of Methods:

- Static Methods:
  - Belong to a class, and not an object
  - Use the static keyword:
  ```java
  public static int max(int num1, int num2){...}
    ```
  - Don't have access to class fields
  - Are invoked using the class name:
  ```java
  int result max = Math.max(5, 10);
    ```
### Abstract Data Types (ADTs)

- An abstract data type, or ADT, is a model of a data structure that specifies:
  - Characteristics of the Collection of Data
  - Operations that can be performed on the collection
- It is *abstract* because it doesn't specify how the ADT will be implemented.
- A given ADT can have multiple implementations