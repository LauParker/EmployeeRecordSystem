package lpapps.ers.main;

import lpapps.ers.objects.Academic;
import lpapps.ers.objects.Date;
import lpapps.ers.objects.Employee;
import lpapps.ers.objects.Person;
import lpapps.ers.objects.Store;

/**
 * 
 * @author Laurence Parker
 *
 */
public class Controller {

	private static boolean ex = false;
	private static int mSelect = 99;
	private static Date dateA;
	private static Date dateB;
	private static Person personA;
	private static Person personB;
	private static Employee employeeA;
	private static Employee employeeB;
	private static Academic academicA;
	private static Academic academicB;
	private static Store store;
	
	/**
	 * Controller menu, and test actions using switch statement.
	 * @param args
	 */
	public static void main(String[] args) {
		UI.mainMenu();
		menuSelect();
		while (!ex) {
			switch (mSelect) {
			
				/************* DATE *************/
			case 1:// DATE
				UI.dateMenu();
				menuSelect();
				break;
				
			case 11:// DATE Constructor
				UI.dateConstructorMenu();
				menuSelect();
				break;
				
			case 111:// null constructor
				System.out.println("Create null date.");
				dateA = new Date();
				System.out.println("Date created: " + dateA.toString());
				menuSelect();
				break;
			case 112:// defined constructor
				System.out.println("Create defined date.");
				dateA = getDate();
				System.out.println("Date created: " + dateA.toString());
				menuSelect();
				break;
			case 113:
				System.out.println("Create clone of date A");
				dateA = isDateNull(dateA);
				System.out.println("Date A: " + dateA.toString());
				System.out.println("Date B: " + dateB.toString());
				dateB = new Date(dateA);
				System.out.println("Date A: " + dateA.toString());
				System.out.println("Date B: " + dateB.toString());
				menuSelect();
				break;
				
			case 12:// DATE Transformer
				UI.dateTransformerMenu();
				menuSelect();
				break;
				
			case 121://set day
				System.out.println("Date: " + dateA.toString());
				dateA = isDateNull(dateA);
				System.out.println("Set day");
				dateA.setDay(EasyIn.getInt());
				System.out.println("Date updated: " + dateA.toString());
				menuSelect();
				break;
			case 122:// set month
				System.out.println("Date: " + dateA.toString());
				dateA = isDateNull(dateA);
				System.out.println("Set month");
				dateA.setMonth(EasyIn.getInt());
				System.out.println("Date updated: " + dateA.toString());
				menuSelect();
				break;
			case 123:// set year
				System.out.println("Date: " + dateA.toString());
				dateA = isDateNull(dateA);
				System.out.println("Set year");
				dateA.setYear(EasyIn.getInt());
				System.out.println("Date updated: " + dateA.toString());
				menuSelect();
				break;
			case 124:// copy date
				System.out.println("Date A: " + dateA.toString());
				System.out.println("Date B: " + dateB.toString());
				dateA = isDateNull(dateA);
				dateB = isDateNull(dateB);
				System.out.println("Copy date B to date A");
				dateA.copyDate(dateB);
				System.out.println("Date A: " + dateA.toString());
				System.out.println("Date B: " + dateB.toString());
				menuSelect();
				break;
				
			case 13:// DATE Accessor
				UI.dateAccessorMenu();
				menuSelect();
				break;
				
			case 131:// get day
				dateA = isDateNull(dateA);
				System.out.println("get day: " + dateA.getDay());
				menuSelect();
				break;
			case 132:// get month
				dateA = isDateNull(dateA);
				System.out.println("get month: " + dateA.getMonth());
				menuSelect();
				break;
			case 133:// get year
				dateA = isDateNull(dateA);
				System.out.println("get year: " + dateA.getYear());
				menuSelect();
				break;
			case 134:// older than
				System.out.println("Is date A older than date B?: ");
				dateA = isDateNull(dateA);
				dateB = isDateNull(dateB);
				System.out.println("Date A: " + dateA.toString());
				System.out.println("Date B: " + dateB.toString());
				System.out.println(dateA.olderThan(dateB));
				menuSelect();
				break;
			case 135:// equals
				System.out.println("Is date A the same as date B?:");
				dateA = isDateNull(dateA);
				dateB = isDateNull(dateB);
				System.out.println("Date A: " + dateA.toString());
				System.out.println("Date B: " + dateB.toString());
				System.out.println(dateA.equals(dateB));
				menuSelect();
				break;
			case 136:// month as string
				System.out.println("Display month as a string");
				dateA = isDateNull(dateA);
				System.out.println(dateA.monthAsString());
				menuSelect();
				break;
			case 137:// to string
				System.out.println("show date");
				dateA = isDateNull(dateA);
				System.out.println(dateA);
				menuSelect();
				break;
			
				/************* PERSON *************/
			case 2:// PERSON
				UI.personMenu();
				menuSelect();
				break;
				
			case 21:// PERSON Constructor
				UI.personConstructorMenu();
				menuSelect();
				break;
				
			case 211:// null constructor
				System.out.println("Create null person.");
				personA = new Person();
				System.out.println("Person created: " + personA.toString());
				menuSelect();
				break;
			case 212:// defined constructor
				System.out.println("Create defined person.");
				personA = getPerson();
				System.out.println("Person created: " + personA.toString());
				menuSelect();
				break;
			case 213:// clone constructor
				System.out.println("Create clone of person A");
				System.out.println("Person A: " + personA.toString());
				System.out.println("Person B: " + personB.toString());
				personA = isPersonNull(personA);
				personB = new Person(personA);
				System.out.println("Person A: " + personA.toString());
				System.out.println("Person B: " + personB.toString());
				menuSelect();
				break;

			case 22:// PERSON Transformer
				UI.personTransformerMenu();
				menuSelect();
				break;
				
			case 221:// set name
				System.out.println("Person: " + personA.toString());
				personA = isPersonNull(personA);
				personA.setName(EasyIn.getString());
				System.out.println("Person updated: " + personA.toString());			
				menuSelect();
				break;
			case 222:// set gender
				System.out.println("Person: " + personA.toString());
				personA = isPersonNull(personA);
				personA.setGender(String.valueOf(EasyIn.getChar()));
				System.out.println("Person updated: " + personA.toString());			
				menuSelect();
				break;
			case 223:// set birth
				System.out.println("Person: " + personA.toString());
				personA = isPersonNull(personA);
				personA.setBirthDate(getDate());
				System.out.println("Person updated: " + personA.toString());			
				menuSelect();
				break;
			case 224:// set address
				System.out.println("Person: " + personA.toString());
				personA = isPersonNull(personA);
				personA.setAddress(EasyIn.getString());
				System.out.println("Person updated: " + personA.toString());			
				menuSelect();
				break;
			case 225:// set Nat no.
				System.out.println("Person: " + personA.toString());
				personA = isPersonNull(personA);
				personA.setNationalI(EasyIn.getString());
				System.out.println("Person updated: " + personA.toString());			
				menuSelect();
				break;
			case 226:// set phone
				System.out.println("Person: " + personA.toString());
				personA = isPersonNull(personA);
				personA.setPhone(EasyIn.getString());
				System.out.println("Person updated: " + personA.toString());			
				menuSelect();
				break;
			case 227:// copy person
				System.out.println("Person A: " + personA.toString());
				System.out.println("Person B: " + personB.toString());
				personA = isPersonNull(personA);
				personB.copyPerson(personA);
				System.out.println("Person A: " + personA.toString());			
				System.out.println("Person B: " + personB.toString());
				menuSelect();
				break;
				
			case 23:// PERSON Accessor
				UI.personAccessorMenu();
				menuSelect();
				break;
				
			case 231:// get name
				personA = isPersonNull(personA);
				System.out.println("get name: " + personA.getName());
				menuSelect();
				break;
			case 232:// get gender
				personA = isPersonNull(personA);
				System.out.println("get gender: " + personA.getGender());
				menuSelect();
				break;
			case 233:// get birthday
				personA = isPersonNull(personA);
				System.out.println("get birthday: " + personA.getBirthDate());
				menuSelect();
				break;
			case 234:// get address
				personA = isPersonNull(personA);
				System.out.println("get address: " + personA.getAddress());
				menuSelect();
				break;
			case 235:// get nat no.
				personA = isPersonNull(personA);
				System.out.println("get National I number: " + personA.getNationalI());
				menuSelect();
				break;
			case 236:// get phone
				personA = isPersonNull(personA);
				System.out.println("get phone number: " + personA.getPhone());
				menuSelect();
				break;
			case 237:// get count of people added
				System.out.println("get counter of Persons added: " + Person.getCount());
				menuSelect();
				break;
			case 238:// check if two persons are the same
				System.out.println("Is person A the same as person B?:");
				personA = isPersonNull(personA);
				personB = isPersonNull(personB);
				System.out.println("Person A: " + personA.toString());
				System.out.println("Person B: " + personB.toString());
				System.out.println(personA.equals(personB));
				menuSelect();
				break;
			case 239:// display person details
				System.out.println("Show person details");
				personA = isPersonNull(personA);
				System.out.println(personA.toString());
				menuSelect();
				break;

				/************* EMPLOYEE *************/
			case 3:// EMPLOYEE
				UI.employeeMenu();
				menuSelect();
				break;
				
			case 31:// EMPLOYEE Constructor
				UI.employeeConstructorMenu();
				menuSelect();
				break;
				
			case 311:// null constructor
				System.out.println("create null employee");
				employeeA = new Employee();
				System.out.println("created employee: " + employeeA);
				menuSelect();
				break;
			case 312:// defined constructor
				System.out.println("create defined employee");
				employeeA = getEmployee();
				System.out.println("created employee: " + employeeA);
				menuSelect();
				break;
			case 313:// clone constructor
				System.out.println("create clone employee");
				System.out.println("Employee A: " + employeeA.toString());
				System.out.println("Employee B: " + employeeB.toString());
				employeeA = isEmployeeNull(employeeA);
				employeeB = new Employee(employeeA);
				System.out.println("Employee A: " + employeeA.toString());
				System.out.println("Employee B: " + employeeB.toString());
				menuSelect();
				break;

			case 32:// EMPLOYEE Transformer
				UI.employeeTransformerMenu();
				menuSelect();
				break;
				
			case 321:// set id
				System.out.println("Employee: " + employeeA.toString());
				employeeA = isEmployeeNull(employeeA);
				employeeA.setId(EasyIn.getInt());
				System.out.println("Employee updated: " + employeeA.toString());
				menuSelect();
				break;
			case 322:// set salary
				System.out.println("Employee: " + employeeA.toString());
				employeeA = isEmployeeNull(employeeA);
				employeeA.setSalary(EasyIn.getInt());
				System.out.println("Employee updated: " + employeeA.toString());
				menuSelect();
				break;
			case 323:// set start date
				System.out.println("Employee: " + employeeA.toString());
				employeeA = isEmployeeNull(employeeA);
				employeeA.setDateStarted(getDate());
				System.out.println("Employee updated: " + employeeA.toString());
				menuSelect();
				break;
			case 324:// copy employee
				System.out.println("Copy employee A to B:");
				System.out.println("Employee A: " + employeeA.toString());
				System.out.println("Employee B: " + employeeB.toString());
				employeeA = isEmployeeNull(employeeA);
				employeeB.copy(employeeA);
				System.out.println("Employee A: " + employeeA.toString());
				System.out.println("Employee B: " + employeeB.toString());
				menuSelect();
				break;
				
			case 33:// EMPLOYEE Accessor
				UI.employeeAccessorMenu();
				menuSelect();
				break;
				
			case 331:// get id
				System.out.println("get id");
				employeeA = isEmployeeNull(employeeA);
				System.out.println("get id" + employeeA.getId());
				menuSelect();
				break;
			case 332:// get salary
				System.out.println("get salary");
				employeeA = isEmployeeNull(employeeA);
				System.out.println("get salary" + employeeA.getSalary());
				menuSelect();
				break;
			case 333:// get start date
				System.out.println("get start date");
				employeeA = isEmployeeNull(employeeA);
				System.out.println("get start date" + employeeA.getDateStarted());
				menuSelect();
				break;
			case 334:// is equal to
				System.out.println("is employee A the same as employee B");
				System.out.println("Employee A: " + employeeA.toString());
				System.out.println("Employee B: " + employeeB.toString());
				employeeA = isEmployeeNull(employeeA);
				employeeA = isEmployeeNull(employeeA);
				System.out.println(employeeA.equals(employeeB));
				menuSelect();
				break;
			case 335:// to string
				employeeA = isEmployeeNull(employeeA);
				System.out.println(employeeA.toString());
				menuSelect();
				break;

				/************* ACADEMIC *************/
			case 4:// ACADEMIC
				UI.academicMenu();
				menuSelect();
				break;
				
			case 41:// ACADEMIC Constructor
				UI.academicConstructorMenu();
				menuSelect();
				break;
				
			case 411:// null constructor
				System.out.println("null constructor:");
				academicA = new Academic();
				System.out.println("Academic Created: " + academicA.toString());
				menuSelect();
				break;
			case 412:// defined constructor
				System.out.println("defined constructor");
				academicA = getAcademic();
				System.out.println("Academic created: " + academicA.toString());
				menuSelect();
				break;
			case 413:// clone constructor
				System.out.println("clone constructor");
				System.out.println("a: " + academicA.toString());
				System.out.println("b: " + academicB.toString());
				academicA = isAcademicNull(academicA);
				academicB = new Academic(academicA);
				System.out.println("a: " + academicA.toString());
				System.out.println("b: " + academicB.toString());
				menuSelect();
				break;
				
			case 42:// ACADEMIC Transformer
				UI.academicTransformerMenu();
				menuSelect();
				break;
				
			case 421:// set department
				System.out.println("set department:");
				System.out.println(academicA.toString());
				academicA = isAcademicNull(academicA);
				academicA.setDepartment(EasyIn.getString());
				System.out.println("updated: " + academicA.toString());
				menuSelect();
				break;
			case 422:// set room num
				System.out.println("set room number:");
				System.out.println(academicA.toString());
				academicA = isAcademicNull(academicA);
				academicA.setRoomNo(EasyIn.getString());
				System.out.println("updated: " + academicA.toString());
				menuSelect();
				break;
			case 423:// set extension
				System.out.println("set extension:");
				System.out.println(academicA.toString());
				academicA = isAcademicNull(academicA);
				boolean ok = false;
				while (!ok) {
					int extension = EasyIn.getInt();
					if ((extension == 8) || (extension == 9) || (extension == 10)) {
						academicA.setExtension(extension);
						ok = true;
					}
				}
				System.out.println("updated: " + academicA.toString());
				menuSelect();
				break;
			case 424:// set grade
				System.out.println("set grade:");
				System.out.println(academicA.toString());
				academicA = isAcademicNull(academicA);
				academicA.setGrade(EasyIn.getInt());
				System.out.println("updated: " + academicA.toString());
				menuSelect();
				break;
			case 425:// copy academic
				System.out.println("copy A to B:");
				System.out.println(academicA.toString());
				System.out.println(academicB.toString());
				academicA = isAcademicNull(academicA);
				academicB.copy(academicA);
				System.out.println(academicA.toString());
				System.out.println(academicB.toString());
				menuSelect();
				break;
				
			case 43:// ACADEMIC Accessor
				UI.academicAccessorMenu();
				menuSelect();
				break;
				
			case 431:// get department
				System.out.println("get department");
				academicA = isAcademicNull(academicA);
				System.out.println("department: " + academicA.getDepartment());
				menuSelect();
				break;
			case 432:// get room
				System.out.println("get room number");
				academicA = isAcademicNull(academicA);
				System.out.println("room number: " + academicA.getRoomNo());
				menuSelect();
				break;
			case 433:// get extension
				System.out.println("get extension");
				academicA = isAcademicNull(academicA);
				System.out.println("department: " + academicA.getExtension());
				menuSelect();
				break;
			case 434:// get grade
				System.out.println("get grade");
				academicA = isAcademicNull(academicA);
				System.out.println("department: " + academicA.getGrade());
				menuSelect();
				break;
			case 435:// equals
				System.out.println("is A the same as B?");
				academicA = isAcademicNull(academicA);
				academicB = isAcademicNull(academicB);
				System.out.println("A" + academicA.toString());
				System.out.println("B" + academicB.toString());
				System.out.println(academicA.equals(academicB));
				menuSelect();
				break;
			case 436:// to string
				academicA = isAcademicNull(academicA);
				academicA.toString();
				menuSelect();
				break;

				/************* STORE *************/
			case 5:// store
				UI.storeMenu();
				menuSelect();
				break;
				
			case 51:// constructor
				System.out.println("create a store");
				store = new Store(EasyIn.getInt());
				menuSelect();
				break;
				
			case 52:
				UI.storeAddMenu();
				menuSelect();
				break;
				
			case 521:// add person
				store = isStoreNull();
				personA = isPersonNull(personA);
				store.addPerson(personA);
				break;
			case 522:// add employee
				store = isStoreNull();
				employeeA = isEmployeeNull(employeeA);
				store.addPerson(employeeA);
				break;
			case 523:// add academic
				store = isStoreNull();
				academicA = isAcademicNull(academicA);
				store.addPerson(academicA);
				menuSelect();
				break;
				
			case 53:// is store full
				System.out.println("is store full?");
				store = isStoreNull();
				System.out.println("store size:" + store.maxSize);
				System.out.println("store count: " + store.count);
				System.out.println(store.storeFull());
				menuSelect();
				break;
			case 54:// get count
				store = isStoreNull();
				System.out.println("Store contains " + store.getCount() + 
						" elements");
				menuSelect();
				break;
			case 55:// element at
				System.out.println("Return details of store at element index");
				store = isStoreNull();
				System.out.println("Index from 0 to " + (store.maxSize-1));
				System.out.println(store.elementAt(EasyIn.getInt()).toString());
				menuSelect();
				break;
			case 56:// already in
				System.out.println("check if person B is already in store");
				System.out.println(personB.toString());
				personB = isPersonNull(personB);
				System.out.println(store.alreadyIn(personB));
				menuSelect();
				break;
			case 57:// show all
				store = isStoreNull();
				System.out.println(store.showAll());
				menuSelect();
				break;
				
			case 58:// increase and add
				UI.storeIncreaseAddMenu();
				menuSelect();
				break;				

			case 581:// add person
				store = isStoreNull();
				personA = isPersonNull(personA);
				store.increaseStoreSizeThenAddP(personA);
				break;
			case 582:// add employee
				store = isStoreNull();
				employeeA = isEmployeeNull(employeeA);
				store.increaseStoreSizeThenAddP(employeeA);
				break;
			case 583:// add academic
				store = isStoreNull();
				academicA = isAcademicNull(academicA);
				store.increaseStoreSizeThenAddP(academicA);
				menuSelect();
				break;

			case 99:
				UI.mainMenu();
				menuSelect();
				break;
			case 999:
				UI.fullMenu();
				menuSelect();
				break;
			case 0:
				ex = true;
				break;
			default:
				System.out.println("Invalid option.");
				menuSelect();
				break;
			}
		}
		System.out.println("Program ends.");
	}
	
	/**
	 * used to recieve input for menu navigation and test selection
	 */
	private static void menuSelect() {
		System.out.println("Menu Selection: ");
		mSelect = EasyIn.getInt();
	}
	
	/**
	 * Get human input for defined Date object
	 * @return Date that was entered
	 */
	private static Date getDate() {
		System.out.println("Enter day (dd): ");
		int dd = EasyIn.getInt();
		System.out.println("Enter month (mm): ");
		int mm = EasyIn.getInt();
		System.out.println("Enter year (yyyy): ");
		int yyyy = EasyIn.getInt();
		return new Date(dd,mm,yyyy); 
	}
	
	/**
	 * used to check if date is not null 
	 * @param date to be checked
	 * @return date checked
	 */
	private static Date isDateNull(Date date) {
		if (date == null) {
			System.out.println("Date not set. Please set date.");
			date = getDate();
			System.out.println("Date created: " + date.toString());
		}
		return date;
	}
	
	/**
	 * Get human input for Person object
	 * @return Person that was entered
	 */
	private static Person getPerson() {
		System.out.println("Enter name: ");
		String name = EasyIn.getString();
		System.out.println("Enter gender (m/f): ");
		char gender = EasyIn.getChar();
		System.out.println("Enter birthday (Date): ");
		Date birth = getDate();
		return new Person(name,gender,birth); 		
	}
	
	/**
	 * used to check if the Person object to be used is not null
	 * @param person to be checked
	 * @return person has been checked
	 */
	private static Person isPersonNull(Person person) {
		if (person == null) {
			System.out.println("Person not set. Please set Person");
			person = getPerson();
			System.out.println("person created: " + person.toString());
		}
		return person;
	}
	
	/**
	 * get human input for Employee object
	 * @return Employee
	 */
	private static Employee getEmployee() {
		Person temp = getPerson();
		System.out.println("Enter employee ID: ");
		int id = EasyIn.getInt();
		Date start = getDate();
		return new Employee(temp.getName(),temp.getGender().charAt(0),
				temp.getBirthDate(),id,start); 		
	}
	
	/**
	 * check if the employee object to be used is not null
	 * @param employee
	 * @return employee
	 */
	private static Employee isEmployeeNull(Employee employee) {
		if (employee == null) {
			System.out.println("Employee not set. Please set Employee");
			employee = getEmployee();
			System.out.println("Employee created: " + employee.toString());
		}
		return employee;
	}
	
	/**
	 * get human input for Academic object
	 * @return academic
	 */
	private static Academic getAcademic() {
		Employee temp = getEmployee();
		return new Academic(temp.getName(),temp.getGender().charAt(0),
				temp.getBirthDate(),temp.getId(),temp.getDateStarted());
	}
	
	/**
	 * check if academic object to be used is not null
	 * @param academic
	 * @return academic
	 */
	private static Academic isAcademicNull(Academic academic) {
		if (academic == null) {
			System.out.println("Academic not set. Please set Academic");
			academic = getAcademic();
			System.out.println("Academic created: " + academic.toString());
		}
		return academic;
	}
	
	/**
	 * check if store object to be used is not null
	 * @return store
	 */
	private static Store isStoreNull() {
		if (store == null) {
			System.out.println("no store set up. Please set up store");
			store = new Store(EasyIn.getInt());
			System.out.println("store created");
		}
		return store;
	}
}
