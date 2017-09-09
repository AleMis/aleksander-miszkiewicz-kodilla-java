package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void agterAllTests() {
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    //Test 1: sprawdzający czy po dodaniu nowego kształtu (Shape) liczba postów wynosi 1.

    @Test
    public void testAddFigure() {
        //Given
        Triangle triangle = new Triangle( "Triangle",10.0);
        ShapeCollector collector = new ShapeCollector();
        //When
        collector.addFigure(triangle);
        //Then
        Assert.assertEquals(1, collector.getFigureNumbers());
    }

    //Test 2: sprawdzający czy Shape pobrany z klasy ShapeCollector jest taki sam jak Shape, który był wstawiany do klasy

    @Test
    public void testGetFigure() {
        //Given
        Triangle triangle = new Triangle( "Triangle", 10.0);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(triangle);

        //When
        Shape addedFigure;
        addedFigure = collector.getFigure(0);

        //Then
        Assert.assertEquals(triangle, addedFigure);
    }

    //Test 3: sprawdzający czy próba usunięcia nieistniejącego Shape'a skończy się zwróceniem wyniku false

    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        Triangle triangle = new Triangle("Triangle",10.0);
        ShapeCollector collector = new ShapeCollector();

        //When
        boolean result = collector.removeFigure(triangle);

        //Then
        Assert.assertFalse(result);
    }

    //Test 4: weryfikujący czy udało się usunąć wybrany Shape z klasy.

    @Test
    public void  testRemoveFigure() {
        //Given
        Triangle triangle = new Triangle( "Triangle",10.0);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(triangle);

        //When
        boolean result = collector.removeFigure(triangle);


        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, collector.getFigureNumbers());
    }


}
