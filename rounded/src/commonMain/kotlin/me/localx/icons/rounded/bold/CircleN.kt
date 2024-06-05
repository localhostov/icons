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

public val Icons.Bold.CircleN: ImageVector
    get() {
        if (_circleN != null) {
            return _circleN!!
        }
        _circleN = Builder(name = "CircleN", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.038f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.038f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(17.0f, 7.75f)
                verticalLineToRelative(7.506f)
                curveToRelative(0.0f, 1.208f, -0.791f, 2.214f, -1.923f, 2.446f)
                curveToRelative(-0.158f, 0.032f, -0.316f, 0.048f, -0.472f, 0.048f)
                curveToRelative(-0.943f, 0.0f, -1.813f, -0.576f, -2.215f, -1.513f)
                lineToRelative(-2.391f, -4.815f)
                verticalLineToRelative(4.828f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -1.213f, 0.778f, -2.22f, 1.892f, -2.448f)
                curveToRelative(1.091f, -0.227f, 2.175f, 0.379f, 2.641f, 1.466f)
                lineToRelative(2.467f, 4.971f)
                verticalLineToRelative(-4.988f)
                curveToRelative(0.0f, -0.828f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _circleN!!
    }

private var _circleN: ImageVector? = null
