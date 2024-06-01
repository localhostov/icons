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

public val Icons.Filled.Diamond: ImageVector
    get() {
        if (_diamond != null) {
            return _diamond!!
        }
        _diamond = Builder(name = "Diamond", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 9.0f)
                    curveTo(23.8705f, 9.7261f, 23.5819f, 10.4146f, 23.155f, 11.016f)
                    lineTo(14.372f, 22.836f)
                    curveTo(14.0935f, 23.1958f, 13.7369f, 23.4875f, 13.3291f, 23.6891f)
                    curveTo(12.9213f, 23.8907f, 12.473f, 23.9969f, 12.0181f, 23.9997f)
                    curveTo(11.5631f, 24.0025f, 11.1135f, 23.9018f, 10.7033f, 23.7052f)
                    curveTo(10.293f, 23.5086f, 9.9328f, 23.2213f, 9.65f, 22.865f)
                    lineTo(0.824f, 10.8f)
                    curveTo(0.4491f, 10.2567f, 0.1844f, 9.6452f, 0.045f, 9.0f)
                    horizontalLineTo(6.313f)
                    lineTo(11.066f, 21.359f)
                    curveTo(11.1383f, 21.5481f, 11.2663f, 21.7108f, 11.4331f, 21.8255f)
                    curveTo(11.5999f, 21.9403f, 11.7976f, 22.0017f, 12.0f, 22.0017f)
                    curveTo(12.2024f, 22.0017f, 12.4001f, 21.9403f, 12.5669f, 21.8255f)
                    curveTo(12.7337f, 21.7108f, 12.8617f, 21.5481f, 12.934f, 21.359f)
                    lineTo(17.687f, 9.0f)
                    horizontalLineTo(24.0f)
                    close()
                    moveTo(17.7f, 7.0f)
                    horizontalLineTo(23.957f)
                    curveTo(23.8049f, 6.3234f, 23.513f, 5.6861f, 23.1f, 5.129f)
                    lineTo(20.542f, 1.675f)
                    curveTo(20.1716f, 1.1573f, 19.6831f, 0.7353f, 19.117f, 0.444f)
                    curveTo(18.551f, 0.1527f, 17.9236f, 5.0E-4f, 17.287f, 0.0f)
                    horizontalLineTo(15.087f)
                    lineTo(17.7f, 7.0f)
                    close()
                    moveTo(11.108f, 0.0f)
                    lineTo(8.449f, 7.0f)
                    horizontalLineTo(15.561f)
                    lineTo(12.955f, 0.0f)
                    horizontalLineTo(11.108f)
                    close()
                    moveTo(6.31f, 7.0f)
                    lineTo(8.968f, 0.0f)
                    horizontalLineTo(6.646f)
                    curveTo(6.0148f, -6.0E-4f, 5.3924f, 0.1485f, 4.83f, 0.4352f)
                    curveTo(4.2677f, 0.7218f, 3.7813f, 1.1379f, 3.411f, 1.649f)
                    lineTo(0.938f, 4.891f)
                    curveTo(0.4648f, 5.511f, 0.1435f, 6.2334f, 0.0f, 7.0f)
                    horizontalLineTo(6.31f)
                    close()
                    moveTo(15.544f, 9.0f)
                    horizontalLineTo(8.456f)
                    lineTo(12.0f, 18.214f)
                    lineTo(15.544f, 9.0f)
                    close()
                }
            }
        }
        .build()
        return _diamond!!
    }

private var _diamond: ImageVector? = null
