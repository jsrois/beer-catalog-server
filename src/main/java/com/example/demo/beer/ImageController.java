package com.example.demo.beer;


import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.activation.FileTypeMap;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@RestController
public class ImageController {
    public static final String BASE_IMAGES_PATH = "src/main/resources/fake-db/images/";
    public static final String IMAGE_FILE_EXTENSION = ".jpg";

    @GetMapping(value = "/image/{id:.+}")
    public ResponseEntity<byte[]> getImage(@PathVariable("id") String id) throws IOException {
        File image = new File(imagePathFrom(id));
        // TODO: simplify this shit!?
        return ResponseEntity.ok()
                .contentType(MediaType
                        .valueOf(FileTypeMap.getDefaultFileTypeMap()
                                .getContentType(image)))
                .body(Files.readAllBytes(image.toPath()));
    }

    public String imagePathFrom(String id) {
        return BASE_IMAGES_PATH + id + IMAGE_FILE_EXTENSION;
    }
}
