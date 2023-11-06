import org.example.seminar4.WeatherReporter;
import org.example.seminar4.WeatherService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

public class seminar4Test3 {

@Test
    void TestWeaserReport(){
    WeatherService mockWeatherService =mock(WeatherService.class);
    when(mockWeatherService.getCurrentTemperature()).thenReturn(25);
    WeatherReporter weatherReporter = new WeatherReporter(mockWeatherService);
    String result =weatherReporter.generateReport();
    assertThat(result).isEqualTo("Текущая температура: 25 градусов.");
    }
}
