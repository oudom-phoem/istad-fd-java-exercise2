Exercise 1: E-Commerce System
1. Base Class:
   - Create a class Product with attributes:
     - id (int)
     - name (String)
     - price (double)
   - Add a method calculateDiscount() that returns 0 (no discount).
   - Add a method displayDetails() to print product details.
2. Derived Classes:
   - Create a class Electronics that extends Product with an additional attribute:
     - warrantyYears (int)
   - Override calculateDiscount() to provide a 10% discount for warranties greater than 2 years.
   - Create another class Clothing with an additional attribute:
     - size (String: S, M, L, XL)
   - Override calculateDiscount() to provide a 15% discount.
3. Main Program:
   - Create an array of Product references to store Electronics and Clothing objects.
   - Demonstrate polymorphism by iterating through the array and displaying details and discounts. 