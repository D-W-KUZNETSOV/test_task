package com.gridnine.testing;

import java.util.List;

interface FlightFilter {
    List<Flight> filter(List<Flight> flights);
}