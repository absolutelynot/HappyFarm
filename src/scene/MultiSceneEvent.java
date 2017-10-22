package scene;

import java.util.Vector;

public class MultiSceneEvent implements Runnable {

    public MultiSceneEvent(Vector<Scene> _scenes) {
        this.scenes = _scenes;
    }

    @Override
    public void run() {
        for(Scene scene : scenes){
            scene.action();
        }
    }

    public void addScene(Scene scene){
        scenes.add(scene);
    }

    public void clearScenes(){
        scenes.clear();
    }

    private Vector<Scene> scenes = new Vector<>();
}
