package me.localx.icons.rounded.filled

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

public val Icons.Filled.ChartPyramid: ImageVector
    get() {
        if (_chartPyramid != null) {
            return _chartPyramid!!
        }
        _chartPyramid = Builder(name = "ChartPyramid", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.587f, 18.2399f)
                    curveTo(0.2882f, 18.8497f, 0.1495f, 19.5256f, 0.1842f, 20.2038f)
                    curveTo(0.2188f, 20.882f, 0.4255f, 21.5402f, 0.7848f, 22.1165f)
                    curveTo(1.1442f, 22.6927f, 1.6443f, 23.168f, 2.2381f, 23.4975f)
                    curveTo(2.8319f, 23.827f, 3.4999f, 23.9999f, 4.179f, 23.9998f)
                    horizontalLineTo(19.82f)
                    curveTo(20.4991f, 24.0f, 21.1672f, 23.8272f, 21.7611f, 23.4978f)
                    curveTo(22.3551f, 23.1684f, 22.8554f, 22.6931f, 23.2148f, 22.1169f)
                    curveTo(23.5743f, 21.5406f, 23.7811f, 20.8823f, 23.8158f, 20.204f)
                    curveTo(23.8504f, 19.5257f, 23.7118f, 18.8498f, 23.413f, 18.2399f)
                    lineTo(22.806f, 16.9999f)
                    horizontalLineTo(1.194f)
                    lineTo(0.587f, 18.2399f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.377f, 10.0001f)
                    horizontalLineTo(4.623f)
                    lineTo(2.174f, 15.0001f)
                    horizontalLineTo(21.826f)
                    lineTo(19.377f, 10.0001f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.593f, 2.2748f)
                    curveTo(15.2638f, 1.6026f, 14.7526f, 1.0362f, 14.1176f, 0.64f)
                    curveTo(13.4825f, 0.2438f, 12.749f, 0.0338f, 12.0005f, 0.0338f)
                    curveTo(11.252f, 0.0338f, 10.5185f, 0.2438f, 9.8834f, 0.64f)
                    curveTo(9.2483f, 1.0362f, 8.7371f, 1.6026f, 8.408f, 2.2748f)
                    lineTo(5.6f, 7.9998f)
                    horizontalLineTo(18.4f)
                    lineTo(15.593f, 2.2748f)
                    close()
                }
            }
        }
        .build()
        return _chartPyramid!!
    }

private var _chartPyramid: ImageVector? = null
