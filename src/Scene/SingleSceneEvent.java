package Scene;

public class SingleSceneEvent implements Runnable {

    public SingleSceneEvent(Scene scene) {
        this.scene = scene;
    }

    @Override
    public void run() {
        scene.action();
    }


    public void setScene(Scene scene) {
        this.scene = scene;
    }

    private Scene scene;
}
