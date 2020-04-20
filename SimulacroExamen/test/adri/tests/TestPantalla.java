package adri.tests;

import adri.Principal;
import org.junit.Before;
import org.junit.Test;
import org.testfx.api.FxAssert;
import org.testfx.assertions.api.Assertions;
import org.testfx.framework.junit.ApplicationTest;
import org.testfx.matcher.control.TableViewMatchers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TestPantalla extends ApplicationTest {

    @Before
    public void setup() throws Exception {
        ApplicationTest.launch(Principal.class);
    }

    @Test
    public void probarReserva() {
        clickOn("#buttonReservar");
        FxAssert.verifyThat("#tableViewReservas", TableViewMatchers.containsRow("Aula 0", LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG))));
    }

}
