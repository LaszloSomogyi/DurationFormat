
package tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BasicTests {
    
    public BasicTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void exampleTests() {
        assertEquals("now", durationformat.DurationFormat.durationFormat(0));
        assertEquals("1 second", durationformat.DurationFormat.durationFormat(1));
        assertEquals("1 minute", durationformat.DurationFormat.durationFormat(60));
        assertEquals("1 minute and 2 seconds", durationformat.DurationFormat.durationFormat(62));
        assertEquals("2 minutes", durationformat.DurationFormat.durationFormat(120));
        assertEquals("1 hour", durationformat.DurationFormat.durationFormat(3600));
        assertEquals("1 hour, 1 minute and 2 seconds", durationformat.DurationFormat.durationFormat(3662));
        assertEquals("1 day and 1 second", durationformat.DurationFormat.durationFormat(86401));
        assertEquals("1 day and 1 minute", durationformat.DurationFormat.durationFormat(86460));
        assertEquals("1 day, 1 minute and 1 second", durationformat.DurationFormat.durationFormat(86461));
        assertEquals("14 days, 3 hours, 28 minutes and 43 seconds", durationformat.DurationFormat.durationFormat(1222123));
        assertEquals("2 years, 1 day and 1 minute", durationformat.DurationFormat.durationFormat(63158460));
        assertEquals("2 years, 1 day, 1 minute and 2 seconds", durationformat.DurationFormat.durationFormat(63158462));
        assertEquals("1 year, 1 minute and 2 seconds", durationformat.DurationFormat.durationFormat(31536062));
    }
}
