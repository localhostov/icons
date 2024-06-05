package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.HoodCloak: ImageVector
    get() {
        if (_hoodCloak != null) {
            return _hoodCloak!!
        }
        _hoodCloak = Builder(name = "HoodCloak", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                curveToRelative(0.0f, -0.964f, -0.502f, -3.481f, -1.502f, -5.065f)
                curveToRelative(-0.321f, -0.51f, -0.498f, -1.074f, -0.498f, -1.588f)
                curveToRelative(0.0f, -0.354f, 0.621f, -0.919f, 0.992f, -1.256f)
                curveToRelative(0.242f, -0.221f, 0.456f, -0.422f, 0.597f, -0.592f)
                curveToRelative(0.536f, -0.646f, 0.647f, -1.519f, 0.292f, -2.276f)
                curveToRelative(-0.354f, -0.753f, -1.093f, -1.221f, -1.927f, -1.221f)
                horizontalLineToRelative(-7.954f)
                curveToRelative(-1.033f, 0.0f, -1.954f, 0.009f, -2.603f, 0.041f)
                curveTo(5.345f, 0.338f, 0.356f, 5.301f, 0.042f, 11.338f)
                curveToRelative(-0.196f, 3.764f, 0.558f, 6.877f, 2.442f, 10.096f)
                curveToRelative(0.09f, 0.153f, 0.038f, 0.289f, 0.0f, 0.355f)
                curveToRelative(-0.04f, 0.069f, -0.135f, 0.186f, -0.319f, 0.186f)
                horizontalLineToRelative(-1.165f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(10.763f)
                curveToRelative(-0.686f, -0.059f, -1.327f, -0.355f, -1.819f, -0.875f)
                curveToRelative(-1.846f, -1.949f, -4.944f, -5.793f, -4.944f, -9.643f)
                curveToRelative(0.0f, -4.112f, 3.141f, -7.458f, 7.0f, -7.458f)
                reflectiveCurveToRelative(7.0f, 3.346f, 7.0f, 7.458f)
                curveToRelative(0.0f, 3.85f, -3.099f, 7.694f, -4.945f, 9.644f)
                curveToRelative(-0.491f, 0.519f, -1.132f, 0.815f, -1.818f, 0.874f)
                horizontalLineToRelative(10.763f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.152f)
                curveToRelative(-0.166f, 0.0f, -0.256f, -0.091f, -0.302f, -0.168f)
                curveToRelative(-0.034f, -0.058f, -0.104f, -0.213f, -0.003f, -0.401f)
                curveToRelative(1.837f, -3.432f, 2.457f, -5.805f, 2.457f, -9.407f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 8.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.448f, -5.0f, 5.458f)
                curveToRelative(0.0f, 3.157f, 2.755f, 6.535f, 4.396f, 8.268f)
                curveToRelative(0.336f, 0.354f, 0.872f, 0.354f, 1.206f, 0.0f)
                curveToRelative(1.643f, -1.733f, 4.397f, -5.111f, 4.397f, -8.268f)
                curveToRelative(0.0f, -3.01f, -2.243f, -5.458f, -5.0f, -5.458f)
                close()
            }
        }
        .build()
        return _hoodCloak!!
    }

private var _hoodCloak: ImageVector? = null
