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

public val Icons.Bold.FaceAngryHorns: ImageVector
    get() {
        if (_faceAngryHorns != null) {
            return _faceAngryHorns!!
        }
        _faceAngryHorns = Builder(name = "FaceAngryHorns", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.063f, 7.329f)
                lineToRelative(1.874f, 2.342f)
                lineToRelative(-2.478f, 1.983f)
                curveToRelative(-0.26f, 0.216f, -0.594f, 0.346f, -0.959f, 0.346f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.475f, 0.221f, -0.899f, 0.566f, -1.174f)
                lineToRelative(2.497f, -1.997f)
                close()
                moveTo(9.5f, 12.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.475f, -0.221f, -0.899f, -0.566f, -1.174f)
                lineToRelative(-2.497f, -1.997f)
                lineToRelative(-1.874f, 2.342f)
                lineToRelative(2.478f, 1.983f)
                curveToRelative(0.26f, 0.216f, 0.594f, 0.346f, 0.959f, 0.346f)
                close()
                moveTo(6.5f, 16.182f)
                lineToRelative(1.994f, 2.241f)
                curveToRelative(0.016f, -0.014f, 1.645f, -1.423f, 3.506f, -1.423f)
                reflectiveCurveToRelative(3.49f, 1.409f, 3.506f, 1.423f)
                lineToRelative(1.994f, -2.241f)
                curveToRelative(-0.1f, -0.09f, -2.477f, -2.182f, -5.5f, -2.182f)
                reflectiveCurveToRelative(-5.399f, 2.092f, -5.5f, 2.182f)
                close()
                moveTo(22.749f, 6.67f)
                curveToRelative(0.8f, 1.607f, 1.251f, 3.416f, 1.251f, 5.33f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                curveToRelative(0.0f, -1.913f, 0.451f, -3.723f, 1.251f, -5.33f)
                lineTo(0.0f, 0.0f)
                lineTo(4.989f, 2.268f)
                curveTo(6.962f, 0.842f, 9.385f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(5.038f, 0.842f, 7.011f, 2.268f)
                lineTo(24.0f, 0.0f)
                lineToRelative(-1.251f, 6.67f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, -4.963f, -4.038f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveTo(3.0f, 7.037f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                close()
            }
        }
        .build()
        return _faceAngryHorns!!
    }

private var _faceAngryHorns: ImageVector? = null
