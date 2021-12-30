package com.relay.management.customer;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public ModelAndView list(CustomerDTO customer, ModelAndView mav, @RequestParam(defaultValue = "",value = "msg")String msg) throws Exception{
        int totalRow = customerService.findByCustomerCount(customer);
       customer.setPaging(totalRow);
       List<CustomerDTO> list = customerService.findByCustomerList(customer);

        mav.setViewName("index");
        mav.addObject("list", list);
        mav.addObject("totalRow", totalRow);
        mav.addObject("customer", customer);
        mav.addObject("msg", msg);
        return mav;
    }

    @PostMapping("customerInsert")
    public String customerInsert(CustomerDTO customer, RedirectAttributes redirect)throws Exception{

        int result = customerService.insertInCustomer(customer);
        if(result > 0){
            redirect.addAttribute("msg", "정상적으로 등록되었습니다.");
        }
        return "redirect:/";
    }

    @PostMapping("customerDelete")
    public String customerDelete(CustomerDTO customer, RedirectAttributes redirect)throws Exception{
        int len = customer.getC_Nums().length;
        int result = 0;
        if(len > 0){
            for(int i = 0; i < len; i++){
                int[] num = customer.getC_Nums();
                customer.setC_Num(num[i]);
                result = customerService.deleteInCustomer(customer);

            }
        }
            if(result > 0){
                redirect.addAttribute("msg", "정상적으로 삭제되었습니다.");
            }



        return "redirect:/";
    }
}
