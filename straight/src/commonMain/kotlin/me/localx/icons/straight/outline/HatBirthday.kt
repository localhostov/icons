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

public val Icons.Outline.HatBirthday: ImageVector
    get() {
        if (_hatBirthday != null) {
            return _hatBirthday!!
        }
        _hatBirthday = Builder(name = "HatBirthday", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.6996f, 24.0001f)
                    lineTo(13.4746f, 5.6001f)
                    curveTo(14.0518f, 5.2742f, 14.5049f, 4.7663f, 14.7629f, 4.1558f)
                    curveTo(15.021f, 3.5452f, 15.0696f, 2.8663f, 14.9011f, 2.2253f)
                    curveTo(14.7326f, 1.5841f, 14.3565f, 1.0169f, 13.8316f, 0.6121f)
                    curveTo(13.3067f, 0.2073f, 12.6625f, -0.0122f, 11.9996f, -0.0122f)
                    curveTo(11.3368f, -0.0122f, 10.6926f, 0.2073f, 10.1676f, 0.6121f)
                    curveTo(9.6427f, 1.0169f, 9.2666f, 1.5841f, 9.0982f, 2.2253f)
                    curveTo(8.9297f, 2.8663f, 8.9782f, 3.5452f, 9.2363f, 4.1558f)
                    curveTo(9.4944f, 4.7663f, 9.9474f, 5.2742f, 10.5246f, 5.6001f)
                    lineTo(0.2996f, 24.0001f)
                    horizontalLineTo(23.6996f)
                    close()
                    moveTo(10.3996f, 22.0001f)
                    horizontalLineTo(8.2346f)
                    lineTo(14.2706f, 11.1471f)
                    lineTo(15.4086f, 13.1941f)
                    lineTo(10.3996f, 22.0001f)
                    close()
                    moveTo(16.5426f, 15.2401f)
                    lineTo(17.6776f, 17.2841f)
                    lineTo(14.9856f, 22.0001f)
                    horizontalLineTo(12.6996f)
                    lineTo(16.5426f, 15.2401f)
                    close()
                    moveTo(5.9456f, 22.0001f)
                    horizontalLineTo(3.6996f)
                    lineTo(11.9996f, 7.0591f)
                    lineTo(13.1266f, 9.0881f)
                    lineTo(5.9456f, 22.0001f)
                    close()
                    moveTo(17.2886f, 22.0001f)
                    lineTo(18.8156f, 19.3271f)
                    lineTo(20.2996f, 22.0001f)
                    horizontalLineTo(17.2886f)
                    close()
                }
            }
        }
        .build()
        return _hatBirthday!!
    }

private var _hatBirthday: ImageVector? = null
