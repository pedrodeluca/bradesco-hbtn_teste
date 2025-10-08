import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    Person person = new Person();

    @BeforeEach
    public void setup() {
        person.setName("Paul");
        person.setSurname("McCartney");
        person.setBirthDate(new Date(2000, Calendar.FEBRUARY, 1));
        person.setSalary(2000);
        person.setAnotherCompanyOwner(true);
        person.setPensioner(true);
        person.setPublicServer(true);
    }

    @Test
    public void show_full_name() {
        assertEquals("Paul McCartney", person.fullName());
    }

    @Test
    public void test_calculateYearlySalary() {
        person.setSalary(1200);
        assertEquals(14400, person.calculateYearlySalary());
    }

    @Test
    public void person_is_MEI() {
        person.setAnotherCompanyOwner(false);
        person.setPensioner(false);
        person.setPublicServer(false);
        person.setBirthDate(Date.from(java.time.LocalDate.now().minusYears(19).atStartOfDay()
                .atZone(java.time.ZoneId.systemDefault()).toInstant()));
        assertTrue(person.isMEI());
    }

    @Test
    public void person_is_not_MEI() {
        assertFalse(person.isMEI());
    }
}
