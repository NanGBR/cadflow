package model.utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Utils {

    public static Stage currentStage(ActionEvent event) {
        return (Stage) ((Node) event.getSource()).getScene().getWindow();
    }

    public static Integer tryParseToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static Double tryParseToDouble(String str) throws ParseException {
            DecimalFormat dcf = new DecimalFormat("0.00");
            return dcf.parse(str).doubleValue();
    }

    public static <T> void formatTableColumnDate(TableColumn<T, LocalDate> tableColumn) {
        tableColumn.setCellFactory(column -> {
            TableCell<T, LocalDate> cell = new TableCell<T, LocalDate>() {
                @Override
                protected void updateItem(LocalDate item, boolean empty) {
                    super.updateItem(item, empty);
                    if (empty) {
                        setText(null);
                    } else {
                        setText(item.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
                    }
                }
            };
            return cell;
        });
    }

    public static <T> void formatTableColumnDouble(TableColumn<T, Double> tableColumn, int decimalPlaces) {
        tableColumn.setCellFactory(column -> {
            TableCell<T, Double> cell = new TableCell<T, Double>() {
                @Override
                protected void updateItem(Double item, boolean empty) {
                    super.updateItem(item, empty);
                    if (empty) {
                        setText(null);
                    } else {
                        setText(String.format("%." + decimalPlaces + "f", item));
                    }
                }
            };
            return cell;
        });
    }

    public static String getSeparadorDecimal() {
        DecimalFormatSymbols decimal = new DecimalFormatSymbols(Locale.getDefault());
        return String.valueOf(decimal.getDecimalSeparator());
    }

    public static void setTextFieldDouble(TextField txt) {
        txt.textProperty().addListener((obs, oldValue, newValue) -> {
            if (newValue != null && !newValue.matches("\\d*([\\"+getSeparadorDecimal()+"]\\d*)?")) {
                txt.setText(oldValue);
            }
        });
    }

}
