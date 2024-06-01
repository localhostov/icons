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

public val Icons.Filled.Cream: ImageVector
    get() {
        if (_cream != null) {
            return _cream!!
        }
        _cream = Builder(name = "Cream", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0f, 24.0002f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6744f, 23.9986f, 2.4036f, 23.4713f, 1.4662f, 22.534f)
                    curveTo(0.5289f, 21.5966f, 0.0016f, 20.3258f, 0.0f, 19.0002f)
                    lineTo(0.0f, 17.0002f)
                    curveTo(0.0f, 16.2045f, 0.3161f, 15.4415f, 0.8787f, 14.8789f)
                    curveTo(1.4413f, 14.3162f, 2.2043f, 14.0002f, 3.0f, 14.0002f)
                    horizontalLineTo(21.0f)
                    curveTo(21.7956f, 14.0002f, 22.5587f, 14.3162f, 23.1213f, 14.8789f)
                    curveTo(23.6839f, 15.4415f, 24.0f, 16.2045f, 24.0f, 17.0002f)
                    verticalLineTo(19.0002f)
                    curveTo(23.9984f, 20.3258f, 23.4711f, 21.5966f, 22.5338f, 22.534f)
                    curveTo(21.5964f, 23.4713f, 20.3256f, 23.9986f, 19.0f, 24.0002f)
                    close()
                    moveTo(22.0f, 12.0002f)
                    verticalLineTo(10.0002f)
                    curveTo(22.0f, 9.4698f, 21.7893f, 8.961f, 21.4142f, 8.586f)
                    curveTo(21.0391f, 8.2109f, 20.5304f, 8.0002f, 20.0f, 8.0002f)
                    horizontalLineTo(4.0f)
                    curveTo(3.4696f, 8.0002f, 2.9609f, 8.2109f, 2.5858f, 8.586f)
                    curveTo(2.2107f, 8.961f, 2.0f, 9.4698f, 2.0f, 10.0002f)
                    verticalLineTo(12.0002f)
                    horizontalLineTo(22.0f)
                    close()
                    moveTo(18.961f, 6.0002f)
                    curveTo(18.8623f, 4.0348f, 18.3069f, 2.1195f, 17.339f, 0.4062f)
                    curveTo(17.2378f, 0.2688f, 17.1029f, 0.1597f, 16.9474f, 0.0895f)
                    curveTo(16.7918f, 0.0193f, 16.6208f, -0.0096f, 16.4508f, 0.0055f)
                    curveTo(16.2808f, 0.0205f, 16.1176f, 0.0791f, 15.9768f, 0.1756f)
                    curveTo(15.836f, 0.272f, 15.7224f, 0.4031f, 15.647f, 0.5562f)
                    curveTo(15.35f, 1.288f, 14.8398f, 1.9137f, 14.1826f, 2.3518f)
                    curveTo(13.5255f, 2.79f, 12.7518f, 3.0204f, 11.962f, 3.0132f)
                    horizontalLineTo(10.0f)
                    curveTo(9.0134f, 2.9383f, 8.0296f, 3.1902f, 7.2004f, 3.73f)
                    curveTo(6.3712f, 4.2699f, 5.7427f, 5.0676f, 5.412f, 6.0002f)
                    horizontalLineTo(18.961f)
                    close()
                }
            }
        }
        .build()
        return _cream!!
    }

private var _cream: ImageVector? = null
