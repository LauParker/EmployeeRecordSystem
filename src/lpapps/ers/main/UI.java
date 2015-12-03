package lpapps.ers.main;

/**
 * 
 * @author Laurence Parker
 *
 */
public class UI {

	public static void fullMenu() {
		mainMenu();
		dateMenu();
		dateConstructorMenu();
		dateTransformerMenu();
		dateAccessorMenu();
		personMenu();
		personConstructorMenu();
		personTransformerMenu();
		personAccessorMenu();
		employeeMenu();
		employeeConstructorMenu();
		employeeTransformerMenu();
		employeeAccessorMenu();
		academicMenu();
		academicConstructorMenu();
		academicTransformerMenu();
		academicAccessorMenu();
		storeMenu();
		storeAddMenu();
		storeIncreaseAddMenu();
	}
	
	public static void mainMenu() {
		System.out.println("==============================================");
		System.out.println("|   Author:     Laurence Parker              |");
		System.out.println("|   Assignment: Object Oriented Programming  |");
		System.out.println("==============================================");
		System.out.println("|   Full menu: 999                           |");
		System.out.println("|   CLASSES:                                 |");
		System.out.println("|      1   . DATE                            |");
		System.out.println("|      2   . PERSON                          |");
		System.out.println("|      3   . EMPLOYEE                        |");
		System.out.println("|      4   . ACADEMIC                        |");
		System.out.println("|      5   . STORE                           |");
		System.out.println("|                                            |");
		System.out.println("|      0   . EXIT                            |");
		System.out.println("==============================================");
	}
	
	/*******************		DATE		*******************/
	
	public static void dateMenu() {
		System.out.println("==============================================");
		System.out.println("|   Author:     Laurence Parker              |");
		System.out.println("|   CLASS: 1. DATE                           |");
		System.out.println("==============================================");
		System.out.println("|   Main Menu: 99                            |");
		System.out.println("|   LOCATION: Date Menu                      |");
		System.out.println("|                                            |");
		System.out.println("|      11  . Constructor                     |");
		System.out.println("|      12  . Transformer                     |");
		System.out.println("|      13  . Accessor                        |");
		System.out.println("|                                            |");
		System.out.println("|      0   . EXIT                            |");
		System.out.println("==============================================");
	}

	public static void dateConstructorMenu() {
		System.out.println("==============================================");
		System.out.println("|   Author:     Laurence Parker              |");
		System.out.println("|   CLASS: 1. DATE                           |");
		System.out.println("==============================================");
		System.out.println("|   Main Menu: 99                            |");
		System.out.println("|   LOCATION: 11. Constructor                |");
		System.out.println("|     1 . DATE                               |");
		System.out.println("|                                            |");
		System.out.println("|      111 . Date() null                     |");
		System.out.println("|      112 . Date(int,int,int) defined       |");
		System.out.println("|      113 . Date(date) clone                |");
		System.out.println("|                                            |");
		System.out.println("|      0   . EXIT                            |");
		System.out.println("==============================================");
	}

	public static void dateTransformerMenu() {
		System.out.println("==============================================");
		System.out.println("|   Author:     Laurence Parker              |");
		System.out.println("|   CLASS: 1. DATE                           |");
		System.out.println("==============================================");
		System.out.println("|   Main Menu: 99                            |");
		System.out.println("|   LOCATION: 12. Transformer                |");
		System.out.println("|     1 . DATE                               |");
		System.out.println("|                                            |");
		System.out.println("|      121 . set day(int)                    |");
		System.out.println("|      122 . set month(int)                  |");
		System.out.println("|      123 . set year(int)                   |");
		System.out.println("|      124 . copy date(Date)                 |");
		System.out.println("|                                            |");
		System.out.println("|      0   . EXIT                            |");
		System.out.println("==============================================");
	}

	public static void dateAccessorMenu() {
		System.out.println("==============================================");
		System.out.println("|   Author:     Laurence Parker              |");
		System.out.println("|   CLASS: 1. DATE                           |");
		System.out.println("==============================================");
		System.out.println("|   Main Menu: 99                            |");
		System.out.println("|   LOCATION: 13. Accessor                   |");
		System.out.println("|     1 . DATE                               |");
		System.out.println("|                                            |");
		System.out.println("|      131 . get day(int)                    |");
		System.out.println("|      132 . get month(int)                  |");
		System.out.println("|      133 . get year(int)                   |");
		System.out.println("|      134 . older than(Date)                |");
		System.out.println("|      135 . equals(date)                    |");
		System.out.println("|      136 . month as string                 |");
		System.out.println("|      137 . to string()                     |");
		System.out.println("|                                            |");
		System.out.println("|      0   . EXIT                            |");
		System.out.println("==============================================");
	}

	/*******************		PERSON		*******************/
	
	public static void personMenu() {
		System.out.println("==============================================");
		System.out.println("|   Author:     Laurence Parker              |");
		System.out.println("|   CLASS: 2. PERSON                         |");
		System.out.println("==============================================");
		System.out.println("|   Main Menu: 99                            |");
		System.out.println("|   LOCATION: Person Menu                    |");
		System.out.println("|                                            |");
		System.out.println("|      21  . Constructor                     |");
		System.out.println("|      22  . Transformer                     |");
		System.out.println("|      23  . Accessor                        |");
		System.out.println("|                                            |");
		System.out.println("|      0   . EXIT                            |");
		System.out.println("==============================================");
	}

	public static void personConstructorMenu() {
		System.out.println("==============================================");
		System.out.println("|   Author:     Laurence Parker              |");
		System.out.println("|   CLASS: 2. PERSON                         |");
		System.out.println("==============================================");
		System.out.println("|   Main Menu: 99                            |");
		System.out.println("|   LOCATION: 21. Constructor                |");
		System.out.println("|     2 . PERSON                             |");
		System.out.println("|                                            |");
		System.out.println("|      211 . Person() null                   |");
		System.out.println("|      212 . Person(Str,char,Date) defined   |");
		System.out.println("|      213 . Person(person) clone            |");
		System.out.println("|                                            |");
		System.out.println("|      0   . EXIT                            |");
		System.out.println("==============================================");
	}

	public static void personTransformerMenu() {
		System.out.println("==============================================");
		System.out.println("|   Author:     Laurence Parker              |");
		System.out.println("|   CLASS: 2. PERSON                         |");
		System.out.println("==============================================");
		System.out.println("|   Main Menu: 99                            |");
		System.out.println("|   LOCATION: 22. Transformer                |");
		System.out.println("|     2 . PERSON                             |");
		System.out.println("|                                            |");
		System.out.println("|      221 . set name(Str)                   |");
		System.out.println("|      222 . set gender(char)                |");
		System.out.println("|      223 . set birth(Date)                 |");
		System.out.println("|      224 . set address(Str)                |");
		System.out.println("|      225 . set nationalI(Str)              |");
		System.out.println("|      226 . set phone(Str)                  |");
		System.out.println("|      227 . copy Person(person)             |");
		System.out.println("|                                            |");
		System.out.println("|      0   . EXIT                            |");
		System.out.println("==============================================");
	}

	public static void personAccessorMenu() {
		System.out.println("==============================================");
		System.out.println("|   Author:     Laurence Parker              |");
		System.out.println("|   CLASS: 2. PERSON                         |");
		System.out.println("==============================================");
		System.out.println("|   Main Menu: 99                            |");
		System.out.println("|   LOCATION: 23. Accessor                   |");
		System.out.println("|     2 . PERSON                             |");
		System.out.println("|                                            |");
		System.out.println("|      231 . get name()                      |");
		System.out.println("|      232 . get gender()                    |");
		System.out.println("|      233 . get birth()                     |");
		System.out.println("|      234 . get address()                   |");
		System.out.println("|      235 . get nationalI()                 |");
		System.out.println("|      236 . get phone()                     |");
		System.out.println("|      237 . get cont()                      |");
		System.out.println("|      238 . equals(Person)                  |");
		System.out.println("|      239 . to string()                     |");
		System.out.println("|                                            |");
		System.out.println("|      0   . EXIT                            |");
		System.out.println("==============================================");
	}

	/*******************		Employee		*******************/
	
	public static void employeeMenu() {
		System.out.println("==============================================");
		System.out.println("|   Author:     Laurence Parker              |");
		System.out.println("|   CLASS: 3. EMPLOYEE                       |");
		System.out.println("==============================================");
		System.out.println("|   Main Menu: 99                            |");
		System.out.println("|   LOCATION: Employee Menu                  |");
		System.out.println("|                                            |");
		System.out.println("|      31  . Constructor                     |");
		System.out.println("|      32  . Transformer                     |");
		System.out.println("|      33  . Accessor                        |");
		System.out.println("|                                            |");
		System.out.println("|      0   . EXIT                            |");
		System.out.println("==============================================");
	}

	public static void employeeConstructorMenu() {
		System.out.println("==============================================");
		System.out.println("|   Author:     Laurence Parker              |");
		System.out.println("|   CLASS: 3. EMPLOYEE                       |");
		System.out.println("==============================================");
		System.out.println("|   Main Menu: 99                            |");
		System.out.println("|   LOCATION: 31. Constructor                |");
		System.out.println("|     3. EMPLOYEE                            |");
		System.out.println("|                                            |");
		System.out.println("|      311 . Employee() null                 |");
		System.out.println("|      312 . Employee(Super(),int,Date) def  |"); 
		System.out.println("|      313 . Employee(employee) clone        |");
		System.out.println("|                                            |");
		System.out.println("|      0   . EXIT                            |");
		System.out.println("==============================================");
	}

	public static void employeeTransformerMenu() {
		System.out.println("==============================================");
		System.out.println("|   Author:     Laurence Parker              |");
		System.out.println("|   CLASS: 3. EMPLOYEE                       |");
		System.out.println("==============================================");
		System.out.println("|   Main Menu: 99                            |");
		System.out.println("|   LOCATION: 32. Transformer                |");
		System.out.println("|     3. EMPLOYEE                            |");
		System.out.println("|                                            |");
		System.out.println("|      321 . set id(int)                     |");
		System.out.println("|      322 . set salary(float)               |");
		System.out.println("|      323 . set started(Date)               |");
		System.out.println("|      324 . copy Employee(employee)         |");
		System.out.println("|                                            |");
		System.out.println("|      0   . EXIT                            |");
		System.out.println("==============================================");
	}

	public static void employeeAccessorMenu() {
		System.out.println("==============================================");
		System.out.println("|   Author:     Laurence Parker              |");
		System.out.println("|   CLASS: 3. EMPLOYEE                       |");
		System.out.println("==============================================");
		System.out.println("|   Main Menu: 99                            |");
		System.out.println("|   LOCATION: 33. Accessor                   |");
		System.out.println("|     3. EMPLOYEE                            |");
		System.out.println("|                                            |");
		System.out.println("|      331 . get id()                        |");
		System.out.println("|      332 . get salary()                    |");
		System.out.println("|      333 . get started()                   |");
		System.out.println("|      334 . equals(Employee)                |");
		System.out.println("|      335 . to string()                     |");
		System.out.println("|                                            |");
		System.out.println("|      0   . EXIT                            |");
		System.out.println("==============================================");
	}

	/*******************		Academic		*******************/
	
	public static void academicMenu() {
		System.out.println("==============================================");
		System.out.println("|   Author:     Laurence Parker              |");
		System.out.println("|   CLASS: 4. ACADEMIC                       |");
		System.out.println("==============================================");
		System.out.println("|   Main Menu: 99                            |");
		System.out.println("|   LOCATION: Academic Menu                  |");
		System.out.println("|                                            |");
		System.out.println("|      41  . Constructor                     |");
		System.out.println("|      42  . Transformer                     |");
		System.out.println("|      43  . Accessor                        |");
		System.out.println("|                                            |");
		System.out.println("|      0   . EXIT                            |");
		System.out.println("==============================================");
	}

	public static void academicConstructorMenu() {
		System.out.println("==============================================");
		System.out.println("|   Author:     Laurence Parker              |");
		System.out.println("|   CLASS: 4. ACADEMIC                       |");
		System.out.println("==============================================");
		System.out.println("|   Main Menu: 99                            |");
		System.out.println("|   LOCATION: 41. Constructor                |");
		System.out.println("|     4. ACADEMIC                            |");
		System.out.println("|                                            |");
		System.out.println("|      411 . Academic() null                 |");
		System.out.println("|      412 . Academic(Super()) defined       |"); 
		System.out.println("|      413 . Academic(academic) clone        |");
		System.out.println("|                                            |");
		System.out.println("|      0   . EXIT                            |");
		System.out.println("==============================================");
	}

	public static void academicTransformerMenu() {
		System.out.println("==============================================");
		System.out.println("|   Author:     Laurence Parker              |");
		System.out.println("|   CLASS: 4. ACADEMIC                       |");
		System.out.println("==============================================");
		System.out.println("|   Main Menu: 99                            |");
		System.out.println("|   LOCATION: 42. Transformer                |");
		System.out.println("|     4. ACADEMIC                            |");
		System.out.println("|                                            |");
		System.out.println("|      421 . set department(Str)             |");
		System.out.println("|      422 . set room number(Str)            |");
		System.out.println("|      423 . set extension(int)              |");
		System.out.println("|      424 . set grade(int)                  |");
		System.out.println("|      425 . copy Academic(academic)         |");
		System.out.println("|                                            |");
		System.out.println("|      0   . EXIT                            |");
		System.out.println("==============================================");
	}

	public static void academicAccessorMenu() {
		System.out.println("==============================================");
		System.out.println("|   Author:     Laurence Parker              |");
		System.out.println("|   CLASS: 4. ACADEMIC                       |");
		System.out.println("==============================================");
		System.out.println("|   Main Menu: 99                            |");
		System.out.println("|   LOCATION: 43. Accessor                   |");
		System.out.println("|     4. ACADEMIC                            |");
		System.out.println("|                                            |");
		System.out.println("|      431 . get department()                |");
		System.out.println("|      432 . get room number()               |");
		System.out.println("|      433 . get extension()                 |");
		System.out.println("|      434 . get grade()                     |");
		System.out.println("|      435 . equals(academic)                |");
		System.out.println("|      436 . to string()                     |");
		System.out.println("|                                            |");
		System.out.println("|      0   . EXIT                            |");
		System.out.println("==============================================");
	}

	/*******************		Store		*******************/
	
	public static void storeMenu() {
		System.out.println("==============================================");
		System.out.println("|   Author:     Laurence Parker              |");
		System.out.println("|   CLASS: 5. Store                          |");
		System.out.println("==============================================");
		System.out.println("|   Main Menu: 99                            |");
		System.out.println("|   LOCATION: Store Menu                     |");
		System.out.println("|                                            |");
		System.out.println("|      51  . create store(int) defined       |");
		System.out.println("|      52  . add                             |");
		System.out.println("|      53  . store full()                    |");
		System.out.println("|      54  . get count()                     |");
		System.out.println("|      55  . element at(int)                 |");
		System.out.println("|      56  . already in(Person)              |");
		System.out.println("|      57  . show all()                      |");
		System.out.println("|      58  . increase and add(Person)        |");
		System.out.println("|                                            |");
		System.out.println("|      0   . EXIT                            |");
		System.out.println("==============================================");
	}
	
	public static void storeAddMenu() {
		System.out.println("==============================================");
		System.out.println("|   Author:     Laurence Parker              |");
		System.out.println("|   CLASS: 5. Store                          |");
		System.out.println("==============================================");
		System.out.println("|   Main Menu: 99                            |");
		System.out.println("|   LOCATION: 52. Store add                  |");
		System.out.println("|                                            |");
		System.out.println("|      521 . add person(Person)              |");
		System.out.println("|      522 . add employee(Employee)          |");
		System.out.println("|      523 . add academic(Academic)          |");
		System.out.println("|                                            |");
		System.out.println("|      0   . EXIT                            |");
		System.out.println("==============================================");
	}

	public static void storeIncreaseAddMenu() {
		System.out.println("==============================================");
		System.out.println("|   Author:     Laurence Parker              |");
		System.out.println("|   CLASS: 5. Store                          |");
		System.out.println("==============================================");
		System.out.println("|   Main Menu: 99                            |");
		System.out.println("|   LOCATION: 58. Increase and add           |");
		System.out.println("|                                            |");
		System.out.println("|      581 . add person(Person)              |");
		System.out.println("|      582 . add employee(Employee)          |");
		System.out.println("|      583 . add academic(Academic)          |");
		System.out.println("|                                            |");
		System.out.println("|      0   . EXIT                            |");
		System.out.println("==============================================");
	}
}
