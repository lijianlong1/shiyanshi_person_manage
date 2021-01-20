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
public class Teacher implements Serializable {

    private static final long serialVersionUID=1L;

      private String tno;

    private String tname;

    private String tsex;

    private String tlevel;

    private String tintroduce;

    
    public String getTno() {
        return tno;
    }

      public void setTno(String tno) {
          this.tno = tno;
      }
    
    public String getTname() {
        return tname;
    }

      public void setTname(String tname) {
          this.tname = tname;
      }
    
    public String getTsex() {
        return tsex;
    }

      public void setTsex(String tsex) {
          this.tsex = tsex;
      }
    
    public String getTlevel() {
        return tlevel;
    }

      public void setTlevel(String tlevel) {
          this.tlevel = tlevel;
      }
    
    public String getTintroduce() {
        return tintroduce;
    }

      public void setTintroduce(String tintroduce) {
          this.tintroduce = tintroduce;
      }

    @Override
    public String toString() {
        return "Teacher{" +
              "tno=" + tno +
                  ", tname=" + tname +
                  ", tsex=" + tsex +
                  ", tlevel=" + tlevel +
                  ", tintroduce=" + tintroduce +
              "}";
    }
}
