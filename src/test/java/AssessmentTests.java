import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;

public class AssessmentTests {

    @Before
    public void setup() {

    }

    /**************** Test Factorial Method *****************/
    @Test
    public void testFactorialMethod() {
        try {
            Assessment.class.getMethod("factorial", int.class);
            assertEquals(720, Assessment.factorial(6));
            assertEquals(3628800, Assessment.factorial(10));
            assertEquals(120, Assessment.factorial(5));
        } catch( NoSuchMethodException e ) {
            Assert.fail("factorial() method not found");
        } catch( Exception e) {
            Assert.fail("Something else went wrong with the factorial() method");
        }
    }

    /***************** Test Quotient Method *****************/
    @Test
    public void testQuotientMethod() {
        try {
            Assessment.class.getMethod("quotient", double.class, double.class);
            assertEquals(3.2, Assessment.quotient(16.0, 5.0), 0.2);
        } catch( NoSuchMethodException e ) {
            Assert.fail("quotient() method not found");
        }
    }

    /***************** Test minMaxSum Method *****************/
    @Test
    public void testMinMaxSumMethod() {
        /***************** Test minMaxSum Method *****************/
        try {
            Assessment.class.getMethod("minMaxSum", int[].class);
            int[] minMax1 = {1,2,3,4,5};             // 1 + 5 = 6
            int[] minMax2 = {100,1,44,22,77,99,2};   // 100 + 1 = 101
            int[] minMax3 = {-1,88,3,15,31,63,-2,0}; // 88 + -2 = 86
            assertEquals(6, Assessment.minMaxSum(minMax1));
            assertEquals(101, Assessment.minMaxSum(minMax2));
            assertEquals(86, Assessment.minMaxSum(minMax3));
        } catch (NoSuchMethodException e) {
            Assert.fail("minMaxSum() method not found");
        } catch (Exception e) {
            Assert.fail("Something else went wrong with the minMaxSum() method");
        }
    }

    /***************** Test Vehicle Class *****************/
    @Test
    public void testVehicleClass() {
        try {
            Class.forName("Vehicle");
            Vehicle.class.getMethod("getManufacturer");
            Vehicle.class.getMethod("getModel");
            Vehicle.class.getMethod("getCargoCapacity");
            Vehicle.class.getMethod("getModelYear");

            Vehicle miata = new Vehicle("Mazda", "Miata", 5, 1998);
            Vehicle mustang = new Vehicle("Ford", "Mustang", 10, 2005);
            Vehicle sprinter = new Vehicle("Mercedes", "Sprinter", 50, 2018);

            ArrayList<Vehicle> allAutos = new ArrayList<>();
            HashMap<String, Vehicle> carInventory = new HashMap<>();
            allAutos.add(miata);
            allAutos.add(mustang);
            allAutos.add(sprinter);

            assertEquals(1998, miata.getModelYear());
            assertNotEquals("1998", miata.getModelYear());
            assertEquals(2005, mustang.getModelYear());
            assertEquals(2018, sprinter.getModelYear());
        } catch( ClassNotFoundException e ) {
            Assert.fail("Vehicle Class not found");
        } catch( NoSuchMethodException e ) {
            Assert.fail("Getters and/or Setters not found in Vehicles Class");
        } catch( Exception e ) {
            Assert.fail("Something else went wrong with the Vehicle Class");
        }
    }

    /***************** Test createInventory Method *****************/
    @Test
    public void testCreateInventoryMethod() {
        try {
            Assessment.class.getMethod("createInventory", ArrayList.class);
            Vehicle miata = new Vehicle("Mazda", "Miata", 5, 1998);
            Vehicle mustang = new Vehicle("Ford", "Mustang", 10, 2005);
            Vehicle sprinter = new Vehicle("Mercedes", "Sprinter", 50, 2018);

            ArrayList<Vehicle> allAutos = new ArrayList<>();
            HashMap<String, Vehicle> carInventory;

            allAutos.add(miata);
            allAutos.add(mustang);
            allAutos.add(sprinter);

            carInventory = Assessment.createInventory(allAutos);
            assertEquals("Miata", carInventory.get("SATX0").getModel());
            assertEquals(1998, carInventory.get("SATX0").getModelYear());

            // TODO: Add a method to test for the storeStuff() string output
        } catch( NoSuchMethodException e ) {
            Assert.fail("createInventory() method not found");
        } catch( Exception e ) {
            Assert.fail("Something else went wrong with the ");
        }
    }

    /* Test for Question 4 */
    @Test
    public void testStoreStuff() {
        try {
            Class.forName("VehicleStorage");
            VehicleStorage.class.getMethod("storeStuff", String.class);
            Vehicle mustang = new Vehicle("Ford", "Mustang", 10, 2005);
            assertEquals("The Ford Mustang can store a measly 10 units of groceries.", mustang.storeStuff("groceries"));
        } catch(ClassNotFoundException e) {
            Assert.fail("VehicleStorage Interface not found");
        } catch(NoSuchMethodException e) {
            Assert.fail("storeStuff() interface method not found");
        }
        catch( Exception e) {
            Assert.fail("Something else went wrong with the testStoreStuff");
        }
    }

    /***************** Test the Truck Class *****************/
    @Test
    public void testTruckClass() {
        try {
            Class.forName("Truck").getMethod("hasTrailerHitch");
        } catch( ClassNotFoundException e ) {
            Assert.fail("Truck class not found");
        } catch ( NoSuchMethodException e ) {
            Assert.fail("hasTrailerHitch() not found - check to see if they called it isTrailerHitch()");
        } catch(Exception e) {
            Assert.fail("Something else went wrong in the Truck Class");
        }
        try {
            Truck frontier = new Truck("Nissan", "Frontier", 25, 2006, true);
            assertTrue(frontier.trailerHitch);
            assertTrue("Has a hitch", frontier.hasTrailerHitch());
        } catch( Exception e ) {
            Assert.fail("Something else went wrong with the Truck class");
        }
    }

    /******* Test for the Truck interface *******/
    @Test
    public void testVehicleStorageInterface() {
        try {
            Class.forName("VehicleStorage").getMethod("storeStuff", String.class);
        } catch(ClassNotFoundException e) {
            Assert.fail("Didn't find a class named VehicleStorage");
        } catch (Exception e) {
            Assert.fail("Something else went wrong with this test");
        }
    }
}