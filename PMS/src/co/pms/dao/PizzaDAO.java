package co.pms.dao;
import java.util.List;

import com.pms.bean.Pizza;


 public interface PizzaDAO {
	
		public void addPizza();
		public Pizza viewPizza(int pid);
		public List<Pizza> viewAllPizzas();
		public void updatePizza(int pid);
		public void deletePizza(int pid);
		public void bill();
		public void back();
		public void cancelorder();
		public void placeorder();
}
