package me.localx.icons.rounded.bold

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

public val Icons.Bold.Ban: ImageVector
    get() {
        if (_ban != null) {
            return _ban!!
        }
        _ban = Builder(name = "Ban", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 0.0f)
                    curveTo(5.3726f, 0.0f, 0.0f, 5.3726f, 0.0f, 12.0f)
                    curveTo(0.0f, 18.6274f, 5.3726f, 24.0f, 12.0f, 24.0f)
                    curveTo(18.6274f, 24.0f, 24.0f, 18.6274f, 24.0f, 12.0f)
                    curveTo(23.9928f, 5.3755f, 18.6245f, 0.0072f, 12.0f, 0.0f)
                    close()
                    moveTo(12.0f, 3.0f)
                    curveTo(13.8676f, 3.0002f, 15.6884f, 3.5849f, 17.207f, 4.672f)
                    lineTo(4.672f, 17.206f)
                    curveTo(1.789f, 13.1664f, 2.7267f, 7.5546f, 6.7663f, 4.6716f)
                    curveTo(8.2936f, 3.5817f, 10.1237f, 2.9971f, 12.0f, 3.0f)
                    close()
                    moveTo(12.0f, 21.0f)
                    curveTo(10.1326f, 20.9999f, 8.3122f, 20.4152f, 6.794f, 19.328f)
                    lineTo(19.328f, 6.793f)
                    curveTo(22.2115f, 10.8322f, 21.2746f, 16.4442f, 17.2354f, 19.3277f)
                    curveTo(15.7077f, 20.4182f, 13.877f, 21.003f, 12.0f, 21.0f)
                    close()
                }
            }
        }
        .build()
        return _ban!!
    }

private var _ban: ImageVector? = null
