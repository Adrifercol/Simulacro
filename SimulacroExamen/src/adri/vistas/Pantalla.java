package adri.vistas;

import adri.model.Reserva;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;

import java.time.LocalDate;

public class Pantalla  {

    @FXML
    public ComboBox<String> comboBoxAulas;

    @FXML
    public DatePicker datePickerFecha;

    @FXML
    public TableView<Reserva> tableViewReservas;

    public void initialize() {
        for (int i = 0; i <= 9; i++)
            comboBoxAulas.getItems().add("Aula " + i);

        comboBoxAulas.getSelectionModel().selectFirst();
        datePickerFecha.setValue(LocalDate.now());
    }

    public void reservar() {
        String aula = comboBoxAulas.getSelectionModel().getSelectedItem();
        LocalDate fecha = datePickerFecha.getValue();

        tableViewReservas.getItems().add(new Reserva(aula, fecha));

        comboBoxAulas.getItems().remove(aula);
    }

    public void liberar() {
        Reserva reserva = tableViewReservas.getSelectionModel().getSelectedItem();

        tableViewReservas.getItems().remove(reserva);
        comboBoxAulas.getItems().add(reserva.getAula());
    }
}
