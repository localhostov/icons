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

public val Icons.Filled.Shuttlecock: ImageVector
    get() {
        if (_shuttlecock != null) {
            return _shuttlecock!!
        }
        _shuttlecock = Builder(name = "Shuttlecock", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.447f, 21.5f)
                lineTo(5.975f, 22.975f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -4.95f, -4.95f)
                lineTo(2.5f, 16.553f)
                close()
                moveTo(24.0f, 12.125f)
                arcToRelative(2.77f, 2.77f, 0.0f, false, true, -0.959f, 1.985f)
                arcTo(34.193f, 34.193f, 0.0f, false, true, 9.648f, 20.875f)
                lineTo(3.125f, 14.352f)
                arcTo(34.193f, 34.193f, 0.0f, false, true, 9.89f, 0.961f)
                arcTo(2.772f, 2.772f, 0.0f, false, true, 11.875f, 0.0f)
                arcToRelative(2.742f, 2.742f, 0.0f, false, true, 2.036f, 0.785f)
                arcToRelative(3.213f, 3.213f, 0.0f, false, true, 0.821f, 1.406f)
                arcToRelative(3.261f, 3.261f, 0.0f, false, true, 3.285f, 0.741f)
                arcToRelative(3.135f, 3.135f, 0.0f, false, true, 0.93f, 2.117f)
                arcToRelative(3.166f, 3.166f, 0.0f, false, true, 2.105f, 0.878f)
                lineToRelative(0.036f, 0.035f)
                arcToRelative(3.189f, 3.189f, 0.0f, false, true, 0.755f, 3.3f)
                arcToRelative(3.252f, 3.252f, 0.0f, false, true, 1.354f, 0.81f)
                arcTo(2.759f, 2.759f, 0.0f, false, true, 24.0f, 12.125f)
                close()
                moveTo(7.7f, 10.193f)
                curveToRelative(0.729f, -1.018f, 2.91f, -4.023f, 4.728f, -6.12f)
                curveToRelative(0.029f, -0.039f, 0.157f, -0.179f, 0.18f, -0.206f)
                arcToRelative(1.272f, 1.272f, 0.0f, false, false, -0.093f, -1.649f)
                arcToRelative(0.756f, 0.756f, 0.0f, false, false, -1.105f, 0.045f)
                arcTo(29.994f, 29.994f, 0.0f, false, false, 6.947f, 9.441f)
                close()
                moveTo(10.048f, 12.54f)
                lineTo(16.584f, 6.0f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, 0.365f, -0.837f)
                arcToRelative(1.152f, 1.152f, 0.0f, false, false, -0.346f, -0.817f)
                arcToRelative(1.212f, 1.212f, 0.0f, false, false, -1.676f, 0.0f)
                curveToRelative(-0.055f, 0.055f, -0.873f, 0.9f, -0.9f, 0.932f)
                curveToRelative(-1.962f, 2.245f, -4.52f, 5.821f, -4.894f, 6.348f)
                close()
                moveTo(12.356f, 14.848f)
                curveToRelative(0.52f, -0.37f, 4.018f, -2.872f, 6.267f, -4.825f)
                lineToRelative(0.007f, -0.007f)
                curveToRelative(0.09f, -0.09f, 0.824f, -0.741f, 1.046f, -0.962f)
                arcTo(1.186f, 1.186f, 0.0f, false, false, 19.693f, 7.4f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.213f, 1.213f, 0.0f, false, false, -1.675f, 0.0f)
                lineTo(11.46f, 13.954f)
                close()
                moveTo(21.792f, 11.5f)
                arcToRelative(1.327f, 1.327f, 0.0f, false, false, -0.9f, -0.386f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, -0.7f, 0.194f)
                curveToRelative(-2.1f, 1.862f, -5.339f, 4.214f, -6.4f, 4.977f)
                lineToRelative(0.771f, 0.771f)
                arcToRelative(29.969f, 29.969f, 0.0f, false, false, 7.177f, -4.461f)
                arcTo(0.754f, 0.754f, 0.0f, false, false, 22.0f, 12.043f)
                arcTo(0.73f, 0.73f, 0.0f, false, false, 21.792f, 11.5f)
                close()
            }
        }
        .build()
        return _shuttlecock!!
    }

private var _shuttlecock: ImageVector? = null
