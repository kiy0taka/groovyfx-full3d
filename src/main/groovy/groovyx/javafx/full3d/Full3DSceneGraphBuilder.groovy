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

package groovyx.javafx.full3d

import groovyx.javafx.full3d.factory.PerspectiveCameraFactory
import groovyx.javafx.full3d.factory.PhongMaterialFactory
import groovyx.javafx.full3d.factory.Shape3DFactory
import javafx.scene.shape.Box
import javafx.scene.shape.Cylinder
import javafx.scene.shape.Sphere
import javafx.stage.Stage

/**
 * @author Kiyotaka Oku
 */
class Full3DSceneGraphBuilder extends groovyx.javafx.SceneGraphBuilder {

    Full3DSceneGraphBuilder(boolean init = true) {
        super(init)
    }

    Full3DSceneGraphBuilder(Stage primaryStage, boolean init = true) {
        super(init)
    }

    void registerShape3Ds() {
        registerFactory 'box',      new Shape3DFactory(Box)
        registerFactory 'cylinder', new Shape3DFactory(Cylinder)
        registerFactory 'sphere',   new Shape3DFactory(Sphere)

        registerFactory 'perspectiveCamera', new PerspectiveCameraFactory()
        registerFactory 'phongMaterial', new PhongMaterialFactory()
    }
}
