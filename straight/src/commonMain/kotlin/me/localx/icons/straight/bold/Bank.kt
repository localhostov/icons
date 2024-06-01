package me.localx.icons.straight.bold

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

public val Icons.Bold.Bank: ImageVector
    get() {
        if (_bank != null) {
            return _bank!!
        }
        _bank = Builder(name = "Bank", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(1.0E-4f, 21.0f)
                    horizontalLineTo(24.0001f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(1.0E-4f)
                    verticalLineTo(21.0f)
                    close()
                    moveTo(24.0001f, 8.1f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(21.0001f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(23.0001f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(1.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(3.0001f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(1.0E-4f)
                    verticalLineTo(8.1f)
                    curveTo(-0.0013f, 7.4863f, 0.1631f, 6.8836f, 0.4758f, 6.3555f)
                    curveTo(0.7886f, 5.8275f, 1.2382f, 5.3937f, 1.7771f, 5.1f)
                    lineTo(10.3671f, 0.416f)
                    curveTo(10.8677f, 0.1419f, 11.4293f, -0.0018f, 12.0001f, -0.0018f)
                    curveTo(12.5708f, -0.0018f, 13.1324f, 0.1419f, 13.6331f, 0.416f)
                    lineTo(22.2241f, 5.1f)
                    curveTo(22.7627f, 5.3939f, 23.212f, 5.8278f, 23.5246f, 6.3558f)
                    curveTo(23.8371f, 6.8838f, 24.0014f, 7.4864f, 24.0001f, 8.1f)
                    close()
                    moveTo(4.562f, 7.0f)
                    horizontalLineTo(19.4371f)
                    lineTo(12.2001f, 3.05f)
                    curveTo(12.1404f, 3.0167f, 12.0733f, 2.9992f, 12.0051f, 2.9992f)
                    curveTo(11.9368f, 2.9992f, 11.8697f, 3.0167f, 11.8101f, 3.05f)
                    lineTo(4.562f, 7.0f)
                    close()
                    moveTo(11.0001f, 10.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(13.0001f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(11.0001f)
                    close()
                    moveTo(6.0001f, 16.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(6.0001f)
                    verticalLineTo(16.0f)
                    close()
                    moveTo(18.0001f, 10.0f)
                    horizontalLineTo(16.0001f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(18.0001f)
                    verticalLineTo(10.0f)
                    close()
                }
            }
        }
        .build()
        return _bank!!
    }

private var _bank: ImageVector? = null
