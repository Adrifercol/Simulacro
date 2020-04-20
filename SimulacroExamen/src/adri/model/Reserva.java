package adri.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Objects;

public class Reserva {
    private String aula;
    private LocalDate fecha;

    public Reserva(String aula, LocalDate fecha) {
        this.aula = aula;
        this.fecha = fecha;
    }

    public String getAula() {
        return aula;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getFechaFmt() {
        return fecha.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return aula.equals(reserva.aula) &&
                fecha.equals(reserva.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aula, fecha);
    }
}
