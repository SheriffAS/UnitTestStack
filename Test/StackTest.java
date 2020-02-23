import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {



    Stack<Ski> skiStack;


    @BeforeEach
    void setUp() {

        skiStack = new Stack<>(10);

        try {
            skiStack.push(new Ski("Rebels","Head",165,11.4));
            skiStack.push(new Ski("Magnum","Head",180,17));
            skiStack.push(new Ski("Hero","Rossignol",160,10.6));
            skiStack.push(new Ski("Poachers","K2",185,19.6));
            skiStack.push(new Ski("Redster","Atomic",175,18.2));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @AfterEach
    void tearDown() {
        skiStack = null;
    }

    @Test
    void isEmpty() {

        // System.out.println(skiStack.getSize());


        int size = skiStack.getSize();

        for (int i=0;i<size;i++){

            try {

                skiStack.pop();


            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        assertEquals(true,skiStack.isEmpty());
    }

    @Test
    void isFull() {

        for (int a=skiStack.getSize();a<skiStack.getCapacity();a++){

            try {

                skiStack.push(new Ski("Ultrawide","Line",190,19.9));

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        assertEquals(true,skiStack.isFull());

    }

    @Test
    void push() {

        int previousSize = skiStack.getSize();


        Ski ski = new Ski("Lady","Volkl",150,13.5);

        try {

            skiStack.push(ski);


        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(previousSize+1,skiStack.getSize());

        assertEquals(ski,skiStack.top());
    }

    @Test
    void pop() {

        int previousSize = skiStack.getSize();

        Ski ski = skiStack.top();

        try {

            skiStack.pop();

        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(previousSize-1,skiStack.getSize());

        assertNotEquals(ski,skiStack.top());
    }

    @Test
    void top() {

        Ski ski = new Ski("Lady","Volkl",150,13.5);

        try {
            skiStack.push(ski);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(ski,skiStack.top());
    }

    @Test
    void topAndPop() {

        Ski ski = new Ski("Lady","Volkl",150,13.5);

        try {
            skiStack.push(ski);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            assertEquals(ski,skiStack.topAndPop());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void getSize() {
        assertEquals(5,skiStack.getSize());
    }

    @Test
    void getCapacity() {
        assertEquals(10,skiStack.getCapacity());
    }

    @Test
    void empty() {

        skiStack.empty();
        assertEquals(true,skiStack.isEmpty());

    }

}