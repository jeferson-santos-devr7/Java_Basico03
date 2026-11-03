public class Exercicio13 {
    static double converterCelsius(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static void main(String[] args) {
        double celsius = 30.0;
        double fahrenheit = converterCelsius(celsius);
        System.out.println(celsius + "°C equivalem a " + fahrenheit + "°F.");
    }
}