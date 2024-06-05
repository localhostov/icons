package me.localx.icons.rounded.bold

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
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.038f, -9.0f, -9.0f)
                reflectiveCurveTo(7.037f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.037f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(8.0f, 14.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(18.0f, 12.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(6.782f, 8.624f)
                curveToRelative(-0.198f, 0.248f, -0.489f, 0.376f, -0.783f, 0.376f)
                curveToRelative(-0.218f, 0.0f, -0.438f, -0.071f, -0.622f, -0.218f)
                curveToRelative(-0.433f, -0.344f, -0.503f, -0.973f, -0.159f, -1.405f)
                curveToRelative(0.91f, -1.141f, 2.307f, -2.064f, 3.559f, -2.351f)
                curveToRelative(0.536f, -0.124f, 1.074f, 0.212f, 1.198f, 0.751f)
                reflectiveCurveToRelative(-0.213f, 1.075f, -0.751f, 1.198f)
                curveToRelative(-0.812f, 0.187f, -1.816f, 0.864f, -2.441f, 1.649f)
                close()
                moveTo(18.623f, 8.782f)
                curveToRelative(-0.184f, 0.147f, -0.404f, 0.218f, -0.622f, 0.218f)
                curveToRelative(-0.294f, 0.0f, -0.585f, -0.129f, -0.783f, -0.376f)
                curveToRelative(-0.625f, -0.785f, -1.629f, -1.462f, -2.441f, -1.649f)
                curveToRelative(-0.538f, -0.124f, -0.875f, -0.66f, -0.751f, -1.198f)
                reflectiveCurveToRelative(0.66f, -0.878f, 1.198f, -0.751f)
                curveToRelative(1.252f, 0.287f, 2.648f, 1.21f, 3.559f, 2.351f)
                curveToRelative(0.344f, 0.432f, 0.273f, 1.061f, -0.159f, 1.405f)
                close()
                moveTo(16.742f, 16.614f)
                curveToRelative(0.801f, 0.958f, -0.15f, 2.366f, -1.335f, 1.974f)
                curveToRelative(-0.817f, -0.271f, -1.832f, -0.587f, -3.369f, -0.588f)
                curveToRelative(-1.537f, 0.0f, -2.552f, 0.317f, -3.368f, 0.588f)
                curveToRelative(-1.185f, 0.393f, -2.137f, -1.017f, -1.335f, -1.974f)
                curveToRelative(0.995f, -1.188f, 2.503f, -2.613f, 4.703f, -2.613f)
                reflectiveCurveToRelative(3.711f, 1.426f, 4.704f, 2.614f)
                close()
            }
        }
        .build()
        return _faceWorried!!
    }

private var _faceWorried: ImageVector? = null
