package fr.bpi.repositories;

import java.util.Locale;
import org.springframework.data.repository.CrudRepository;
import fr.bpi.domain.Business;
import fr.bpi.domain.BusinessTranslation;

public interface BusinessTranslationRepository extends CrudRepository<BusinessTranslation, Integer>{

    BusinessTranslation findByBusinessAndLocale(Business business, Locale locale);

}