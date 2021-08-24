package com.traffic.trainstation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.traffic.trainstation.query.TrafficQuery;

public class TrafficQueryTest {
    TrafficQuery tq;

    @Before
    public void setUp(){
        tq = new TrafficQuery();
    }

    @Test
    public void canCreateObject(){
        assertTrue(tq != null);
    }
}
