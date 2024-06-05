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

public val Icons.Bold.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) {
            return _cloudRain!!
        }
        _cloudRain = Builder(name = "CloudRain", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 18.63f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.064f, -2.556f)
                curveToRelative(2.809f, -2.6f, 1.562f, -7.521f, -2.214f, -8.21f)
                arcToRelative(3.417f, 3.417f, 0.0f, false, true, -2.447f, -1.9f)
                arcTo(5.183f, 5.183f, 0.0f, false, false, 4.984f, 7.285f)
                arcTo(5.317f, 5.317f, 0.0f, false, false, 5.0f, 9.173f)
                arcToRelative(3.417f, 3.417f, 0.0f, false, true, -1.088f, 3.144f)
                arcToRelative(2.749f, 2.749f, 0.0f, false, false, -0.255f, 3.822f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.323f, 1.9f)
                arcTo(5.766f, 5.766f, 0.0f, false, true, 1.9f, 10.1f)
                arcToRelative(0.433f, 0.433f, 0.0f, false, false, 0.161f, -0.353f)
                arcToRelative(8.289f, 8.289f, 0.0f, false, true, -0.034f, -2.952f)
                arcTo(8.128f, 8.128f, 0.0f, false, true, 8.558f, 0.14f)
                arcToRelative(8.241f, 8.241f, 0.0f, false, true, 8.929f, 4.54f)
                arcToRelative(0.437f, 0.437f, 0.0f, false, false, 0.322f, 0.242f)
                curveToRelative(6.1f, 1.134f, 8.255f, 9.008f, 3.755f, 13.265f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.5f, 18.63f)
                close()
                moveTo(9.268f, 23.268f)
                curveToRelative(1.624f, -1.463f, 0.078f, -3.935f, -0.825f, -4.891f)
                arcToRelative(1.365f, 1.365f, 0.0f, false, false, -1.92f, 0.036f)
                arcTo(6.176f, 6.176f, 0.0f, false, false, 5.0f, 21.5f)
                arcTo(2.513f, 2.513f, 0.0f, false, false, 7.5f, 24.0f)
                arcTo(2.486f, 2.486f, 0.0f, false, false, 9.268f, 23.268f)
                close()
                moveTo(17.268f, 23.268f)
                curveToRelative(1.624f, -1.463f, 0.078f, -3.935f, -0.825f, -4.891f)
                arcToRelative(1.365f, 1.365f, 0.0f, false, false, -1.92f, 0.036f)
                arcTo(6.176f, 6.176f, 0.0f, false, false, 13.0f, 21.5f)
                arcTo(2.513f, 2.513f, 0.0f, false, false, 15.5f, 24.0f)
                arcTo(2.486f, 2.486f, 0.0f, false, false, 17.268f, 23.268f)
                close()
                moveTo(13.268f, 16.268f)
                curveToRelative(1.624f, -1.463f, 0.078f, -3.935f, -0.825f, -4.891f)
                arcToRelative(1.365f, 1.365f, 0.0f, false, false, -1.92f, 0.036f)
                arcTo(6.176f, 6.176f, 0.0f, false, false, 9.0f, 14.5f)
                arcTo(2.513f, 2.513f, 0.0f, false, false, 11.5f, 17.0f)
                arcTo(2.486f, 2.486f, 0.0f, false, false, 13.268f, 16.268f)
                close()
            }
        }
        .build()
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
