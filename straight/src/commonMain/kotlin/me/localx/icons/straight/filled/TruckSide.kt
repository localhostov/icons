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

public val Icons.Filled.TruckSide: ImageVector
    get() {
        if (_truckSide != null) {
            return _truckSide!!
        }
        _truckSide = Builder(name = "TruckSide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.0f, 17.9994f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(3.9994f)
                    curveTo(0.0f, 3.2037f, 0.3161f, 2.4406f, 0.8787f, 1.878f)
                    curveTo(1.4413f, 1.3154f, 2.2043f, 0.9994f, 3.0f, 0.9994f)
                    horizontalLineTo(12.0f)
                    curveTo(12.7956f, 0.9994f, 13.5587f, 1.3154f, 14.1213f, 1.878f)
                    curveTo(14.6839f, 2.4406f, 15.0f, 3.2037f, 15.0f, 3.9994f)
                    verticalLineTo(17.9994f)
                    close()
                    moveTo(17.0f, 17.9994f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(12.9994f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(17.9994f)
                    close()
                    moveTo(19.0f, 4.9994f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(10.9994f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(9.9994f)
                    curveTo(23.9984f, 8.6738f, 23.4711f, 7.4029f, 22.5338f, 6.4656f)
                    curveTo(21.5964f, 5.5282f, 20.3256f, 5.0009f, 19.0f, 4.9994f)
                    close()
                    moveTo(3.058f, 19.9994f)
                    curveTo(3.0214f, 20.1636f, 3.0019f, 20.3311f, 3.0f, 20.4994f)
                    curveTo(3.0f, 21.1624f, 3.2634f, 21.7983f, 3.7322f, 22.2671f)
                    curveTo(4.2011f, 22.736f, 4.837f, 22.9994f, 5.5f, 22.9994f)
                    curveTo(6.163f, 22.9994f, 6.7989f, 22.736f, 7.2678f, 22.2671f)
                    curveTo(7.7366f, 21.7983f, 8.0f, 21.1624f, 8.0f, 20.4994f)
                    curveTo(7.9981f, 20.3311f, 7.9786f, 20.1636f, 7.942f, 19.9994f)
                    horizontalLineTo(3.058f)
                    close()
                    moveTo(17.058f, 19.9994f)
                    curveTo(17.0214f, 20.1636f, 17.0019f, 20.3311f, 17.0f, 20.4994f)
                    curveTo(17.0f, 21.1624f, 17.2634f, 21.7983f, 17.7322f, 22.2671f)
                    curveTo(18.2011f, 22.736f, 18.837f, 22.9994f, 19.5f, 22.9994f)
                    curveTo(20.163f, 22.9994f, 20.7989f, 22.736f, 21.2678f, 22.2671f)
                    curveTo(21.7366f, 21.7983f, 22.0f, 21.1624f, 22.0f, 20.4994f)
                    curveTo(21.9981f, 20.3311f, 21.9786f, 20.1636f, 21.942f, 19.9994f)
                    horizontalLineTo(17.058f)
                    close()
                }
            }
        }
        .build()
        return _truckSide!!
    }

private var _truckSide: ImageVector? = null
