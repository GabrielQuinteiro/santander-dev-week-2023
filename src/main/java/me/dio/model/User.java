package me.dio.model;

import jakarta.persistence.*;

import java.util.List;
@Entity(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToOne(cascade = CascadeType.ALL)
    private Card card;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Feature> features;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> newsList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public Card getCard() {
        return card;
    }

    public List<News> getNewsList() {
        return newsList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void setNewsList(List<News> newsList) {
        this.newsList = newsList;
    }
}
