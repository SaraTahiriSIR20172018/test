/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;

import javax.persistence.Id;

/**
 *
 * @author lenovo
 */
@Entity
public class Article implements Serializable {
    private static final long serialVersionUID = 1L;
  
    
    private String title;
    @Id
    private String url;
    private String content;
    

 
    

    public Article(String title, String url, String content) {
        this.title = title;
        this.url = url;
        this.content = content;
    }

    public Article() {
    }

  

 
   
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (title != null ? title.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the title fields are not set
        if (!(object instanceof Article)) {
            return false;
        }
        Article other = (Article) object;
        if ((this.title == null && other.title != null) || (this.title != null && !this.title.equals(other.title))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Article{" + "title=" + title + ", url=" + url + ", content=" + content + '}';
    }

   
    
}
