package com.project.vehicle_rental_system.bank;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("account/add")
    public String addAccount(@RequestBody AccountDto accountDto){
        return this.accountService.addAccount(accountDto);
    }
}
