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

public val Icons.Bold.Lipstick: ImageVector
    get() {
        if (_lipstick != null) {
            return _lipstick!!
        }
        _lipstick = Builder(name = "Lipstick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.0002f, 12.0003f)
                    verticalLineTo(7.0003f)
                    horizontalLineTo(15.0002f)
                    verticalLineTo(1.5733f)
                    curveTo(15.0003f, 1.3054f, 14.932f, 1.0419f, 14.8016f, 0.8078f)
                    curveTo(14.6713f, 0.5737f, 14.4832f, 0.3769f, 14.2553f, 0.236f)
                    curveTo(14.0274f, 0.0951f, 13.7673f, 0.0148f, 13.4997f, 0.0028f)
                    curveTo(13.232f, -0.0092f, 12.9657f, 0.0474f, 12.7262f, 0.1673f)
                    lineTo(10.2642f, 1.4003f)
                    curveTo(9.8834f, 1.5885f, 9.5632f, 1.8797f, 9.3397f, 2.2409f)
                    curveTo(9.1163f, 2.602f, 8.9986f, 3.0186f, 9.0001f, 3.4433f)
                    verticalLineTo(7.0003f)
                    horizontalLineTo(7.0002f)
                    verticalLineTo(12.0003f)
                    horizontalLineTo(5.0002f)
                    verticalLineTo(24.0003f)
                    horizontalLineTo(19.0002f)
                    verticalLineTo(12.0003f)
                    horizontalLineTo(17.0002f)
                    close()
                    moveTo(10.0002f, 10.0003f)
                    horizontalLineTo(14.0002f)
                    verticalLineTo(12.0003f)
                    horizontalLineTo(10.0002f)
                    verticalLineTo(10.0003f)
                    close()
                    moveTo(16.0002f, 21.0003f)
                    horizontalLineTo(8.0001f)
                    verticalLineTo(15.0003f)
                    horizontalLineTo(16.0002f)
                    verticalLineTo(21.0003f)
                    close()
                }
            }
        }
        .build()
        return _lipstick!!
    }

private var _lipstick: ImageVector? = null
