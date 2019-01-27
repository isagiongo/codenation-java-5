package challenge;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends CrudRepository<Quote, Integer> {
	
	Quote findQuoteById(Integer id);

    List<Quote> findQuoteByActorContains(String actor);

    Quote findQuoteByIdBetween(Integer start, Integer end);

}
