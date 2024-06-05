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

public val Icons.Bold.ClockOne: ImageVector
    get() {
        if (_clockOne != null) {
            return _clockOne!!
        }
        _clockOne = Builder(name = "ClockOne", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.383f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(7.037f, 3.0f, 3.0f, 7.038f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.037f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.038f, 9.0f, -9.0f)
                reflectiveCurveTo(16.963f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(12.689f, 13.414f)
                lineToRelative(2.682f, -3.49f)
                curveToRelative(0.505f, -0.657f, 0.382f, -1.599f, -0.275f, -2.104f)
                curveToRelative(-0.652f, -0.501f, -1.59f, -0.382f, -2.096f, 0.266f)
                verticalLineToRelative(-1.586f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.643f, 0.409f, 1.213f, 1.018f, 1.42f)
                curveToRelative(0.158f, 0.054f, 0.321f, 0.08f, 0.482f, 0.08f)
                curveToRelative(0.457f, 0.0f, 0.9f, -0.209f, 1.189f, -0.586f)
                close()
            }
        }
        .build()
        return _clockOne!!
    }

private var _clockOne: ImageVector? = null
