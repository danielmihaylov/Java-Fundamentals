package JavaOOPAdvanced.IteratorsAndComparators.petClinic.petClinic.interfaces;

import java.util.Map;

/**
 * Created by Daniel on 29.3.2017 г..
 */
public interface ClinicDatabase {

    Map<String,Clinic> getAllClinics();

    Map<String,Pet> getAllPets();

    void addClinic(String clinicName, Integer roomCapacity);

    void addPet(String name, Integer age, String kind);

    void addPetToClinic(String petName, String clinicName);

    boolean isAdded();


}
