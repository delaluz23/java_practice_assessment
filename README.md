# Java Fundamentals Assessment

## Setup

1. Copy the clone address of this repo to your clipboard. 
1. Open up intelliJ and choose "Checkout from Version Control" or New->Project From Version Control->Git
1. Paste the github clone address.
1. Create a branch named `firstname-lastname` with your first and last names. See https://java.codeup.com/appendix/git/branching/ if you need directions to create a branch.
1. Write your code and commit on your branch, but don't push your branch until
   the assessment is over
1. Ensure that all of your commits happen before the deadline.
1. **Don't push until the assessment is over**.
1. Verify that your branch is present on GitHub.

## Problems

1. On your `Assessment` class file inside the `src/main/java` directory.

    - `factorial`

        Write a public static method named `factorial` that accepts an integer as
        input and returns that number's factorial.

        Hint: `5!` (5 factorial) is `1 x 2 x 3 x 4 x 5`

    - `quotient`

        Write a public static method named `quotient` that accepts two
        arguments (`divisor`, `dividend`) and returns the quotient of the two passed numbers. 
        The method should work with both integers and doubles, and should
        always return a double. 

        Hints

        - The quotient of 54 / 7 = 7.714... (don't worry about how many
        significant digits you return)
        - Don't separate the remainder from the answer - we want the exact
        result of dividing `divisor` / `dividend`
        - Using method overloading will help to solve this problem

    - `minMaxSum`

        Write a public static method named `minMaxSum` that takes in an `Array` of
        integers (not a `List`, an Array) and returns the sum of the smallest and
        largest numbers in the list as an `integer`.

        Hint: A good test is making sure the minMaxSum of `[1, 2, 3, 4]` is `5`
        Another possible test is making sure the minMaxSum of `[5, 2, 6, 20, 15]` is `22` 

1. Create a class named `Vehicle` inside of `src/main/java`.

    - The class should define 4 instance properties.

        - Two instance properties for `manufacturer` and `model` should both be `String`.
        - Two instance properties for `cargoCapacity` and `modelYear` should both be `int`.
        - These properties should not be accessible outside of the `Vehicle` class.

    - Create a constructor method that takes in two strings and two ints, and
      sets the `manufacturer`, `model`, `cargoCapacity`, and `modelYear` properties
      based on the passed arguments.
    - Inside the constructor, if either of the passed `manufacturer` or `model`
      arguments are `null`, or if the passed `cargoCapacity` or `modelYear` is 0, 
      the constructor should throw an `IllegalArgumentException`.
    - Create a getter and setter for each property of the class.

1. Create a class named `Truck` that inherits from `Vehicle`.

    - Add a protected instance property named `trailerHitch` that is a boolean.
      This property represents whether an instance of this class has a trailer hitch.
    - Write the constructor on `Truck` that defines 5 parameters: the manufacturer of
      that vehicle, the model name, the cargo capacity, the model year, and a boolean 
      indicating regardless of whether that vehicle has a trailer hitch. The corresponding 
      properties of the object should be set based on the arguments passed to the 
      constructor.
    - Write an instance method on the `Truck` class named `hasTrailerHitch`
      that returns a boolean indicating whether the truck has a
      trailer hitch or not, based on the `trailerHitch` property.

1. Create an interface named `VehicleStorage`

    - This interface should specify an instance method named `storeStuff` that
      accepts one `String` argument named `stuff` and returns a `String`
    - Change your `Vehicle` class so that it implements the `VehicleStorage` interface
    - The implementation of the `storeStuff` method should return a String with
      this message:
      
    ```
    The $MANUFACTURER $CAR_MODEL can store a $ADJECTIVE $SPACE units of $STUFF.
    ```
   
   Replace | with... | This comes from
   --- | --- | ---
   $MANUFACTURER | The vehicle manufacturer | the instance property `manufacturer`
   $CAR_MODEL | The model of the vehicle | the instance property `model`
   $ADJECTIVE | "whopping" or "measly" | (see note below)
   $SPACE | The cargo capacity of the vehicle | the instance property `cargoCapacity`
   $STUFF | The argument `stuff` that was passed to the method | the string you manually passed in
   
   `$ADJECTIVE` should be replaced with either `whopping` or `measly`. Use the value of the instance property
   `cargoCapacity` to replace `$ADJECTIVE` with either `measly` if the `cargoCapacity` is less than 20, or 
   `whopping` if the `cargoCapacity` is greater than or equal to 20.
   
   An example return string if `cargoCapacity` => `11`, `model` => `Mustang`, and the `stuff` argument => `groceries`
    might look like:
   
   ```
   The Ford Mustang can store a measly 11 units of groceries.
   ```  

1. Create a static method named `createInventory` on the Assessment class.

    This class should take in an `ArrayList` of `Vechicle` objects.

    The method should return a `HashMap<String, Vehicle>`. The keys of the
    returned HashMap should be a license plate number generated automatically. The license plate number
    is created by a String that starts with "SATX" and ends with a number matching the ArrayList index,
    i.e. `SATX0`, `SATX1` , `SATX2`, etc. The value of the HashMap is the vehicle instance itself. Examples:
    ```
    
    
    The purpose of the License Plate Number as a key in a HashMap is to be able to find vehicles like this:
    
    HashMap<String, Vehicle> inventory = Assessment.createInventory(vehicles); 
    inventory.get("SATX0"); -> this line would return the first Vehicle object in the car website
    ```

## Grading

A Total of 5 Points are available. One point will be awarded per problem if the
provided solution fulfills all the specifications for the problem.

**If a class does not compile, no points can be awarded for it.** It would be
*wise* to spend the last ~15 minutes of the assessment ensuring that your code is error-free.

## Testing your Code

You can (and are encouraged to) write a `main` method on any or all of your
classes to test the code that you have written. The presence or absence of a
`main` method will not affect your grade.

### JUnit Testing

While this assessment does not assess your JUnit test writing capability, we have provided some JUnit tests to confirm the accuracy of your implementations for the questions. These tests are in the **src/test** directory of this project.

As you complete each method / class, you can run the corresponding method test, located in the src/test/java/**AssessmentTests.java** class. Simply press the green Play button next to each of the tests, and run them to test your completed code.

**If you do not want to run the tests (or don't want the tests to cause your code to not compile) - you can simply comment out the entire AssessmentTests.java file.** _You can uncomment out the parts you want to test as you write the code for them._