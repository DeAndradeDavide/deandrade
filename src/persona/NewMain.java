/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author davide.deandrade
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String dataDiNascita = "11/10/2000";
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = new GregorianCalendar();
        
        Date trialTime = new Date();
        calendar.setTime(trialTime);
        
        String coso = String.valueOf(trialTime);
        Date dateObj = calendar.getTime();
        coso = formato.format(dateObj);
        
        Boolean valida = false;
        String[] d = dataDiNascita.split("/");
        Integer data[] = new Integer[d.length];
        
        for (int i = 0; i < d.length; i++) {
            data[i] = Integer.valueOf(d[i]);
        }

        if (data[2] >= 0 && data[2] <= 9999) {
            switch (data[1]) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (data[0] >= 1 && data[0] <= 31) {
                        valida = true;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (data[0] >= 1 && data[0] <= 30) {
                        valida = true;
                    }
                    break;
                case 2:
                    if (data[2] % 400 == 0 || data[2] % 4 == 0 && data[2] % 100 != 0) {
                        if (data[0] >= 1 && data[0] <= 29) {
                            valida = true;
                        }

                    } else {
                        if (data[0] >= 1 && data[0] <= 28) {
                            valida = true;
                        }
                    }
                    break;
                default:
                    valida = false;
            }

        }
        if (valida == true) {
            Integer eta;
        
            Calendar calendario = Calendar.getInstance();

            String dataOggi = formato.format(dateObj);
            String[] a = dataDiNascita.split("/");
            
            Integer gg = Integer.valueOf(a[0]);
            Integer mm = Integer.valueOf(a[1]);
            Integer aaaa = Integer.valueOf(a[2]);
            
            String[] dOggi = dataOggi.split("/");
            
            Integer ggOggi = Integer.valueOf(dOggi[0]);
            Integer mmOggi = Integer.valueOf(dOggi[1]);
            Integer aaaaOggi = Integer.valueOf(dOggi[2]);
        
            eta = aaaaOggi - aaaa - 1;
        
            if(mm == mmOggi){
                if(gg <= ggOggi)
                    eta = eta + 1;
            }
        
            if(mm < mmOggi)
                    eta = eta + 1;
        
            System.out.println(eta);
            }else{
                System.out.println("no");
            }
        
        
    }
    
}
