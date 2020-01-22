package virtual_pet;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShelterTest {
    private Shelter underTest = new Shelter();

    @Test
    public void AdoptionShouldChangeStatusToAdopted(){
        underTest.choosePet("Bob");
        assertEquals("Adopted",underTest.pets.get("Bob").getStatus());
    }

}
