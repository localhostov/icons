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

public val Icons.Bold.FaceZany: ImageVector
    get() {
        if (_faceZany != null) {
            return _faceZany!!
        }
        _faceZany = Builder(name = "FaceZany", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 14.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(17.0f, 8.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                curveToRelative(0.0f, 5.421f, 3.615f, 10.009f, 8.56f, 11.492f)
                curveToRelative(-1.509f, -0.808f, -2.56f, -2.51f, -2.56f, -4.492f)
                verticalLineToRelative(-0.315f)
                curveToRelative(-1.835f, -1.649f, -3.0f, -4.029f, -3.0f, -6.685f)
                curveTo(3.0f, 7.038f, 7.037f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                curveToRelative(0.0f, 3.999f, -2.628f, 7.381f, -6.244f, 8.55f)
                curveToRelative(-0.544f, 1.836f, -2.007f, 3.19f, -3.79f, 3.398f)
                curveToRelative(0.341f, 0.029f, 0.685f, 0.052f, 1.034f, 0.052f)
                curveToRelative(6.617f, 0.0f, 12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(13.0f, 19.0f)
                verticalLineToRelative(-2.038f)
                curveToRelative(0.298f, -0.103f, 0.597f, -0.213f, 0.893f, -0.334f)
                curveToRelative(0.378f, -0.155f, 0.747f, -0.327f, 1.107f, -0.506f)
                curveToRelative(0.0f, 0.0f, -0.013f, 2.079f, -0.018f, 2.18f)
                curveToRelative(2.804f, -1.366f, 3.614f, -4.477f, 3.328f, -6.73f)
                curveToRelative(0.0f, -0.001f, -2.402f, 2.067f, -5.177f, 3.206f)
                curveToRelative(-2.775f, 1.139f, -5.931f, 1.352f, -5.93f, 1.353f)
                curveToRelative(0.229f, 0.3f, 0.497f, 0.595f, 0.798f, 0.876f)
                verticalLineToRelative(1.993f)
                curveToRelative(0.0f, 1.5f, 1.0f, 3.0f, 2.5f, 3.0f)
                reflectiveCurveToRelative(2.5f, -1.5f, 2.5f, -3.0f)
                close()
            }
        }
        .build()
        return _faceZany!!
    }

private var _faceZany: ImageVector? = null
