import controller.Controller;
import database.ConnectJDBC;
import service.FilmService;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.mainMenu();
    }
}
