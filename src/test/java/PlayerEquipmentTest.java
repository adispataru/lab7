import org.junit.jupiter.api.Test;
import ro.uvt.p3.lab7.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayerEquipmentTest {

    @Test
    void playerEquipment(){
        Player player = new Player("John");
        player.addItem(new Weapon("Sword of Ra", 20, 40));
        player.addItem(new Weapon("Sword of Gilgamesh", 20, 45));
        player.addItem(new Item("Stone"));
        player.equip(MountPoint.ATTACK_ARM, 0);
        Equipment e = player.getEquipment(MountPoint.ATTACK_ARM);
        boolean allOk = false;
        try {
            Weapon weapon = (Weapon) e;
            assertEquals("Sword of Ra", weapon.getName());
            allOk = true;
        }catch (ClassCastException ex){
            assertTrue(allOk, "Could not create back weapon out of equipment");
        }
    }
}
