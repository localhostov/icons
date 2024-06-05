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

public val Icons.Bold.HouseFire: ImageVector
    get() {
        if (_houseFire != null) {
            return _houseFire!!
        }
        _houseFire = Builder(name = "HouseFire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 10.164f)
                verticalLineToRelative(2.827f)
                curveToRelative(-0.936f, -1.162f, -2.202f, -2.36f, -3.191f, -3.221f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveTo(12.308f, 3.118f, 12.308f, 3.118f)
                curveToRelative(-0.182f, -0.142f, -0.434f, -0.142f, -0.615f, 0.0f)
                lineTo(3.192f, 9.77f)
                curveToRelative(-0.122f, 0.096f, -0.192f, 0.239f, -0.192f, 0.394f)
                verticalLineToRelative(10.824f)
                horizontalLineToRelative(7.585f)
                curveToRelative(0.469f, 1.161f, 1.205f, 2.183f, 2.128f, 3.0f)
                lineTo(0.0f, 23.988f)
                verticalLineToRelative(-13.824f)
                curveToRelative(0.0f, -1.084f, 0.489f, -2.089f, 1.344f, -2.757f)
                lineTo(9.843f, 0.756f)
                curveToRelative(1.27f, -0.994f, 3.043f, -0.994f, 4.314f, 0.0f)
                lineToRelative(8.5f, 6.652f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.854f, 0.668f, 1.343f, 1.673f, 1.343f, 2.756f)
                close()
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.686f, -6.0f, -6.0f)
                curveToRelative(0.0f, -1.725f, 1.0f, -3.06f, 1.995f, -4.087f)
                curveToRelative(0.0f, 0.0f, 0.681f, 2.087f, 1.287f, 2.087f)
                curveToRelative(1.263f, 0.0f, 0.897f, -3.898f, 2.718f, -6.0f)
                curveToRelative(1.895f, 1.895f, 6.0f, 4.526f, 6.0f, 8.0f)
                close()
                moveTo(19.414f, 18.585f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-1.415f, -1.415f)
                lineToRelative(-1.415f, 1.415f)
                curveToRelative(-0.781f, 0.781f, -0.781f, 2.048f, 0.0f, 2.829f)
                curveToRelative(0.781f, 0.781f, 2.048f, 0.781f, 2.829f, 0.0f)
                curveToRelative(0.781f, -0.781f, 0.781f, -2.048f, 0.0f, -2.829f)
                close()
            }
        }
        .build()
        return _houseFire!!
    }

private var _houseFire: ImageVector? = null
