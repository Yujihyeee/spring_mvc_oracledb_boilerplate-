package shop.tripn.oracle.mappers;

import java.util.List;
import org.springframework.stereotype.Repository;
import shop.tripn.oracle.publisher.domain.PublisherDto;

@Repository
public interface PublisherMapper {
	public List<PublisherDto> findAll();
	public PublisherDto findById(int pubId);
}
