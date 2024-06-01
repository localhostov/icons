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

public val Icons.Bold.MakeupBrush: ImageVector
    get() {
        if (_makeupBrush != null) {
            return _makeupBrush!!
        }
        _makeupBrush = Builder(name = "MakeupBrush", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.984f, 1.0181f)
                    curveTo(22.364f, 0.4043f, 21.5366f, 0.0449f, 20.6648f, 0.0108f)
                    curveTo(19.7929f, -0.0232f, 18.94f, 0.2705f, 18.274f, 0.8341f)
                    lineTo(5.648f, 11.7541f)
                    curveTo(3.573f, 12.2271f, 0.0f, 13.5191f, 0.0f, 16.8001f)
                    curveTo(0.0021f, 18.709f, 0.7614f, 20.5391f, 2.1112f, 21.8889f)
                    curveTo(3.461f, 23.2388f, 5.2911f, 23.998f, 7.2f, 24.0001f)
                    curveTo(10.482f, 24.0001f, 11.773f, 20.4271f, 12.246f, 18.3521f)
                    lineTo(23.18f, 5.7101f)
                    curveTo(23.7374f, 5.044f, 24.0261f, 4.194f, 23.9899f, 3.3262f)
                    curveTo(23.9537f, 2.4584f, 23.595f, 1.6354f, 22.984f, 1.0181f)
                    close()
                    moveTo(7.2f, 21.0001f)
                    curveTo(6.0861f, 21.0001f, 5.0178f, 20.5576f, 4.2302f, 19.77f)
                    curveTo(3.4425f, 18.9823f, 3.0f, 17.914f, 3.0f, 16.8001f)
                    curveTo(3.0f, 15.7061f, 5.121f, 14.9141f, 6.681f, 14.6001f)
                    lineTo(9.4f, 17.3191f)
                    curveTo(9.086f, 18.8811f, 8.294f, 21.0001f, 7.2f, 21.0001f)
                    close()
                    moveTo(20.9f, 3.7601f)
                    lineTo(14.653f, 10.9831f)
                    lineTo(13.016f, 9.3481f)
                    lineTo(20.227f, 3.1121f)
                    curveTo(20.3156f, 3.0366f, 20.4292f, 2.9967f, 20.5456f, 3.0002f)
                    curveTo(20.6621f, 3.0038f, 20.773f, 3.0506f, 20.8568f, 3.1314f)
                    curveTo(20.9407f, 3.2123f, 20.9914f, 3.3214f, 20.9992f, 3.4376f)
                    curveTo(21.007f, 3.5538f, 20.9713f, 3.6688f, 20.899f, 3.7601f)
                    horizontalLineTo(20.9f)
                    close()
                }
            }
        }
        .build()
        return _makeupBrush!!
    }

private var _makeupBrush: ImageVector? = null
