package prj.spring_mvc.itfc;

import java.util.List;
import prj.spring_mvc.entity.Spittle;

/*****************
 *
 * @author Alex
 *
 ****************/

public interface SpittleRepository {
	
	List<Spittle> findSpittles(long max, int count);
	
}
