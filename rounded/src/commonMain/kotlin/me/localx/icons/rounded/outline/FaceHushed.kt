package me.localx.icons.rounded.outline

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

public val Icons.Outline.FaceHushed: ImageVector
    get() {
        if (_faceHushed != null) {
            return _faceHushed!!
        }
        _faceHushed = Builder(name = "FaceHushed", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(10.0f, 11.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(17.0f, 11.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(14.0f, 18.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(6.782f, 8.623f)
                curveToRelative(-0.197f, 0.248f, -0.489f, 0.377f, -0.783f, 0.377f)
                curveToRelative(-0.218f, 0.0f, -0.438f, -0.071f, -0.622f, -0.218f)
                curveToRelative(-0.432f, -0.345f, -0.503f, -0.974f, -0.159f, -1.405f)
                curveToRelative(0.91f, -1.143f, 2.308f, -2.065f, 3.56f, -2.352f)
                curveToRelative(0.531f, -0.126f, 1.074f, 0.212f, 1.197f, 0.752f)
                curveToRelative(0.123f, 0.538f, -0.213f, 1.074f, -0.752f, 1.197f)
                curveToRelative(-0.812f, 0.186f, -1.815f, 0.864f, -2.44f, 1.648f)
                close()
                moveTo(18.782f, 7.377f)
                curveToRelative(0.344f, 0.432f, 0.272f, 1.061f, -0.159f, 1.405f)
                curveToRelative(-0.184f, 0.146f, -0.404f, 0.218f, -0.622f, 0.218f)
                curveToRelative(-0.294f, 0.0f, -0.586f, -0.129f, -0.783f, -0.377f)
                curveToRelative(-0.625f, -0.784f, -1.629f, -1.463f, -2.44f, -1.648f)
                curveToRelative(-0.539f, -0.123f, -0.875f, -0.659f, -0.752f, -1.197f)
                curveToRelative(0.123f, -0.54f, 0.666f, -0.878f, 1.197f, -0.752f)
                curveToRelative(1.252f, 0.286f, 2.649f, 1.209f, 3.56f, 2.352f)
                close()
            }
        }
        .build()
        return _faceHushed!!
    }

private var _faceHushed: ImageVector? = null
