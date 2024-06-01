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

public val Icons.Outline.Apple: ImageVector
    get() {
        if (_apple != null) {
            return _apple!!
        }
        _apple = Builder(name = "Apple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.2422f, 6.192f)
                    curveTo(18.4857f, 4.733f, 19.1123f, 2.8471f, 18.9892f, 0.934f)
                    lineTo(18.9252f, 0.075f)
                    lineTo(18.0662f, 0.011f)
                    curveTo(16.1523f, -0.1134f, 14.2654f, 0.5141f, 12.8072f, 1.76f)
                    curveTo(12.5944f, 1.9757f, 12.4013f, 2.2099f, 12.2302f, 2.46f)
                    curveTo(11.9524f, 1.6293f, 11.6045f, 0.8237f, 11.1902f, 0.052f)
                    lineTo(9.4352f, 1.01f)
                    curveTo(10.2654f, 2.5569f, 10.7813f, 4.2528f, 10.9532f, 6.0f)
                    horizontalLineTo(8.5002f)
                    curveTo(6.1811f, 6.0709f, 3.9846f, 7.0577f, 2.3915f, 8.7445f)
                    curveTo(0.7984f, 10.4313f, -0.0614f, 12.6806f, 2.0E-4f, 15.0f)
                    curveTo(-0.1068f, 21.331f, 6.4172f, 25.953f, 12.0002f, 23.2f)
                    curveTo(17.5842f, 25.952f, 24.1072f, 21.331f, 24.0002f, 15.0f)
                    curveTo(24.0386f, 12.9833f, 23.3907f, 11.0134f, 22.1629f, 9.4131f)
                    curveTo(20.9351f, 7.8128f, 19.2001f, 6.6771f, 17.2422f, 6.192f)
                    close()
                    moveTo(14.2212f, 3.174f)
                    curveTo(14.9839f, 2.5047f, 15.9466f, 2.1063f, 16.9592f, 2.041f)
                    curveTo(16.8939f, 3.0536f, 16.4956f, 4.0163f, 15.8262f, 4.779f)
                    curveTo(15.052f, 5.4555f, 14.0802f, 5.8644f, 13.0552f, 5.945f)
                    curveTo(13.1358f, 4.92f, 13.5447f, 3.9483f, 14.2212f, 3.174f)
                    close()
                    moveTo(15.5002f, 22.0f)
                    curveTo(14.4447f, 21.9998f, 13.4075f, 21.724f, 12.4912f, 21.2f)
                    lineTo(12.0002f, 20.924f)
                    lineTo(11.5092f, 21.202f)
                    curveTo(7.2002f, 23.7f, 1.9072f, 20.061f, 2.0002f, 15.0f)
                    curveTo(1.9386f, 13.211f, 2.5877f, 11.4704f, 3.8057f, 10.1587f)
                    curveTo(5.0238f, 8.8469f, 6.7116f, 8.0708f, 8.5002f, 8.0f)
                    horizontalLineTo(15.5002f)
                    curveTo(24.1002f, 8.321f, 24.1002f, 21.682f, 15.5002f, 22.0f)
                    close()
                }
            }
        }
        .build()
        return _apple!!
    }

private var _apple: ImageVector? = null
