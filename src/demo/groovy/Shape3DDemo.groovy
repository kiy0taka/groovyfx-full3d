/*
* Copyright 2014 the original author or authors.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

import static groovyx.javafx.full3d.GroovyFX.start

/**
 * @author Kiyotaka Oku
 */

start {
    stage(title: "Shape3D Demo", visible: true, primary: true) {
        scene(fill: GROOVYBLUE, width: 500, height: 500,
            camera:perspectiveCamera(fixedEyeAtCameraZero:true, translateZ:-100, nearClip:0, farClip:100)) {
            group(rotationAxis:[1, 1, 0], rotate:45) {
                cylinder(radius:5, height:10, translateX:-15, material:phongMaterial(diffuseColor:'red'))
                sphere(radius:5, material:phongMaterial(diffuseColor:'yellow'))
                box(width:10, height:10, depth:10, translateX:15, material:phongMaterial(diffuseColor:'green'))
            }
        }
    }
}
