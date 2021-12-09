package adrianliz.smartthermostat.temperatures;

import static org.mockito.Mockito.*;

import adrianliz.smartthermostat.shared.infrastructure.UnitTestCase;
import adrianliz.smartthermostat.temperatures.domain.Temperature;
import adrianliz.smartthermostat.temperatures.domain.TemperaturesRepository;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

import java.util.Optional;

public abstract class TemperaturesModuleUnitTestCase extends UnitTestCase {
  protected TemperaturesRepository repository;

  @BeforeEach
  protected void setUp() {
    super.setUp();

    repository = mock(TemperaturesRepository.class);
  }

  public void shouldHaveSaved(Temperature temperature) {
    verify(repository, atLeastOnce()).save(temperature);
  }

  public void shouldSearchLastTemperature(Temperature temperature) {
    Mockito.when(repository.searchLast()).thenReturn(Optional.of(temperature));
  }
}
