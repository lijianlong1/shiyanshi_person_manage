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
public class Student implements Serializable {

    private static final long serialVersionUID=1L;

      private String sno;

    private String sname;

    private String ssex;

    private String sclass;

    private String shometown;

    private Integer sscore;

    private Integer ssort;

    private String sintroduce;

    private String scollege;

    
    public String getSno() {
        return sno;
    }

      public void setSno(String sno) {
          this.sno = sno;
      }
    
    public String getSname() {
        return sname;
    }

      public void setSname(String sname) {
          this.sname = sname;
      }
    
    public String getSsex() {
        return ssex;
    }

      public void setSsex(String ssex) {
          this.ssex = ssex;
      }
    
    public String getSclass() {
        return sclass;
    }

      public void setSclass(String sclass) {
          this.sclass = sclass;
      }
    
    public String getShometown() {
        return shometown;
    }

      public void setShometown(String shometown) {
          this.shometown = shometown;
      }
    
    public Integer getSscore() {
        return sscore;
    }

      public void setSscore(Integer sscore) {
          this.sscore = sscore;
      }
    
    public Integer getSsort() {
        return ssort;
    }

      public void setSsort(Integer ssort) {
          this.ssort = ssort;
      }
    
    public String getSintroduce() {
        return sintroduce;
    }

      public void setSintroduce(String sintroduce) {
          this.sintroduce = sintroduce;
      }
    
    public String getScollege() {
        return scollege;
    }

      public void setScollege(String scollege) {
          this.scollege = scollege;
      }

    @Override
    public String toString() {
        return "Student{" +
              "sno=" + sno +
                  ", sname=" + sname +
                  ", ssex=" + ssex +
                  ", sclass=" + sclass +
                  ", shometown=" + shometown +
                  ", sscore=" + sscore +
                  ", ssort=" + ssort +
                  ", sintroduce=" + sintroduce +
                  ", scollege=" + scollege +
              "}";
    }
}
