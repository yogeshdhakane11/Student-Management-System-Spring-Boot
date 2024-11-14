package in.yogesh.ServiceImpl;

import in.yogesh.Entity.Student;
import in.yogesh.Repository.StudentRepository;
import in.yogesh.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceImpl implements StudentService {
    @Autowired
    in.yogesh.Repository.StudentRepository StudentRepository;
    @Override
    public List<Student> getAllStudents() {
        List<Student> list = StudentRepository.findAll();
        return list;
    }

    @Override
    public Student saveStudent(Student student) {
        return StudentRepository.save(student);
    }

    @Override
    public Student getById(int id) {
        return StudentRepository.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
        StudentRepository.deleteById(id);
    }
}
