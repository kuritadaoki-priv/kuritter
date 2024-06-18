package model;
import java.io.Serializable;

public class Mutter implements Serializable {
  private String userName; // ユーザー名
  private String text; // つぶやき内容
  private String date;
  public Mutter() { }
  public Mutter(String userName, String text, String date) {
    this.userName = userName;
    this.text = text;
    this.date = date;
  }
  public String getUserName() { return userName; }
  public String getText() { return text; }
  public String getDate(){ return date;}
}
