/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quave.thingsready.view;

import com.ocpsoft.pretty.faces.annotation.URLBeanName;
import com.ocpsoft.pretty.faces.annotation.URLMapping;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author filipe
 */
@ViewScoped
@Named
@URLBeanName("indexView")
@URLMapping(id = "index", pattern = "/index", viewId = "/index.xhtml")
public class IndexView implements Serializable {
}
