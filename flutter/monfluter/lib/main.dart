import 'package:flutter/material.dart';
import 'package:monfluter/pages/carroussel/carrousselPage.dart';
import 'package:monfluter/pages/commencons/commenconPage.dart';
import 'package:monfluter/pages/home/home.page.dart';
import 'package:monfluter/pages/login/login.page.dart';
import 'package:monfluter/pages/map/map.page.dart';
import 'package:monfluter/pages/register/register.dart';
import 'package:monfluter/pages/trajet/trajet.page.dart';

void main() {
  runApp(const MainApp());
}

class MainApp extends StatelessWidget {
  const MainApp({super.key});

 @override
  Widget build(BuildContext context) {

    return  MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Flutter Demo',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.grey),
        useMaterial3: true,
      ),
      initialRoute: "/home",
      routes: {  
        "/home":(context)=> const HomePage(),
        "/carrousel":(context)=> const CarrousselPage(),
        "/register":(context)=>  RegisterPage(),
        "/start":(context)=> const CommenconsPage(),
        "/login":(context)=> const LoginPage(),
        "/map":(context)=> const MapPage(), 
        "/navigation":(context)=>  MyHomePage(),  
      },
      home: const HomePage() ,
    );
  }
}
