package com.example.test.controller;

import com.example.test.dao.DepartmentDao;
import com.example.test.dao.EmployeeDao;
import com.example.test.model.Department;
import com.example.test.model.Employee;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;

    @GetMapping("/emps")
    //TODO emps跳转不到list页面
    public String list(Model model){
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps",employees);
        return "emp/list";
    }

    @GetMapping("/forwardCrud")
    public String forwardCrud() {
        return "dashboard";
    }

    @GetMapping("/emp")
    public String toAddpage(Model model){
        // 来到添加页面，查出所有部门
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/add";
    }

    @PostMapping("/emp")
    public String addEmp(Employee employee){
        // 保存员工数据
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    //回到修改页面，查出当前员工，在页面回显
    @GetMapping("/emp/{id}")
    public String toEditpage(@PathVariable("id") Integer id,Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp",employee);
        //页面要显示所有部门列表
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/add";
    }

    @PutMapping("/emp")
    public String editEmp(Employee employee){
        // 修改员工数据
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @RequestMapping(value = "/emp/{id}", method = RequestMethod.POST)
    public String deleteEmployee(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/emps";
    }
}
