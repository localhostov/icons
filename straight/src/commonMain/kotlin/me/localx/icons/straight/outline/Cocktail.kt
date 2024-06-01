package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Cocktail: ImageVector
    get() {
        if (_cocktail != null) {
            return _cocktail!!
        }
        _cocktail = Builder(name = "Cocktail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.4868f, 1.317f)
                    curveTo(23.2116f, 0.9108f, 22.8409f, 0.5784f, 22.4073f, 0.3488f)
                    curveTo(21.9737f, 0.1192f, 21.4905f, -6.0E-4f, 20.9998f, 0.0f)
                    horizontalLineTo(2.9998f)
                    curveTo(2.5096f, -5.0E-4f, 2.0267f, 0.1191f, 1.5934f, 0.3484f)
                    curveTo(1.16f, 0.5777f, 0.7895f, 0.9097f, 0.5142f, 1.3153f)
                    curveTo(0.2389f, 1.721f, 0.0672f, 2.1879f, 0.0141f, 2.6753f)
                    curveTo(-0.0389f, 3.1627f, 0.0283f, 3.6556f, 0.2098f, 4.111f)
                    curveTo(1.0936f, 6.2978f, 2.5735f, 8.1926f, 4.481f, 9.5798f)
                    curveTo(6.3885f, 10.9671f, 8.6471f, 11.791f, 10.9998f, 11.958f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(5.9998f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(17.9998f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(12.9998f)
                    verticalLineTo(11.958f)
                    curveTo(15.3525f, 11.791f, 17.6111f, 10.9671f, 19.5186f, 9.5798f)
                    curveTo(21.4262f, 8.1926f, 22.906f, 6.2978f, 23.7898f, 4.111f)
                    curveTo(23.9713f, 3.656f, 24.0386f, 3.1634f, 23.9857f, 2.6763f)
                    curveTo(23.9329f, 2.1893f, 23.7616f, 1.7226f, 23.4868f, 1.317f)
                    close()
                    moveTo(2.1688f, 2.44f)
                    curveTo(2.2598f, 2.3033f, 2.3835f, 2.1915f, 2.5286f, 2.1147f)
                    curveTo(2.6737f, 2.0378f, 2.8356f, 1.9984f, 2.9998f, 2.0f)
                    horizontalLineTo(20.9998f)
                    curveTo(21.1635f, 1.9994f, 21.3248f, 2.0391f, 21.4696f, 2.1154f)
                    curveTo(21.6144f, 2.1918f, 21.7382f, 2.3024f, 21.8302f, 2.4378f)
                    curveTo(21.9222f, 2.5732f, 21.9796f, 2.729f, 21.9973f, 2.8917f)
                    curveTo(22.015f, 3.0544f, 21.9925f, 3.219f, 21.9318f, 3.371f)
                    curveTo(21.8488f, 3.579f, 21.7548f, 3.789f, 21.6528f, 4.0f)
                    horizontalLineTo(2.3468f)
                    curveTo(2.2468f, 3.789f, 2.1468f, 3.579f, 2.0678f, 3.371f)
                    curveTo(2.0061f, 3.2196f, 1.983f, 3.0553f, 2.0006f, 2.8927f)
                    curveTo(2.0182f, 2.7302f, 2.0761f, 2.5746f, 2.1688f, 2.44f)
                    close()
                    moveTo(11.9998f, 10.0f)
                    curveTo(10.3897f, 10.0206f, 8.7963f, 9.6705f, 7.3431f, 8.9769f)
                    curveTo(5.8898f, 8.2833f, 4.6155f, 7.2648f, 3.6188f, 6.0f)
                    horizontalLineTo(20.3808f)
                    curveTo(19.3841f, 7.2648f, 18.1098f, 8.2833f, 16.6566f, 8.9769f)
                    curveTo(15.2033f, 9.6705f, 13.61f, 10.0206f, 11.9998f, 10.0f)
                    close()
                }
            }
        }
        .build()
        return _cocktail!!
    }

private var _cocktail: ImageVector? = null
