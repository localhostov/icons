package me.localx.icons.rounded.filled

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

public val Icons.Filled.FaceWorried: ImageVector
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
                moveTo(5.999f, 9.0f)
                curveToRelative(-0.218f, 0.0f, -0.438f, -0.071f, -0.622f, -0.218f)
                curveToRelative(-0.433f, -0.344f, -0.503f, -0.973f, -0.159f, -1.405f)
                curveToRelative(0.91f, -1.141f, 2.307f, -2.064f, 3.559f, -2.351f)
                curveToRelative(0.536f, -0.124f, 1.074f, 0.212f, 1.198f, 0.751f)
                reflectiveCurveToRelative(-0.213f, 1.075f, -0.751f, 1.198f)
                curveToRelative(-0.812f, 0.187f, -1.816f, 0.864f, -2.441f, 1.649f)
                curveToRelative(-0.198f, 0.248f, -0.489f, 0.376f, -0.783f, 0.376f)
                close()
                moveTo(8.5f, 10.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(16.03f, 18.981f)
                curveToRelative(-0.93f, -0.195f, -1.998f, -0.98f, -4.03f, -0.981f)
                curveToRelative(-2.032f, 0.0f, -3.023f, 0.785f, -3.953f, 0.981f)
                curveToRelative(-0.72f, 0.151f, -1.272f, -0.617f, -0.876f, -1.214f)
                curveToRelative(0.849f, -1.282f, 2.372f, -2.767f, 4.871f, -2.767f)
                reflectiveCurveToRelative(4.016f, 1.484f, 4.865f, 2.767f)
                curveToRelative(0.395f, 0.597f, -0.157f, 1.365f, -0.877f, 1.214f)
                close()
                moveTo(14.0f, 11.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
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
            }
        }
        .build()
        return _faceWorried!!
    }

private var _faceWorried: ImageVector? = null
