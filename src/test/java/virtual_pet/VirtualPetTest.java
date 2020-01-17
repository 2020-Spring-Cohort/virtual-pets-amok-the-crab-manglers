package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    private VirtualPet underTest;

    @BeforeEach
    void setUp() {
        underTest = new VirtualPet("CRABORG");
    }

    @Test
    public void ShouldBeAbleToCreateVirtualPet() {
        VirtualPet underTest = new VirtualPet("CRABORG");
    }

    @Test
    public void petShouldHaveANameCraborg() {
        String result = underTest.getName();
        assertEquals("CRABORG", result);
    }

    @Test
    public void PetShouldHaveHungerSetToTenByDefault() {
        int result = underTest.getHunger();
        assertEquals(10, result);
    }

    @Test
    public void feedShouldDecreaseHungerBy3() {
        underTest.feed();
        int result = underTest.getHunger();
        assertEquals(7, result);
    }

    @Test
    public void feedingAPetShouldNotDecreaseHungerBellowZero() {
        for (int i = 0; i < 5; i++) {
            underTest.feed();
        }
        int result = underTest.getHunger();
        assertEquals(0, result);
    }

    @Test
    public void PetShouldHaveBoredomSetToZeroByDefault() {
        int result = underTest.getBored();
        assertEquals(0, result);
    }

    @Test
    public void PetShouldIncreaseBoredomBy1() {
        underTest.bored();
        int result = underTest.getBored();
    }
    @Test
    public void ActivityShouldDecreaseBoredom(){
        for (int b = 10; b > 0; b--);
        underTest.activity();
    }


}
