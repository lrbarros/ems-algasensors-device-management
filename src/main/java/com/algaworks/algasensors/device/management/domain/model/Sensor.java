package com.algaworks.algasensors.device.management.domain.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Entity
public class Sensor {
    @Id
    @AttributeOverride(name="value", column = @Column(name="id" , columnDefinition = "BIGINT"))
    private SensorId id;

    private String name;
    private String ip;
    private String location;
    private String protocol;
    private String model;
    private Boolean enabled;
}
