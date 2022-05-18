//CAROLINA ETCHART - 278963
//MARIA EUGENIA MATTO - 227056
package dominio;
import java.util.*;

public class criterioDescripcion implements Comparator{

    @Override
    public int compare(Object cat1, Object cat2) {
            return ((Categoria)cat1).getDescripcion().compareTo( ((Categoria)cat2).getDescripcion());
    }
}  

