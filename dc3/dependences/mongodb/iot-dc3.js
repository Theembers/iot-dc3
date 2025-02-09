/*
 * Copyright 2019 Pnoker. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// create iot-dc3 database and user
db = db.getSiblingDB('iot-dc3');
db.createUser({
    user: "root",
    pwd: "iotdc3",
    roles: [{
        role: "readWrite",
        db: "iot-dc3"
    }]
});

db.createCollection("dc3_group");
db.createCollection("dc3_device");
db.createCollection("dc3_unit");
db.createCollection("dc3_variable");
db.createCollection("dc3_data");
