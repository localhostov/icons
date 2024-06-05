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

public val Icons.Bold.Handshake: ImageVector
    get() {
        if (_handshake != null) {
            return _handshake!!
        }
        _handshake = Builder(name = "Handshake", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 14.0f)
                horizontalLineToRelative(-0.188f)
                curveToRelative(-0.194f, 0.0f, -0.388f, 0.011f, -0.58f, 0.032f)
                lineTo(12.91f, 7.295f)
                curveToRelative(-0.4f, -0.305f, -0.911f, -0.381f, -1.37f, -0.235f)
                lineToRelative(2.821f, -2.386f)
                curveToRelative(0.741f, -0.697f, 1.902f, -0.867f, 2.808f, -0.412f)
                lineToRelative(2.104f, 1.051f)
                curveToRelative(0.898f, 0.45f, 1.903f, 0.688f, 2.908f, 0.688f)
                horizontalLineToRelative(0.319f)
                curveToRelative(1.972f, -0.034f, 1.971f, -2.966f, 0.0f, -3.0f)
                horizontalLineToRelative(-0.319f)
                curveToRelative(-0.541f, 0.0f, -1.082f, -0.128f, -1.565f, -0.37f)
                lineToRelative(-2.104f, -1.051f)
                curveToRelative(-2.005f, -1.004f, -4.605f, -0.599f, -6.146f, 0.857f)
                lineToRelative(-0.358f, 0.302f)
                lineToRelative(-0.341f, -0.311f)
                curveToRelative(-1.607f, -1.506f, -4.199f, -1.866f, -6.177f, -0.85f)
                lineToRelative(-2.105f, 1.053f)
                curveToRelative(-0.482f, 0.241f, -1.023f, 0.369f, -1.564f, 0.369f)
                horizontalLineToRelative(-0.319f)
                curveToRelative(-1.972f, 0.034f, -1.971f, 2.966f, 0.0f, 3.0f)
                horizontalLineToRelative(0.319f)
                curveToRelative(1.005f, 0.0f, 2.01f, -0.237f, 2.907f, -0.687f)
                lineToRelative(2.105f, -1.053f)
                curveToRelative(0.843f, -0.422f, 2.046f, -0.313f, 2.813f, 0.385f)
                lineToRelative(0.051f, 0.046f)
                reflectiveCurveToRelative(-3.758f, 3.177f, -3.788f, 3.208f)
                curveToRelative(-1.044f, 1.046f, -1.202f, 2.706f, -0.369f, 3.864f)
                curveToRelative(0.511f, 0.71f, 1.301f, 1.157f, 2.167f, 1.227f)
                curveToRelative(0.837f, 0.069f, 1.669f, -0.227f, 2.279f, -0.809f)
                lineToRelative(2.067f, -1.767f)
                lineToRelative(6.539f, 4.994f)
                lineToRelative(-5.971f, 4.388f)
                curveToRelative(-0.371f, 0.273f, -0.871f, 0.273f, -1.242f, 0.0f)
                lineToRelative(-6.434f, -4.728f)
                curveToRelative(-0.938f, -0.689f, -2.094f, -1.069f, -3.257f, -1.069f)
                horizontalLineToRelative(-0.188f)
                curveToRelative(-1.972f, 0.034f, -1.971f, 2.966f, 0.0f, 3.0f)
                horizontalLineToRelative(0.188f)
                curveToRelative(0.528f, 0.0f, 1.054f, 0.173f, 1.479f, 0.486f)
                lineToRelative(6.434f, 4.729f)
                curveToRelative(1.435f, 1.053f, 3.362f, 1.053f, 4.797f, 0.0f)
                lineToRelative(6.434f, -4.729f)
                curveToRelative(0.426f, -0.312f, 0.951f, -0.485f, 1.479f, -0.485f)
                horizontalLineToRelative(0.188f)
                curveToRelative(1.972f, -0.034f, 1.971f, -2.966f, 0.0f, -3.0f)
                close()
            }
        }
        .build()
        return _handshake!!
    }

private var _handshake: ImageVector? = null
