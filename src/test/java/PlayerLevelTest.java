import org.junit.jupiter.api.Test;
import ro.uvt.p3.lab7.Player;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerLevelTest {
    @Test
    void playerFields(){
        Player player = new Player("John");

        player.levelUp();
        assertEquals(120, player.getMaxHP(), "max HP not not updated");
        assertEquals(120, player.getHP(), "HP not not updated when level up");
        assertEquals(120, player.getMaxStamina(), "max Stamina not not updated when level up");
        assertEquals(120, player.getStamina(),"Stamina not not updated when level up");
        assertEquals(2, player.getLevel(), "level not updated");

        player.levelUp();
        assertEquals(3, player.getLevel(), "level not updated");
        assertEquals(144, player.getMaxHP(), "max HP not not updated");
        assertEquals(144, player.getHP(), "HP not not updated when level up");
        assertEquals(144, player.getMaxStamina(), "max Stamina not not updated when level up");
        assertEquals(144, player.getStamina(),"Stamina not not updated when level up");

    }
}
