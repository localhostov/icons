package me.localx.icons.straight.filled

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

public val Icons.Filled.Glasses: ImageVector
    get() {
        if (_glasses != null) {
            return _glasses!!
        }
        _glasses = Builder(name = "Glasses", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.9999f, 0.058f)
                    curveTo(18.9391f, 0.058f, 17.9217f, 0.4794f, 17.1715f, 1.2296f)
                    curveTo(16.4214f, 1.9797f, 15.9999f, 2.9971f, 15.9999f, 4.058f)
                    horizontalLineTo(17.9999f)
                    curveTo(17.9999f, 3.5275f, 18.2107f, 3.0188f, 18.5857f, 2.6438f)
                    curveTo(18.9608f, 2.2687f, 19.4695f, 2.058f, 19.9999f, 2.058f)
                    horizontalLineTo(21.9999f)
                    verticalLineTo(15.083f)
                    curveTo(21.1392f, 14.4219f, 20.0852f, 14.0618f, 18.9999f, 14.058f)
                    curveTo(17.8477f, 14.0593f, 16.7311f, 14.4578f, 15.8385f, 15.1865f)
                    curveTo(14.9459f, 15.9151f, 14.3319f, 16.9293f, 14.0999f, 18.058f)
                    horizontalLineTo(9.8999f)
                    curveTo(9.668f, 16.9293f, 9.054f, 15.9151f, 8.1614f, 15.1865f)
                    curveTo(7.2688f, 14.4578f, 6.1522f, 14.0593f, 4.9999f, 14.058f)
                    curveTo(3.9147f, 14.0618f, 2.8607f, 14.4219f, 1.9999f, 15.083f)
                    verticalLineTo(2.058f)
                    horizontalLineTo(3.9999f)
                    curveTo(4.5304f, 2.058f, 5.0391f, 2.2687f, 5.4142f, 2.6438f)
                    curveTo(5.7892f, 3.0188f, 5.9999f, 3.5275f, 5.9999f, 4.058f)
                    horizontalLineTo(7.9999f)
                    curveTo(7.9999f, 2.9971f, 7.5785f, 1.9797f, 6.8284f, 1.2296f)
                    curveTo(6.0782f, 0.4794f, 5.0608f, 0.058f, 3.9999f, 0.058f)
                    horizontalLineTo(-1.0E-4f)
                    verticalLineTo(19.058f)
                    curveTo(-0.0013f, 20.2979f, 0.4582f, 21.4941f, 1.2893f, 22.4143f)
                    curveTo(2.1204f, 23.3345f, 3.2638f, 23.9131f, 4.4974f, 24.0377f)
                    curveTo(5.7311f, 24.1623f, 6.9671f, 23.8241f, 7.9654f, 23.0887f)
                    curveTo(8.9637f, 22.3533f, 9.6532f, 21.2731f, 9.8999f, 20.058f)
                    horizontalLineTo(14.0999f)
                    curveTo(14.3467f, 21.2731f, 15.0361f, 22.3533f, 16.0345f, 23.0887f)
                    curveTo(17.0328f, 23.8241f, 18.2688f, 24.1623f, 19.5024f, 24.0377f)
                    curveTo(20.7361f, 23.9131f, 21.8795f, 23.3345f, 22.7106f, 22.4143f)
                    curveTo(23.5417f, 21.4941f, 24.0012f, 20.2979f, 23.9999f, 19.058f)
                    verticalLineTo(0.058f)
                    horizontalLineTo(19.9999f)
                    close()
                }
            }
        }
        .build()
        return _glasses!!
    }

private var _glasses: ImageVector? = null
