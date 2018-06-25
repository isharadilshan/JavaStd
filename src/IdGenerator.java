
import java.sql.SQLException;
import java.text.NumberFormat;


public class IdGenerator {
    public static String getNewId(String tableName,String columnName,String prefix) throws ClassNotFoundException, SQLException{
        String lastId = IdController.getLastId(tableName,columnName);
        if(lastId != null){
            int id = Integer.parseInt(lastId.split(prefix)[1]);
            id++;
            NumberFormat numberFormat = NumberFormat.getIntegerInstance();//
            numberFormat.setMaximumIntegerDigits(3);//
            numberFormat.setGroupingUsed(false);//
            String newID = numberFormat.format(id);//me tika mkdda kyla ahanna
            if(id<10){
                return prefix+"00"+newID;
            }else{
                return prefix +"0"+ newID;
            }
            
        } else {
            return prefix + "001";
        }
        
    }
}
