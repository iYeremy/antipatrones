// Jerarquia 1
abstract class Employee {}
class Engineer extends Employee {}
class Manager extends Employee {}

// Jerarquia 2 (Paralela)
abstract class SalaryCalculator {}
class EngineerSalaryCalculator extends SalaryCalculator {}
class ManagerSalaryCalculator extends SalaryCalculator {}
// Si añado "Director" a la J1, tengo que añadir "DirectorSalaryCalculator" a la J2.
