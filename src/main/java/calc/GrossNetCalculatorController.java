package calc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GrossNetCalculatorController {

  @GetMapping("/grossnetcalculator")
  public String greetingForm(Model model) {
    model.addAttribute("grossnetcalculator", new GrossNetCalculator());
    return "grossnetcalculator";
  }

  @PostMapping("/grossnetcalculator")
  public String greetingSubmit(@ModelAttribute GrossNetCalculator grossnetcalculator, Model model) {
    model.addAttribute("grossnetcalculator", grossnetcalculator);
    grossnetcalculator.calculate();
    return "result";
  }

}
