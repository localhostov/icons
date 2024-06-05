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

public val Icons.Bold.FaceDowncastSweat: ImageVector
    get() {
        if (_faceDowncastSweat != null) {
            return _faceDowncastSweat!!
        }
        _faceDowncastSweat = Builder(name = "FaceDowncastSweat", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                curveToRelative(2.093f, 0.0f, 3.717f, 1.164f, 3.896f, 1.297f)
                lineToRelative(-1.791f, 2.406f)
                reflectiveCurveToRelative(-0.987f, -0.703f, -2.104f, -0.703f)
                reflectiveCurveToRelative(-2.103f, 0.702f, -2.113f, 0.709f)
                lineToRelative(-1.783f, -2.412f)
                curveToRelative(0.178f, -0.133f, 1.802f, -1.297f, 3.896f, -1.297f)
                close()
                moveTo(6.0f, 13.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                lineTo(6.0f, 10.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(18.0f, 10.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(12.0f, 0.0f)
                curveToRelative(-1.821f, 0.0f, -3.542f, 0.419f, -5.089f, 1.148f)
                curveToRelative(0.506f, 0.848f, 0.936f, 1.825f, 1.055f, 2.818f)
                curveToRelative(1.215f, -0.613f, 2.583f, -0.966f, 4.034f, -0.966f)
                curveToRelative(4.962f, 0.0f, 9.0f, 4.037f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.038f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(3.0f, 16.963f, 3.0f, 12.0f)
                curveToRelative(0.0f, -1.054f, 0.192f, -2.062f, 0.526f, -3.003f)
                curveToRelative(-0.009f, 0.0f, -0.017f, 0.003f, -0.026f, 0.003f)
                curveToRelative(-1.063f, 0.0f, -2.028f, -0.386f, -2.798f, -1.004f)
                curveToRelative(-0.446f, 1.254f, -0.702f, 2.598f, -0.702f, 4.004f)
                curveToRelative(0.0f, 6.617f, 5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(3.5f, 7.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                curveTo(6.0f, 2.513f, 3.5f, 0.0f, 3.5f, 0.0f)
                curveTo(3.5f, 0.0f, 1.0f, 2.462f, 1.0f, 4.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _faceDowncastSweat!!
    }

private var _faceDowncastSweat: ImageVector? = null
