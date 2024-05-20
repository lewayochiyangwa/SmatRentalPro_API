package com.example.SmatRentalPro_API.Users;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/smatrentalpro/api/v1/users")
@RequiredArgsConstructor
@Slf4j  // to have something printed on the console
public class UsersController {

    @GetMapping("/test")//ConsolidatedPortfolio
    public String saveServer()throws Exception{
        return "Server is running";
    }
}
