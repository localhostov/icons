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

public val Icons.Outline.LampDesk: ImageVector
    get() {
        if (_lampDesk != null) {
            return _lampDesk!!
        }
        _lampDesk = Builder(name = "LampDesk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.059f, 13.988f)
                curveToRelative(0.084f, 0.009f, -0.083f, 0.0f, 0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(22.266f, 8.078f)
                lineToRelative(-0.834f, 0.834f)
                curveToRelative(0.809f, 0.982f, 0.755f, 2.437f, -0.163f, 3.355f)
                reflectiveCurveToRelative(-2.373f, 0.973f, -3.355f, 0.163f)
                lineToRelative(-0.835f, 0.835f)
                curveToRelative(-0.473f, 0.474f, -1.077f, 0.722f, -2.019f, 0.722f)
                curveToRelative(-0.75f, -0.074f, -1.42f, -0.477f, -1.837f, -1.104f)
                lineToRelative(-3.077f, -4.615f)
                lineToRelative(-1.68f, 1.68f)
                curveToRelative(-0.944f, 0.944f, -1.465f, 2.2f, -1.465f, 3.536f)
                verticalLineToRelative(8.515f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                lineTo(1.0f, 23.999f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-8.515f)
                curveToRelative(0.0f, -1.87f, 0.729f, -3.628f, 2.051f, -4.95f)
                lineToRelative(2.157f, -2.157f)
                curveToRelative(-0.388f, -1.393f, -0.193f, -2.877f, 0.594f, -4.08f)
                curveToRelative(0.75f, -1.146f, 1.894f, -1.926f, 3.219f, -2.197f)
                curveToRelative(1.321f, -0.271f, 2.672f, -0.007f, 3.798f, 0.743f)
                lineToRelative(5.065f, 3.378f)
                curveToRelative(0.627f, 0.417f, 1.029f, 1.086f, 1.104f, 1.836f)
                curveToRelative(0.075f, 0.75f, -0.188f, 1.486f, -0.722f, 2.02f)
                close()
                moveTo(20.997f, 6.257f)
                curveToRelative(-0.009f, -0.089f, -0.049f, -0.255f, -0.222f, -0.369f)
                lineToRelative(-5.066f, -3.379f)
                curveToRelative(-0.504f, -0.336f, -1.082f, -0.51f, -1.674f, -0.51f)
                curveToRelative(-0.204f, 0.0f, -0.41f, 0.021f, -0.614f, 0.062f)
                curveToRelative(-0.799f, 0.163f, -1.49f, 0.637f, -1.945f, 1.333f)
                curveToRelative(-0.646f, 0.985f, -0.599f, 2.368f, 0.117f, 3.441f)
                lineToRelative(3.293f, 4.939f)
                curveToRelative(0.115f, 0.174f, 0.281f, 0.214f, 0.37f, 0.223f)
                curveToRelative(0.089f, 0.011f, 0.261f, 0.002f, 0.406f, -0.146f)
                lineToRelative(5.189f, -5.188f)
                curveToRelative(0.147f, -0.147f, 0.154f, -0.318f, 0.146f, -0.407f)
                close()
            }
        }
        .build()
        return _lampDesk!!
    }

private var _lampDesk: ImageVector? = null
