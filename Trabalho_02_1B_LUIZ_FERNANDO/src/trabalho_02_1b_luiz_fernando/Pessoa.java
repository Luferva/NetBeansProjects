
package trabalho_02_1b_luiz_fernando;


public class Pessoa {
    
    int peso;
    double altura;
    
float calculoIMC()
 {
  return (float) (peso/(altura*altura));
 }
 
String obterIMC()
 {
  float imc;
  String classe;
  imc = calculoIMC();
 
  if (imc < 20.7)
    classe = "Abaixo do Peso";
  else
  if (imc <= 26.4)
    classe = "Peso normal";
  else
  if (imc <= 27.8)
    classe = "Marginalmente acima do peso";
  else
  if (imc <= 31.1)
    classe = "Acima do peso";
  else
    classe = "Obesidade";
 
return classe;
 } 
    
}
