import java.util.Scanner;
import Menu;

public class Server {
    public static void Menu(String [] args) throws Exeption{
        Database db = new Database();
        Menu menu1 = new Menu();
        Menu menu2 = new Menu();
        Menu menu3 = new Menu();

        menu1.setName("Bakso");
        menu2.setName("Es teh");
        menu3.setName("Brownies");

        menu1.setName("Pancake");
        menu2.setName("Es Jeruk");
        menu3.setName("Brownies");

        db.InsertMenu(menu1);
    }

    
}
