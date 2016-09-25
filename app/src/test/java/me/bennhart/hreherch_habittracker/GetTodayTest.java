package me.bennhart.hreherch_habittracker;

import junit.framework.TestCase;

import java.util.GregorianCalendar;

/**
 * Created by Ben on 2016-09-24.
 */
public class GetTodayTest extends TestCase {

    public void testGetDatePlus() {
        String aDay = "2016-09-24";
        String theNextDay = "2016-09-25";
        assertEquals( "testGetDatePlus: next day was not returned",
                      0, theNextDay.compareTo( GetToday.getDatePlus( aDay, 1 ) ) );

        aDay = "2015-02-28";
        theNextDay = "2015-03-01";
        assertEquals( "testGetDatePlus: formatter can't handle non-leap years",
                      theNextDay, GetToday.getDatePlus( aDay, 1 ) );
    }
}
