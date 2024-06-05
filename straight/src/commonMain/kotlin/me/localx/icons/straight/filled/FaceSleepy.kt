package me.localx.icons.straight.filled

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

public val Icons.Filled.FaceSleepy: ImageVector
    get() {
        if (_faceSleepy != null) {
            return _faceSleepy!!
        }
        _faceSleepy = Builder(name = "FaceSleepy", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 22.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                curveToRelative(0.0f, -3.5f, -2.0f, -5.0f, -2.0f, -5.0f)
                curveToRelative(0.0f, 0.0f, 6.0f, 1.0f, 6.0f, 5.0f)
                close()
                moveTo(18.031f, 22.363f)
                curveToRelative(-1.774f, 1.035f, -3.83f, 1.637f, -6.031f, 1.637f)
                curveTo(5.373f, 24.0f, 0.0f, 18.627f, 0.0f, 12.0f)
                reflectiveCurveTo(5.373f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.373f, 12.0f, 12.0f)
                curveToRelative(0.0f, 1.718f, -0.367f, 3.349f, -1.018f, 4.827f)
                curveToRelative(-0.314f, -0.212f, -0.636f, -0.412f, -0.969f, -0.587f)
                curveToRelative(-1.652f, -0.868f, -3.52f, -1.241f, -5.386f, -1.24f)
                curveToRelative(-0.82f, 0.0f, -1.628f, 0.0f, -1.628f, 0.0f)
                curveToRelative(0.108f, 0.094f, 2.995f, 4.714f, 2.999f, 6.924f)
                curveToRelative(0.0f, 0.148f, 0.017f, 0.293f, 0.032f, 0.438f)
                close()
                moveTo(13.119f, 11.675f)
                curveToRelative(0.837f, 0.848f, 1.899f, 1.306f, 3.016f, 1.306f)
                curveToRelative(0.09f, 0.0f, 0.181f, -0.003f, 0.271f, -0.009f)
                curveToRelative(1.036f, -0.068f, 2.056f, -0.527f, 2.798f, -1.26f)
                lineToRelative(-1.406f, -1.423f)
                curveToRelative(-0.398f, 0.394f, -0.968f, 0.651f, -1.522f, 0.688f)
                curveToRelative(-0.647f, 0.045f, -1.228f, -0.195f, -1.733f, -0.707f)
                lineToRelative(-1.422f, 1.405f)
                close()
                moveTo(7.947f, 12.993f)
                curveToRelative(1.044f, 0.0f, 2.12f, -0.389f, 3.019f, -1.296f)
                lineToRelative(-1.422f, -1.407f)
                curveToRelative(-1.192f, 1.204f, -2.605f, 0.668f, -3.264f, 0.017f)
                lineToRelative(-1.406f, 1.422f)
                curveToRelative(0.792f, 0.784f, 1.912f, 1.265f, 3.073f, 1.265f)
                close()
                moveTo(15.597f, 17.198f)
                curveToRelative(-0.066f, -0.049f, -1.632f, -1.198f, -3.598f, -1.198f)
                reflectiveCurveToRelative(-3.531f, 1.149f, -3.598f, 1.198f)
                lineToRelative(1.191f, 1.607f)
                curveToRelative(0.011f, -0.008f, 1.117f, -0.805f, 2.406f, -0.805f)
                reflectiveCurveToRelative(2.396f, 0.797f, 2.402f, 0.802f)
                lineToRelative(1.195f, -1.604f)
                close()
            }
        }
        .build()
        return _faceSleepy!!
    }

private var _faceSleepy: ImageVector? = null
