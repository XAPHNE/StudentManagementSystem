module com.xaphene.studentmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires MaterialFX;
    requires java.sql;
    requires mysql.connector.j;

    opens com.xaphene.studentmanagementsystem to javafx.fxml;
    exports com.xaphene.studentmanagementsystem;
}