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

public val Icons.Outline.Hammer: ImageVector
    get() {
        if (_hammer != null) {
            return _hammer!!
        }
        _hammer = Builder(name = "Hammer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.141f, 9.794f)
                lineToRelative(-7.127f, -7.202f)
                curveTo(12.848f, -0.536f, 9.633f, -0.169f, 7.992f, 0.33f)
                curveToRelative(-0.688f, 0.21f, -1.201f, 0.751f, -1.371f, 1.447f)
                curveToRelative(-0.168f, 0.689f, 0.033f, 1.396f, 0.539f, 1.896f)
                lineToRelative(4.481f, 4.506f)
                lineTo(0.863f, 18.892f)
                curveToRelative(-1.161f, 1.178f, -1.149f, 3.08f, 0.026f, 4.241f)
                curveToRelative(0.565f, 0.56f, 1.313f, 0.867f, 2.108f, 0.867f)
                horizontalLineToRelative(0.018f)
                curveToRelative(0.802f, -0.005f, 1.554f, -0.321f, 2.11f, -0.886f)
                lineTo(15.872f, 12.433f)
                lineToRelative(2.285f, 2.298f)
                curveToRelative(0.567f, 0.572f, 1.323f, 0.887f, 2.129f, 0.887f)
                horizontalLineToRelative(0.005f)
                curveToRelative(0.807f, 0.0f, 1.563f, -0.318f, 2.129f, -0.892f)
                lineToRelative(0.713f, -0.721f)
                curveToRelative(1.144f, -1.156f, 1.148f, -3.044f, 0.008f, -4.211f)
                close()
                moveTo(8.575f, 2.243f)
                curveToRelative(0.474f, -0.145f, 1.026f, -0.248f, 1.634f, -0.248f)
                curveToRelative(1.29f, 0.0f, 2.829f, 0.468f, 4.391f, 2.011f)
                lineToRelative(4.964f, 5.017f)
                lineToRelative(-2.128f, 2.147f)
                lineTo(8.574f, 2.259f)
                verticalLineToRelative(-0.016f)
                close()
                moveTo(3.709f, 21.702f)
                curveToRelative(-0.188f, 0.19f, -0.438f, 0.296f, -0.704f, 0.298f)
                curveToRelative(-0.277f, -0.016f, -0.519f, -0.101f, -0.709f, -0.29f)
                curveToRelative(-0.393f, -0.387f, -0.396f, -1.021f, -0.016f, -1.407f)
                lineTo(13.052f, 9.597f)
                lineToRelative(1.41f, 1.418f)
                lineTo(3.709f, 21.702f)
                close()
                moveTo(21.711f, 12.599f)
                lineToRelative(-0.714f, 0.722f)
                curveToRelative(-0.188f, 0.191f, -0.44f, 0.297f, -0.709f, 0.297f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.269f, 0.0f, -0.521f, -0.104f, -0.71f, -0.296f)
                lineToRelative(-0.73f, -0.734f)
                lineToRelative(2.125f, -2.143f)
                lineToRelative(0.744f, 0.752f)
                curveToRelative(0.379f, 0.388f, 0.377f, 1.017f, -0.004f, 1.402f)
                close()
            }
        }
        .build()
        return _hammer!!
    }

private var _hammer: ImageVector? = null
