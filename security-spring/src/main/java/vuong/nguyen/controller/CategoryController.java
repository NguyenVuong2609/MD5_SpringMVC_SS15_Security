package vuong.nguyen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vuong.nguyen.dto.response.ResponseMessage;
import vuong.nguyen.model.Category;
import vuong.nguyen.model.User;
import vuong.nguyen.security.userprincipal.UserDetailsServiceIMPL;
import vuong.nguyen.service.category.ICategoryService;

import javax.validation.Valid;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    ICategoryService categoryService;
    @Autowired
    UserDetailsServiceIMPL userDetailsServiceIMPL;
    @PostMapping
    public ResponseEntity<?> createCategory(@Valid @RequestBody Category category){
        User user = userDetailsServiceIMPL.getCurrentUser();
        category.setUser(user);
        categoryService.save(category);
        return new ResponseEntity<>(new ResponseMessage("Category created successfully!"), HttpStatus.OK);
    }
}
