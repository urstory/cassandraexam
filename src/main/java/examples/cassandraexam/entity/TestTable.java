package examples.cassandraexam.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value = "test_table_ex1")
@Setter
@Getter
public class TestTable {
    @Id
    private TestTableId testTableId;

    @Column
    private String description;
    @Column
    private String sequence;
}
