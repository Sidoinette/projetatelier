// ignore_for_file: public_member_api_docs, sort_constructors_first
import 'dart:convert';

class User {
  String nomComplet;
  String email;
  String telephone;
  String username;
  String password;
  User({
    required this.username,
    required this.password,
    required this.telephone,
    required this.nomComplet,
    required this.email,
  });

  Map<String, dynamic> toMap() {
    return <String, dynamic>{
      'username': username,
      'password': password,
    };
  }

  Map<String, dynamic> toJson() {
    return {
      'telephone': telephone,
      'nomComplet': nomComplet,
      'email': email,
      'username': username,
      'password': password,
    };
  }

  factory User.FromJson(Map<String, dynamic> json) {
    return User(
      username: json['id'],
      password: json['password'],
      telephone: json['telephone'],
      nomComplet: json['nomComplet'],
      email: json['email'],
    );
  }
}
