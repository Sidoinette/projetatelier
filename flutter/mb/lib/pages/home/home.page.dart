import 'package:flutter/material.dart';
import 'package:mb/pages/carroussel/carrousselPage.dart';




class HomePage extends StatelessWidget {
  const HomePage({super.key});
static String routeName="/home";
  
  @override
  Widget build(BuildContext context) {
  return  Scaffold(
      
         body:  Container(
          height: double.infinity,
          width: double.infinity,
          child: Center(
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              crossAxisAlignment: CrossAxisAlignment.center,
              children: [
                InkWell(
                  onTap: (){
                      Navigator.pop(context);
                      Navigator.pushNamed(context,CarrousselPage.routeName);
                  },
                  child: const Image(image: AssetImage('assets/logo.png')),
                
                ),
                const Text(
                  "BokkouYon",
                  style: TextStyle(
                    color: Color.fromARGB(255, 40, 177, 255),
                    fontWeight: FontWeight.bold,
                    fontFamily: 'Montserrat',
                 fontSize: 50, 
                 decoration: TextDecoration.underline,
                decorationColor: Color.fromARGB(255, 40, 177, 255), letterSpacing: 5,
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
       )

    );
  }
}