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

public val Icons.Bold.FaceRelieved: ImageVector
    get() {
        if (_faceRelieved != null) {
            return _faceRelieved!!
        }
        _faceRelieved = Builder(name = "FaceRelieved", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                curveToRelative(-2.158f, 0.0f, -3.975f, -1.058f, -4.866f, -1.688f)
                lineToRelative(1.732f, -2.449f)
                curveToRelative(0.601f, 0.425f, 1.806f, 1.138f, 3.134f, 1.138f)
                reflectiveCurveToRelative(2.533f, -0.713f, 3.134f, -1.138f)
                lineToRelative(1.732f, 2.449f)
                curveToRelative(-0.891f, 0.631f, -2.708f, 1.688f, -4.866f, 1.688f)
                close()
                moveTo(24.0f, 12.0f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, 4.963f, -4.038f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(3.0f, 16.963f, 3.0f, 12.0f)
                reflectiveCurveTo(7.038f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                close()
                moveTo(11.0f, 10.0f)
                reflectiveCurveToRelative(-2.0f, 1.0f, -3.0f, 1.0f)
                reflectiveCurveToRelative(-3.0f, -1.0f, -3.0f, -1.0f)
                curveToRelative(0.0f, 1.631f, 1.0f, 4.0f, 3.0f, 4.0f)
                reflectiveCurveToRelative(3.0f, -2.369f, 3.0f, -4.0f)
                close()
                moveTo(19.0f, 10.0f)
                reflectiveCurveToRelative(-2.0f, 1.0f, -3.0f, 1.0f)
                reflectiveCurveToRelative(-3.0f, -1.0f, -3.0f, -1.0f)
                curveToRelative(0.0f, 1.631f, 1.0f, 4.0f, 3.0f, 4.0f)
                reflectiveCurveToRelative(3.0f, -2.369f, 3.0f, -4.0f)
                close()
                moveTo(9.392f, 6.92f)
                lineToRelative(-0.784f, -1.84f)
                curveToRelative(-1.673f, 0.713f, -3.041f, 1.851f, -3.953f, 3.29f)
                lineToRelative(1.688f, 1.07f)
                curveToRelative(0.685f, -1.079f, 1.768f, -1.975f, 3.048f, -2.521f)
                close()
                moveTo(19.264f, 8.244f)
                curveToRelative(-0.912f, -1.379f, -2.251f, -2.474f, -3.872f, -3.164f)
                lineToRelative(-0.784f, 1.84f)
                curveToRelative(1.259f, 0.536f, 2.292f, 1.376f, 2.988f, 2.428f)
                lineToRelative(1.668f, -1.104f)
                close()
            }
        }
        .build()
        return _faceRelieved!!
    }

private var _faceRelieved: ImageVector? = null
