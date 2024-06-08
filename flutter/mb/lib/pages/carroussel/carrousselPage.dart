import 'package:flutter/material.dart';
import 'package:carousel_slider/carousel_slider.dart';
import 'package:mb/pages/home/home.page.dart';
import 'package:mb/pages/register/register.dart';



class CarrousselPage extends StatelessWidget {
  const CarrousselPage({super.key});
  
static String routeName="/carrousel";
  
//   @override
//   Widget build(BuildContext context) {
//   return  Scaffold(
//          body:  Container(
//           height: double.infinity,
//           width: double.infinity,
         
//             )
//             );
       
// }
@override
  Widget build(BuildContext context) {
    return MaterialApp(

      home: Scaffold(
        appBar: AppBar(),
        body: Column(
          children: [
            CarouselDemo(),
            InkWell(
                  onTap: (){
                      Navigator.pop(context);
                      Navigator.pushNamed(context,RegisterPage.routeName);
                  },
                   child: const Text("Skip"),
                ), 
          ],
        ),

      ),
    );
  }
  
}

class CarouselDemo extends StatelessWidget {
   List<String> imgList = [
    'assets/img1.png',
    'assets/im2.png',
    'assets/img3.png',
  ];
   List<String> titreListe = [
    'Trouver une voiture',
    'Suivi en temps réel',
    'Gagner de l’argent'
  ];
  List<String> bodyt = [
    'Un chauffeur à proximité \n vient vous chercher',
    'Suivez l’emplacement \n de votre chauffeur \n sur la carte',
    'Amener des gens lors de vos \n trajet et gagner de l’argent',
  ];
  
  get items => null;
  
  get callbackFunction => null;

  @override
  Widget build(BuildContext context) {
    return Column(
      children: [
        CarouselSlider(
          options: CarouselOptions(height: 400.0,
          aspectRatio: 16/9,
          viewportFraction: 0.8,
          initialPage: 0,
          enableInfiniteScroll: true,
          reverse: false,
          autoPlay: true,
          autoPlayInterval: Duration(seconds: 3),
          autoPlayAnimationDuration: Duration(milliseconds: 800),
          autoPlayCurve: Curves.fastOutSlowIn,
          enlargeCenterPage: true,
          enlargeFactor: 0.3,
          onPageChanged: callbackFunction,
          scrollDirection: Axis.horizontal,
          ),
          items: [0,1,2].map((i) {
        return Builder(
          builder: (BuildContext context) {
            return Container(
              height: double.infinity,
              width: double.infinity,
              // decoration: BoxDecoration(
              //   color: Colors.amber
              // ),
              child: Center(
                child: Column(
                    mainAxisAlignment: MainAxisAlignment.center,
                  crossAxisAlignment: CrossAxisAlignment.center,
        
                  children: [ 
                     InkWell(
                      onTap: (){
                          Navigator.pop(context);
                          Navigator.pushNamed(context,HomePage.routeName);
                      },
                        child:  Image.asset(imgList[i]),
                    ),  
                    Text(
                     titreListe[i],
                      style: const TextStyle(
                        color: Color.fromARGB(255, 40, 177, 255),
                        fontWeight: FontWeight.bold,
                        fontFamily: 'Montserrat',
                        fontSize: 20,
         
                    decorationColor: Color.fromARGB(255, 40, 177, 255), letterSpacing: 5,
                      ),
                    ),    
                    Text(
                      bodyt[i],
                      style: const TextStyle(
                        color: Color.fromARGB(255, 40, 177, 255),
                        fontWeight: FontWeight.bold,
                        fontFamily: 'Montserrat',
                     fontSize: 10, 
                    decorationColor: Color.fromARGB(255, 40, 177, 255), letterSpacing: 5,
                      ),
                    ),       
                    ],
        
                )
                )
              
        //child: Text('text $i', style: const TextStyle(fontSize: 16.0),)
            );
          },
        );
          }).toList(),
        ),
        
      ],
    );
  }
}