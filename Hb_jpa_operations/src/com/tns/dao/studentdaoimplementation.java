package com.tns.dao;

import com.tns.entity.student;

public class studentdaoimplementation {

	private EntityManager entityManager;
	
	public  void addstudent(student student)
	{
		entityManager.persist(student);
	}
    public void getstudentbyId(int id)
    {
    	return entityManager.find(student.class,id);
    }
    public   void updatestudent(student student)
    {
    	entityManager.merge(student);
    }
    public   void removestudent(student student)
    {
    	entityManager.remove(student);
    }
    public   void commitTransaction()
    {
    	entityManager.getTransaction().commit();
    }
    public   void beginTransaction()
    {
    	entityManager.getTransaction().begin();	
    }
}
