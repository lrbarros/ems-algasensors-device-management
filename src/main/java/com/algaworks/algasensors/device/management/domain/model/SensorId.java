package com.algaworks.algasensors.device.management.domain.model;

import io.hypersistence.tsid.TSID;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Embeddable
@NoArgsConstructor
public class SensorId implements Serializable {

    private TSID value;

    private static final String MSG_VALIDACAO ="o valor TSID não pode ser nulo.";

    public SensorId(TSID value) {
        Objects.requireNonNull(value, MSG_VALIDACAO);
        this.value = value;
    }

    public SensorId(Long value) {
        Objects.requireNonNull(value, MSG_VALIDACAO);
        this.value = TSID.from(value);
    }


    public SensorId(String value) {
        Objects.requireNonNull(value, MSG_VALIDACAO);
        this.value = TSID.from(value);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
