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

public val Icons.Bold.CircleS: ImageVector
    get() {
        if (_circleS != null) {
            return _circleS!!
        }
        _circleS = Builder(name = "CircleS", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.037f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.037f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(10.0f, 9.467f)
                curveToRelative(0.0f, 0.207f, 0.14f, 0.392f, 0.34f, 0.448f)
                lineToRelative(4.165f, 1.263f)
                curveToRelative(1.457f, 0.418f, 2.489f, 1.789f, 2.489f, 3.328f)
                curveToRelative(0.0f, 1.913f, -1.557f, 3.47f, -3.47f, 3.47f)
                lineToRelative(-3.514f, 0.024f)
                curveToRelative(-1.665f, 0.0f, -3.011f, -1.346f, -3.011f, -3.0f)
                lineToRelative(6.514f, -0.024f)
                curveToRelative(0.27f, 0.0f, 0.48f, -0.211f, 0.48f, -0.47f)
                curveToRelative(0.0f, -0.208f, -0.14f, -0.394f, -0.339f, -0.451f)
                lineToRelative(-4.161f, -1.261f)
                curveToRelative(-1.458f, -0.414f, -2.494f, -1.785f, -2.494f, -3.327f)
                curveToRelative(0.0f, -1.911f, 1.556f, -3.467f, 3.467f, -3.467f)
                horizontalLineToRelative(3.533f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                horizontalLineToRelative(-6.533f)
                curveToRelative(-0.258f, 0.0f, -0.467f, 0.209f, -0.467f, 0.467f)
                close()
            }
        }
        .build()
        return _circleS!!
    }

private var _circleS: ImageVector? = null
