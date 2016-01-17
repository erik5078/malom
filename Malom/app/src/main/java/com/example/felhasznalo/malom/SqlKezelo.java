package com.example.felhasznalo.malom;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.widget.Toast;

import java.util.Locale;

public class SqlKezelo
{
    private static SqlKezelo instance;
    private SQLiteDatabase db;
    private String hiba;
    private String sarga;
    private String dontetlen;
    private String piros;

    public static SqlKezelo Instance()
    {
        if (instance == null)
        {
            instance = new SqlKezelo();
        }

        return instance;
    }

    private SqlKezelo()
    {
        hiba = "";
        sarga = "0";
        dontetlen = "0";
        piros = "0";

        try
        {
            db = SQLiteDatabase.create(null);
            db.execSQL("create table if not exists allas (id integer, sarga integer, dontetlen integer, piros integer)");
            db.execSQL("create table if not exists allas (id integer, szoveg varchar)");
        }
        catch (Exception e)
        {
            hiba = e.toString();
        }

        try
        {
            db.execSQL("insert into allas (sarga, dontetlen, piros) values (0, 0, 0)");
        }
        catch(Exception e)
        {
            hiba = e.toString();
        }

        try
        {
            Cursor c = null;
            c = db.rawQuery("select * from allas", null);
            c.moveToFirst();
            this.sarga = c.getString(c.getColumnIndex("sarga"));
            this.dontetlen = c.getString(c.getColumnIndex("dontetlen"));
            this.piros = c.getString(c.getColumnIndex("piros"));
            c.close();
        }
        catch (Exception e)
        {
            hiba = e.toString();
        }

        /*try
        {
            db.close();
        }
        catch (Exception e)
        {

        }*/
    }

    public String GetHiba()
    {
        return hiba;
    }

    public int GetSarga()
    {
        return Integer.parseInt(sarga);
    }

    public int GetDontetlen()
    {
        return Integer.parseInt(dontetlen);
    }

    public int GetPiros()
    {
        return Integer.parseInt(piros);
    }

    public String Gyoztes(int gyoztes)
    {
        String hiba = "";

        try {
            switch (gyoztes) {
                case 0:
                    int d = Integer.parseInt(dontetlen);
                    d++;
                    db.rawQuery("update allas set dontetlen=" + d, null);
                    break;
                case 1:
                    int s = Integer.parseInt(sarga);
                    s++;
                    db.rawQuery("update allas set sarga=" + s, null);
                    break;
                case 2:
                    int p = Integer.parseInt(piros);
                    p++;
                    db.rawQuery("update allas set piros=" + p, null);
                    break;
                default:
                    break;
            }
        }
        catch (Exception e)
        {
            hiba = e.toString();
        }

        return hiba;
    }

    public String Log(String szoveg)
    {
        String hiba = "";

        try
        {
            db.execSQL("insert into log (szoveg) values ('" + szoveg + "')");
        }
        catch (Exception e)
        {
            hiba = e.toString();
        }

        return hiba;
    }

    public String Nullaz()
    {
        String hiba = "";

        try
        {
            db.execSQL("update allas set sarga=0");
            db.execSQL("update allas set dontetlen=0");
            db.execSQL("update allas set piros=0");
        }
        catch (Exception e)
        {
            hiba = e.toString();
        }

        return hiba;
    }
}
