package telran.x;

import java.time.LocalDate;

import telran.reflect.*;

public record PersonNormal (@Id long personId, String name, @Index LocalDate birthDate){

}