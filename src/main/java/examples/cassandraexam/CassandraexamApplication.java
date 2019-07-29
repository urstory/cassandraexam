package examples.cassandraexam;

import examples.cassandraexam.entity.TestTable;
import examples.cassandraexam.repository.TestTableRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StopWatch;

import java.util.List;

@SpringBootApplication
@Slf4j
public class CassandraexamApplication implements CommandLineRunner {
    @Autowired
    TestTableRepository testTableRepository;

    public static void main(String[] args) {
        SpringApplication.run(CassandraexamApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        int i = 0;
        long start = System.currentTimeMillis();
        while(true) {
            List<TestTable> all = testTableRepository.findAll();
            for (TestTable tt : all) {
                if(i == 1000){
                    long end= System.currentTimeMillis();
                    System.out.println(end - start);
                    return;
                }
               i++;
            }
//            Thread.sleep(1000);
        }
    }
}
