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

public val Icons.Outline.Pending: ImageVector
    get() {
        if (_pending != null) {
            return _pending!!
        }
        _pending = Builder(name = "Pending", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 6.0f)
                verticalLineToRelative(5.312f)
                lineToRelative(4.163f, 2.553f)
                lineToRelative(-1.045f, 1.705f)
                lineToRelative(-5.118f, -3.139f)
                verticalLineToRelative(-6.432f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                curveToRelative(3.191f, 0.0f, 6.112f, 1.506f, 7.982f, 4.0f)
                horizontalLineToRelative(-3.982f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(23.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.065f)
                curveTo(18.754f, 1.51f, 15.51f, 0.0f, 12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(0.465f, 0.0f, 0.935f, -0.027f, 1.397f, -0.081f)
                lineToRelative(-0.23f, -1.986f)
                curveToRelative(-0.387f, 0.045f, -0.779f, 0.067f, -1.167f, 0.067f)
                close()
                moveTo(20.551f, 17.188f)
                lineToRelative(1.711f, 1.037f)
                curveToRelative(0.378f, -0.624f, 0.7f, -1.283f, 0.957f, -1.957f)
                lineToRelative(-1.869f, -0.713f)
                curveToRelative(-0.214f, 0.562f, -0.482f, 1.112f, -0.799f, 1.633f)
                close()
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, 0.607f, -0.055f, 1.216f, -0.163f, 1.81f)
                lineToRelative(1.967f, 0.359f)
                curveToRelative(0.13f, -0.711f, 0.196f, -1.441f, 0.196f, -2.169f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(18.147f, 19.888f)
                lineToRelative(1.229f, 1.578f)
                curveToRelative(0.571f, -0.445f, 1.106f, -0.946f, 1.59f, -1.489f)
                lineToRelative(-1.494f, -1.33f)
                curveToRelative(-0.403f, 0.453f, -0.849f, 0.871f, -1.324f, 1.241f)
                close()
                moveTo(14.942f, 21.561f)
                lineToRelative(0.588f, 1.912f)
                curveToRelative(0.692f, -0.213f, 1.371f, -0.491f, 2.016f, -0.828f)
                lineToRelative(-0.926f, -1.773f)
                curveToRelative(-0.537f, 0.281f, -1.102f, 0.513f, -1.678f, 0.689f)
                close()
            }
        }
        .build()
        return _pending!!
    }

private var _pending: ImageVector? = null
