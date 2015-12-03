package lpapps.ers.objects;

/**
 * 
 * @author Laurence Parker
 *
 */
public class Employee extends Person {

        protected Date dateStarted;
        protected float salary;
        protected int id;
        
        /**
         * null constructor
         */
        public Employee() {
            super();
            dateStarted = new Date();
            id = 0;
            salary= 0;
        }
        
        /**
         * Defined constructor
         * @param nme name
         * @param sex gender
         * @param dob date of birth
         * @param number id number
         * @param start start date
         */
        public Employee(String nme,char sex,Date dob, int number, Date start) {
            super(nme,sex,dob);
            salary = 0;
            id = number;
            dateStarted = new Date(start);
        }
        
        /** 
         * Clone constructor
         * @param other
         */
        public Employee (Employee other) {
        	super(other.name, other.gender.trim().charAt(0), other.birthDate);
            id = other.id; 
            dateStarted = new Date(other.dateStarted);            
        }
        
        /**
		 * @param dateStarted the dateStarted to set
		 */
		public void setDateStarted(Date dateStarted) {
			this.dateStarted = dateStarted;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}

		/**
		 * @param sal the salary to set
		 */
        public void setSalary(float sal)
        {
            salary = sal;
        }
        
        
        public void copy(Employee other)
        {
        	super.copyPerson(other);
            dateStarted = new Date(other.dateStarted);
            salary = other.salary;
            id = other.id;
        }
        
        /**
		 * @return the dateStarted
		 */
		public Date getDateStarted() {
			return dateStarted;
		}

		/**
		 * @return the salary
		 */
		public float getSalary() {
			return salary;
		}

		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}

		/**
         * Override, Check if two employees are the same
         * @param other employee in comparison 
         * @return boolean true if they are the same
         */
        public boolean equalsEmployee (Employee other)
        {
            return super.equals(other) && id == other.id && salary == other.salary &&
            dateStarted.equals(other.dateStarted);
        }

        public String toString()
        {
            return super.toString() + "Employee Number:"+ id + " salary:" + salary + " Started:" + dateStarted.toString();
        }
}