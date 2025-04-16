package br.upe.mavenBasico;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ResultadoMegaSenaTests {
    private final static int NUMERO_DE_DEZENAS = 6;

    @Test
    public void testObtemUltimoResultado() {
        String[] ultimoResultado = ResultadoMegaCena.obtemUltimoResultado();
        assertNotNull(ultimoResultado);
        assertEquals(NUMERO_DE_DEZENAS, ultimoResultado.length);
    }
}

