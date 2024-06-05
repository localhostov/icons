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

public val Icons.Outline.FaceSleepy: ImageVector
    get() {
        if (_faceSleepy != null) {
            return _faceSleepy!!
        }
        _faceSleepy = Builder(name = "FaceSleepy", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 1.701f, -0.361f, 3.317f, -1.001f, 4.784f)
                curveToRelative(-0.419f, -0.611f, -0.943f, -1.141f, -1.53f, -1.593f)
                curveToRelative(0.339f, -1.004f, 0.531f, -2.074f, 0.531f, -3.191f)
                curveToRelative(0.0f, -5.514f, -4.486f, -10.0f, -10.0f, -10.0f)
                reflectiveCurveTo(2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(1.488f, 0.0f, 2.896f, -0.336f, 4.167f, -0.921f)
                curveToRelative(0.187f, 0.662f, 0.525f, 1.262f, 0.997f, 1.737f)
                curveToRelative(-1.567f, 0.751f, -3.313f, 1.184f, -5.163f, 1.184f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(1.289f, 0.0f, 2.396f, 0.797f, 2.402f, 0.802f)
                lineToRelative(1.195f, -1.604f)
                curveToRelative(-0.066f, -0.049f, -1.632f, -1.198f, -3.598f, -1.198f)
                reflectiveCurveToRelative(-3.531f, 1.149f, -3.598f, 1.198f)
                lineToRelative(1.191f, 1.607f)
                curveToRelative(0.011f, -0.008f, 1.117f, -0.805f, 2.406f, -0.805f)
                close()
                moveTo(6.28f, 10.306f)
                lineToRelative(-1.406f, 1.422f)
                curveToRelative(0.792f, 0.784f, 1.912f, 1.265f, 3.073f, 1.265f)
                curveToRelative(1.044f, 0.0f, 2.12f, -0.389f, 3.019f, -1.296f)
                lineToRelative(-1.422f, -1.407f)
                curveToRelative(-1.191f, 1.204f, -2.604f, 0.668f, -3.264f, 0.017f)
                close()
                moveTo(16.405f, 12.972f)
                curveToRelative(1.036f, -0.068f, 2.056f, -0.527f, 2.798f, -1.26f)
                lineToRelative(-1.406f, -1.423f)
                curveToRelative(-0.398f, 0.394f, -0.968f, 0.651f, -1.522f, 0.688f)
                curveToRelative(-0.646f, 0.045f, -1.228f, -0.195f, -1.733f, -0.707f)
                lineToRelative(-1.422f, 1.405f)
                curveToRelative(0.837f, 0.848f, 1.899f, 1.306f, 3.016f, 1.306f)
                curveToRelative(0.09f, 0.0f, 0.181f, -0.003f, 0.271f, -0.009f)
                close()
                moveTo(16.0f, 15.0f)
                reflectiveCurveToRelative(2.0f, 1.5f, 2.0f, 5.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                curveToRelative(0.0f, -4.0f, -6.0f, -5.0f, -6.0f, -5.0f)
                close()
            }
        }
        .build()
        return _faceSleepy!!
    }

private var _faceSleepy: ImageVector? = null
