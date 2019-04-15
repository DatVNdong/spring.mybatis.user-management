package spring.mybatis.user.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import spring.mybatis.user.domain.Serv;
import spring.mybatis.user.domain.Type;
import spring.mybatis.user.domain.User;
import spring.mybatis.user.domain.UserServ;
import spring.mybatis.user.domain.UserType;
import spring.mybatis.user.service.ServService;
import spring.mybatis.user.service.TypeService;
import spring.mybatis.user.service.UserServService;
import spring.mybatis.user.service.UserService;
import spring.mybatis.user.service.UserTypeService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private ServService servService;
    @Autowired
    private TypeService typeService;
    @Autowired
    private UserServService userServService;
    @Autowired
    private UserTypeService userTypeService;

    @GetMapping(value = { "/UserAddition" })
    public String create(ModelMap model) {
        User user = new User();
        user.setListServices(new ArrayList<>());
        user.setListTypes(new ArrayList<>());
        model.addAttribute("user", user);
        model.addAttribute("dbservices", servService.findAll());
        model.addAttribute("dbtypes", typeService.findAll());
        model.addAttribute("title", "User addition");
        return "add";
    }

    @GetMapping("/UserAction/{username}/delete")
    public String delete(@PathVariable String username, RedirectAttributes redirect) {
        userService.deleteByUsername(username);
        userServService.deleteByUsername(username);
        userTypeService.deleteByUsername(username);
        redirect.addFlashAttribute("success", "Delete user successfully!");
        return "redirect:/UserList";
    }

    @GetMapping(value = { "/UserEdition/{id}/edit" })
    public String edit(@PathVariable int id, ModelMap model) {
        User user = userService.findOne(id);
        String username = user.getUsername();
        // Add checked service items
        List<UserServ> listUserServs = userServService.findByUsername(username);
        List<Integer> listServices = new ArrayList<>();
        for (UserServ item : listUserServs) {
            listServices.add(item.getIdService());
        }
        user.setListServices(listServices);
        // Add checked type items
        List<UserType> listUserTypes = userTypeService.findByUsername(username);
        List<Integer> listTypes = new ArrayList<>();
        for (UserType item : listUserTypes) {
            listTypes.add(item.getIdType());
        }
        user.setListTypes(listTypes);
        // Add attribute
        model.addAttribute("user", user);
        model.addAttribute("dbservices", servService.findAll());
        model.addAttribute("dbtypes", typeService.findAll());
        model.addAttribute("title", "User edition");
        return "edit";
    }

    @PostMapping("/UserAction/insert")
    public String insert(@Valid User user, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            redirect.addFlashAttribute("failed", "Error, failed to update current user!");
        } else {
            // Save user
            userService.insert(user);
            String username = user.getUsername();
            // Save services of user
            List<Integer> listServices = user.getListServices();
            for (Integer idService : listServices) {
                userServService.insert(new UserServ(username, idService));
            }
            // Save services of user
            List<Integer> listTypes = user.getListTypes();
            for (Integer idType : listTypes) {
                userTypeService.insert(new UserType(username, idType));
            }
            // Turn back to page
            redirect.addFlashAttribute("success", "Create user successfully!");
        }
        return "redirect:/UserList";
    }

    @PostMapping("/UserAction/update")
    public String update(@Valid User user, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            redirect.addFlashAttribute("failed", "Error, failed to update current user!");
        } else {
            // Save user
            userService.update(user);
            String username = user.getUsername();
            // Save services of user
            List<Integer> listServices = user.getListServices();
            userServService.deleteByUsername(username);
            for (Integer idService : listServices) {
                userServService.insert(new UserServ(username, idService));
            }
            // Save services of user
            List<Integer> listTypes = user.getListTypes();
            userTypeService.deleteByUsername(username);
            for (Integer idType : listTypes) {
                userTypeService.insert(new UserType(username, idType));
            }
            // Turn back to page
            redirect.addFlashAttribute("success", "Update user successfully!");
        }
        return "redirect:/UserList";
    }

    @GetMapping(value = { "/UserList", "/", "" })
    public String view(ModelMap model) {
        // Init varriables
        List<UserServ> listUserServs = null;
        List<UserType> listUserTypes = null;
        StringBuilder servsStrBuilder = null;
        StringBuilder typesStrBuilder = null;
        int size = 0;
        String username = "";
        // Get data from db
        List<User> listUsers = userService.findAll();
        List<Serv> listServs = servService.findAll();
        List<Type> listTypes = typeService.findAll();
        // Convert data to String
        for (User user : listUsers) {
            username = user.getUsername();
            listUserServs = userServService.findByUsername(username);
            listUserTypes = userTypeService.findByUsername(username);
            servsStrBuilder = new StringBuilder();
            typesStrBuilder = new StringBuilder();
            // Service
            size = listUserServs.size();
            for (int i = 0; i < size; i++) {
                servsStrBuilder.append(listServs.get(listUserServs.get(i).getIdService() - 1).getNameService());
                if (i < size - 1) {
                    servsStrBuilder.append(", ");
                }
            }
            user.setServices(servsStrBuilder.toString());
            // Type
            size = listUserTypes.size();
            for (int i = 0; i < size; i++) {
                typesStrBuilder.append(listTypes.get(listUserTypes.get(i).getIdType() - 1).getNameType());
                if (i < size - 1) {
                    typesStrBuilder.append(", ");
                }
            }
            user.setTypes(typesStrBuilder.toString());
        }
        // Add attributes
        model.addAttribute("dbusers", listUsers);
        model.addAttribute("title", "User list");
        return "view";
    }
}
