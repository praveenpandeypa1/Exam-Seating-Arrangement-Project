public class Teacher {
	public boolean registerTeacher(TeacherDetails teacherDetails) {
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("com/configure/TeacherDetails.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		//session.save(teacherDetails);
		session.persist(teacherDetails);
		transaction.commit();
		
		return true;
	}
