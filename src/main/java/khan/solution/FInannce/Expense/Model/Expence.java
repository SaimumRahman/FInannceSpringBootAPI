package khan.solution.FInannce.Expense.Model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Data
@Entity
@Table
public class Expence {

    @Id @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    private String id;
    private String amount;
    private String details;
    private String date;
    private String time;

    public Expence() {
        Calendar callForDate=Calendar.getInstance();

        SimpleDateFormat currentDate=new SimpleDateFormat("MM dd, yyyy");
        String saveCurrentDateMs=currentDate.format(callForDate.getTime());

        SimpleDateFormat currentTime=new SimpleDateFormat("HH:mm:ss a");
        String saveCurrentTimeMs=currentTime.format(callForDate.getTime());
        this.date = saveCurrentDateMs;
        this.time = saveCurrentTimeMs;
    }



}
