/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quave.thingsready.service;

import br.com.quave.thingsready.model.Task;
import java.util.List;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author filipe
 */
@Named
public class TaskService {

    @PersistenceContext
    private EntityManager em;

    public List<Task> all() {
//        return Arrays.asList(new Task(1L, "Fazer cadastro de cliente", "Cadastrar os clientes no sistema"));
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Task> query = builder.createQuery(Task.class);
        Root<Task> from = query.from(Task.class);
        CriteriaQuery<Task> select = query.select(from);

        TypedQuery<Task> typedQuery = em.createQuery(select);
        List<Task> results = typedQuery.getResultList();;
        return results;
    }
    
    public void persist(Task task) {
        em.persist(task);
    }

    public Task getById(Long taskId) {
        return all().get(0);
    }
}
