package me.localx.icons.rounded.filled

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

public val Icons.Filled.UserChef: ImageVector
    get() {
        if (_userChef != null) {
            return _userChef!!
        }
        _userChef = Builder(name = "UserChef", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 24.0f)
                horizontalLineToRelative(-4.929f)
                curveToRelative(-0.29f, 0.0f, -0.565f, -0.126f, -0.755f, -0.345f)
                reflectiveCurveToRelative(-0.275f, -0.51f, -0.234f, -0.797f)
                curveToRelative(0.462f, -3.231f, 2.867f, -5.805f, 5.919f, -6.602f)
                verticalLineToRelative(7.743f)
                close()
                moveTo(20.685f, 23.655f)
                curveToRelative(-0.19f, 0.219f, -0.466f, 0.345f, -0.756f, 0.345f)
                horizontalLineToRelative(-8.929f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(3.955f, 0.0f, 7.359f, 2.948f, 7.919f, 6.858f)
                curveToRelative(0.041f, 0.287f, -0.045f, 0.578f, -0.234f, 0.797f)
                close()
                moveTo(16.0f, 20.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(6.001f, 5.854f)
                verticalLineToRelative(1.146f)
                reflectiveCurveToRelative(11.999f, 0.0f, 11.999f, 0.0f)
                verticalLineToRelative(-0.002f)
                lineToRelative(-0.053f, -1.15f)
                curveToRelative(1.228f, -0.409f, 2.053f, -1.554f, 2.053f, -2.848f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-0.641f, 0.0f, -1.407f, 0.206f, -2.096f, 0.553f)
                curveToRelative(-0.618f, -0.22f, -1.747f, -0.553f, -2.904f, -0.553f)
                reflectiveCurveToRelative(-2.286f, 0.333f, -2.905f, 0.553f)
                curveToRelative(-0.688f, -0.347f, -1.455f, -0.553f, -2.095f, -0.553f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 1.294f, 0.825f, 2.438f, 2.001f, 2.854f)
                close()
                moveTo(6.001f, 9.0f)
                curveToRelative(0.0f, 1.687f, 0.716f, 3.305f, 1.964f, 4.44f)
                curveToRelative(1.106f, 1.006f, 2.557f, 1.559f, 4.049f, 1.559f)
                curveToRelative(0.19f, 0.0f, 0.382f, -0.009f, 0.573f, -0.027f)
                curveToRelative(2.967f, -0.283f, 5.305f, -2.885f, 5.41f, -5.972f)
                lineTo(6.0f, 9.0f)
                close()
            }
        }
        .build()
        return _userChef!!
    }

private var _userChef: ImageVector? = null
