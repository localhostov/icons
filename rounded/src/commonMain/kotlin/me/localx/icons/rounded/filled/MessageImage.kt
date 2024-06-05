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

public val Icons.Filled.MessageImage: ImageVector
    get() {
        if (_messageImage != null) {
            return _messageImage!!
        }
        _messageImage = Builder(name = "MessageImage", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.61f, 9.976f)
                curveToRelative(1.276f, -1.277f, 3.503f, -1.277f, 4.779f, 0.0f)
                lineToRelative(0.635f, 0.635f)
                curveToRelative(0.537f, 0.537f, 1.414f, 0.537f, 1.951f, 0.0f)
                lineToRelative(7.833f, -7.833f)
                curveToRelative(-0.518f, -1.61f, -2.029f, -2.777f, -3.809f, -2.777f)
                lineTo(4.0f, 0.001f)
                curveTo(1.794f, 0.0f, 0.0f, 1.794f, 0.0f, 4.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.741f, 0.203f, 1.435f, 0.555f, 2.031f)
                lineToRelative(8.055f, -8.055f)
                close()
                moveTo(6.5f, 5.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(24.0f, 5.414f)
                verticalLineToRelative(10.586f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-2.853f)
                lineToRelative(-3.846f, 3.18f)
                curveToRelative(-0.362f, 0.322f, -0.825f, 0.485f, -1.292f, 0.485f)
                curveToRelative(-0.476f, 0.0f, -0.956f, -0.169f, -1.338f, -0.509f)
                lineToRelative(-3.748f, -3.156f)
                horizontalLineToRelative(-2.923f)
                curveToRelative(-0.741f, 0.0f, -1.435f, -0.203f, -2.031f, -0.555f)
                lineToRelative(8.056f, -8.055f)
                curveToRelative(0.521f, -0.521f, 1.429f, -0.521f, 1.951f, 0.0f)
                lineToRelative(0.635f, 0.635f)
                curveToRelative(1.318f, 1.318f, 3.461f, 1.318f, 4.779f, 0.0f)
                lineToRelative(6.61f, -6.61f)
                close()
            }
        }
        .build()
        return _messageImage!!
    }

private var _messageImage: ImageVector? = null
