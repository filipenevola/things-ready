/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quave.thingsready.service;

import br.com.quave.thingsready.model.Task;
import java.util.Arrays;
import java.util.List;
import javax.inject.Named;

/**
 *
 * @author filipe
 */
@Named
public class TaskService {

    public List<Task> all() {
        return Arrays.asList(new Task(1L, "Fazer cadastro de cliente", "Cadastrar os clientes no sistema"));
    }

    public Task getById(Long taskId) {
        return all().get(0);
    }
}
