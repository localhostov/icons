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

public val Icons.Bold.FaceSmileHorns: ImageVector
    get() {
        if (_faceSmileHorns != null) {
            return _faceSmileHorns!!
        }
        _faceSmileHorns = Builder(name = "FaceSmileHorns", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.062f, 8.329f)
                lineToRelative(1.875f, 2.343f)
                lineToRelative(-2.5f, 2.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.257f, 0.205f, -0.582f, 0.329f, -0.937f, 0.329f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.474f, 0.22f, -0.896f, 0.563f, -1.171f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(2.5f, -2.0f, 2.5f, -2.0f)
                close()
                moveTo(8.562f, 12.671f)
                curveToRelative(0.257f, 0.206f, 0.582f, 0.329f, 0.937f, 0.329f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.474f, -0.22f, -0.896f, -0.563f, -1.171f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(-2.5f, -2.0f, -2.5f, -2.0f)
                lineToRelative(-1.875f, 2.343f)
                lineToRelative(2.5f, 2.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(22.748f, 6.67f)
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
                moveTo(20.999f, 12.0f)
                curveToRelative(0.0f, -4.962f, -4.037f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveTo(3.0f, 7.038f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.037f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.038f, 9.0f, -9.0f)
                close()
                moveTo(11.999f, 16.0f)
                curveToRelative(-1.861f, 0.0f, -3.489f, -1.409f, -3.501f, -1.418f)
                lineToRelative(-1.998f, 2.237f)
                curveToRelative(0.1f, 0.089f, 2.476f, 2.181f, 5.499f, 2.181f)
                reflectiveCurveToRelative(5.399f, -2.092f, 5.499f, -2.181f)
                lineToRelative(-1.993f, -2.242f)
                curveToRelative(-0.017f, 0.014f, -1.645f, 1.423f, -3.506f, 1.423f)
                close()
            }
        }
        .build()
        return _faceSmileHorns!!
    }

private var _faceSmileHorns: ImageVector? = null
