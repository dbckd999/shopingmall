package com.shoping.dbckd.service;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ProductManagerSevImpl implements ProductManagerSev{

    @Override
    public int addProduct(String name, MultipartFile file) {
        UUID uuid = UUID.randomUUID();
        String fileName = uuid + "_" + file.getOriginalFilename();
        
        String path = System.getProperty("user.dir") + "\\src\\main\\resources\\static\\files";
        File saveFile = new File(path, fileName);

        System.out.println(fileName);

        try {
            file.transferTo(saveFile);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // insert db
        /*
         * key
         * name
         * filename
         * path
         */

        return 0;
    }
    
}
