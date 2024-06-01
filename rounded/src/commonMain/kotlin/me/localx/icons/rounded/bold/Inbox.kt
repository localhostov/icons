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

public val Icons.Bold.Inbox: ImageVector
    get() {
        if (_inbox != null) {
            return _inbox!!
        }
        _inbox = Builder(name = "Inbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(3.5f, 5.5f)
                    horizontalLineTo(20.5f)
                    curveTo(21.3284f, 5.5f, 22.0f, 6.1716f, 22.0f, 7.0f)
                    curveTo(22.0f, 7.8284f, 21.3284f, 8.5f, 20.5f, 8.5f)
                    horizontalLineTo(3.5f)
                    curveTo(2.6716f, 8.5f, 2.0f, 7.8284f, 2.0f, 7.0f)
                    curveTo(2.0f, 6.1716f, 2.6716f, 5.5f, 3.5f, 5.5f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(3.5f, 0.5f)
                    horizontalLineTo(20.5f)
                    curveTo(21.3284f, 0.5f, 22.0f, 1.1716f, 22.0f, 2.0f)
                    curveTo(22.0f, 2.8284f, 21.3284f, 3.5f, 20.5f, 3.5f)
                    horizontalLineTo(3.5f)
                    curveTo(2.6716f, 3.5f, 2.0f, 2.8284f, 2.0f, 2.0f)
                    curveTo(2.0f, 1.1716f, 2.6716f, 0.5f, 3.5f, 0.5f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.5f, 23.5f)
                    horizontalLineTo(5.5f)
                    curveTo(2.4638f, 23.4967f, 0.0033f, 21.0362f, 0.0f, 18.0f)
                    verticalLineTo(14.0f)
                    curveTo(0.0f, 12.067f, 1.567f, 10.5f, 3.5f, 10.5f)
                    horizontalLineTo(7.0f)
                    curveTo(7.8285f, 10.5f, 8.5f, 11.1716f, 8.5f, 12.0f)
                    curveTo(8.5f, 13.3807f, 9.6193f, 14.5f, 11.0f, 14.5f)
                    horizontalLineTo(13.0f)
                    curveTo(14.3807f, 14.5f, 15.5f, 13.3807f, 15.5f, 12.0f)
                    curveTo(15.5f, 11.1716f, 16.1716f, 10.5f, 17.0f, 10.5f)
                    horizontalLineTo(20.5f)
                    curveTo(22.433f, 10.5f, 24.0f, 12.067f, 24.0f, 14.0f)
                    verticalLineTo(18.0f)
                    curveTo(23.9967f, 21.0362f, 21.5362f, 23.4967f, 18.5f, 23.5f)
                    close()
                    moveTo(3.5f, 13.5f)
                    curveTo(3.2239f, 13.5f, 3.0f, 13.7239f, 3.0f, 14.0f)
                    verticalLineTo(18.0f)
                    curveTo(3.0f, 19.3807f, 4.1193f, 20.5f, 5.5f, 20.5f)
                    horizontalLineTo(18.5f)
                    curveTo(19.8807f, 20.5f, 21.0f, 19.3807f, 21.0f, 18.0f)
                    verticalLineTo(14.0f)
                    curveTo(21.0f, 13.7239f, 20.7761f, 13.5f, 20.5f, 13.5f)
                    horizontalLineTo(18.292f)
                    curveTo(17.6184f, 15.865f, 15.459f, 17.4972f, 13.0f, 17.5f)
                    horizontalLineTo(11.0f)
                    curveTo(8.5409f, 17.4972f, 6.3815f, 15.865f, 5.708f, 13.5f)
                    horizontalLineTo(3.5f)
                    close()
                }
            }
        }
        .build()
        return _inbox!!
    }

private var _inbox: ImageVector? = null
