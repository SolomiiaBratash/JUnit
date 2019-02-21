package com.bratash.task2_3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class SampleTest {
    @Mock
    ICalculator mcalc;

    @InjectMocks
    Sample calc = new Sample(mcalc);

    @Test
    public void add() {
        when(calc.add(10.0, 20.0)).thenReturn(30.0);
        assertEquals(calc.add(10, 20), 30.0, 0);
        verify(mcalc).add(10.0, 20.0);
        doReturn(15.0).when(mcalc).add(10.0, 5.0);
        assertEquals(calc.add(10.0, 5.0), 15.0, 0);
        verify(mcalc).add(10.0, 5.0);
    }
}
