package me.localx.icons.rounded.outline

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

public val Icons.Outline.Circle2: ImageVector
    get() {
        if (_circle2 != null) {
            return _circle2!!
        }
        _circle2 = Builder(name = "Circle2", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(16.0f, 17.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.781f)
                curveToRelative(0.426f, -0.37f, 1.069f, -0.72f, 1.742f, -1.086f)
                curveToRelative(1.754f, -0.956f, 4.156f, -2.265f, 4.035f, -5.131f)
                curveToRelative(-0.089f, -2.121f, -1.844f, -3.783f, -3.995f, -3.783f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                curveToRelative(1.058f, 0.0f, 1.954f, 0.838f, 1.997f, 1.867f)
                curveToRelative(0.064f, 1.513f, -1.088f, 2.253f, -2.994f, 3.29f)
                curveToRelative(-0.99f, 0.54f, -1.925f, 1.049f, -2.559f, 1.797f)
                curveToRelative(-0.475f, 0.56f, -0.58f, 1.319f, -0.272f, 1.983f)
                curveToRelative(0.304f, 0.655f, 0.942f, 1.062f, 1.666f, 1.062f)
                horizontalLineToRelative(5.162f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _circle2!!
    }

private var _circle2: ImageVector? = null
