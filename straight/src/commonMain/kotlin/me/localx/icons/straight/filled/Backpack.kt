package me.localx.icons.straight.filled

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
import me.localx.icons.straight.Icons

public val Icons.Filled.Backpack: ImageVector
    get() {
        if (_backpack != null) {
            return _backpack!!
        }
        _backpack = Builder(name = "Backpack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 13.0f)
                    verticalLineTo(19.0f)
                    curveTo(23.9987f, 19.9718f, 23.7143f, 20.9221f, 23.1815f, 21.7348f)
                    curveTo(22.6487f, 22.5475f, 21.8906f, 23.1873f, 21.0f, 23.576f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(24.0f)
                    close()
                    moveTo(19.0f, 11.0f)
                    verticalLineTo(17.356f)
                    curveTo(18.1587f, 16.3084f, 17.093f, 15.4631f, 15.8815f, 14.8822f)
                    curveTo(14.67f, 14.3013f, 13.3436f, 13.9998f, 12.0f, 13.9998f)
                    curveTo(10.6564f, 13.9998f, 9.33f, 14.3013f, 8.1185f, 14.8822f)
                    curveTo(6.907f, 15.4631f, 5.8413f, 16.3084f, 5.0f, 17.356f)
                    verticalLineTo(11.0f)
                    curveTo(5.0007f, 9.8729f, 5.2739f, 8.7627f, 5.7962f, 7.7639f)
                    curveTo(6.3186f, 6.7652f, 7.0747f, 5.9075f, 8.0f, 5.264f)
                    verticalLineTo(4.0f)
                    curveTo(8.0f, 2.9391f, 8.4214f, 1.9217f, 9.1716f, 1.1716f)
                    curveTo(9.9217f, 0.4214f, 10.9391f, 0.0f, 12.0f, 0.0f)
                    curveTo(13.0609f, 0.0f, 14.0783f, 0.4214f, 14.8284f, 1.1716f)
                    curveTo(15.5786f, 1.9217f, 16.0f, 2.9391f, 16.0f, 4.0f)
                    verticalLineTo(5.264f)
                    curveTo(16.9253f, 5.9075f, 17.6814f, 6.7652f, 18.2038f, 7.7639f)
                    curveTo(18.7261f, 8.7627f, 18.9993f, 9.8729f, 19.0f, 11.0f)
                    close()
                    moveTo(10.0f, 4.3f)
                    curveTo(11.3043f, 3.9067f, 12.6957f, 3.9067f, 14.0f, 4.3f)
                    verticalLineTo(4.0f)
                    curveTo(14.0f, 3.4696f, 13.7893f, 2.9609f, 13.4142f, 2.5858f)
                    curveTo(13.0391f, 2.2107f, 12.5304f, 2.0f, 12.0f, 2.0f)
                    curveTo(11.4696f, 2.0f, 10.9609f, 2.2107f, 10.5858f, 2.5858f)
                    curveTo(10.2107f, 2.9609f, 10.0f, 3.4696f, 10.0f, 4.0f)
                    verticalLineTo(4.3f)
                    close()
                    moveTo(15.0f, 9.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(9.0f)
                    close()
                    moveTo(0.0f, 19.0f)
                    curveTo(0.0013f, 19.9718f, 0.2857f, 20.9221f, 0.8185f, 21.7348f)
                    curveTo(1.3513f, 22.5475f, 2.1094f, 23.1873f, 3.0f, 23.576f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(19.0f)
                    close()
                    moveTo(12.0f, 16.0f)
                    curveTo(10.1441f, 16.0021f, 8.3649f, 16.7403f, 7.0526f, 18.0526f)
                    curveTo(5.7403f, 19.3649f, 5.0021f, 21.1441f, 5.0f, 23.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(23.0f)
                    curveTo(18.9979f, 21.1441f, 18.2597f, 19.3649f, 16.9474f, 18.0526f)
                    curveTo(15.6351f, 16.7403f, 13.8559f, 16.0021f, 12.0f, 16.0f)
                    close()
                }
            }
        }
        .build()
        return _backpack!!
    }

private var _backpack: ImageVector? = null
