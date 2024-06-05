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

public val Icons.Bold.FaceWorried: ImageVector
    get() {
        if (_faceWorried != null) {
            return _faceWorried!!
        }
        _faceWorried = Builder(name = "FaceWorried", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 10.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(6.0f, 12.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                close()
                moveTo(17.0f, 19.0f)
                curveToRelative(-0.492f, -1.824f, -2.325f, -3.997f, -4.994f, -4.0f)
                curveToRelative(-2.669f, 0.003f, -4.514f, 2.176f, -5.006f, 4.0f)
                curveToRelative(0.0f, 0.001f, 2.6f, -1.0f, 5.0f, -1.0f)
                reflectiveCurveToRelative(5.0f, 1.001f, 5.0f, 1.0f)
                close()
                moveTo(24.0f, 12.0f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, 4.962f, -4.037f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(3.0f, 16.962f, 3.0f, 12.0f)
                reflectiveCurveTo(7.037f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                close()
                moveTo(8.893f, 7.42f)
                lineToRelative(-0.785f, -1.84f)
                curveToRelative(-1.674f, 0.714f, -3.04f, 1.852f, -3.952f, 3.29f)
                lineToRelative(1.689f, 1.071f)
                curveToRelative(0.694f, -1.095f, 1.748f, -1.967f, 3.048f, -2.521f)
                close()
                moveTo(19.764f, 8.745f)
                curveToRelative(-0.911f, -1.379f, -2.25f, -2.473f, -3.871f, -3.165f)
                lineToRelative(-0.785f, 1.84f)
                curveToRelative(1.26f, 0.538f, 2.293f, 1.377f, 2.988f, 2.428f)
                lineToRelative(1.668f, -1.103f)
                close()
            }
        }
        .build()
        return _faceWorried!!
    }

private var _faceWorried: ImageVector? = null
