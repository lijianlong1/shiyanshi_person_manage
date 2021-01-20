package com.example.demo.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author long
 * @since 2021-01-03
 */
public class User_all implements Serializable {

    private static final long serialVersionUID=1L;

    private String uno;

    private String name;

    private String style;

    private String phone;

    private String id_number;

    private String password;

    
    public String getUno() {
        return uno;
    }

      public void setUno(String uno) {
          this.uno = uno;
      }
    
    public String getName() {
        return name;
    }

      public void setName(String name) {
          this.name = name;
      }
    
    public String getStyle() {
        return style;
    }

      public void setStyle(String style) {
          this.style = style;
      }
    
    public String getPhone() {
        return phone;
    }

      public void setPhone(String phone) {
          this.phone = phone;
      }
    
    public String getId_number() {
        return id_number;
    }

      public void setId_number(String id_number) {
          this.id_number = id_number;
      }
    
    public String getPassword() {
        return password;
    }

      public void setPassword(String password) {
          this.password = password;
      }

    @Override
    public String toString() {
        return "User_all{" +
              "uno=" + uno +
                  ", name=" + name +
                  ", style=" + style +
                  ", phone=" + phone +
                  ", id_number=" + id_number +
                  ", password=" + password +
              "}";
    }
}
