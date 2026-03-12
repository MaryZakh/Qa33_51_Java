package lesson14_CatsMarket;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatMarketTest {
    CatMarket market;

    Cat[] cats = {
            new Cat(123, "Barsik", 4),
            new Cat(345, "Dasha", 1),
            new Cat(567, "Murzik", 8)
    };

    Cat sevka = new Cat(111, "Sevka", 12);


    @BeforeEach
    void setUp() {
        market = new CatMarket("Cats market", "Address2");
        for (Cat cat : cats) {
            market.addCat(cat);
        }
    }

    @Test
    void testAddCat() {
        assertEquals(cats.length,market.getCats().size());

       // Cat sevka = new Cat(111, "Sevka", 12);
        assertTrue(market.addCat(sevka));
        assertEquals(cats.length+1, market.getCats().size());
        assertTrue(market.getCats().contains(sevka));

        assertFalse(market.addCat(sevka));
        assertFalse(market.addCat(null));
        assertEquals(cats.length+1, market.getCats().size());
    }

    @Test
    void testRemoveCat() {
        // Cat sevka = new Cat(111, "Sevka", 12);
        assertTrue(market.removeCat(cats[0].getId()));
        assertEquals(cats.length-1,market.getCats().size());
        assertFalse(market.getCats().contains(cats[0]));

        assertFalse(market.removeCat(sevka.getId()));
        assertFalse(market.removeCat(-1000));
        assertEquals(cats.length-1,market.getCats().size());

    }

    @Test
    void testDisplay() {
        market.display();
    }
}