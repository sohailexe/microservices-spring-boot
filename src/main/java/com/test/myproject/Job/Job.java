package com.test.myproject.Job;

public class Job {
    private  Long id;
    private String title;
    private String description;
    private String minSalery;
    private String maxSalery;
    private String location;

    public Job(Long id, String title, String description, String minSalery, String maxSalery, String location) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.minSalery = minSalery;
        this.maxSalery = maxSalery;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMinSalery() {
        return minSalery;
    }

    public void setMinSalery(String minSalery) {
        this.minSalery = minSalery;
    }

    public String getMaxSalery() {
        return maxSalery;
    }

    public void setMaxSalery(String maxSalery) {
        this.maxSalery = maxSalery;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
