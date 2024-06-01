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

public val Icons.Bold.Mars: ImageVector
    get() {
        if (_mars != null) {
            return _mars!!
        }
        _mars = Builder(name = "Mars", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.5062f, 0.0f)
                    horizontalLineTo(16.513f)
                    curveTo(15.686f, 0.0f, 15.0155f, 0.6705f, 15.0155f, 1.4975f)
                    curveTo(15.0155f, 2.3245f, 15.686f, 2.9949f, 16.513f, 2.9949f)
                    horizontalLineTo(18.888f)
                    lineTo(13.3683f, 8.5146f)
                    curveTo(9.5139f, 5.8295f, 4.2125f, 6.7775f, 1.5275f, 10.632f)
                    curveTo(-1.1576f, 14.4864f, -0.2096f, 19.7878f, 3.6449f, 22.4728f)
                    curveTo(7.4993f, 25.1579f, 12.8007f, 24.2099f, 15.4857f, 20.3554f)
                    curveTo(17.521f, 17.4338f, 17.521f, 13.5536f, 15.4857f, 10.632f)
                    lineTo(21.0054f, 5.1123f)
                    verticalLineTo(7.4873f)
                    curveTo(21.0054f, 8.3143f, 21.6758f, 8.9848f, 22.5028f, 8.9848f)
                    curveTo(23.3298f, 8.9848f, 24.0003f, 8.3143f, 24.0003f, 7.4873f)
                    verticalLineTo(3.4941f)
                    curveTo(24.0003f, 1.5644f, 22.4359f, 0.0f, 20.5062f, 0.0f)
                    close()
                    moveTo(8.5265f, 20.9644f)
                    curveTo(5.4941f, 20.9644f, 3.0358f, 18.5062f, 3.0358f, 15.4737f)
                    curveTo(3.0358f, 12.4413f, 5.4941f, 9.983f, 8.5265f, 9.983f)
                    curveTo(11.559f, 9.983f, 14.0172f, 12.4413f, 14.0172f, 15.4737f)
                    curveTo(14.0139f, 18.5048f, 11.5576f, 20.9611f, 8.5265f, 20.9644f)
                    close()
                }
            }
        }
        .build()
        return _mars!!
    }

private var _mars: ImageVector? = null
