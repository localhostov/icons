package me.localx.icons.rounded.outline

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

public val Icons.Outline.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) {
            return _flipHorizontal!!
        }
        _flipHorizontal = Builder(name = "FlipHorizontal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.2068f, 0.0684f)
                    horizontalLineTo(10.1998f)
                    curveTo(9.9758f, 0.0178f, 9.7412f, 0.0458f, 9.5354f, 0.1478f)
                    curveTo(9.3296f, 0.2498f, 9.1652f, 0.4195f, 9.0698f, 0.6284f)
                    lineTo(0.3748f, 19.7594f)
                    curveTo(0.1672f, 20.2164f, 0.0775f, 20.7181f, 0.1141f, 21.2187f)
                    curveTo(0.1506f, 21.7192f, 0.3121f, 22.2027f, 0.5838f, 22.6246f)
                    curveTo(0.8556f, 23.0466f, 1.2288f, 23.3937f, 1.6694f, 23.634f)
                    curveTo(2.11f, 23.8744f, 2.6039f, 24.0004f, 3.1058f, 24.0004f)
                    horizontalLineTo(9.9998f)
                    curveTo(10.265f, 24.0004f, 10.5194f, 23.8951f, 10.7069f, 23.7075f)
                    curveTo(10.8945f, 23.52f, 10.9998f, 23.2656f, 10.9998f, 23.0004f)
                    verticalLineTo(1.0464f)
                    curveTo(10.9979f, 0.8177f, 10.9184f, 0.5964f, 10.7744f, 0.4187f)
                    curveTo(10.6303f, 0.2411f, 10.4302f, 0.1175f, 10.2068f, 0.0684f)
                    close()
                    moveTo(8.9998f, 22.0004f)
                    horizontalLineTo(3.1058f)
                    curveTo(2.9384f, 22.0005f, 2.7737f, 21.9586f, 2.6267f, 21.8785f)
                    curveTo(2.4797f, 21.7984f, 2.3551f, 21.6827f, 2.2645f, 21.542f)
                    curveTo(2.1738f, 21.4013f, 2.1199f, 21.2401f, 2.1077f, 21.0731f)
                    curveTo(2.0956f, 20.9061f, 2.1255f, 20.7388f, 2.1948f, 20.5864f)
                    lineTo(8.9998f, 5.6164f)
                    verticalLineTo(22.0004f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.6248f, 19.7589f)
                    lineTo(14.9298f, 0.6279f)
                    curveTo(14.8299f, 0.4178f, 14.6613f, 0.2481f, 14.4518f, 0.1468f)
                    curveTo(14.2423f, 0.0456f, 14.0046f, 0.0188f, 13.7778f, 0.0709f)
                    curveTo(13.5569f, 0.1212f, 13.3595f, 0.2451f, 13.2182f, 0.4223f)
                    curveTo(13.0768f, 0.5994f, 12.9999f, 0.8193f, 12.9998f, 1.0459f)
                    verticalLineTo(22.9999f)
                    curveTo(12.9998f, 23.2651f, 13.1052f, 23.5195f, 13.2927f, 23.707f)
                    curveTo(13.4803f, 23.8946f, 13.7346f, 23.9999f, 13.9998f, 23.9999f)
                    horizontalLineTo(20.8938f)
                    curveTo(21.3957f, 23.9999f, 21.8896f, 23.8739f, 22.3302f, 23.6336f)
                    curveTo(22.7708f, 23.3932f, 23.1441f, 23.0461f, 23.4158f, 22.6242f)
                    curveTo(23.6876f, 22.2022f, 23.8491f, 21.7188f, 23.8856f, 21.2182f)
                    curveTo(23.9221f, 20.7176f, 23.8325f, 20.2159f, 23.6248f, 19.7589f)
                    close()
                }
            }
        }
        .build()
        return _flipHorizontal!!
    }

private var _flipHorizontal: ImageVector? = null
