import java.util.List;

public class StudentService implements IStudentSevice{
    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public boolean save(Student student) {
        return false;
    }

    @Override
    public boolean delete(Integer integer) {
        return false;
    }

    @Override
    public Student findById(Integer integer) {
        return null;
    }

    @Override
    public int getNewId() {
        return 0;
    }
}
