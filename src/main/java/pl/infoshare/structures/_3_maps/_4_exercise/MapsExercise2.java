package pl.infoshare.structures._3_maps._4_exercise;

import java.util.List;

public class MapsExercise2 {

    // TODO: Ćwiczenie 3 - Analiza danych
    // TODO: 1. Pogrupuj pracowników w zależności od managera do którego przynależą
    // TODO: 2. Wypisz po kolei managerów i pracowników którzy mu podlegają
    // TODO: 3. Wypisz pracowników najstarszego managera?*
    public static void main(String[] args) {
        EmployeeProvider employeeProvider = new EmployeeProvider();
        List<Employee> employees = employeeProvider.getEmployees();
    }
}
