package phr_solution.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import phr_solution.entity.Patient;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Data
public class PatientRepository {
    private List<Patient> patients = new ArrayList<>();
    private static PatientRepository instance = new PatientRepository();

    private PatientRepository() {}

    public static PatientRepository getInstance() {
        return instance;
    }

    public void save(Patient newPatient) {
        patients.add(newPatient);
    }

    public List<Patient> findAll() {
        return new ArrayList<>(patients);
    }

    public Optional<Patient> findById(Long id) {
        return patients.stream()
                .filter(patient -> patient.getId().equals(id))
                .findFirst();
    }

    public void delete(Patient patient) {
        patients.remove(patient);
    }
}
