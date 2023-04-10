package com.example.socialmediaapp.Model;

public class StoryModel {
    int story,storyTpe,profile;
    String name;

    public StoryModel() {
    }

    public int getStory() {
        return story;
    }

    public void setStory(int story) {
        this.story = story;
    }

    public int getStoryTpe() {
        return storyTpe;
    }

    public void setStoryTpe(int storyTpe) {
        this.storyTpe = storyTpe;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StoryModel(int story, int storyTpe, int profile, String name) {
        this.story = story;
        this.storyTpe = storyTpe;
        this.profile = profile;
        this.name = name;
    }
}
