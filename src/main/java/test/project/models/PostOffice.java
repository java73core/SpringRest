package test.project.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PostOffice")
public class PostOffice {

    @Id
    @Column(name = "postIndex")
    private int postIndex;

    @Column(name = "postName")
    private String postName;

    @Column(name = "postAddress")
    private String postAddress;

    public int getPostIndex() {
        return postIndex;
    }

    public void setPostIndex(int postIndex) {
        this.postIndex = postIndex;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }

    public PostOffice(int postIndex, String postName, String postAddress) {
        this.postIndex = postIndex;
        this.postName = postName;
        this.postAddress = postAddress;
    }
}
