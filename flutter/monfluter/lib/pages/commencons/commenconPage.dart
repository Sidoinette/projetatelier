import 'package:flutter/material.dart';
import 'package:monfluter/pages/carroussel/carrousselPage.dart';
import 'package:monfluter/pages/register/register.dart';

class CommenconsPage extends StatelessWidget {
  const CommenconsPage({super.key});
  static String routeName = "/start";

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        body: Container(
      height: double.infinity,
      width: double.infinity,
      child: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          crossAxisAlignment: CrossAxisAlignment.center,
          children: [
            InkWell(
              onTap: () {
               
              },
              child: const Image(image: AssetImage('assets/logo.png')),
            ),
            const Center(
              child: Text(
                
                "Activer votre geolocalisation",
                style: TextStyle(
                  color: Color.fromARGB(255, 40, 177, 255),
                  fontWeight: FontWeight.bold,
                  fontFamily: 'Montserrat',
                  fontSize: 30,
                  decorationColor: Color.fromARGB(255, 40, 177, 255),
                  letterSpacing: 5,
                ),
              ),
            ),
            const Center(
              child: Text(
                "Activez votre geolocalisation pour \n trouver des voitures autour de vous.",
                style: TextStyle(
                  color: Color.fromARGB(239, 34, 34, 34),
                  fontWeight: FontWeight.bold,
                  fontFamily: 'Montserrat',
                  fontSize: 10,
                  decorationColor: Color.fromARGB(255, 40, 177, 255),
                  letterSpacing: 5,
                ),
              ),
            ),
             SizedBox(
                  width: 200,
                  child: ElevatedButton(
                    onPressed: () {
                      // Logique à exécuter lorsque le bouton est appuyé
                      print('Le bouton a été appuyé');
                    },
                    style: ElevatedButton.styleFrom(
                      backgroundColor: const Color.fromARGB(255, 2, 51, 92), // Couleur de fond du bouton
                    ),
                    child: const Text('Activer'),
                  ),
                ),
                SizedBox(
                  width: 200,
                  child: ElevatedButton(
                    onPressed: () {
                        Navigator.pop(context);
                        Navigator.pushNamed(context, RegisterPage.routeName);
                      // Logique à exécuter lorsque le bouton est appuyé
                      print('Le bouton a été appuyé');
                    },
                    style: ElevatedButton.styleFrom(
                      backgroundColor: Color.fromARGB(255, 154, 164, 172), // Couleur de fond du bouton
                    ),
                    child: const Text('Sauter cette etape'),
                  ),
                ),
          ],
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
