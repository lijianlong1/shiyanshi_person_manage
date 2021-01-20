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
public class Academic implements Serializable {

    private static final long serialVersionUID=1L;

    private String name;

      private String artical;

    private String arname;

    private String authorlevel;

    
    public String getName() {
        return name;
    }

      public void setName(String name) {
          this.name = name;
      }
    
    public String getArtical() {
        return artical;
    }

      public void setArtical(String artical) {
          this.artical = artical;
      }

    public String getArname() {
        return arname;
    }

    public void setArname(String arname) {
        this.arname = arname;
    }

    public String getAuthorlevel() {
        return authorlevel;
    }

      public void setAuthorlevel(String authorlevel) {
          this.authorlevel = authorlevel;
      }

    @Override
    public String toString() {
        return "Academic{" +
              "name=" + name +
                  ", artical=" + artical +
                  ", arname=" + arname +
                  ", authorlevel=" + authorlevel +
              "}";
    }
}
