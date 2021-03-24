package Proceso;

import Objetos.Carrera;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class EddieAugustoAlvarezSalazarUedi {

    @InjectMocks
    private AsignarHorario asignarHorario;

    @Mock
    private Carrera carrera;

    @Mock
    private RegistroAcademico registroAcademico;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void codigoHorarioTest() {
        when(registroAcademico.cheequearCarnet()).thenReturn(true);
        try {
            when(carrera.procesarCarrera()).thenReturn(2);
        } catch (Exception e) {}
        when(registroAcademico.getAnio()).thenReturn(2010);
        try {
            Horario horario = asignarHorario.generarHorario(carrera, registroAcademico);
            assertEquals(130, horario.getCodigoHorario());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void descripcionHorarioTest() {
        when(registroAcademico.cheequearCarnet()).thenReturn(true);
        try {
            when(carrera.procesarCarrera()).thenReturn(3);
        } catch (Exception e) {}
        when(registroAcademico.getAnio()).thenReturn(2018);
        try {
            Horario horario = asignarHorario.generarHorario(carrera, registroAcademico);
            assertEquals("Matutino", horario.getDescripcion());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
