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

public val Icons.Bold.Banana: ImageVector
    get() {
        if (_banana != null) {
            return _banana!!
        }
        _banana = Builder(name = "Banana", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.91f, 15.047f)
                curveToRelative(-0.833f, -1.574f, -2.305f, -2.94f, -3.911f, -3.747f)
                curveTo(19.986f, 6.398f, 19.474f, 0.023f, 15.451f, 0.009f)
                horizontalLineToRelative(-0.016f)
                curveTo(12.094f, 0.009f, 10.859f, 3.905f, 10.255f, 8.259f)
                curveToRelative(-0.211f, -0.053f, -0.435f, -0.103f, -0.688f, -0.146f)
                curveToRelative(-1.842f, -0.311f, -3.701f, 0.016f, -5.311f, 0.923f)
                curveToRelative(-0.426f, 0.24f, -0.637f, 0.737f, -0.491f, 1.204f)
                curveToRelative(0.14f, 0.446f, 0.565f, 0.726f, 1.032f, 0.709f)
                curveToRelative(2.245f, -0.08f, 3.739f, 0.435f, 4.777f, 1.113f)
                curveToRelative(-0.53f, 1.465f, -1.684f, 3.522f, -4.167f, 4.765f)
                curveToRelative(-2.229f, 0.961f, -3.206f, 2.376f, -3.604f, 3.173f)
                horizontalLineToRelative(-0.302f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.393f)
                curveToRelative(0.585f, 0.661f, 1.791f, 1.0f, 3.607f, 1.0f)
                curveToRelative(3.77f, 0.0f, 6.545f, -0.885f, 8.587f, -2.131f)
                curveToRelative(0.636f, -0.388f, 0.955f, -1.167f, 0.739f, -1.88f)
                curveToRelative(-0.01f, -0.033f, -0.02f, -0.066f, -0.031f, -0.099f)
                curveToRelative(-0.282f, -0.875f, -1.334f, -1.169f, -2.109f, -0.674f)
                curveToRelative(-1.845f, 1.179f, -4.238f, 1.783f, -7.186f, 1.783f)
                curveToRelative(-0.314f, 0.0f, -0.573f, -0.013f, -0.784f, -0.03f)
                curveToRelative(0.3f, -0.395f, 0.881f, -0.959f, 1.955f, -1.423f)
                curveToRelative(2.682f, -1.341f, 4.227f, -3.343f, 5.122f, -5.112f)
                curveToRelative(2.381f, 1.18f, 4.523f, 2.337f, 5.218f, 6.068f)
                curveToRelative(0.069f, 0.37f, 0.33f, 0.676f, 0.692f, 0.776f)
                curveToRelative(0.481f, 0.134f, 0.975f, -0.128f, 1.162f, -0.591f)
                curveToRelative(0.77f, -1.903f, 0.985f, -3.909f, 0.516f, -5.678f)
                curveToRelative(0.009f, -0.03f, 0.017f, -0.058f, 0.026f, -0.087f)
                curveToRelative(0.913f, 0.165f, 2.134f, 0.771f, 3.147f, 1.384f)
                curveToRelative(0.317f, 0.192f, 0.713f, 0.204f, 1.026f, 0.005f)
                curveToRelative(0.423f, -0.269f, 0.565f, -0.821f, 0.331f, -1.265f)
                close()
                moveTo(13.051f, 10.128f)
                curveToRelative(0.743f, -6.747f, 2.112f, -7.119f, 2.388f, -7.119f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.016f, 0.0f, 1.561f, 0.504f, 1.561f, 8.485f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.006f, 0.0f, 0.006f)
                curveToRelative(0.0f, 0.002f, -0.499f, 0.991f, -1.791f, 0.998f)
                curveToRelative(-0.617f, -0.039f, -2.014f, -0.356f, -2.158f, -2.371f)
                close()
            }
        }
        .build()
        return _banana!!
    }

private var _banana: ImageVector? = null
