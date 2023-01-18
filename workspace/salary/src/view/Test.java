package view;

import java.io.IOException;

import dao.SalaryDAO;
import domain.SalaryVO;

public class Test {
   public static void main(String[] args) throws IOException{
      SalaryVO salaryVO = new SalaryVO();
      SalaryDAO salaryDAO = new SalaryDAO();
//      
//      salaryVO.setSalary(15100);
      salaryVO.setSalary(14000);
      salaryVO.setIncomeTax(1000000);
//      salaryVO.setNetPay(9_000_000);
//      
//      salaryDAO.insert(salaryVO);	// 추가
//      
//      salaryDAO.update(salaryVO); // 수정
//      salaryDAO.delete(salaryVO); // 삭제
//      System.out.println(salaryDAO.showAll(salaryVO)); // 전체 조회
//      System.out.println(salaryDAO.show(salaryVO));
   }
}

