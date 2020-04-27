package demoproj;

import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import subproj.GeneralClass;

@RunWith(MockitoJUnitRunner.class)
public class intTest {
    @Mock
    GeneralClass myclass;

    @InjectMocks
    Sample testobject;

    @Test
    public void TestAdd()
    {
        when(myclass.addnum(10,10)).thenReturn(20);
        assertEquals(testobject.AddTwoNumbers(10,10),20);
    }

    @Test
    public void TestSub()
    {
        when(myclass.subnum(10,10)).thenReturn(0);
        assertEquals(testobject.SubTwoNumbers(10,10),0);
    }    
}