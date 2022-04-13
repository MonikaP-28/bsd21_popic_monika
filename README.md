# CalculatorSys
## What does the program do?
CalculatorSys is a program with which you can carry out simple mathematical calculations. 
You can enter two numbers and then choose whether you want to add, subtract, divide or multiply the two numbers together.
All entries are made on the console.

## Installation
To use the program you need [IntelliJ](https://www.jetbrains.com/de-de/idea/download/#section=windows)

- If you have installed the program, open the CalculatorSys.java document
- Then Run the program
- You can then enter the individual parameters in the console

## How does the project work?
### Methods
- `input(String s)` 
    - to enter the first value
    - You can only enter a positive double
- `operator(String s)` 
    - to enter the operator (*, -, +, /)
- `input2(String s)` 
    - to enter the second value
    - You can only enter a positive double
    - 0 can't be entered with this method if "/" was entered before 
### Exceptions
- If an incorrect value or operator is entered an exception is thrown with an error message
    - letters and negative numbers are not allowed
- a division by 0 is not allowed
## Information about the output
- the result is rounded to two decimal places

## Exercises
- Exercise 1 - [exercise1](exercise1.md)
- Exercise 2 - [exercise2](exercise2.md)
- Exercise 3 - [exercise3](exercise3.md) 

## Author
Monika Popic

[github-profile](https://github.com/MonikaP-28)

[fh-profile](https://www.campus02.at/)
