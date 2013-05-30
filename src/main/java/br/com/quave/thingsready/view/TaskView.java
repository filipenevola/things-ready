/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quave.thingsready.view;

import br.com.quave.thingsready.model.Task;
import br.com.quave.thingsready.service.TaskService;
import com.ocpsoft.pretty.faces.annotation.URLAction;
import com.ocpsoft.pretty.faces.annotation.URLBeanName;
import com.ocpsoft.pretty.faces.annotation.URLMapping;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author filipe
 */
@ViewScoped
@Named
@URLBeanName("taskView")
@URLMapping(id = "show-task", pattern = "/task/show/#{taskView.taskId}", viewId = "/task/task.xhtml")
public class TaskView implements Serializable {

    @Inject
    private TaskService taskService;
    private List<Task> tasks;
    private Task task;
    private Long taskId;

    @PostConstruct
    public void init() {
        tasks = taskService.all();
    }

    @URLAction(mappingId = "show-task", onPostback = false)
    public void showTask() {
        task = taskService.getById(taskId);
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
