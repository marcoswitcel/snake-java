package io.github.marcoswitcel.entity;

import java.util.List;

import io.github.marcoswitcel.utils.Vec2;

public class Snake {
    
    private Vec2 head;
    private List<Vec2> tails;
    
    public Snake(Vec2 head, List<Vec2> tails) {
        this.head = head;
        this.tails = tails;
    }

    public Vec2 getHead() {
        return head;
    }

    public void setHead(Vec2 head) {
        this.head = head;
    }

    public List<Vec2> getTails() {
        return tails;
    }

    public void setTails(List<Vec2> tails) {
        this.tails = tails;
    }    
}
