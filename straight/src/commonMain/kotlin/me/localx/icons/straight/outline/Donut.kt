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

public val Icons.Outline.Donut: ImageVector
    get() {
        if (_donut != null) {
            return _donut!!
        }
        _donut = Builder(name = "Donut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(3.076f, 0.0f, 5.876f, -1.173f, 8.0f, -3.084f)
                verticalLineToRelative(-0.916f)
                horizontalLineToRelative(-2.026f)
                curveToRelative(-1.669f, 1.25f, -3.733f, 2.0f, -5.974f, 2.0f)
                curveToRelative(-5.157f, 0.0f, -9.415f, -3.924f, -9.944f, -8.944f)
                curveToRelative(0.224f, 0.071f, 0.434f, 0.181f, 0.623f, 0.328f)
                curveToRelative(0.511f, 0.396f, 1.158f, 0.615f, 1.821f, 0.615f)
                reflectiveCurveToRelative(1.311f, -0.219f, 1.821f, -0.615f)
                curveToRelative(0.234f, -0.182f, 0.499f, -0.307f, 0.782f, -0.371f)
                curveToRelative(0.47f, 2.273f, 2.487f, 3.987f, 4.897f, 3.987f)
                reflectiveCurveToRelative(4.435f, -1.721f, 4.899f, -4.0f)
                horizontalLineToRelative(0.101f)
                curveToRelative(0.538f, 0.0f, 0.976f, 0.434f, 1.0f, 0.99f)
                verticalLineToRelative(4.01f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.002f)
                curveToRelative(0.02f, -0.56f, 0.459f, -0.998f, 1.0f, -0.998f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-9.0f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(21.0f, 11.0f)
                curveToRelative(-0.768f, 0.0f, -1.468f, 0.288f, -1.998f, 0.77f)
                curveToRelative(-0.531f, -0.48f, -1.232f, -0.77f, -2.002f, -0.77f)
                horizontalLineToRelative(-0.101f)
                curveToRelative(-0.465f, -2.279f, -2.485f, -4.0f, -4.899f, -4.0f)
                reflectiveCurveToRelative(-4.428f, 1.715f, -4.897f, 3.988f)
                curveToRelative(-0.732f, 0.082f, -1.419f, 0.36f, -2.009f, 0.817f)
                curveToRelative(-0.322f, 0.251f, -0.863f, 0.253f, -1.188f, 0.0f)
                curveToRelative(-0.548f, -0.425f, -1.182f, -0.696f, -1.857f, -0.797f)
                curveTo(2.549f, 5.958f, 6.821f, 2.0f, 12.0f, 2.0f)
                curveToRelative(5.231f, 0.0f, 9.536f, 4.038f, 9.964f, 9.16f)
                curveToRelative(-0.303f, -0.103f, -0.627f, -0.16f, -0.964f, -0.16f)
                close()
            }
        }
        .build()
        return _donut!!
    }

private var _donut: ImageVector? = null
