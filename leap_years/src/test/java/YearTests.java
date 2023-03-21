import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YearTests {

    Year year;

    @Test
    public void allYearsDivisibleBy400AreLeapYears() {
        year = new Year(2000);
        assertEquals(true, year.checkLeap());
    }

    @Test
    public void allYearsDivisibleBy100ButNotBy400AreNotLeapYears() {
        year = new Year(1700);
        assertEquals(false, year.checkLeap());
    }

    @Test
    public void allYearsDivisibleBy4ButNotBy100AreLeapYears() {
        year = new Year(2008);
        assertEquals(true, year.checkLeap());
    }

    @Test
    public void allYearsNotDivisibleBy4AreNotLeapYears() {
        year = new Year(2017);
        assertEquals(false, year.checkLeap());
    }
    
}
