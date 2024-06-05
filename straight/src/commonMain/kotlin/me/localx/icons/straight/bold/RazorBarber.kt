package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

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
                moveToRelative(21.0f, 0.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                lineTo(5.012f, 2.0f)
                curveTo(2.743f, 2.0f, 0.823f, 3.698f, 0.546f, 5.95f)
                lineTo(0.048f, 10.0f)
                horizontalLineToRelative(10.778f)
                curveToRelative(2.286f, 0.0f, 4.208f, -1.713f, 4.471f, -3.984f)
                lineToRelative(0.117f, -1.016f)
                horizontalLineToRelative(1.986f)
                curveToRelative(-0.447f, 3.57f, -2.427f, 8.345f, -6.246f, 12.19f)
                curveToRelative(-1.549f, 1.57f, -1.533f, 4.107f, 0.037f, 5.656f)
                curveToRelative(0.754f, 0.745f, 1.751f, 1.154f, 2.81f, 1.154f)
                curveToRelative(0.009f, 0.0f, 0.018f, 0.0f, 0.027f, 0.0f)
                curveToRelative(1.068f, -0.007f, 2.07f, -0.43f, 2.82f, -1.19f)
                curveToRelative(5.424f, -5.494f, 5.352f, -15.62f, 5.202f, -18.608f)
                curveToRelative(1.176f, -0.813f, 1.951f, -2.167f, 1.951f, -3.702f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(12.316f, 5.672f)
                curveToRelative(-0.087f, 0.757f, -0.728f, 1.328f, -1.49f, 1.328f)
                lineTo(3.439f, 7.0f)
                lineToRelative(0.084f, -0.684f)
                curveToRelative(0.092f, -0.75f, 0.732f, -1.316f, 1.489f, -1.316f)
                horizontalLineToRelative(7.382f)
                lineToRelative(-0.078f, 0.672f)
                close()
                moveTo(14.712f, 20.702f)
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
