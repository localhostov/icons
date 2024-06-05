package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.RazorBarber: ImageVector
    get() {
        if (_razorBarber != null) {
            return _razorBarber!!
        }
        _razorBarber = Builder(name = "RazorBarber", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 0.085f)
                curveToRelative(-0.78f, -0.275f, -1.638f, 0.133f, -1.914f, 0.915f)
                curveToRelative(-0.211f, 0.598f, -0.78f, 1.0f, -1.415f, 1.0f)
                lineTo(4.5f, 2.0f)
                curveTo(2.231f, 2.0f, 0.311f, 3.698f, 0.034f, 5.95f)
                lineToRelative(-0.071f, 0.575f)
                curveToRelative(-0.108f, 0.88f, 0.167f, 1.766f, 0.754f, 2.43f)
                curveToRelative(0.588f, 0.665f, 1.434f, 1.045f, 2.321f, 1.045f)
                horizontalLineToRelative(7.789f)
                curveToRelative(2.286f, 0.0f, 4.208f, -1.713f, 4.471f, -3.984f)
                lineToRelative(0.117f, -1.016f)
                horizontalLineToRelative(1.986f)
                curveToRelative(-0.447f, 3.57f, -2.427f, 8.345f, -6.246f, 12.19f)
                curveToRelative(-1.549f, 1.57f, -1.533f, 4.107f, 0.037f, 5.656f)
                curveToRelative(0.754f, 0.745f, 1.751f, 1.154f, 2.81f, 1.154f)
                curveToRelative(1.068f, -0.007f, 2.097f, -0.43f, 2.847f, -1.19f)
                curveToRelative(5.365f, -5.434f, 5.353f, -15.4f, 5.207f, -18.508f)
                curveToRelative(0.843f, -0.528f, 1.514f, -1.322f, 1.86f, -2.302f)
                curveToRelative(0.276f, -0.781f, -0.134f, -1.638f, -0.915f, -1.914f)
                close()
                moveTo(12.317f, 5.671f)
                curveToRelative(-0.087f, 0.757f, -0.728f, 1.328f, -1.49f, 1.328f)
                lineTo(3.038f, 6.999f)
                lineToRelative(-0.097f, -0.109f)
                lineToRelative(0.071f, -0.575f)
                curveToRelative(0.092f, -0.75f, 0.732f, -1.316f, 1.489f, -1.316f)
                horizontalLineToRelative(7.894f)
                lineToRelative(-0.078f, 0.672f)
                close()
                moveTo(14.713f, 20.701f)
                curveToRelative(-0.188f, 0.19f, -0.438f, 0.296f, -0.705f, 0.298f)
                curveToRelative(-0.294f, -0.022f, -0.52f, -0.101f, -0.709f, -0.289f)
                curveToRelative(-0.392f, -0.387f, -0.396f, -1.021f, -0.013f, -1.411f)
                curveToRelative(2.523f, -2.54f, 4.275f, -5.336f, 5.42f, -7.994f)
                curveToRelative(-0.5f, 3.316f, -1.611f, 6.982f, -3.994f, 9.396f)
                close()
            }
        }
        .build()
        return _razorBarber!!
    }

private var _razorBarber: ImageVector? = null
