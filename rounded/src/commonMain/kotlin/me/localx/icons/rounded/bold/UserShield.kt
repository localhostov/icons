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

public val Icons.Bold.UserShield: ImageVector
    get() {
        if (_userShield != null) {
            return _userShield!!
        }
        _userShield = Builder(name = "UserShield", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.96f, 16.019f)
                curveToRelative(-0.19f, 0.806f, -0.999f, 1.304f, -1.805f, 1.115f)
                curveToRelative(-0.375f, -0.089f, -0.764f, -0.134f, -1.155f, -0.134f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -4.411f, 3.589f, -8.0f, 8.0f, -8.0f)
                curveToRelative(0.623f, 0.0f, 1.244f, 0.072f, 1.845f, 0.214f)
                curveToRelative(0.807f, 0.191f, 1.306f, 0.999f, 1.115f, 1.805f)
                close()
                moveTo(14.0f, 6.0f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveTo(4.691f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                close()
                moveTo(11.0f, 6.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                close()
                moveTo(24.0f, 14.61f)
                verticalLineToRelative(3.021f)
                curveToRelative(0.0f, 3.966f, -3.686f, 5.776f, -4.938f, 6.261f)
                curveToRelative(-0.181f, 0.072f, -0.371f, 0.108f, -0.561f, 0.108f)
                curveToRelative(-0.23f, 0.0f, -0.46f, -0.053f, -0.671f, -0.158f)
                curveToRelative(-1.204f, -0.537f, -4.83f, -2.689f, -4.83f, -6.211f)
                verticalLineToRelative(-3.021f)
                curveToRelative(0.0f, -1.416f, 0.903f, -2.666f, 2.247f, -3.111f)
                lineToRelative(2.78f, -0.922f)
                curveToRelative(0.307f, -0.102f, 0.639f, -0.102f, 0.945f, 0.0f)
                lineToRelative(2.781f, 0.922f)
                curveToRelative(1.343f, 0.446f, 2.246f, 1.696f, 2.246f, 3.111f)
                close()
                moveTo(21.0f, 14.61f)
                curveToRelative(0.0f, -0.12f, -0.077f, -0.226f, -0.19f, -0.264f)
                lineToRelative(-2.31f, -0.766f)
                lineToRelative(-2.309f, 0.766f)
                curveToRelative(-0.114f, 0.038f, -0.191f, 0.144f, -0.191f, 0.264f)
                verticalLineToRelative(3.021f)
                curveToRelative(0.0f, 1.521f, 1.687f, 2.698f, 2.564f, 3.207f)
                curveToRelative(0.898f, -0.446f, 2.436f, -1.463f, 2.436f, -3.207f)
                verticalLineToRelative(-3.021f)
                close()
            }
        }
        .build()
        return _userShield!!
    }

private var _userShield: ImageVector? = null
