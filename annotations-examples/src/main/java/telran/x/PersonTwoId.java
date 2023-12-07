package telran.x;

import java.time.LocalDate;

import telran.reflect.*;

public record PersonTwoId (@Id long personId, @Id String name, @Index LocalDate birthDate){

}