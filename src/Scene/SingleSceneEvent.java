package Scene;

public class SingleSceneEvent implements Runnable {

    public SingleSceneEvent(Scene _scene) {
        this._scene = _scene;
    }

    @Override
    public void run() {
        _scene.action();
    }


    public void set_scene(Scene _scene) {
        this._scene = _scene;
    }

    private Scene _scene;
}
