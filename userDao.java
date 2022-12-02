package om.restweb.services.restfulservice.in28.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
   
	public static List<User>  users= new ArrayList<>();
	
	private static int userCount=0;
		static {
			users.add(new User(++userCount,"harish",LocalDate.now().minusYears(5)));
			users.add(new User(++userCount,"modi",LocalDate.now().minusYears(10)));
			users.add(new User(++userCount,"amitshah",LocalDate.now().minusYears(60)));
		}
		
		public List<User> findAll(){
			return users;
			
		}
		public User save(User user) {
			user.setId(++userCount);
			users.add(user);
			return user;
		}
		
		public User findOne(int id) {
         
			Predicate<? super User> predicate =user->user.getId().equals(id);
			 return users.stream().filter(predicate).findFirst().get();
			}			
}
