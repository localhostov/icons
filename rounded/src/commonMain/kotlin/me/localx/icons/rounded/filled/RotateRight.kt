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

public val Icons.Filled.RotateRight: ImageVector
    get() {
        if (_rotateRight != null) {
            return _rotateRight!!
        }
        _rotateRight = Builder(name = "RotateRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.959f, 12.0f)
                    curveTo(22.4532f, 11.9934f, 22.0251f, 12.3721f, 21.97f, 12.875f)
                    curveTo(21.5032f, 18.3947f, 16.6501f, 22.4909f, 11.1304f, 22.024f)
                    curveTo(5.6107f, 21.5572f, 1.5145f, 16.7041f, 1.9814f, 11.1844f)
                    curveTo(2.4483f, 5.6647f, 7.3013f, 1.5685f, 12.821f, 2.0354f)
                    curveTo(15.2108f, 2.2375f, 17.4491f, 3.2893f, 19.13f, 5.0f)
                    horizontalLineTo(16.008f)
                    curveTo(15.4557f, 5.0f, 15.008f, 5.4477f, 15.008f, 5.9999f)
                    curveTo(15.008f, 6.5522f, 15.4557f, 6.9999f, 16.008f, 6.9999f)
                    horizontalLineTo(20.151f)
                    curveTo(21.1763f, 6.9994f, 22.0074f, 6.1683f, 22.008f, 5.1429f)
                    verticalLineTo(1.0f)
                    curveTo(22.008f, 0.4477f, 21.5603f, 0.0f, 21.008f, 0.0f)
                    curveTo(20.4557f, 0.0f, 20.008f, 0.4477f, 20.008f, 1.0f)
                    verticalLineTo(3.078f)
                    curveTo(15.0723f, -1.3324f, 7.4958f, -0.9066f, 3.0854f, 4.0291f)
                    curveTo(-1.3251f, 8.9648f, -0.8992f, 16.5413f, 4.0364f, 20.9517f)
                    curveTo(8.9722f, 25.3621f, 16.5487f, 24.9363f, 20.9591f, 20.0006f)
                    curveTo(22.6735f, 18.082f, 23.725f, 15.6625f, 23.958f, 13.1f)
                    curveTo(24.0094f, 12.5462f, 23.6021f, 12.0556f, 23.0483f, 12.0043f)
                    curveTo(23.0186f, 12.0015f, 22.9889f, 12.0001f, 22.959f, 12.0f)
                    close()
                }
            }
        }
        .build()
        return _rotateRight!!
    }

private var _rotateRight: ImageVector? = null
