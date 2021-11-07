import org.junit.jupiter.api.Test;
import ro.uvt.p3.lab7.Item;
import ro.uvt.p3.lab7.Player;
import ro.uvt.p3.lab7.Weapon;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerInventoryTest {
    @Test
    void playerInventory(){
        Player player = new Player("John");
        player.addItem(new Weapon("Sword of Ra", 20, 40));
        player.addItem(new Weapon("Sword of Gilgamesh", 20, 45));
        player.addItem(new Item("Stone"));

        List<Item> inv = player.getInventory();
        assertEquals("Sword of Ra", inv.get(0).getName());
        assertEquals("Sword of Gilgamesh", inv.get(1).getName());
        assertEquals("Stone", inv.get(2).getName());

    }

}
