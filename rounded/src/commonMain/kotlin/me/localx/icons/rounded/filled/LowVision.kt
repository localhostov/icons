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

public val Icons.Filled.LowVision: ImageVector
    get() {
        if (_lowVision != null) {
            return _lowVision!!
        }
        _lowVision = Builder(name = "LowVision", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.828f, 19.071f)
                curveToRelative(0.576f, 0.576f, 0.266f, 1.559f, -0.534f, 1.707f)
                curveToRelative(-0.008f, 0.001f, -0.016f, 0.003f, -0.024f, 0.004f)
                curveToRelative(-0.322f, 0.059f, -0.656f, -0.053f, -0.888f, -0.285f)
                lineTo(2.216f, 9.332f)
                curveToRelative(-0.361f, -0.361f, -0.397f, -0.932f, -0.083f, -1.334f)
                curveToRelative(0.004f, -0.005f, 0.008f, -0.011f, 0.013f, -0.016f)
                curveToRelative(0.371f, -0.474f, 1.08f, -0.514f, 1.505f, -0.088f)
                lineToRelative(11.177f, 11.177f)
                close()
                moveTo(0.528f, 10.473f)
                curveToRelative(-0.143f, 0.272f, -0.261f, 0.514f, -0.35f, 0.708f)
                curveToRelative(-0.237f, 0.521f, -0.237f, 1.118f, 0.0f, 1.64f)
                curveToRelative(0.041f, 0.091f, 0.094f, 0.199f, 0.147f, 0.308f)
                lineToRelative(5.915f, 5.915f)
                curveToRelative(0.782f, 0.782f, 1.758f, 1.346f, 2.833f, 1.603f)
                curveToRelative(0.086f, 0.021f, 0.173f, 0.04f, 0.261f, 0.059f)
                curveToRelative(0.537f, 0.116f, 0.902f, -0.524f, 0.514f, -0.912f)
                lineTo(0.528f, 10.473f)
                close()
                moveTo(23.707f, 22.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineTo(0.293f, 1.707f)
                curveTo(-0.098f, 1.316f, -0.098f, 0.684f, 0.293f, 0.293f)
                reflectiveCurveTo(1.316f, -0.098f, 1.707f, 0.293f)
                lineToRelative(4.268f, 4.268f)
                curveToRelative(1.838f, -1.036f, 3.862f, -1.561f, 6.025f, -1.561f)
                curveToRelative(6.192f, 0.0f, 9.72f, 4.238f, 11.271f, 6.764f)
                curveToRelative(0.978f, 1.592f, 0.978f, 3.57f, 0.0f, 5.162f)
                curveToRelative(-0.632f, 1.029f, -1.678f, 2.473f, -3.178f, 3.753f)
                lineToRelative(3.614f, 3.614f)
                close()
                moveTo(8.526f, 7.112f)
                lineToRelative(1.444f, 1.444f)
                curveToRelative(0.596f, -0.353f, 1.29f, -0.555f, 2.031f, -0.555f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                curveToRelative(0.0f, 0.741f, -0.203f, 1.435f, -0.555f, 2.031f)
                lineToRelative(1.443f, 1.443f)
                curveToRelative(0.699f, -0.981f, 1.112f, -2.18f, 1.112f, -3.474f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                curveToRelative(-1.294f, 0.0f, -2.493f, 0.412f, -3.474f, 1.112f)
                close()
            }
        }
        .build()
        return _lowVision!!
    }

private var _lowVision: ImageVector? = null
