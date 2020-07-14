package com.unifun.orm;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jdk.jfr.Name;
import org.graalvm.nativeimage.c.struct.RawField;
import org.jboss.logging.annotations.Field;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.transaction.Transactional;

@Entity(name = "Cars")
public class Car extends PanacheEntityBase {
    @Id
    public long carId;
    public String color;
    public String name;

    public Car(String color ,String name) {
        this.name = name;
        this.color = color;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "CarId=" + carId+
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
