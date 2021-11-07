import org.junit.jupiter.api.Test;
import ro.uvt.p3.lab7.Player;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    @Test
    void playerFields(){
        Player player = new Player("John");
        assertEquals("John", player.getName(), "Name mismatch");
        assertEquals(100, player.getHP(), "Wrong HP init");
        assertEquals(100, player.getMaxHP(), "Wrong max HP init");
        assertEquals(100, player.getStamina(), "Wrong stamina init");
        assertEquals(100, player.getMaxStamina(),"Wrong max stamina init");
        assertEquals(1, player.getLevel(), "Wrong level init");

    }
}
