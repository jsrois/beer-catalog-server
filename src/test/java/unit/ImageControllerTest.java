package unit;

import com.example.demo.beer.ImageController;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImageControllerTest {
    @Test
    public void generatesImageRouteFromId()
    {
        ImageController controller = new ImageController();
        assertEquals("resources/fake-db/images/0.jpg", controller.imagePathFrom("0"));

    }
}