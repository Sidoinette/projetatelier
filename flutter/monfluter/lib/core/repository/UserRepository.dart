import 'dart:io';

import 'package:dio/dio.dart';
import 'package:monfluter/core/constantes/api.constante.dart';
import 'package:monfluter/core/model/login_model.dart';
import 'package:monfluter/core/model/token_model.dart';
import 'package:monfluter/core/model/user.dart';
import 'package:get/get.dart' hide Response;

class UserRepositories {
  static Dio dio = Dio();
  Future<void> add(User user) async {
    var path = "$apiUrl/clients";
    print(user);
    Response response = await dio.post(
      path,
      data: user.toJson(),
      options: Options(
        followRedirects: false,
        validateStatus: (status) {
          return status! < 500;
        },
        headers: {
          HttpHeaders.contentTypeHeader: "application/json",
        },
      ),
    );
    if (response.statusCode == 200) {
      Get.toNamed('login');
    }
  }
}
