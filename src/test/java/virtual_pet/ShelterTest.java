package virtual_pet;


import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShelterTest {
    private Shelter underTest = new Shelter();

    @Test
    public void AdoptionShouldChangeStatusToAdopted() {
        underTest.choosePet("Bob");
        assertTrue(underTest.pets.get("BOB").getAdopted());
    }
    @Test
        public void adoptionShouldChangeStatusToAdopted(){
        underTest.choosePet("Charlie");
        assertTrue(underTest.pets.get("CHARLIE").getAdopted());
    }
    @Test
    public void numberOfPetsShouldBeTwo(){
        int result = underTest.getNumberOfPets();
        assertEquals(result, 2);
    }

    @Test
    public void listAllPets(){
        String result = underTest.listPets();
        assertEquals("[BOB, CHARLIE]", result);

    }

}
