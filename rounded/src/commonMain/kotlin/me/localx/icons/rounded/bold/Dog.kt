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

public val Icons.Bold.Dog: ImageVector
    get() {
        if (_dog != null) {
            return _dog!!
        }
        _dog = Builder(name = "Dog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.135f, 5.805f)
                curveToRelative(-0.821f, -0.798f, -1.864f, -0.818f, -2.017f, -0.805f)
                curveToRelative(-0.118f, 0.0f, -0.224f, -0.065f, -0.277f, -0.171f)
                curveToRelative(-0.564f, -1.128f, -1.698f, -1.829f, -2.959f, -1.829f)
                horizontalLineToRelative(-0.882f)
                lineTo(17.0f, 0.77f)
                curveToRelative(0.0f, -0.525f, -0.522f, -0.904f, -1.015f, -0.726f)
                curveToRelative(-1.157f, 0.416f, -1.985f, 1.523f, -1.985f, 2.824f)
                verticalLineToRelative(0.934f)
                curveToRelative(-0.034f, 0.064f, -1.55f, 4.197f, -1.55f, 4.197f)
                horizontalLineToRelative(-4.949f)
                curveToRelative(-1.433f, 0.0f, -2.777f, 0.552f, -3.806f, 1.543f)
                curveToRelative(-0.364f, -0.468f, -0.695f, -1.131f, -0.695f, -2.042f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                curveToRelative(0.0f, 2.395f, 1.2f, 3.926f, 2.153f, 4.766f)
                curveToRelative(-0.092f, 0.402f, -0.152f, 0.812f, -0.152f, 1.234f)
                lineToRelative(0.002f, 8.001f)
                curveToRelative(0.0f, 1.377f, 1.123f, 2.498f, 2.5f, 2.498f)
                reflectiveCurveToRelative(2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-4.314f)
                lineToRelative(1.06f, -4.221f)
                curveToRelative(2.216f, -0.278f, 3.937f, -2.174f, 3.937f, -4.465f)
                verticalLineToRelative(-0.474f)
                curveToRelative(0.0f, -1.14f, -0.471f, -1.837f, -0.865f, -2.221f)
                close()
                moveTo(21.0f, 8.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.615f)
                curveToRelative(-0.688f, 0.0f, -1.288f, 0.468f, -1.455f, 1.135f)
                lineToRelative(-1.261f, 5.021f)
                curveToRelative(-0.201f, -0.099f, -0.426f, -0.155f, -0.666f, -0.155f)
                lineTo(5.503f, 16.001f)
                curveToRelative(-0.176f, 0.0f, -0.345f, 0.03f, -0.502f, 0.086f)
                verticalLineToRelative(-2.586f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(6.002f)
                curveToRelative(0.632f, 0.0f, 1.196f, -0.396f, 1.411f, -0.991f)
                lineToRelative(1.446f, -4.008f)
                horizontalLineToRelative(1.521f)
                curveToRelative(0.121f, 0.0f, 0.227f, 0.072f, 0.281f, 0.18f)
                curveToRelative(0.549f, 1.09f, 1.631f, 1.779f, 2.837f, 1.821f)
                curveToRelative(0.0f, 0.008f, 0.0f, 0.5f, 0.0f, 0.5f)
                close()
            }
        }
        .build()
        return _dog!!
    }

private var _dog: ImageVector? = null
