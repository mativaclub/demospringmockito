package com.springmockito.demospringmockkito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemospringmockkitoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemospringmockkitoApplication.class, args);
	}

}

//В текущем домашнем задании мы вновь вернёмся к работе над
// книгой сотрудников, которую разрабатываем в ходе курса.
// Задача данного домашнего задания - покрыть проект (его сервисы) максимальным количеством тестов.

//Реализуемые вами проекты имеют два сервиса. Подход в каждом из них будет немного отличаться.

//- EmployeeService не имеет зависимостей, потому должен быть покрыт с помощью JUnit.
//- DepartmentService имеет зависимость на EmployeeService, потому потребуется еще и Mockito.

//**Шаг 1.** Необходимо покрыть тестами все операции по работе с сотрудниками из
// EmployeeService (добавление, удаление, поиск).
//
//*Нужно покрыть максимальное количество ситуаций, например добавление сотрудника,
// который уже есть в коллекции, или удаление сотрудника, которого нет.*
//
//**Шаг 2.** Необходимо покрыть тестами все операции по работе с отделами из DepartmentService.
//
//*Нужно «замокать» EmployeeService, который возвращает список сотрудников,
// а уже затем покрыть все методы сервиса тестами с максимальным количеством
// придуманных ситуаций. Например, когда переданный отдел отсутствует или вообще не передан пользователем.*