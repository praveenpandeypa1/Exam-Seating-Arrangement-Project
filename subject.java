public class Subject {
	
public boolean AddSubject(SubjectDetails subjectDetails) {
		
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("com/configure/SubjectDetails.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(subjectDetails);
		tx.commit();
		
		
		return true;
	}
