import 'package:flutter/material.dart';
import 'package:monfluter/core/model/login_model.dart';
import 'package:monfluter/core/model/token_model.dart';
import 'package:monfluter/core/repository/login_repository.dart';

class LoginService extends ChangeNotifier {
  static String? adresse;
  static TokenResponseModel? user;
  static Future<void> getUserConnect(LoginModel loginModel) async {
    final TokenResponseModel? token =
        await SecurityRepository.findUserByLoginAndPassword(loginModel);
    user = token;
  }
}
