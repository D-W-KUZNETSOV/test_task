package com.gridnine.testing;

import java.util.ArrayList;
import java.util.List;

public class FlightFilterManager {
    private List<FlightFilter> filters;

    public FlightFilterManager() {
        filters = new ArrayList<>();
    }

    public void addFilter(FlightFilter filter) {
        filters.add(filter);
    }

    public List<Flight> filter(List<Flight> flights) {
        for (FlightFilter filter : filters) {
            flights = filter.filter(flights);
        }
        return flights;
    }
}