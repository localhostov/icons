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

public val Icons.Bold.Rabbit: ImageVector
    get() {
        if (_rabbit != null) {
            return _rabbit!!
        }
        _rabbit = Builder(name = "Rabbit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 21.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-8.614f)
                curveToRelative(1.735f, -0.683f, 3.0f, -1.952f, 3.0f, -3.886f)
                curveToRelative(0.0f, -2.564f, -2.374f, -6.239f, -6.12f, -6.477f)
                curveToRelative(-1.062f, -0.474f, -4.943f, -2.023f, -10.38f, -2.023f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                curveToRelative(2.213f, 0.0f, 4.135f, 0.293f, 5.656f, 0.644f)
                curveToRelative(-1.195f, 0.693f, -2.705f, 1.356f, -5.656f, 1.356f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                curveToRelative(1.902f, 0.0f, 3.342f, -0.25f, 4.505f, -0.599f)
                curveToRelative(0.0f, 0.488f, 0.065f, 1.058f, 0.185f, 1.508f)
                curveToRelative(-6.701f, 2.003f, -9.105f, 7.522f, -9.586f, 11.194f)
                curveToRelative(-0.192f, -0.061f, -0.392f, -0.103f, -0.604f, -0.103f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(20.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(18.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.607f, -1.682f, -5.095f, -4.0f, -5.914f)
                curveToRelative(-0.779f, -0.278f, -1.638f, 0.132f, -1.914f, 0.914f)
                curveToRelative(-0.276f, 0.781f, 0.133f, 1.638f, 0.914f, 1.914f)
                curveToRelative(1.122f, 0.396f, 2.0f, 1.752f, 2.0f, 3.086f)
                horizontalLineToRelative(-7.467f)
                curveToRelative(0.159f, -1.79f, 1.239f, -7.748f, 8.302f, -9.411f)
                curveToRelative(0.974f, 0.874f, 2.256f, 1.411f, 3.665f, 1.411f)
                curveToRelative(0.167f, 0.0f, 0.333f, -0.006f, 0.5f, -0.013f)
                verticalLineToRelative(8.013f)
                close()
                moveTo(17.5f, 10.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.122f, -2.5f, 2.5f, -2.5f)
                curveToRelative(2.137f, 0.0f, 3.5f, 2.298f, 3.5f, 3.5f)
                curveToRelative(0.0f, 1.034f, -2.047f, 1.5f, -3.5f, 1.5f)
                close()
            }
        }
        .build()
        return _rabbit!!
    }

private var _rabbit: ImageVector? = null
