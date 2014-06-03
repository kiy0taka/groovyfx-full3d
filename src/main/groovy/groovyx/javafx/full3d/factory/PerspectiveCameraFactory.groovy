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

package groovyx.javafx.full3d.factory

import groovyx.javafx.factory.AbstractNodeFactory
import javafx.scene.PerspectiveCamera

/**
 * @author Kiyotaka Oku
 */
class PerspectiveCameraFactory extends AbstractNodeFactory {

    PerspectiveCameraFactory() {
        super(PerspectiveCamera, true)
    }

    @Override
    Object newInstance(FactoryBuilderSupport builder, Object name, Object value, Map attributes) throws InstantiationException, IllegalAccessException {
        if (checkValue(name, value)) {
            return value
        }

        boolean fixedEyeAtCameraZero = attributes.remove('fixedEyeAtCameraZero')
        return new PerspectiveCamera(fixedEyeAtCameraZero)
    }
}
