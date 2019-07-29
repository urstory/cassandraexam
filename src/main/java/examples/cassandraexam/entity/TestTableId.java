package examples.cassandraexam.entity;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.io.Serializable;

@Data
public class TestTableId implements Serializable {
    private String code;
    private String location;
}
