package adrianliz.smartthermostat.temperatures.domain;

import adrianliz.smartthermostat.shared.domain.Identifier;

public final class TemperatureId extends Identifier {

  public TemperatureId(final String value) {
    super(value);
  }

  private TemperatureId() {}
}
