package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.model.Instructor;
import org.dselent.course_load_scheduler.client.presenter.SchedulePresenter;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import org.dselent.course_load_scheduler.client.model.Course;
import org.dselent.course_load_scheduler.client.view.impl.ModelButton; 

public interface ScheduleView extends BaseView<SchedulePresenter>{
	
	public void addInstructorButton(Instructor instructor);
	public void addCourseButton(Course course);
	public void removeInstructorButton(Instructor instructor);
	public void removeCourseButton(Course course);
	public ModelButton<Instructor> getSelectedInstructorButton();
	public ModelButton<Course> getSelectedCourseButton();
	public void setSelectedInstructorButton(ModelButton<Instructor> selection);
	public void setSelectedCourseButton(ModelButton<Course> selection);
	
	Button getAddInstructorButton();
	Button getEditInstructorButton();
	Button getAddCourseButton();
	Button getEditCourseButton();
	Button getCreateSectionButton();
	Button getEditSectionButton();
	Button getValidateButton();
	void showErrorMessages(String errorMessages);
	
	TextBox getSectionNameText();
	void setSectionNameText(TextBox sectionNameTextBox);
	TextBox getSectionIdText();
	void setSectionIdText(TextBox sectionIdTextBox);
	TextBox getSectionTypeText();
	void setSectionTypeText(TextBox sectionTypeTextBox);
	TextBox getPopulationText();
	void setPopulationText(TextBox populationTextBox);
	
	Button getSectionSubmitButton();
	Button getInstructorSubmitButton();
	Button getCourseSubmitButton();
	
	public TextBox getPopInstructorTextFirstName();
	public void setPopInstructorTextFirstName(TextBox popInstructorTextFirstName);
	public TextBox getPopInstructorTextLastName();
	public void setPopInstructorTextLastName(TextBox popInstructorTextLastName);
	public TextBox getPopInstructorTextRank();
	public void setPopInstructorTextRank(TextBox popInstructorTextRank);
	public TextBox getPopInstructorTextEmail();
	public void setPopInstructorTextEmail(TextBox popInstructorTextEmail);
	public TextBox getPopCourseTextName();
	public void setPopCourseTextName(TextBox popCourseTextName);
	public TextBox getPopCourseTextNumber();
	public void setPopCourseTextNumber(TextBox popCourseTextNumber);
	public TextBox getPopCourseTextFrequency();
	public void setPopCourseTextFrequency(TextBox popCourseTextFrequency);
	
	
	boolean isCreating();
	void setCreating(boolean c);
}
