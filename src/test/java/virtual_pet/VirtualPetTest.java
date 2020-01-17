package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    @Test
    public void ShouldBeAbleToCreateVirtualPet() {
        VirtualPet underTest = new VirtualPet("CRABORG");
    }

    @Test
    public void petShouldHaveANameCraborg() {
        VirtualPet underTest = new VirtualPet("CRABORG");
        String result = underTest.getName();
        assertEquals("CRABORG", result);
    }

    @Test
    public void PetShouldHaveHungerSetToTenByDefault() {
        VirtualPet underTest = new VirtualPet("CRABORG");
        int result = underTest.getHunger();
        assertEquals(10, result);
    }

    @Test
    public void feedShouldDecreaseHungerBy3() {
        VirtualPet underTest = new VirtualPet("CRABORG");
        underTest.feed();
        int result = underTest.getHunger();
        assertEquals(7, result);
    }

    @Test
    public void feedingAPetShouldNotDecreaseHungerBellowZero() {
        VirtualPet underTest = new VirtualPet("CRABORG");
        for (int i = 0; i < 5; i++) {
            underTest.feed();
        }
        int result = underTest.getHunger();
        assertEquals(0, result);
    }


}
