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

public val Icons.Bold.CursorFinger: ImageVector
    get() {
        if (_cursorFinger != null) {
            return _cursorFinger!!
        }
        _cursorFinger = Builder(name = "CursorFinger", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.9998f, 7.829f)
                    verticalLineTo(4.0f)
                    curveTo(13.9998f, 2.9391f, 13.5783f, 1.9217f, 12.8282f, 1.1716f)
                    curveTo(12.078f, 0.4214f, 11.0606f, 0.0f, 9.9998f, 0.0f)
                    curveTo(8.9389f, 0.0f, 7.9215f, 0.4214f, 7.1713f, 1.1716f)
                    curveTo(6.4212f, 1.9217f, 5.9998f, 2.9391f, 5.9998f, 4.0f)
                    verticalLineTo(9.872f)
                    lineTo(2.0248f, 13.782f)
                    curveTo(1.6997f, 14.107f, 1.4419f, 14.4929f, 1.266f, 14.9175f)
                    curveTo(1.09f, 15.3422f, 0.9995f, 15.7973f, 0.9995f, 16.257f)
                    curveTo(0.9995f, 16.7167f, 1.09f, 17.1718f, 1.266f, 17.5965f)
                    curveTo(1.4419f, 18.0211f, 1.6997f, 18.407f, 2.0248f, 18.732f)
                    lineTo(7.2918f, 24.0f)
                    horizontalLineTo(21.9998f)
                    verticalLineTo(9.829f)
                    lineTo(13.9998f, 7.829f)
                    close()
                    moveTo(18.9998f, 21.0f)
                    horizontalLineTo(8.5358f)
                    lineTo(4.1458f, 16.61f)
                    curveTo(4.0523f, 16.5163f, 3.9998f, 16.3894f, 3.9998f, 16.257f)
                    curveTo(3.9986f, 16.1286f, 4.0482f, 16.005f, 4.1378f, 15.913f)
                    lineTo(5.9998f, 14.08f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(8.9998f)
                    verticalLineTo(4.0f)
                    curveTo(8.9998f, 3.7348f, 9.1051f, 3.4804f, 9.2927f, 3.2929f)
                    curveTo(9.4802f, 3.1054f, 9.7346f, 3.0f, 9.9998f, 3.0f)
                    curveTo(10.265f, 3.0f, 10.5193f, 3.1054f, 10.7069f, 3.2929f)
                    curveTo(10.8944f, 3.4804f, 10.9998f, 3.7348f, 10.9998f, 4.0f)
                    verticalLineTo(10.171f)
                    lineTo(18.9998f, 12.171f)
                    verticalLineTo(21.0f)
                    close()
                }
            }
        }
        .build()
        return _cursorFinger!!
    }

private var _cursorFinger: ImageVector? = null
