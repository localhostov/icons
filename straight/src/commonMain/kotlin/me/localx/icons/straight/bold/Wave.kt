package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Wave: ImageVector
    get() {
        if (_wave != null) {
            return _wave!!
        }
        _wave = Builder(name = "Wave", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 19.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                horizontalLineTo(0.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                curveToRelative(1.363f, 0.0f, 2.597f, -0.551f, 3.5f, -1.438f)
                curveToRelative(0.903f, 0.887f, 2.137f, 1.438f, 3.5f, 1.438f)
                reflectiveCurveToRelative(2.597f, -0.551f, 3.5f, -1.438f)
                curveToRelative(0.903f, 0.887f, 2.137f, 1.438f, 3.5f, 1.438f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.123f, 17.005f)
                curveTo(1.917f, 17.005f, 0.123f, 15.211f, 0.123f, 13.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.557f, 0.449f, 1.005f, 1.0f, 1.005f)
                reflectiveCurveToRelative(1.0f, -0.448f, 0.877f, -1.0f)
                verticalLineToRelative(-1.5f)
                curveTo(5.123f, 5.164f, 10.281f, 0.005f, 16.622f, 0.005f)
                curveToRelative(1.944f, 0.0f, 3.871f, 0.499f, 5.571f, 1.442f)
                lineToRelative(1.34f, 0.743f)
                lineToRelative(-1.351f, 2.32f)
                lineToRelative(-1.135f, -0.266f)
                curveToRelative(-0.454f, -0.124f, -0.914f, -0.256f, -1.434f, -0.239f)
                curveToRelative(-1.945f, 0.0f, -3.401f, 0.527f, -4.328f, 1.568f)
                curveToRelative(-1.617f, 1.815f, -1.301f, 4.717f, -1.297f, 4.746f)
                lineToRelative(0.011f, 0.18f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -4.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, 4.084f, -2.916f, 7.0f, -6.5f, 7.0f)
                curveToRelative(-3.556f, 0.0f, -6.455f, -2.871f, -6.5f, -6.416f)
                curveToRelative(-0.062f, -0.645f, -0.278f, -4.043f, 1.74f, -6.639f)
                curveToRelative(-2.74f, 1.412f, -4.618f, 4.271f, -4.741f, 7.561f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.123f, 2.206f, -1.672f, 4.0f, -3.877f, 4.0f)
                close()
            }
        }
        .build()
        return _wave!!
    }

private var _wave: ImageVector? = null
