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

public val Icons.Filled.Cocktail: ImageVector
    get() {
        if (_cocktail != null) {
            return _cocktail!!
        }
        _cocktail = Builder(name = "Cocktail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0089f, 4.0f)
                    horizontalLineTo(-0.0091f)
                    curveTo(-0.0059f, 2.9385f, 0.4178f, 1.9216f, 1.1692f, 1.1719f)
                    curveTo(1.9206f, 0.4222f, 2.9385f, 8.0E-4f, 3.9999f, 0.0f)
                    lineTo(19.9999f, 0.0f)
                    curveTo(21.0614f, 8.0E-4f, 22.0792f, 0.4222f, 22.8306f, 1.1719f)
                    curveTo(23.5821f, 1.9216f, 24.0057f, 2.9385f, 24.0089f, 4.0f)
                    close()
                    moveTo(23.4539f, 6.0f)
                    horizontalLineTo(0.5339f)
                    curveTo(1.7147f, 7.7201f, 3.2698f, 9.1503f, 5.0824f, 10.1834f)
                    curveTo(6.8951f, 11.2165f, 8.9182f, 11.8256f, 10.9999f, 11.965f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(6.9999f)
                    curveTo(6.7347f, 22.0f, 6.4803f, 22.1054f, 6.2928f, 22.2929f)
                    curveTo(6.1053f, 22.4804f, 5.9999f, 22.7348f, 5.9999f, 23.0f)
                    curveTo(5.9999f, 23.2652f, 6.1053f, 23.5196f, 6.2928f, 23.7071f)
                    curveTo(6.4803f, 23.8946f, 6.7347f, 24.0f, 6.9999f, 24.0f)
                    horizontalLineTo(16.9999f)
                    curveTo(17.2651f, 24.0f, 17.5195f, 23.8946f, 17.707f, 23.7071f)
                    curveTo(17.8946f, 23.5196f, 17.9999f, 23.2652f, 17.9999f, 23.0f)
                    curveTo(17.9999f, 22.7348f, 17.8946f, 22.4804f, 17.707f, 22.2929f)
                    curveTo(17.5195f, 22.1054f, 17.2651f, 22.0f, 16.9999f, 22.0f)
                    horizontalLineTo(12.9999f)
                    verticalLineTo(11.965f)
                    curveTo(15.0798f, 11.8249f, 17.1009f, 11.2154f, 18.9115f, 10.1823f)
                    curveTo(20.7221f, 9.1492f, 22.2751f, 7.7193f, 23.4539f, 6.0f)
                    close()
                }
            }
        }
        .build()
        return _cocktail!!
    }

private var _cocktail: ImageVector? = null
