/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quave.thingsready.model;

/**
 *
 * @author filipe
 */
public class Task {

    private Long id;
    private String title;
    private String description;

    public Task(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
