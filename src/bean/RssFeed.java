/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author lenovo
 */
@Entity
public class RssFeed implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String url;
    private String name;
    //what on earth are those types ??
   private RssFeed [][] rssfeeds;
   private Article[] articles;
  

    public RssFeed( String name,String url, Article[] articles) {
        this.url = url;
        this.name = name;
        this.articles = articles;
    }

    public RssFeed[][] getRssfeeds() {
        return rssfeeds;
    }

    public void setRssfeeds(RssFeed[][] rssfeeds) {
        this.rssfeeds = rssfeeds;
    }

    public RssFeed() {
    }

    public Article[] getArticles() {
        return articles;
    }

    public void setArticles(Article[] articles) {
        this.articles = articles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
   
    

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (url != null ? url.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the url fields are not set
        if (!(object instanceof RssFeed)) {
            return false;
        }
        RssFeed other = (RssFeed) object;
        if ((this.url == null && other.url != null) || (this.url != null && !this.url.equals(other.url))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RSSfeed{" + "url=" + url + ", name=" + name +'}';
    }

  
    
}
