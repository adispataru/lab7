import org.junit.jupiter.api.Test;
import ro.uvt.p3.lab7.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayerComparisonTest {
    @Test
    void playerInventory(){
        Player player = new Player("John");
        player.addItem(new Weapon("Sword of Ra", 20, 40));

        player.addItem(new Item("Stone"));

        player.levelUp();
        player.levelUp();

        Player p2 = new Player("Mary");
        p2.addItem(new Weapon("Sword of Ra", 20, 40));


        p2.levelUp();

        Player p3 = new Player("George");
        p3.addItem(new Weapon("Sword of Ra", 20, 40));
        p3.addItem(new Item("Stone"));

        p3.levelUp();

        List<Player> players = new ArrayList<Player>();
        players.add(player);
        players.add(p2);
        players.add(p3);

        Collections.sort(players);
        assertEquals(p2, players.get(0), "Wrong sort");
        assertEquals(p3, players.get(1), "Wrong sort");
        assertEquals(player, players.get(2), "Wrong sort");
    }
}
