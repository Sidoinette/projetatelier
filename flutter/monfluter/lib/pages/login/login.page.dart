import 'package:flutter/material.dart';
import 'package:monfluter/core/components/custom_form_field.dart';
import 'package:monfluter/pages/carroussel/carrousselPage.dart';
import 'package:monfluter/pages/map/map.page.dart';

class LoginPage extends StatelessWidget {
  const LoginPage({super.key});
  static String routeName = "/login";

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
                  "Se Connecter",
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
                Column(
                  mainAxisAlignment: MainAxisAlignment.center,
                  crossAxisAlignment: CrossAxisAlignment.center,
                  children: [
                    CustomFormField(
                      // controller: _passworController,
                      hintText: 'Entrer votre email/nom d’utilisateur',
                      icon: Icons.email,
                      validator: (val) {
                        if (val != null && val.isEmpty) {
                          return 'Enter un Mot de Passe  Valide';
                        }
                      },
                    ),
                  ],
                ),
                Column(
                  mainAxisAlignment: MainAxisAlignment.center,
                  crossAxisAlignment: CrossAxisAlignment.center,
                  children: [
                    CustomFormField(
                      // controller: _passworController,
                      hintText: 'Entrer votre mot de passe',
                      obscureText: true,
                      icon: Icons.person,
                      validator: (val) {
                        if (val != null && val.isEmpty) {
                          return 'Enter un mot de passe  Valide';
                        }
                      },
                    ),
                  ],
                ),
              const Padding(
                padding: EdgeInsets.all(8.0),
                child: Text(
                    
                      "Mot de  passe oublié?",
                    style: TextStyle(
                      
                      color: Color.fromARGB(255, 0, 0, 0),
                      fontWeight: FontWeight.normal,
                      fontFamily: 'Inter',
                      fontSize: 8,
                      decorationColor: Color.fromARGB(255, 40, 177, 255),
                      letterSpacing: 5,
                    ),
                  ),
              ), 
                SizedBox(
                  width: 200,
                  child: ElevatedButton(
                    onPressed: () {
                       Navigator.pop(context);
                      Navigator.pushNamed(context, MapPage.routeName);
                     
                    },
                    style: ElevatedButton.styleFrom(
                      backgroundColor: Colors.blue, // Couleur de fond du bouton
                    ),
                    child: const Text('Se Connecter'),
                  ),
                ),
                const Text(
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
              ],
            ),
          ),
          
          )
     
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
