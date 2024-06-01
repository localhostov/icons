package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Disk: ImageVector
    get() {
        if (_disk != null) {
            return _disk!!
        }
        _disk = Builder(name = "Disk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.682f, 4.3327f)
                    lineTo(19.667f, 1.3187f)
                    curveTo(18.8253f, 0.4713f, 17.6793f, -0.0037f, 16.485f, -3.0E-4f)
                    horizontalLineTo(4.5f)
                    curveTo(2.0159f, 0.0024f, 0.0028f, 2.0155f, 0.0f, 4.4997f)
                    verticalLineTo(19.4997f)
                    curveTo(0.0028f, 21.9838f, 2.0159f, 23.9969f, 4.5f, 23.9997f)
                    horizontalLineTo(19.5f)
                    curveTo(21.9841f, 23.9969f, 23.9972f, 21.9838f, 24.0f, 19.4997f)
                    verticalLineTo(7.5146f)
                    curveTo(24.0034f, 6.3205f, 23.5288f, 5.1747f, 22.682f, 4.3327f)
                    close()
                    moveTo(21.0f, 19.4997f)
                    curveTo(21.0f, 20.3281f, 20.3284f, 20.9997f, 19.5f, 20.9997f)
                    horizontalLineTo(4.5f)
                    curveTo(3.6716f, 20.9997f, 3.0f, 20.3281f, 3.0f, 19.4997f)
                    verticalLineTo(4.4997f)
                    curveTo(3.0f, 3.6712f, 3.6716f, 2.9997f, 4.5f, 2.9997f)
                    horizontalLineTo(6.0f)
                    curveTo(6.0f, 5.2088f, 7.7909f, 6.9996f, 10.0f, 6.9996f)
                    horizontalLineTo(13.0f)
                    curveTo(15.1698f, 6.9953f, 16.9405f, 5.2619f, 16.991f, 3.0926f)
                    curveTo(17.1991f, 3.1653f, 17.3884f, 3.2835f, 17.545f, 3.4386f)
                    lineTo(20.561f, 6.4546f)
                    curveTo(20.8429f, 6.7352f, 21.001f, 7.1169f, 21.0f, 7.5146f)
                    verticalLineTo(19.4997f)
                    horizontalLineTo(21.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 18.0f)
                    curveTo(14.2091f, 18.0f, 16.0f, 16.2091f, 16.0f, 14.0f)
                    curveTo(16.0f, 11.7909f, 14.2091f, 10.0f, 12.0f, 10.0f)
                    curveTo(9.7908f, 10.0f, 8.0f, 11.7909f, 8.0f, 14.0f)
                    curveTo(8.0f, 16.2091f, 9.7908f, 18.0f, 12.0f, 18.0f)
                    close()
                }
            }
        }
        .build()
        return _disk!!
    }

private var _disk: ImageVector? = null
