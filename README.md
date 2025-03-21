## Distribution Efficiently Project

### Objective
The purpose of this project is to learn how to distribute an array and practice calculating the time and space complexity.

### Problem
You're required to create a function that divides the array into a two-dimensional array. 

The first parameter of the function should take an array, and the second parameter should take a number. 

Based on that number, we divide the arrays into a list and then group them into a two-dimensional array. Then, calculate the time and space complexity.

### Use case
Example One:
```java
distribution(arrOne, 2)
```
```
["one", "two", "three", "four", "five", "six", "seven", "eight"]
```
OUTPUT
```
[ ["one", "two", "three", "four"], ["five", "six", "seven", "eight"] ]
```

Example Two:
```
distribution(arrTwo, 3)
```
```java
["Majed", "Saud", "Fahad", "Fasial", "Sarah", "Noura"]
```
OUTPUT
```
[ ["Majed", "Saud"], ["Fahad", "Fasial"], ["Sarah", "Noura"] ]
```


### Implementation
- Create a function called **distribution** that takes an `ArrayList` as an argument and int which based on it you divide the array into arrays, and the return type should be `ArrayList<ArrayList<String>>`.
- Call the distribution function and pass the `arrOne`, and `2`.
- Call the distribution function and pass the `arrTwo`, and `3`.
- Calculate the time & space complexity of the distribution function and write it as a comment above the function.

### Qualification to pass
- [ ] The code should run successfully.
- [ ] Write all the required functions correctly.
- [ ] The Output should match the use case.
- [ ] The time and space complexity calculation result should be correct.

### Project submission instruction
> Fork the repository, then implement all the project requirements and finally make a pull request.
