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

public val Icons.Bold.FaceGlasses: ImageVector
    get() {
        if (_faceGlasses != null) {
            return _faceGlasses!!
        }
        _faceGlasses = Builder(name = "FaceGlasses", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(12.0f, 3.0f)
                curveToRelative(2.66f, 0.0f, 5.053f, 1.16f, 6.702f, 3.0f)
                horizontalLineToRelative(-3.202f)
                curveToRelative(-0.816f, 0.0f, -1.542f, 0.393f, -1.999f, 1.0f)
                horizontalLineToRelative(-3.002f)
                curveToRelative(-0.456f, -0.607f, -1.182f, -1.0f, -1.999f, -1.0f)
                horizontalLineToRelative(-3.202f)
                curveToRelative(1.649f, -1.84f, 4.042f, -3.0f, 6.702f, -3.0f)
                close()
                moveTo(19.0f, 9.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(8.0f, 9.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.792f, 0.0f, -8.72f, -3.764f, -8.985f, -8.49f)
                curveToRelative(0.416f, 0.308f, 0.929f, 0.49f, 1.485f, 0.49f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.379f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.556f, 0.0f, 1.07f, -0.182f, 1.485f, -0.49f)
                curveToRelative(-0.265f, 4.727f, -4.193f, 8.49f, -8.985f, 8.49f)
                close()
                moveTo(16.005f, 14.377f)
                lineToRelative(1.994f, 2.241f)
                curveToRelative(-0.108f, 0.098f, -2.703f, 2.382f, -5.999f, 2.382f)
                reflectiveCurveToRelative(-5.891f, -2.284f, -5.999f, -2.382f)
                lineToRelative(1.994f, -2.241f)
                curveToRelative(0.019f, 0.017f, 1.871f, 1.623f, 4.005f, 1.623f)
                reflectiveCurveToRelative(3.986f, -1.606f, 4.005f, -1.623f)
                close()
            }
        }
        .build()
        return _faceGlasses!!
    }

private var _faceGlasses: ImageVector? = null
