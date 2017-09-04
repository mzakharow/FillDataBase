package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.String.format;

public class Main {

    public static void main(String[] args) {

        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://127.0.0.1:5432/********";
            String login = "*****";
            String password = "*****";
            Connection con = DriverManager.getConnection(url, login, password);

            Statement stmt = con.createStatement();

            int rsInt1 = stmt.executeUpdate("CREATE TABLE authorities\n" +
                    "(\n" +
                    "    username character varying(255),\n" +
                    "    authority character varying(255)\n" +
                    ")\n" +
                    "WITH (\n" +
                    "    OIDS = FALSE\n" +
                    ")\n" +
                    "TABLESPACE pg_default;");
            int rsInt2 = stmt.executeUpdate("ALTER TABLE authorities\n" +
                    "    OWNER to postgres;");

            int rsInt3 = stmt.executeUpdate("CREATE TABLE siteuser\n" +
                    "(\n" +
                    "    username character varying(255),\n" +
                    "    password character varying(255),\n" +
                    "    enabled boolean\n" +
                    ")\n" +
                    "WITH (\n" +
                    "    OIDS = FALSE\n" +
                    ")\n" +
                    "TABLESPACE pg_default;");
            int rsInt4 = stmt.executeUpdate("ALTER TABLE siteuser\n" +
                    "    OWNER to postgres;");

            int rsInt5 = stmt.executeUpdate("CREATE TABLE cars\n" +
                    "(\n" +
                    "    iduser integer NOT NULL,\n" +
                    "    taxi boolean,\n" +
                    "    carnumber character varying(20),\n" +
                    "    username character varying(50),\n" +
                    "    vin character varying(20),\n" +
                    "    phone character varying(15),\n" +
                    "    customs boolean,\n" +
                    "    model character varying(50),\n" +
                    "    manufacture character varying(10),\n" +
                    "    PRIMARY KEY (iduser)\n" +
                    ")\n" +
                    "WITH (\n" +
                    "    OIDS = FALSE\n" +
                    ")\n" +
                    "TABLESPACE pg_default;");
            int rsInt6 = stmt.executeUpdate("ALTER TABLE cars\n" +
                    "    OWNER to postgres;");


            List<String> charList = new ArrayList<String>();
            charList.add("а");
            charList.add("в");
            charList.add("е");
            charList.add("к");
            charList.add("м");
            charList.add("н");
            charList.add("о");
            charList.add("р");
            charList.add("с");
            charList.add("т");
            charList.add("у");
            charList.add("х");

            List<String> location = new ArrayList<String>();
            location.add("77");
            location.add("177");
            location.add("97");
            location.add("197");
            location.add("50");
            location.add("150");
            location.add("99");
            location.add("199");
            location.add("777");


            List<String> nameListM = new ArrayList<String>();
            nameListM.add("Петров");
            nameListM.add("Иванов");
            nameListM.add("Сидоров");
            nameListM.add("Скворцов");
            nameListM.add("Соколов");
            nameListM.add("Захаров");
            nameListM.add("Мельников");
            nameListM.add("Пулькин");
            nameListM.add("Дулькин");
            nameListM.add("Чебурашкин");
            nameListM.add("Курочкин");
            nameListM.add("Лавочкин");
            nameListM.add("Путин");
            nameListM.add("Медведев");
            nameListM.add("Трампов");
            nameListM.add("Обамов");
            nameListM.add("Пелюлькин");
            nameListM.add("Жаров");
            nameListM.add("Жабин");
            nameListM.add("Курносов");

            List<String> nameListW = new ArrayList<String>();
            nameListW.add("Лавочкина");
            nameListW.add("Иванова");
            nameListW.add("Сидорова");
            nameListW.add("Скворцова");
            nameListW.add("Соколова");
            nameListW.add("Захарова");
            nameListW.add("Мельникова");
            nameListW.add("Пулькина");
            nameListW.add("Дулькина");
            nameListW.add("Чебурашкина");
            nameListW.add("Курочкина");
            nameListW.add("Путина");
            nameListW.add("Петрова");
            nameListW.add("Медведева");
            nameListW.add("Трампова");
            nameListW.add("Обамова");
            nameListW.add("Пелюлькина");
            nameListW.add("Жарова");
            nameListW.add("Жабина");
            nameListW.add("Курносова");

            List<String> middleMList = new ArrayList<String>();
            middleMList.add("Петрович");
            middleMList.add("Иванович");
            middleMList.add("Сидорович");
            middleMList.add("Ильич");
            middleMList.add("Михайлович");
            middleMList.add("Владимирович");
            middleMList.add("Владленович");
            middleMList.add("Максимович");
            middleMList.add("Андреевич");
            middleMList.add("Кириллович");
            middleMList.add("Сергеевич");
            middleMList.add("Александрович");
            middleMList.add("Анатольевич");
            middleMList.add("Геннадьевич");

            List<String> lastMList = new ArrayList<String>();
            lastMList.add("Геннадий");
            lastMList.add("Петр");
            lastMList.add("Илья");
            lastMList.add("Сидор");
            lastMList.add("Владимир");
            lastMList.add("Михаил");
            lastMList.add("Андрей");
            lastMList.add("Владлен");
            lastMList.add("Максим");
            lastMList.add("Сергей");
            lastMList.add("Кирилл");
            lastMList.add("Анатолий");
            lastMList.add("Александр");
            lastMList.add("Иван");

            List<String> middleWList = new ArrayList<String>();
            middleWList.add("Валентиновна");
            middleWList.add("Сергеевна");
            middleWList.add("Анатольевна");
            middleWList.add("Петровна");
            middleWList.add("Владленовна");
            middleWList.add("Владимировна");
            middleWList.add("Михайловна");
            middleWList.add("Максимовна");
            middleWList.add("Андреевна");
            middleWList.add("Кирилловна");
            middleWList.add("Ивановна");
            middleWList.add("Александровна");
            middleWList.add("Сидоровна");
            middleWList.add("Геннадьевна");

            List<String> lastWList = new ArrayList<String>();
            lastWList.add("Оксана");
            lastWList.add("Светлана");
            lastWList.add("Екатерина");
            lastWList.add("Елена");
            lastWList.add("Наталия");
            lastWList.add("София");
            lastWList.add("Ксения");
            lastWList.add("Валентина");
            lastWList.add("Ольга");
            lastWList.add("Алла");
            lastWList.add("Анна");
            lastWList.add("Юлия");
            lastWList.add("Татьяна");
            lastWList.add("Мария");

            List<String> carList = new ArrayList<String>();
            carList.add("Nissa Teana");
            carList.add("Nissa Juke");
            carList.add("Nissa Murano");
            carList.add("Toyota Camry");
            carList.add("Reno Logan");
            carList.add("Peugeot 206");
            carList.add("Peugeot 107");
            carList.add("Peugeot 3008");
            carList.add("ВАЗ 2108");
            carList.add("ВАЗ 2101");
            carList.add("ВАЗ 2106");
            carList.add("ВАЗ 2107");
            carList.add("ВАЗ 2110");
            carList.add("ВАЗ 2111");
            carList.add("ВАЗ 2112");
            carList.add("ВАЗ 2115");
            carList.add("Infinity QX35");
            carList.add("Infinity QX60");
            carList.add("Ferrari Spider");
            carList.add("Bugatti Veyron");
            carList.add("MacLaren F1");
            carList.add("Kia Rio");
            carList.add("ГазельNEXT");
            carList.add("ГАЗ 66");
            carList.add("BMW M5");
            carList.add("BMW X1");
            carList.add("BMW X3");
            carList.add("BMW X5");
            carList.add("Mercedes C120");
            carList.add("Mercedes ML");
            carList.add("Mercedes C120 CGL");
            carList.add("Mercedes GLK");
            carList.add("Mercedes GLX");
            carList.add("Audi A4");
            carList.add("Audi A6");
            carList.add("Audi A8");
            carList.add("Audi Q3");
            carList.add("Audi Q5");
            carList.add("Audi Q7");
            carList.add("УАЗ Патриот");
            carList.add("Ford Focus");
            carList.add("Ford Mondeo");
            carList.add("Volvo XC90");
            carList.add("Volvo XC60");

            List<String> codePhone = new ArrayList<String>();
            codePhone.add("+7926");
            codePhone.add("+7903");
            codePhone.add("+7905");
            codePhone.add("+7916");
            codePhone.add("+7967");
            codePhone.add("+7901");

            Random rnd = new Random(System.currentTimeMillis());
            int phone = 1;
            int iduser = 1;
            //ResultSet rs = null;
            for (String charOne : charList) {//первая буква
                for (int i = 1; i <= 999; i++) {//цмфры
                    for (String charTwo : charList) {//вторая буква
                        for (String charThree : charList) {//третья буква
                            for (String local : location) {//регион

                                int numberChar = rnd.nextInt(11); //буквы
                                //int numberLocal = rnd.nextInt(7); //регионы
                                int numberFam = rnd.nextInt(20); //фамилии в именах
                                int numberName = rnd.nextInt(14); //отчества и имена
                                int numberCar = rnd.nextInt(44); //машины
                                int numberCode = rnd.nextInt(6); //код телефона

                                String username;
                                if (phone % 2 == 0) {
                                    username = nameListM.get(numberFam) + " " + lastMList.get(numberName) + " " + middleMList.get(numberName);
                                } else {
                                    username = nameListW.get(numberFam) + " " + lastWList.get(numberName) + " " + middleWList.get(numberName);
                                }
                                int year = 2017 - numberChar;
                                String manufacture = "" + year;
//                                  boolean result = ormService.insertOnceUser(iduser, false, charOne.toUpperCase()+format("%03d",i)+charTwo.toUpperCase()+charThree.toUpperCase()+location.get(numberLocal), username, "VQ9I8JJT9RF6J6T9Y", codePhone.get(numberCode)+format("%07d",phone), manufacture, true, carList.get(numberCar));

                                int rsInt = stmt.executeUpdate("INSERT INTO public.cars (iduser, taxi, carnumber, username, vin, phone, manufacture, customs, model) VALUES (" + iduser + ", FALSE,'" + charOne.toUpperCase() + format("%03d", i) + charTwo.toUpperCase() + charThree.toUpperCase() + local + "','" + username + "', 'VQ9I8JJT9RF6J6T9Y','" + codePhone.get(numberCode) + format("%07d", phone) + "','" + manufacture + "', true,'" + carList.get(numberCar) + "');");

                                iduser++;
                                phone++;
                            }
                        }
                    }
                }
            }
            System.out.println(phone);
            //rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
