package khan.solution.FInannce.Expense.Repository;

import khan.solution.FInannce.Expense.Model.Expence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenceRepo extends JpaRepository<Expence,String> {
}
