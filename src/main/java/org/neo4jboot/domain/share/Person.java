package org.neo4jboot.domain.share;

import org.neo4j.ogm.annotation.Relationship;

import java.util.Set;

/**
 * Created by hugh on 1/26/16.
 */
public class Person extends Entity{

    private String userName;
    private String password;
    private String photo;
    @Relationship(type="FOLLOWING", direction= Relationship.OUTGOING)
    private Set<Person> following;

    @Relationship(type="FOLLOWER", direction= Relationship.INCOMING)
    private Set<Person> follower;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Set<Person> getFollowing() {
        return following;
    }

    public void setFollowing(Set<Person> following) {
        this.following = following;
    }

    public Set<Person> getFollower() {
        return follower;
    }

    public void setFollower(Set<Person> follower) {
        this.follower = follower;
    }

}
