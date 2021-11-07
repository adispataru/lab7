import org.junit.jupiter.api.Test;
import ro.uvt.p3.lab7.Item;
import ro.uvt.p3.lab7.Player;
import ro.uvt.p3.lab7.Weapon;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerWeaponsTest {
    @Test
    void bestWeapon(){
        Player player = new Player("John");
        player.addItem(new Weapon("Sword of Ra", 20, 40));

        player.addItem(new Item("Stone"));


        Player p2 = new Player("Mary");
        p2.addItem(new Weapon("Sword of Zeus", 10, 45));




        Player p3 = new Player("George");
        p3.addItem(new Weapon("Sword of Gilgamesh", 25, 45));

        p3.addItem(new Item("Stone"));



        List<Player> players = new ArrayList<Player>();
        players.add(player);
        players.add(p2);
        players.add(p3);

        Weapon weapon = Player.findBestWeapon(players);
        assertEquals("Sword of Gilgamesh", weapon.getName(), "Wrong weapon chosen");
    }
}
