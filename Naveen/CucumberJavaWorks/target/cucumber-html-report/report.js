$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Sanity"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "check user for valid login",
  "description": "",
  "id": "login-feature;check-user-for-valid-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user successfully logs in",
  "rows": [
    {
      "cells": [
        "login",
        "password"
      ],
      "line": 6
    },
    {
      "cells": [
        "adith.naveen",
        "testing1"
      ],
      "line": 7
    },
    {
      "cells": [
        "lee",
        "hello"
      ],
      "line": 8
    },
    {
      "cells": [
        "shweta",
        "testing2"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "show inbox",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.user_successfully_logs_in(DataTable)"
});
formatter.result({
  "duration": 126161281,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.show_inbox()"
});
formatter.result({
  "duration": 68974,
  "status": "passed"
});
});