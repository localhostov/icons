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

public val Icons.Bold.Checkbox: ImageVector
    get() {
        if (_checkbox != null) {
            return _checkbox!!
        }
        _checkbox = Builder(name = "Checkbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.5f, 24.0f)
                    horizontalLineTo(5.5f)
                    curveTo(2.4638f, 23.9967f, 0.0033f, 21.5362f, 0.0f, 18.5f)
                    verticalLineTo(5.5f)
                    curveTo(0.0033f, 2.4638f, 2.4638f, 0.0033f, 5.5f, 0.0f)
                    horizontalLineTo(18.5f)
                    curveTo(21.5362f, 0.0033f, 23.9967f, 2.4638f, 24.0f, 5.5f)
                    verticalLineTo(18.5f)
                    curveTo(23.9967f, 21.5362f, 21.5362f, 23.9967f, 18.5f, 24.0f)
                    close()
                    moveTo(5.5f, 3.0f)
                    curveTo(4.1193f, 3.0f, 3.0f, 4.1193f, 3.0f, 5.5f)
                    verticalLineTo(18.5f)
                    curveTo(3.0f, 19.8807f, 4.1193f, 21.0f, 5.5f, 21.0f)
                    horizontalLineTo(18.5f)
                    curveTo(19.8807f, 21.0f, 21.0f, 19.8807f, 21.0f, 18.5f)
                    verticalLineTo(5.5f)
                    curveTo(21.0f, 4.1193f, 19.8807f, 3.0f, 18.5f, 3.0f)
                    horizontalLineTo(5.5f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.6671f, 17.7869f)
                    curveTo(9.036f, 17.7873f, 8.4311f, 17.5353f, 7.9871f, 17.0869f)
                    lineTo(5.0001f, 14.1049f)
                    curveTo(4.4141f, 13.5193f, 4.4138f, 12.5696f, 4.9994f, 11.9836f)
                    curveTo(4.9997f, 11.9834f, 4.9999f, 11.9831f, 5.0001f, 11.9829f)
                    curveTo(5.5858f, 11.3973f, 6.5353f, 11.3973f, 7.1211f, 11.9829f)
                    lineTo(9.6671f, 14.5279f)
                    lineTo(16.8791f, 7.3159f)
                    curveTo(17.4648f, 6.7303f, 18.4143f, 6.7303f, 19.0001f, 7.3159f)
                    curveTo(19.5861f, 7.9015f, 19.5864f, 8.8512f, 19.0007f, 9.4372f)
                    curveTo(19.0005f, 9.4375f, 19.0003f, 9.4377f, 19.0001f, 9.4379f)
                    lineTo(11.3461f, 17.0919f)
                    curveTo(10.9016f, 17.5384f, 10.2971f, 17.7887f, 9.6671f, 17.7869f)
                    close()
                }
            }
        }
        .build()
        return _checkbox!!
    }

private var _checkbox: ImageVector? = null
