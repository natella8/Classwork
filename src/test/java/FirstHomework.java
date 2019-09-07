import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstHomework {

    private Integer count_percentage(Integer number, Integer percentage) {
        return (number * percentage) / 100;
    }

    private Double fuelConsumption(Double fuel, Integer distance) {
        return (fuel / distance) * 100;
    }

    @Test
    public void runTests() {
        Integer percentageResult;
        Double consumptionResult;

        percentageResult = count_percentage(100, 5);
        consumptionResult = fuelConsumption(5.5, 100);

        Assertions.assertEquals(5, percentageResult, "True");
        Assertions.assertEquals(5.5, consumptionResult);

    }
}


