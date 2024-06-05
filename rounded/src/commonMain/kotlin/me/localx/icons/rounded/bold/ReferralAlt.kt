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

public val Icons.Bold.ReferralAlt: ImageVector
    get() {
        if (_referralAlt != null) {
            return _referralAlt!!
        }
        _referralAlt = Builder(name = "ReferralAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(3.5f, 12.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(18.0f, 17.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                close()
                moveTo(16.1f, 9.979f)
                curveToRelative(-0.564f, -0.608f, -1.512f, -0.642f, -2.12f, -0.079f)
                lineToRelative(-3.338f, 3.1f)
                horizontalLineToRelative(-1.141f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.141f)
                lineToRelative(3.338f, 3.1f)
                curveToRelative(0.289f, 0.268f, 0.655f, 0.4f, 1.021f, 0.4f)
                curveToRelative(0.402f, 0.0f, 0.804f, -0.161f, 1.1f, -0.479f)
                curveToRelative(0.563f, -0.606f, 0.528f, -1.556f, -0.079f, -2.12f)
                lineToRelative(-2.585f, -2.4f)
                lineToRelative(2.585f, -2.4f)
                curveToRelative(0.607f, -0.564f, 0.643f, -1.514f, 0.079f, -2.12f)
                close()
                moveTo(3.5f, 13.0f)
                curveToRelative(-1.621f, 0.0f, -2.994f, 0.878f, -3.461f, 2.089f)
                curveToRelative(-0.174f, 0.451f, 0.254f, 0.911f, 0.827f, 0.911f)
                horizontalLineToRelative(5.267f)
                curveToRelative(0.573f, 0.0f, 1.001f, -0.46f, 0.827f, -0.911f)
                curveToRelative(-0.467f, -1.212f, -1.84f, -2.089f, -3.461f, -2.089f)
                close()
                moveTo(17.866f, 8.808f)
                horizontalLineToRelative(5.267f)
                curveToRelative(0.573f, 0.0f, 1.001f, -0.46f, 0.827f, -0.911f)
                curveToRelative(-0.467f, -1.211f, -1.84f, -2.089f, -3.461f, -2.089f)
                reflectiveCurveToRelative(-2.994f, 0.878f, -3.461f, 2.089f)
                curveToRelative(-0.174f, 0.451f, 0.254f, 0.911f, 0.827f, 0.911f)
                close()
                moveTo(20.5f, 21.0f)
                curveToRelative(-1.621f, 0.0f, -2.994f, 0.878f, -3.461f, 2.089f)
                curveToRelative(-0.174f, 0.451f, 0.254f, 0.911f, 0.827f, 0.911f)
                horizontalLineToRelative(5.267f)
                curveToRelative(0.573f, 0.0f, 1.001f, -0.46f, 0.827f, -0.911f)
                curveToRelative(-0.467f, -1.212f, -1.84f, -2.089f, -3.461f, -2.089f)
                close()
            }
        }
        .build()
        return _referralAlt!!
    }

private var _referralAlt: ImageVector? = null
