package sample;

import java.util.ArrayList;
import java.util.Date;

public class consultation {
    private String num;
    private Date date;
    private String num_ord;
    private String[] listmedica = new String[20];


    public void setListmedica(String[] listmedica) {
        this.listmedica = listmedica;
    }

    public String[] getListmedica() {
        return listmedica;
    }



    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setNum_ord(String num_ord) {
        this.num_ord = num_ord;
    }



    public Date getDate() {
        return date;
    }

    public String getNum_ord() {
        return num_ord;
    }


}