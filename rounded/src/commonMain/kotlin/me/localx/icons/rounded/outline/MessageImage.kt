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

public val Icons.Outline.MessageImage: ImageVector
    get() {
        if (_messageImage != null) {
            return _messageImage!!
        }
        _messageImage = Builder(name = "MessageImage", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 6.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 4.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-2.853f)
                lineToRelative(-3.846f, 3.18f)
                curveToRelative(-0.362f, 0.322f, -0.825f, 0.485f, -1.292f, 0.485f)
                curveToRelative(-0.476f, 0.0f, -0.956f, -0.169f, -1.338f, -0.509f)
                lineToRelative(-3.748f, -3.156f)
                horizontalLineToRelative(-2.923f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                lineTo(-0.0f, 4.0f)
                curveTo(0.0f, 1.794f, 1.794f, 0.0f, 4.0f, 0.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                close()
                moveTo(2.0f, 16.0f)
                curveToRelative(0.0f, 0.179f, 0.024f, 0.352f, 0.068f, 0.518f)
                lineToRelative(6.542f, -6.542f)
                curveToRelative(1.276f, -1.277f, 3.503f, -1.277f, 4.779f, 0.0f)
                lineToRelative(0.635f, 0.635f)
                curveToRelative(0.537f, 0.537f, 1.414f, 0.537f, 1.951f, 0.0f)
                lineToRelative(6.024f, -6.024f)
                verticalLineToRelative(-0.586f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                lineTo(4.0f, 2.001f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(22.0f, 16.0f)
                lineTo(22.0f, 7.414f)
                lineToRelative(-4.61f, 4.61f)
                curveToRelative(-1.277f, 1.277f, -3.502f, 1.277f, -4.779f, 0.0f)
                lineToRelative(-0.635f, -0.635f)
                curveToRelative(-0.521f, -0.521f, -1.43f, -0.521f, -1.951f, 0.0f)
                lineToRelative(-6.542f, 6.542f)
                curveToRelative(0.165f, 0.044f, 0.339f, 0.068f, 0.518f, 0.068f)
                horizontalLineToRelative(3.289f)
                curveToRelative(0.236f, 0.0f, 0.464f, 0.083f, 0.644f, 0.235f)
                lineToRelative(4.047f, 3.409f)
                lineToRelative(4.172f, -3.415f)
                curveToRelative(0.179f, -0.148f, 0.404f, -0.229f, 0.637f, -0.229f)
                horizontalLineToRelative(3.212f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _messageImage!!
    }

private var _messageImage: ImageVector? = null
