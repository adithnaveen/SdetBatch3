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
formatter.before({
  "duration": 260121,
  "status": "passed"
});
formatter.before({
  "duration": 90987,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 4,
      "value": "# will be executed before scenario/s"
    }
  ],
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Launch FireFox",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.setUp()"
});
formatter.result({
  "duration": 173019026,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "check user for valid login",
  "description": "",
  "id": "login-feature;check-user-for-valid-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@FirstDryRun"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user successfully logs in",
  "rows": [
    {
      "cells": [
        "login",
        "password"
      ],
      "line": 11
    },
    {
      "cells": [
        "adith.naveen",
        "testing1"
      ],
      "line": 12
    },
    {
      "cells": [
        "lee",
        "hello"
      ],
      "line": 13
    },
    {
      "cells": [
        "shweta",
        "testing2"
      ],
      "line": 14
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "show inbox",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.user_successfully_logs_in(DataTable)"
});
formatter.result({
  "duration": 6533478,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.show_inbox()"
});
formatter.result({
  "duration": 221965,
  "status": "passed"
});
formatter.before({
  "duration": 82549,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 4,
      "value": "# will be executed before scenario/s"
    }
  ],
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Launch FireFox",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.setUp()"
});
formatter.result({
  "duration": 57601,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "check user for valid login",
  "description": "",
  "id": "login-feature;check-user-for-valid-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@BeforeRelease"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user successfully logs in",
  "rows": [
    {
      "cells": [
        "login",
        "password"
      ],
      "line": 21
    },
    {
      "cells": [
        "chitti",
        "hello@123"
      ],
      "line": 22
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "show inbox",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.user_successfully_logs_in(DataTable)"
});
formatter.result({
  "duration": 212426,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.show_inbox()"
});
formatter.result({
  "duration": 58335,
  "status": "passed"
});
formatter.before({
  "duration": 65673,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 4,
      "value": "# will be executed before scenario/s"
    }
  ],
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Launch FireFox",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.setUp()"
});
formatter.result({
  "duration": 65672,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "check user for valid login",
  "description": "",
  "id": "login-feature;check-user-for-valid-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@AfterRelease"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "user successfully logs in",
  "rows": [
    {
      "cells": [
        "login",
        "password"
      ],
      "line": 28
    },
    {
      "cells": [
        "parag",
        "hello@333"
      ],
      "line": 29
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "show inbox",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.user_successfully_logs_in(DataTable)"
});
formatter.result({
  "duration": 202520,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.show_inbox()"
});
formatter.result({
  "duration": 56867,
  "status": "passed"
});
});