package ma.enset.patientmvc.web;

import lombok.AllArgsConstructor;
import ma.enset.patientmvc.entities.Patient;
import ma.enset.patientmvc.repositories.MedecinRepository;
import ma.enset.patientmvc.repositories.PatientRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;
@Controller @AllArgsConstructor
public class MedecinController {
    private MedecinRepository medecinRepository;
}
