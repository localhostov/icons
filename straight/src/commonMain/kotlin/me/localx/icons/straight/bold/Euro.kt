package me.localx.icons.straight.bold

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

public val Icons.Bold.Euro: ImageVector
    get() {
        if (_euro != null) {
            return _euro!!
        }
        _euro = Builder(name = "Euro", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0f, 20.9999f)
                    curveTo(12.3259f, 20.9976f, 10.6857f, 20.5284f, 9.2636f, 19.6452f)
                    curveTo(7.8416f, 18.7619f, 6.694f, 17.4995f, 5.95f, 15.9999f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(12.9999f)
                    horizontalLineTo(5.059f)
                    curveTo(4.9803f, 12.3355f, 4.9803f, 11.6642f, 5.059f, 10.9999f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(7.9999f)
                    horizontalLineTo(5.95f)
                    curveTo(6.6158f, 6.6553f, 7.6076f, 5.4987f, 8.835f, 4.6357f)
                    curveTo(10.0624f, 3.7727f, 11.4863f, 3.2306f, 12.9768f, 3.0589f)
                    curveTo(14.4674f, 2.8872f, 15.9772f, 3.0913f, 17.3687f, 3.6527f)
                    curveTo(18.7601f, 4.2141f, 19.9889f, 5.1149f, 20.943f, 6.2729f)
                    lineTo(23.257f, 4.3629f)
                    curveTo(21.9063f, 2.7244f, 20.1447f, 1.474f, 18.1523f, 0.7396f)
                    curveTo(16.1599f, 0.0052f, 14.0082f, -0.1868f, 11.9173f, 0.1831f)
                    curveTo(9.8263f, 0.553f, 7.8711f, 1.4717f, 6.2516f, 2.8451f)
                    curveTo(4.6322f, 4.2185f, 3.4065f, 5.9974f, 2.7f, 7.9999f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(10.9999f)
                    horizontalLineTo(2.051f)
                    curveTo(2.023f, 11.3309f, 2.0f, 11.6619f, 2.0f, 11.9999f)
                    curveTo(2.0f, 12.3379f, 2.023f, 12.6689f, 2.051f, 12.9999f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(15.9999f)
                    horizontalLineTo(2.7f)
                    curveTo(3.4065f, 18.0023f, 4.6322f, 19.7812f, 6.2516f, 21.1546f)
                    curveTo(7.8711f, 22.528f, 9.8263f, 23.4467f, 11.9173f, 23.8166f)
                    curveTo(14.0082f, 24.1865f, 16.1599f, 23.9945f, 18.1523f, 23.2601f)
                    curveTo(20.1447f, 22.5257f, 21.9063f, 21.2754f, 23.257f, 19.6369f)
                    lineTo(20.943f, 17.7269f)
                    curveTo(20.0997f, 18.7518f, 19.0396f, 19.577f, 17.839f, 20.1429f)
                    curveTo(16.6384f, 20.7089f, 15.3273f, 21.0016f, 14.0f, 20.9999f)
                    close()
                }
            }
        }
        .build()
        return _euro!!
    }

private var _euro: ImageVector? = null
