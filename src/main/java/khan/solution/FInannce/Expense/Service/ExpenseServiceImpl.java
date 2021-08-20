package khan.solution.FInannce.Expense.Service;

import khan.solution.FInannce.Expense.Model.Expence;
import khan.solution.FInannce.Expense.Repository.ExpenceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenceService{

    @Autowired
    private ExpenceRepo expenceRepo;

    @Override
    public List<Expence> getAllExpense() {
        return expenceRepo.findAll();
    }

    @Override
    public Expence createExpense(Expence expence) {
        return expenceRepo.save(expence);
    }

    @Override
    public Expence getExpenseByDate(String date) {
       return expenceRepo.findById(date).orElse(null);
    }

    @Override
    public void deleteExpenseByDate(String date) {
        Expence expence=expenceRepo.findById(date).orElse(null);
        expenceRepo.delete(expence);
    }
}
