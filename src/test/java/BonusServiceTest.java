import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготовка данных:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызов целевого метода:
        long actual = service.calculate(amount, registered);

        // сравнение ОР и ФР:
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготовка данных:
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;

        // вызов целевого метода:
        long actual = service.calculate(amount, registered);

        // сравнение ОР и ФР:
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготовка данных:
        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        // вызов целевого метода:
        long actual = service.calculate(amount, registered);

        // сравнение ОР и ФР:
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForUnregisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготовка данных:
        long amount = 1_000_000_60;
        boolean registered = false;
        long expected = 500;

        // вызов целевого метода:
        long actual = service.calculate(amount, registered);

        // сравнение ОР и ФР:
        assertEquals(expected, actual);
    }
}