package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    private VirtualPet underTest;

    @BeforeEach
    void setUp() {
        underTest = new VirtualPet("","");
    }

    @Test
    public void shouldBeAbleToCreateVirtualPet() {
        VirtualPet underTest = new VirtualPet("","");
    }

    @Test
    public void petShouldHaveAnEmptyName() {
        String result = underTest.getName();
        assertEquals("", result);
    }

    @Test
    public void petShouldHaveHungerSetToTenByDefault() {
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
    public void petShouldHaveBoredomSetToZeroByDefault() {
        int result = underTest.getBored();
        assertEquals(0, result);
    }

    @Test
    public void petShouldIncreaseBoredomBy1() {
        underTest.bored();
        int result = underTest.getBored();
    }
    @Test
    public void activityShouldDecreaseBoredom(){
        for (int b = 10; b > 0; b--);
        underTest.activity();
    }

    @Test
    public void nameShouldInitializeToBlank(){
        underTest.getName();

    }

    @Test
    public void typeShouldInitializeToNoType(){
        underTest.getType();
    }



}
