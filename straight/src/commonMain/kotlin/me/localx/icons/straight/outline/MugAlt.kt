package me.localx.icons.straight.outline

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

public val Icons.Outline.MugAlt: ImageVector
    get() {
        if (_mugAlt != null) {
            return _mugAlt!!
        }
        _mugAlt = Builder(name = "MugAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 22.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(22.0f)
                    close()
                    moveTo(24.0f, 8.0f)
                    curveTo(24.0f, 10.774f, 21.815f, 14.0f, 19.0f, 14.0f)
                    horizontalLineTo(17.965f)
                    lineTo(16.828f, 20.0f)
                    horizontalLineTo(3.172f)
                    lineTo(0.065f, 3.618f)
                    curveTo(-0.0232f, 3.1816f, -0.0138f, 2.7311f, 0.0925f, 2.2988f)
                    curveTo(0.1988f, 1.8665f, 0.3994f, 1.4631f, 0.6798f, 1.1173f)
                    curveTo(0.9603f, 0.7716f, 1.3138f, 0.4921f, 1.7149f, 0.299f)
                    curveTo(2.116f, 0.1058f, 2.5548f, 0.0037f, 3.0f, 0.0f)
                    lineTo(17.0f, 0.0f)
                    curveTo(17.4494f, 0.0f, 17.8931f, 0.101f, 18.2983f, 0.2955f)
                    curveTo(18.7034f, 0.49f, 19.0597f, 0.773f, 19.3408f, 1.1237f)
                    curveTo(19.6219f, 1.4744f, 19.8206f, 1.8838f, 19.9222f, 2.3215f)
                    curveTo(20.0238f, 2.7593f, 20.0258f, 3.2143f, 19.928f, 3.653f)
                    lineTo(19.852f, 4.053f)
                    curveTo(22.46f, 4.307f, 24.0f, 5.734f, 24.0f, 8.0f)
                    close()
                    moveTo(17.969f, 3.249f)
                    curveTo(18.0065f, 3.0986f, 18.0089f, 2.9415f, 17.9762f, 2.79f)
                    curveTo(17.9434f, 2.6385f, 17.8763f, 2.4965f, 17.78f, 2.375f)
                    curveTo(17.6864f, 2.2581f, 17.5677f, 2.1637f, 17.4327f, 2.0988f)
                    curveTo(17.2977f, 2.0338f, 17.1498f, 2.0001f, 17.0f, 2.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.8506f, 2.001f, 2.7034f, 2.0353f, 2.5689f, 2.1003f)
                    curveTo(2.4344f, 2.1653f, 2.3161f, 2.2594f, 2.2226f, 2.3759f)
                    curveTo(2.1291f, 2.4923f, 2.0626f, 2.6281f, 2.0281f, 2.7734f)
                    curveTo(1.9935f, 2.9188f, 1.9918f, 3.0699f, 2.023f, 3.216f)
                    lineTo(4.828f, 18.0f)
                    horizontalLineTo(15.172f)
                    lineTo(17.969f, 3.249f)
                    close()
                    moveTo(22.0f, 8.0f)
                    curveTo(22.0f, 7.533f, 22.0f, 6.169f, 19.479f, 6.015f)
                    lineTo(18.345f, 12.0f)
                    horizontalLineTo(19.0f)
                    curveTo(20.545f, 12.0f, 22.0f, 9.746f, 22.0f, 8.0f)
                    close()
                }
            }
        }
        .build()
        return _mugAlt!!
    }

private var _mugAlt: ImageVector? = null
