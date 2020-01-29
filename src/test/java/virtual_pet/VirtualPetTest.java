package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class VirtualPetTest {

    private HashMap<String, String> tricks = new HashMap<>();
    private VirtualPet underTest = new VirtualPet("BOB", "O", tricks);

    @BeforeEach
    void setUp() {
        underTest = new VirtualPet("BOB", "O", tricks);
    }


    @Test
    public void petShouldHaveBlankName() {
        String result = underTest.getName();
        assertEquals("", result);
    }

    @Test
    public void petShouldHaveHungerSetToTenByDefault() {
        int result = underTest.getHunger();
        assertEquals(0, result);
        //10 means pet hungry.
    }

    @Test
    public void feedShouldDecreaseHungerBy3() {
        underTest.feedOrOil();
        int result = underTest.getHunger();
        assertEquals(0, result);
    }

    @Test
    public void feedingAPetShouldNotDecreaseHungerBellowZero() {
        for (int i = 0; i < 5; i++) {
            underTest.feedOrOil();
        }
        int result = underTest.getHunger();
        assertEquals(0, result);
    }

    @Test
    public void petShouldHaveBoredomSetToZeroByDefault() {
        int result = underTest.getBored();
        assertEquals(0, result);
    }

    @Test
    public void petShouldIncreaseBoredomBy1() {
        underTest.bored();
        int result = underTest.getBored();
        assertEquals(1, result);
    }

    @Test
    public void activityShouldDecreaseBoredom() {
        underTest.bored();
        underTest.activity();
        assertEquals(0, underTest.getBored());
    }


    @Test
    public void adoptedStatusShouldBeFalse() {
        boolean result = underTest.getAdopted();
        assertFalse(result);
    }

    @Test
    public void hungryShouldIncreaseHunger() {
        underTest.hungry();
        int result = underTest.getHunger();
        assertEquals(1, result);
    }

    @Test
    public void tickShouldIncreaseHunger() {
        underTest.tick();
        int result = underTest.getHunger();
        assertEquals(1, result);
    }

    @Test
    public void tickShouldIncreaseBoredom() {
        underTest.tick();
        int result = underTest.getBored();
        assertEquals(1, result);
    }

    @Test
    public void getHealthReturnsHealth() {
        int result = underTest.getHealth();
        assertEquals(100, result);
    }

    @Test
    public void adoptSetsAdoptedToTrue() {
        underTest.adopt();
        boolean result = underTest.getAdopted();
        assertTrue(result);
    }

    @Test
    public void getTypeShouldReturnType() {
        assertEquals("Organic", underTest.getType());
    }

    @Test
    public void getNameShouldReturnName() {
        assertEquals("BOB", underTest.getName());
    }


    @Test
    public void setHealthShouldChangeHealth() {
        underTest.setHealth(50);
        assertEquals(50, underTest.getHealth());
    }


}