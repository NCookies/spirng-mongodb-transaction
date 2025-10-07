package xyz.ncookie.mongotransactiontest.notification;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import xyz.ncookie.mongotransactiontest.NotificationDocument;
import xyz.ncookie.mongotransactiontest.NotificationMongoRepository;

@SpringBootTest
@ActiveProfiles("test")
public class MongoTransactionTest {

	@Autowired
	private NotificationMongoRepository mongoRepository;

	@Test
	@Transactional
	void transactionTest() {

		mongoRepository.save(new NotificationDocument(null, "hello"));
	}
}
