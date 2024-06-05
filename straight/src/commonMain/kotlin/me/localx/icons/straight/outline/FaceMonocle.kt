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

public val Icons.Outline.FaceMonocle: ImageVector
    get() {
        if (_faceMonocle != null) {
            return _faceMonocle!!
        }
        _faceMonocle = Builder(name = "FaceMonocle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(3.009f, 0.0f, 5.308f, 1.159f, 6.832f, 3.445f)
                lineToRelative(-1.664f, 1.109f)
                curveToRelative(-1.703f, -2.555f, -4.22f, -2.555f, -5.168f, -2.555f)
                close()
                moveTo(9.0f, 8.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(19.972f, 10.0f)
                horizontalLineToRelative(0.028f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(18.0f, 14.24f)
                curveToRelative(-0.716f, 0.48f, -1.576f, 0.76f, -2.5f, 0.76f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.019f, -4.5f, 4.5f, -4.5f)
                curveToRelative(2.312f, 0.0f, 4.223f, 1.753f, 4.472f, 4.0f)
                close()
                moveTo(18.0f, 10.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.121f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.122f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.121f, 2.5f, -2.5f)
                close()
                moveTo(24.0f, 12.0f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(1.404f, 0.0f, 2.747f, -0.255f, 4.0f, -0.7f)
                verticalLineToRelative(-2.141f)
                curveToRelative(-1.226f, 0.538f, -2.578f, 0.841f, -4.0f, 0.841f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                verticalLineToRelative(6.619f)
                curveToRelative(1.261f, -1.899f, 2.0f, -4.173f, 2.0f, -6.619f)
                close()
            }
        }
        .build()
        return _faceMonocle!!
    }

private var _faceMonocle: ImageVector? = null
