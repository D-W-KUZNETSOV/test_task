import com.gridnine.testing.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Flight> flights = FlightBuilder.createFlights(); // Получаем тестовые перелеты

        FlightFilterManager filterManager = new FlightFilterManager();

        // Фильтрация по времени вылета
        filterManager.addFilter(new DepartureTimeFilter());
        List<Flight> filteredByDepartureTime = filterManager.filter(flights);
        System.out.println("Перелеты после фильтрации по времени вылета:");
        filteredByDepartureTime.forEach(flight -> System.out.println(flight));

        // Сбросим фильтры для следующей проверки
        filterManager = new FlightFilterManager();

        // Фильтрация по времени прилета
        filterManager.addFilter(new ArrivalBeforeDepartureFilter());
        List<Flight> filteredByArrivalTime = filterManager.filter(flights);
        System.out.println("Перелеты после фильтрации по времени прилета:");
        filteredByArrivalTime.forEach(flight -> System.out.println(flight));

        // Сбросим фильтры для следующей проверки
        filterManager = new FlightFilterManager();

        // Фильтрация по времени на земле
        filterManager.addFilter(new GroundTimeFilter());
        List<Flight> filteredByGroundTime = filterManager.filter(flights);
        System.out.println("Перелеты после фильтрации по времени на земле:");
        filteredByGroundTime.forEach(flight -> System.out.println(flight));
    }
}
