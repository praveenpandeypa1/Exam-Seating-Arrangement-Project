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
	public List TeacherDetails(TeacherDetails teacherDetails) {
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("com/configure/TeacherDetails.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Criteria criteria = session.createCriteria(TeacherDetails.class);
		criteria.add(Restrictions.eq("id", teacherDetails.getId()));
		List teacher=criteria.list();
		transaction.commit();
		return teacher;
