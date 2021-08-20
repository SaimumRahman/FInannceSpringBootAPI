package khan.solution.FInannce.Expense.Service;

import khan.solution.FInannce.Expense.Model.Expence;

import java.util.List;

public interface ExpenceService {

    List<Expence> getAllExpense();
    Expence createExpense(Expence expence);
    Expence getExpenseByDate(String date);
    void deleteExpenseByDate(String date);

}
