# solutions
**Problem 1:** Java program that generates a Fibonacci sequence
File:[Solutions/FibonacciSequence.java](Solutions/FibonacciSEquence.java)
Description:This file contains solutions to the Fibonacci sequence problem.The purpose of the above code is to generate and print the Fibonacci sequence up to a given input number. The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1.
Code Description-First we import the scanner from the java.util package which is used for user input.Inside the main method we create a Scanner object called scanner to read user input .getValidInput will prompt the user to enter the correct input and it is stored in the userInput variable.The fibonacci sequence is then generated using a for loop as it iterates from 0 to userInput-1 to calculate each number at each position and print it in the console.
Next ,is a private method called fibonnaci which calculates the number at given position (n) and store them in an array.If n is 0, it returns 0 because the Fibonacci sequence starts with 0.
If n is 1, it returns 1 because the second Fibonacci number is 1.
If fibArray[n] is not 0, it means the Fibonacci number at position n has already been calculated and stored in the fibArray. In this case, it directly returns the value from the array.
If none of the above conditions are met, it recursively calculates the Fibonacci number at position n by summing the Fibonacci numbers at positions n - 1 and n - 2. The calculated Fibonacci number is stored in the fibArray for future use and then returned.
The getValidInput method is defined. It takes a Scanner object as a parameter and returns a valid positive integer input from the user.A userInput variable is initialized to 0, and a isValid variable is set to false to indicate that the input is not yet valid.The method enters a while loop that continues until a valid input is provided by the user.Inside the loop, the user is prompted to enter a positive integer.
The scanner.hasNextInt() method is used to check if the user input is an integer. If it is, the code inside the if statement is executed.The user's input is stored in the userInput variable using the scanner.nextInt() method.

If the userInput is greater than or equal to 0, it is considered valid, and the isValid flag is set to true.If the userInput is less than 0, an error message is printed, indicating that a positive integer is required.
If the user's input is not an integer, an error message is printed, and the scanner.next() method is called to discard the invalid input.Once a valid input is obtained, the method exits the loop and returns the userInput value.

**Problem 2:** Write a Java program that takes a list of integers as input and returns the largest difference between any two numbers in the list.
File:[Solutions/FindLargestDifference](Solutions/LargestDifference.java)
Description: This file contains a solution to a problem of finding a largest difference between the two numbers in the list.
The class FindLargestDifference takes a List<Integer> called numbers as input and returns an integer, representing the largest difference between any two numbers in the list.The if statement checks if the numbers in the list is less than 2 so that it can be enough for difference to be calculated.
minNum is declared and innitialized with the value of the first element which is numbers using the (numbers.get(0)).MaxDiff is initialized to 0.We then loop through the list using a for loop starting from i=1 to the last element (i< numbers.size).As the loop iterates ,it allows us to get each element from the list using (numbers.get(i)) and assigning it to currentNum variable .The difference is then calculated between the currentNum and minNum and assigned to a diff variable and is compared to the maxDiff .If the difference is larger than maxDiff then we have found a new maximum difference.
currentNum is also compared with minNum and if the currentNum is less than minNum,we assigned it to minNum variable and that is our minimum number.After the loop finishes iterating through all the numbers in the list, the method returns the largest difference stored in the variable maxDiff.

**Problem 3:** An SQL query that selects all employees whose age is above 30 and salary is above $50,000
File:[Solutions/Employee_querry.sql](Solutions/Employee_querry.sql)
Description:The purpose of this problem is to get the correct SQL querry to extract the required employee .    SELECT * FROM employees WHERE age > 30 AND salary > 50000;
The SELECT statement extract all columns from employees table.FROM employees specified the table name where the data will be retrived.WHERE statement filters the rows from which employee will be extracted based on the specified conditions.For example in this case,age is more than 30 and salary is more than $50,000.It will extract all employees whose age is more tahn 30 and their salary is more than $50,000.

**Problem 4:** Idetify a bug and fix the code so that it correctly calculates and
displays the average.
File:[Solutions/AverageCalculator.java](Solutions/AverageCalculator.java)
Description:The purpose of this problem fix a bug through problem solving skills .By going through each line of code,i identified the problem.
The code has a bug at the division part .The bug is about the division of the total and numbers.Length which are both intergers and it was performing interger division and therefore Truncating the decimal part.By adding double to the division part ,this bug was solved because division is now performed using floating-point arithmetic.The total variable is explicitly cast to a double before dividing by numbers.length. This ensures that the division is performed using floating-point arithmetic, resulting in the correct average with decimal precision.



