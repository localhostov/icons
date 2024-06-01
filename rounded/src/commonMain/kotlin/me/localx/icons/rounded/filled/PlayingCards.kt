package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.PlayingCards: ImageVector
    get() {
        if (_playingCards != null) {
            return _playingCards!!
        }
        _playingCards = Builder(name = "PlayingCards", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.8f, 8.1556f)
                    lineTo(20.387f, 18.5556f)
                    curveTo(20.1717f, 19.2789f, 19.7938f, 19.9433f, 19.2821f, 20.4979f)
                    curveTo(18.7704f, 21.0526f, 18.1386f, 21.4828f, 17.435f, 21.7556f)
                    curveTo(17.8087f, 20.8849f, 18.001f, 19.9471f, 18.0f, 18.9996f)
                    verticalLineTo(8.9996f)
                    curveTo(17.9979f, 7.1437f, 17.2597f, 5.3645f, 15.9474f, 4.0522f)
                    curveTo(14.6351f, 2.7399f, 12.8559f, 2.0017f, 11.0f, 1.9996f)
                    horizontalLineTo(9.335f)
                    curveTo(9.9525f, 1.1827f, 10.8052f, 0.5744f, 11.7786f, 0.2564f)
                    curveTo(12.7519f, -0.0616f, 13.7993f, -0.0741f, 14.78f, 0.2206f)
                    lineTo(20.466f, 1.9666f)
                    curveTo(21.7212f, 2.3565f, 22.7735f, 3.2231f, 23.3968f, 4.3803f)
                    curveTo(24.0202f, 5.5374f, 24.1649f, 6.8929f, 23.8f, 8.1556f)
                    close()
                    moveTo(16.0f, 8.9996f)
                    verticalLineTo(18.9996f)
                    curveTo(15.9984f, 20.3252f, 15.4711f, 21.596f, 14.5338f, 22.5334f)
                    curveTo(13.5964f, 23.4707f, 12.3256f, 23.998f, 11.0f, 23.9996f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6744f, 23.998f, 2.4036f, 23.4707f, 1.4662f, 22.5334f)
                    curveTo(0.5289f, 21.596f, 0.0016f, 20.3252f, 0.0f, 18.9996f)
                    lineTo(0.0f, 8.9996f)
                    curveTo(0.0016f, 7.674f, 0.5289f, 6.4032f, 1.4662f, 5.4658f)
                    curveTo(2.4036f, 4.5285f, 3.6744f, 4.0012f, 5.0f, 3.9996f)
                    horizontalLineTo(11.0f)
                    curveTo(12.3256f, 4.0012f, 13.5964f, 4.5285f, 14.5338f, 5.4658f)
                    curveTo(15.4711f, 6.4032f, 15.9984f, 7.674f, 16.0f, 8.9996f)
                    close()
                    moveTo(12.0f, 12.9996f)
                    curveTo(12.0f, 12.4692f, 11.7893f, 11.9605f, 11.4142f, 11.5854f)
                    curveTo(11.0391f, 11.2103f, 10.5304f, 10.9996f, 10.0f, 10.9996f)
                    curveTo(9.4696f, 10.9996f, 8.9609f, 11.2103f, 8.5858f, 11.5854f)
                    curveTo(8.2107f, 11.9605f, 8.0f, 12.4692f, 8.0f, 12.9996f)
                    curveTo(8.0f, 12.4692f, 7.7893f, 11.9605f, 7.4142f, 11.5854f)
                    curveTo(7.0391f, 11.2103f, 6.5304f, 10.9996f, 6.0f, 10.9996f)
                    curveTo(5.4696f, 10.9996f, 4.9609f, 11.2103f, 4.5858f, 11.5854f)
                    curveTo(4.2107f, 11.9605f, 4.0f, 12.4692f, 4.0f, 12.9996f)
                    curveTo(4.0f, 14.4496f, 5.544f, 16.3906f, 6.714f, 17.3776f)
                    curveTo(7.0735f, 17.6817f, 7.5291f, 17.8486f, 8.0f, 17.8486f)
                    curveTo(8.4709f, 17.8486f, 8.9265f, 17.6817f, 9.286f, 17.3776f)
                    curveTo(10.456f, 16.3906f, 12.0f, 14.4496f, 12.0f, 12.9996f)
                    close()
                }
            }
        }
        .build()
        return _playingCards!!
    }

private var _playingCards: ImageVector? = null
