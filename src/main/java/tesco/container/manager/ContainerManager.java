package tesco.container.manager;

import tesco.container.model.Container;
import tesco.container.model.Large;
import tesco.container.model.Medium;
import tesco.container.model.Small;

import java.util.*;

public class ContainerManager implements ContainerManagerInterface{
    private static ContainerManager cm;
    // The container should be sorted in the order of volume for the most optimal one container to get.
    List<Container> containers;
    public ContainerManager() {
        containers = new LinkedList<>();
        // TODO: Create factory for getting different containers
        Container small = new Small(1, 10, 20, 30);
        Container medium = new Medium(2, 30, 40, 50);
        Container large = new Large(3, 100, 200, 300);
        containers.add(small);
        containers.add(medium);
        containers.add(large);
    }

    @Override
    public int getContainer(int vol) {
        int containerID = -1;
        for (Container container : containers) { // m
            if (container.getVolume() >= vol) {
                containerID = container.id;
                break;
            }
        }
        return containerID;
    }

    public static ContainerManager getInstance() {
        if (cm == null) {
            cm = new ContainerManager();
        }
        return cm;
    }
}
