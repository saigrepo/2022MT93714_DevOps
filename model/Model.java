package model;
import java.*;

class Model {
    String modelName;
    public Model(String modelName) {
        this.modelName = modelName;
    }
    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public String toString() {
        return "modelName= " + modelName;
    }
}