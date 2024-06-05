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

public val Icons.Filled.FaceAstonished: ImageVector
    get() {
        if (_faceAstonished != null) {
            return _faceAstonished!!
        }
        _faceAstonished = Builder(name = "FaceAstonished", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(6.0f, 9.0f)
                curveToRelative(-0.219f, 0.0f, -0.438f, -0.071f, -0.623f, -0.218f)
                curveToRelative(-0.432f, -0.345f, -0.503f, -0.974f, -0.159f, -1.405f)
                curveToRelative(0.91f, -1.143f, 2.307f, -2.065f, 3.559f, -2.352f)
                curveToRelative(0.541f, -0.124f, 1.075f, 0.213f, 1.198f, 0.752f)
                curveToRelative(0.124f, 0.538f, -0.213f, 1.074f, -0.751f, 1.197f)
                curveToRelative(-0.812f, 0.186f, -1.816f, 0.864f, -2.441f, 1.648f)
                curveToRelative(-0.198f, 0.248f, -0.489f, 0.377f, -0.783f, 0.377f)
                close()
                moveTo(7.0f, 10.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(15.0f, 17.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(15.5f, 12.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(18.623f, 8.782f)
                curveToRelative(-0.184f, 0.146f, -0.404f, 0.218f, -0.623f, 0.218f)
                curveToRelative(-0.294f, 0.0f, -0.585f, -0.129f, -0.783f, -0.377f)
                curveToRelative(-0.625f, -0.784f, -1.629f, -1.463f, -2.441f, -1.648f)
                curveToRelative(-0.539f, -0.123f, -0.875f, -0.659f, -0.751f, -1.197f)
                curveToRelative(0.124f, -0.539f, 0.663f, -0.877f, 1.198f, -0.752f)
                curveToRelative(1.252f, 0.286f, 2.649f, 1.209f, 3.559f, 2.352f)
                curveToRelative(0.344f, 0.432f, 0.273f, 1.061f, -0.159f, 1.405f)
                close()
            }
        }
        .build()
        return _faceAstonished!!
    }

private var _faceAstonished: ImageVector? = null
