import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class seminar4Task1 {
    @Test
    void iterotorReturnHelloWorld(){
        Iterator iterator = mock(Iterator.class);
        when(iterator.next()).thenReturn("Hello").thenReturn("World!");
        String result = iterator.next()+" "+iterator.next();
        assertThat(result).isEqualTo("Hello World!");
    }


}
