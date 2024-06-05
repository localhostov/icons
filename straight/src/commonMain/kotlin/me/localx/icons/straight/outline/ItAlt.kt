package me.localx.icons.straight.outline

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

public val Icons.Outline.ItAlt: ImageVector
    get() {
        if (_itAlt != null) {
            return _itAlt!!
        }
        _itAlt = Builder(name = "ItAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 4.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(8.5f, 3.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(-5.755f)
                curveToRelative(0.482f, -0.602f, 0.879f, -1.274f, 1.173f, -2.0f)
                horizontalLineToRelative(2.582f)
                verticalLineToRelative(-11.0f)
                lineTo(2.0f, 9.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(2.582f)
                curveToRelative(0.294f, 0.726f, 0.691f, 1.398f, 1.173f, 2.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(22.0f, 7.0f)
                lineTo(22.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, -0.449f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(20.0f)
                close()
                moveTo(14.401f, 11.506f)
                lineToRelative(-1.401f, -0.613f)
                verticalLineToRelative(4.107f)
                curveToRelative(0.0f, 0.552f, -0.449f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-4.107f)
                lineToRelative(-1.401f, 0.613f)
                curveToRelative(-2.187f, 0.957f, -3.599f, 3.113f, -3.599f, 5.494f)
                curveToRelative(0.0f, 2.159f, 1.158f, 4.133f, 3.0f, 5.197f)
                verticalLineToRelative(1.803f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.07f)
                lineToRelative(-0.599f, -0.262f)
                curveToRelative(-1.458f, -0.639f, -2.401f, -2.078f, -2.401f, -3.668f)
                curveToRelative(0.0f, -0.991f, 0.368f, -1.924f, 1.0f, -2.641f)
                verticalLineToRelative(0.641f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-0.641f)
                curveToRelative(0.632f, 0.717f, 1.0f, 1.649f, 1.0f, 2.641f)
                curveToRelative(0.0f, 1.59f, -0.942f, 3.029f, -2.401f, 3.668f)
                lineToRelative(-0.599f, 0.262f)
                verticalLineToRelative(3.07f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.803f)
                curveToRelative(1.842f, -1.064f, 3.0f, -3.038f, 3.0f, -5.197f)
                curveToRelative(0.0f, -2.381f, -1.413f, -4.537f, -3.599f, -5.494f)
                close()
            }
        }
        .build()
        return _itAlt!!
    }

private var _itAlt: ImageVector? = null
