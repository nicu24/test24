package com.unifun.orm;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.transaction.Transactional;

@Entity(name = "Drive_License")
public class DriveLicense {
    @Id
    public long license_id;
    public long carId;
    public long personId;

}
