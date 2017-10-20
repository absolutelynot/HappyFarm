package Scene;

import java.util.Vector;

public class MultiSceneEvent implements Runnable {

    public MultiSceneEvent(Vector<Scene> _scenes) {
        this._scenes = _scenes;
    }

    @Override
    public void run() {
        for(Scene scene : _scenes){
            scene.action();
        }
    }

    public void addScene(Scene scene){
        _scenes.add(scene);
    }

    public void clearScenes(){
        _scenes.clear();
    }

    private Vector<Scene> _scenes = new Vector<>();
}
