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

public val Icons.Outline.FaceSmileHorns: ImageVector
    get() {
        if (_faceSmileHorns != null) {
            return _faceSmileHorns!!
        }
        _faceSmileHorns = Builder(name = "FaceSmileHorns", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.336f, 15.252f)
                lineToRelative(1.33f, 1.493f)
                curveToRelative(-0.103f, 0.092f, -2.559f, 2.254f, -5.666f, 2.254f)
                reflectiveCurveToRelative(-5.563f, -2.162f, -5.666f, -2.254f)
                lineToRelative(1.33f, -1.493f)
                curveToRelative(0.02f, 0.018f, 2.005f, 1.748f, 4.336f, 1.748f)
                reflectiveCurveToRelative(4.316f, -1.73f, 4.336f, -1.748f)
                close()
                moveTo(14.724f, 10.215f)
                curveToRelative(-0.434f, 0.263f, -0.724f, 0.74f, -0.724f, 1.284f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.155f, -0.023f, -0.304f, -0.067f, -0.444f)
                lineToRelative(1.668f, -1.257f)
                lineToRelative(-1.203f, -1.598f)
                lineToRelative(-2.674f, 2.015f)
                close()
                moveTo(22.749f, 6.669f)
                curveToRelative(0.8f, 1.607f, 1.251f, 3.416f, 1.251f, 5.33f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                curveToRelative(0.0f, -1.913f, 0.451f, -3.723f, 1.251f, -5.33f)
                lineTo(0.0f, 0.0f)
                lineTo(4.989f, 2.268f)
                curveTo(6.962f, 0.842f, 9.384f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(5.038f, 0.842f, 7.011f, 2.268f)
                lineTo(24.0f, 0.0f)
                lineToRelative(-1.251f, 6.67f)
                close()
                moveTo(22.0f, 11.999f)
                curveToRelative(0.0f, -5.514f, -4.486f, -10.0f, -10.0f, -10.0f)
                reflectiveCurveTo(2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                close()
                moveTo(7.0f, 11.499f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.545f, -0.29f, -1.021f, -0.724f, -1.284f)
                lineToRelative(-2.674f, -2.015f)
                lineToRelative(-1.203f, 1.598f)
                lineToRelative(1.668f, 1.257f)
                curveToRelative(-0.043f, 0.14f, -0.067f, 0.289f, -0.067f, 0.444f)
                close()
            }
        }
        .build()
        return _faceSmileHorns!!
    }

private var _faceSmileHorns: ImageVector? = null
