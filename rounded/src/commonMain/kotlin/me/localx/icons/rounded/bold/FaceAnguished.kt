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

public val Icons.Bold.FaceAnguished: ImageVector
    get() {
        if (_faceAnguished != null) {
            return _faceAnguished!!
        }
        _faceAnguished = Builder(name = "FaceAnguished", defaultWidth = 512.0.dp, defaultHeight =
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
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.038f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.038f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(6.782f, 8.623f)
                curveToRelative(-0.198f, 0.248f, -0.489f, 0.377f, -0.783f, 0.377f)
                curveToRelative(-0.219f, 0.0f, -0.438f, -0.071f, -0.623f, -0.218f)
                curveToRelative(-0.432f, -0.345f, -0.503f, -0.974f, -0.159f, -1.405f)
                curveToRelative(0.91f, -1.143f, 2.307f, -2.065f, 3.559f, -2.352f)
                curveToRelative(0.541f, -0.124f, 1.075f, 0.213f, 1.198f, 0.752f)
                curveToRelative(0.124f, 0.538f, -0.213f, 1.074f, -0.751f, 1.197f)
                curveToRelative(-0.812f, 0.186f, -1.816f, 0.864f, -2.441f, 1.648f)
                close()
                moveTo(18.623f, 8.782f)
                curveToRelative(-0.184f, 0.146f, -0.404f, 0.218f, -0.623f, 0.218f)
                curveToRelative(-0.294f, 0.0f, -0.585f, -0.129f, -0.783f, -0.377f)
                curveToRelative(-0.625f, -0.784f, -1.629f, -1.463f, -2.441f, -1.648f)
                curveToRelative(-0.539f, -0.123f, -0.875f, -0.659f, -0.751f, -1.197f)
                curveToRelative(0.123f, -0.539f, 0.66f, -0.877f, 1.198f, -0.752f)
                curveToRelative(1.252f, 0.286f, 2.649f, 1.209f, 3.559f, 2.352f)
                curveToRelative(0.344f, 0.432f, 0.273f, 1.061f, -0.159f, 1.405f)
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
                moveTo(15.814f, 17.237f)
                curveToRelative(0.448f, 0.786f, -0.111f, 1.763f, -1.015f, 1.763f)
                horizontalLineToRelative(-5.599f)
                curveToRelative(-0.904f, 0.0f, -1.462f, -0.977f, -1.015f, -1.763f)
                curveToRelative(0.671f, -1.178f, 2.232f, -2.235f, 3.814f, -2.237f)
                curveToRelative(1.582f, 0.002f, 3.143f, 1.059f, 3.814f, 2.237f)
                close()
            }
        }
        .build()
        return _faceAnguished!!
    }

private var _faceAnguished: ImageVector? = null
