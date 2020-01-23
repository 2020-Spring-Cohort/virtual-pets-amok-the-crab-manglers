package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    private VirtualPet underTest;

    @BeforeEach
    void setUp() {
        underTest = new VirtualPet("", "");
    }

    @Test
    public void shouldBeAbleToCreateVirtualPet() {
        VirtualPet underTest = new VirtualPet("", "");
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
    public void typeShouldInitializeToNoType() {
        String result = underTest.getType();
        assertEquals("NOTYPE", result);
    }

    @Test
    public void statusShouldBeUnAdoptedByDefault() {
        String result = underTest.getStatus();
        assertEquals("unAdopted", result);
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

}
