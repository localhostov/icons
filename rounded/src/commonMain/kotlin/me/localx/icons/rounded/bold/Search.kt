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

public val Icons.Bold.Search: ImageVector
    get() {
        if (_search != null) {
            return _search!!
        }
        _search = Builder(name = "Search", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.5612f, 21.4454f)
                    lineTo(18.9161f, 16.7983f)
                    curveTo(22.3918f, 12.1535f, 21.4441f, 5.5705f, 16.7993f, 2.0948f)
                    curveTo(12.1545f, -1.3809f, 5.5715f, -0.4332f, 2.0958f, 4.2116f)
                    curveTo(-1.3799f, 8.8563f, -0.4322f, 15.4393f, 4.2126f, 18.9151f)
                    curveTo(7.9436f, 21.7071f, 13.0682f, 21.7071f, 16.7993f, 18.9151f)
                    lineTo(21.4464f, 23.5622f)
                    curveTo(22.0304f, 24.1462f, 22.9772f, 24.1462f, 23.5612f, 23.5622f)
                    curveTo(24.1452f, 22.9782f, 24.1452f, 22.0314f, 23.5612f, 21.4474f)
                    lineTo(23.5612f, 21.4454f)
                    close()
                    moveTo(10.5447f, 18.0181f)
                    curveTo(6.4166f, 18.0181f, 3.0702f, 14.6717f, 3.0702f, 10.5437f)
                    curveTo(3.0702f, 6.4156f, 6.4166f, 3.0692f, 10.5447f, 3.0692f)
                    curveTo(14.6727f, 3.0692f, 18.0191f, 6.4156f, 18.0191f, 10.5437f)
                    curveTo(18.0147f, 14.6698f, 14.6709f, 18.0137f, 10.5447f, 18.0181f)
                    close()
                }
            }
        }
        .build()
        return _search!!
    }

private var _search: ImageVector? = null
