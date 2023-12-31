package br.com.infnet;

import br.com.infnet.exception.ValorInvalidoException;
import br.com.infnet.util.ConversorDeMassas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import  org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ConversorDeMassasTests {
    @Test
    @DisplayName("Deve Converter de KGS para Libras")
    public void KilosParaLibras(){
        ConversorDeMassas conversorDeMassas = new ConversorDeMassas();
        double libras = conversorDeMassas.kilosParaLibras(1);
        assertEquals(2.204,libras,0.01);
        assertEquals(2966.6945,conversorDeMassas.kilosParaLibras(1345.67),0.01);
        assertThrows(ValorInvalidoException.class, () ->{
            conversorDeMassas.kilosParaLibras(-1345.67);
        });
    }
}
