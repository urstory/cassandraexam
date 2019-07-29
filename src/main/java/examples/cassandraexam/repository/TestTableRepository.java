package examples.cassandraexam.repository;

import examples.cassandraexam.entity.TestTable;
import examples.cassandraexam.entity.TestTableId;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface TestTableRepository extends CassandraRepository<TestTable, TestTableId> {

}

