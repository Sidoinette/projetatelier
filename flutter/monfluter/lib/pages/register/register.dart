import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:monfluter/core/components/custom_form_field.dart';
import 'package:monfluter/core/model/user.dart';
import 'package:monfluter/core/repository/UserRepository.dart';
import 'package:monfluter/core/services/UserService.dart';
import 'package:monfluter/pages/carroussel/carrousselPage.dart';
import 'package:monfluter/pages/login/login.page.dart';

class RegisterPage extends StatelessWidget {
  RegisterPage({super.key});
  static String routeName = "/register";
  final TextEditingController email = TextEditingController();
  final TextEditingController nom = TextEditingController();
  final TextEditingController tel = TextEditingController();
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(),
        body: Container(
          height: double.infinity,
          width: double.infinity,
          child: SingleChildScrollView(
            child: Center(
              child: Column(
                children: [
                  InkWell(
                    onTap: () {
                      Navigator.pop(context);
                      Navigator.pushNamed(context, CarrousselPage.routeName);
                    },
                    child: const Image(image: AssetImage('assets/img4.png')),
                  ),
                  const Text(
                    "S’inscrire",
                    style: TextStyle(
                      color: Color.fromARGB(255, 40, 177, 255),
                      fontWeight: FontWeight.bold,
                      fontFamily: 'Montserrat',
                      fontSize: 30,
                      decoration: TextDecoration.underline,
                      decorationColor: Color.fromARGB(255, 40, 177, 255),
                      letterSpacing: 5,
                    ),
                  ),
                  TextField(
                    controller: email,
                    decoration: const InputDecoration(
                      // contentPadding: EdgeInsets.symmetric(5.0,5.0)
                      prefixIcon: Icon(Icons.email),
                      hintText: 'Entrer votre email/nom d’utilisateur',
                    ),
                  ),
                  TextField(
                    controller: nom,
                    decoration: const InputDecoration(
                      // contentPadding: EdgeInsets.symmetric(5.0,5.0)
                      prefixIcon: Icon(Icons.person),
                      hintText: 'Entrer votre nom complet',
                    ),
                  ),
                  TextField(
                    controller: tel,
                    decoration: const InputDecoration(
                      // contentPadding: EdgeInsets.symmetric(5.0,5.0)
                      prefixIcon: Icon(Icons.call),
                      hintText: 'Entrer votre nom complet',
                    ),
                  ),
                  const Text(
                    "En vous inscrivant, vous acceptez nos conditions \n générales et politique de confidentialité",
                    style: TextStyle(
                      color: Color.fromARGB(255, 0, 0, 0),
                      fontWeight: FontWeight.normal,
                      fontFamily: 'Inter',
                      fontSize: 14,
                      decorationColor: Color.fromARGB(255, 40, 177, 255),
                      letterSpacing: 5,
                    ),
                  ),
                  SizedBox(
                    width: 200,
                    child: ElevatedButton(
                      onPressed: () {
                        // Logique à exécuter lorsque le bouton est appuyé
                        User user = User(
                          username: nom.text,
                          password: 'passer',
                          telephone: tel.text,
                          nomComplet: nom.text,
                          email: email.text,
                        );
                        UserService.save(user);
                      
                        Navigator.pop(context);
                        Navigator.pushNamed(context, LoginPage.routeName);
                      },
                      style: ElevatedButton.styleFrom(
                        backgroundColor:
                            Colors.blue, // Couleur de fond du bouton
                      ),
                      child: Text('Continuez'),
                    ),
                  ),
                  const Center(
                    child: Text(
                      "vous êtes déjà inscrit? Connecter-vous    ",
                      style: TextStyle(
                        color: Color.fromARGB(255, 0, 0, 0),
                        fontWeight: FontWeight.normal,
                        fontFamily: 'Inter',
                        fontSize: 14,
                        decorationColor: Color.fromARGB(255, 40, 177, 255),
                        letterSpacing: 5,
                      ),
                    ),
                  ),
                ],
              ),
            ),
          ),
          //  child: SingleChildScrollView(
          //    child: Column(
          //     crossAxisAlignment: CrossAxisAlignment.center,
          //    mainAxisAlignment: MainAxisAlignment.center,
          //     children: [
          //      SizedBox(
          //        width: double.infinity,
          //         child: Text("BokkouYon",style: TextStyle(
          //            fontSize: 20,
          //            fontWeight: FontWeight.bold,
          //             color: Colors.grey
          //         ),
          //         textAlign: TextAlign.start,
          //         ),
          //         ),
          //       //Liste des Catgories

          //     ],),
          //  ),
        ));
  }
}
