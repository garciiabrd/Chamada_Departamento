package com.fatec.loja.Controller;
public class DepartamentoFactory extends Departamento{
   @Override
    public CalcadosFactory createdepartamento(){
       return new CalcadosFactory();
   }
}
