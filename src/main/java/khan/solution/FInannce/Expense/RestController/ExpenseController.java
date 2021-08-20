package khan.solution.FInannce.Expense.RestController;

import khan.solution.FInannce.Expense.Model.Expence;
import khan.solution.FInannce.Expense.Service.ExpenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/expence")
public class ExpenseController {

    @Autowired
    private ExpenceService service;

    @GetMapping
    public List<Expence> getAllExpenses(){
    return service.getAllExpense();
    }

    @GetMapping("/{date}")
    public Expence getExpensesByDate(@PathVariable("date") String date){
    return service.getExpenseByDate(date);
    }

    @PostMapping
    public Expence createExpenses(@RequestBody Expence expence){
    return service.createExpense(expence);
    }

    @PutMapping
    public Expence updateExpenses(@RequestBody Expence expence){
    return service.createExpense(expence);
    }

    @DeleteMapping("/{date}")
    public void deleteExpenseByDate(@PathVariable("date") String date){
     service.deleteExpenseByDate(date);
    }


}
