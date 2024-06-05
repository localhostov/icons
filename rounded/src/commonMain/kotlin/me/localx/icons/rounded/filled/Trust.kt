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

public val Icons.Filled.Trust: ImageVector
    get() {
        if (_trust != null) {
            return _trust!!
        }
        _trust = Builder(name = "Trust", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(21.683f, 17.712f)
                lineToRelative(-2.703f, 2.614f)
                curveToRelative(-0.452f, 0.446f, -1.052f, 0.671f, -1.653f, 0.671f)
                reflectiveCurveToRelative(-1.203f, -0.225f, -1.663f, -0.674f)
                lineToRelative(-1.354f, -1.332f)
                curveToRelative(-0.395f, -0.387f, -0.4f, -1.02f, -0.014f, -1.414f)
                curveToRelative(0.386f, -0.395f, 1.019f, -0.401f, 1.414f, -0.014f)
                lineToRelative(1.353f, 1.331f)
                curveToRelative(0.144f, 0.142f, 0.38f, 0.139f, 0.522f, -0.002f)
                lineToRelative(2.713f, -2.624f)
                curveToRelative(0.397f, -0.381f, 1.031f, -0.37f, 1.414f, 0.029f)
                curveToRelative(0.382f, 0.398f, 0.369f, 1.031f, -0.029f, 1.414f)
                close()
                moveTo(10.942f, 12.0f)
                horizontalLineToRelative(1.771f)
                curveToRelative(-1.665f, 1.466f, -2.721f, 3.607f, -2.721f, 6.0f)
                curveToRelative(0.0f, 0.703f, 0.1f, 1.381f, 0.27f, 2.031f)
                horizontalLineToRelative(-0.05f)
                curveToRelative(-1.142f, 0.003f, -2.229f, 0.495f, -2.985f, 1.351f)
                lineToRelative(-1.715f, 1.942f)
                curveToRelative(-0.38f, 0.43f, -0.926f, 0.676f, -1.499f, 0.676f)
                horizontalLineToRelative(-1.013f)
                curveToRelative(-1.66f, 0.0f, -3.004f, -1.348f, -3.0f, -3.008f)
                lineToRelative(0.017f, -6.199f)
                curveToRelative(0.001f, -0.426f, 0.127f, -0.85f, 0.396f, -1.182f)
                curveToRelative(0.319f, -0.395f, 0.613f, -0.81f, 0.74f, -1.302f)
                lineToRelative(0.77f, -2.982f)
                curveToRelative(0.305f, -1.182f, 1.069f, -2.147f, 2.071f, -2.729f)
                lineToRelative(-0.002f, 4.726f)
                curveToRelative(0.0f, 1.824f, 1.318f, 3.471f, 3.133f, 3.657f)
                curveToRelative(1.923f, 0.197f, 3.557f, -1.176f, 3.817f, -2.981f)
                close()
                moveTo(23.992f, 3.0f)
                verticalLineToRelative(1.233f)
                curveToRelative(0.0f, 0.494f, -0.183f, 0.971f, -0.513f, 1.338f)
                lineToRelative(-3.987f, 4.43f)
                horizontalLineToRelative(-8.49f)
                lineToRelative(0.021f, -3.07f)
                curveToRelative(0.004f, -0.552f, -0.441f, -1.003f, -0.993f, -1.007f)
                curveToRelative(-0.552f, -0.004f, -1.003f, 0.441f, -1.007f, 0.993f)
                lineToRelative(-0.032f, 4.584f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-5.495f)
                reflectiveCurveToRelative(0.001f, 0.0f, 0.001f, 0.0f)
                verticalLineToRelative(-0.007f)
                curveToRelative(0.056f, -1.942f, 1.391f, -3.614f, 3.247f, -4.093f)
                lineToRelative(2.829f, -0.602f)
                curveToRelative(0.637f, -0.136f, 1.244f, -0.397f, 1.778f, -0.765f)
                curveToRelative(0.502f, -0.345f, 1.091f, -0.538f, 1.7f, -0.538f)
                horizontalLineToRelative(5.445f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _trust!!
    }

private var _trust: ImageVector? = null
