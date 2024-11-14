package in.yogesh.Service;

import in.yogesh.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    public List<Student> getAllStudents();
    public Student saveStudent(Student student);
    public Student getById(int id);
    public void deleteById(int id);
}
