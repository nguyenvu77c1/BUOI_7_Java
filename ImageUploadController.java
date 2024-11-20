package laptrinhungdungjava.bai2.thlaptrinhjava.ImageUploadController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class ImageUploadController {

    @PostMapping("/upload")
    public String uploadImage(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return "redirect:/error";
        }

        try {
            // Lưu tập tin vào thư mục trên máy chủ
            String uploadDir = "/path/to/your/upload/directory/";
            String fileName = file.getOriginalFilename();
            String filePath = uploadDir + fileName;
            File dest = new File(filePath);
            file.transferTo(dest);
        } catch (IOException e) {
            return "redirect:/error";
        }

        // Xử lý sau khi tải lên thành công
        return "redirect:/success";
    }
}
