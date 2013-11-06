/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hmi.patterns;

/**
 *
 * @author hebergui, unkedeuxke
 */
public abstract class AbstractController {

    private AbstractModel abstractModel;
    private AbstractView abstractView;

    public AbstractController(AbstractModel abstractModel, AbstractView abstractView) {
        this.abstractModel = abstractModel;
        this.abstractView = abstractView;
    }

    public AbstractModel getAbstractModel() {
        return this.abstractModel;
    }

    public void setAbstractModel(AbstractModel abstractModel) {
        this.abstractModel = abstractModel;
    }

    public AbstractView getAbstractView() {
        return this.abstractView;
    }

    public void setAbstractView(AbstractView abstractView) {
        this.abstractView = abstractView;
    }
}
