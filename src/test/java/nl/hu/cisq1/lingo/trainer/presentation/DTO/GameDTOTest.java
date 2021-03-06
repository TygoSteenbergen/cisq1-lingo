package nl.hu.cisq1.lingo.trainer.presentation.DTO;

import nl.hu.cisq1.lingo.trainer.domain.Game;
import nl.hu.cisq1.lingo.trainer.domain.Round;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameDTOTest {

    @Test
    void setId() {
        GameDTO gameDTO = new GameDTO(new Game());
        gameDTO.setId(Long.parseLong("1"));
        assertEquals(Long.parseLong("1"),gameDTO.getId());
    }

    @Test
    void testToString() {
        GameDTO gameDTO = new GameDTO(new Game());
        assertNotNull(gameDTO.toString());
    }
}