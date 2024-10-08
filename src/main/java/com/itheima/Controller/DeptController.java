package com.itheima.Controller;

import com.itheima.Service.DeptService;
import com.itheima.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//我是张钦安---测试--01-02-03-04
//我是等等纳豆奶奶-01
//表查询相关信息666
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping
    public List<Dept> getDept(){
        return deptService.getAllDepts();
    }

    @PostMapping("/insert")
    public String updateDept(@RequestBody Dept dept){
     return deptService.updateAllDepts(dept);
    }

    @PutMapping("/update")
    public String updateUser(@RequestBody Dept dept){
        return deptService.updateUsers(dept);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") int id){
        return deptService.deleteUsers(id);
    }
}
