import org.junit.jupiter.api.Test;
import ro.uvt.p3.lab7.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WeaponTest {
    @Test
    void testWeapon(){
        Weapon weapon = new Weapon("Sword of Ra", 20, 40);
        assertEquals("Sword of Ra", weapon.getName());
        assertEquals(20, weapon.getMinAttack());
        assertEquals(40, weapon.getMaxAttack());

        assertTrue(weapon instanceof Item, "Weapon must be a kind of Item");
        assertTrue(weapon instanceof Equipment, "Weapon must be a kind of Item");

        assertEquals(MountPoint.ATTACK_ARM, weapon.getMountPoint(), "wrong mounting point");
    }

}
