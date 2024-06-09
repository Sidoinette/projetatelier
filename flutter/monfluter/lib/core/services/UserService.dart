import 'package:flutter/material.dart';
import 'package:monfluter/core/model/login_model.dart';
import 'package:monfluter/core/model/token_model.dart';
import 'package:monfluter/core/model/user.dart';
import 'package:monfluter/core/repository/UserRepository.dart';
import 'package:monfluter/core/repository/login_repository.dart';

class UserService {
  static Future<void> save(User user) async {
    await UserRepositories().add(user);
  }
}
