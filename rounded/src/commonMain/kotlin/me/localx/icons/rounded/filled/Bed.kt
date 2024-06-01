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

public val Icons.Filled.Bed: ImageVector
    get() {
        if (_bed != null) {
            return _bed!!
        }
        _bed = Builder(name = "Bed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.0f, 9.5f)
                    curveTo(9.0f, 9.9944f, 8.8534f, 10.4778f, 8.5787f, 10.8889f)
                    curveTo(8.304f, 11.3f, 7.9135f, 11.6205f, 7.4567f, 11.8097f)
                    curveTo(6.9999f, 11.9989f, 6.4972f, 12.0484f, 6.0123f, 11.952f)
                    curveTo(5.5273f, 11.8555f, 5.0819f, 11.6174f, 4.7322f, 11.2678f)
                    curveTo(4.3826f, 10.9181f, 4.1445f, 10.4727f, 4.048f, 9.9877f)
                    curveTo(3.9516f, 9.5028f, 4.0011f, 9.0001f, 4.1903f, 8.5433f)
                    curveTo(4.3795f, 8.0865f, 4.7f, 7.696f, 5.1111f, 7.4213f)
                    curveTo(5.5222f, 7.1466f, 6.0055f, 7.0f, 6.5f, 7.0f)
                    curveTo(7.163f, 7.0f, 7.7989f, 7.2634f, 8.2678f, 7.7322f)
                    curveTo(8.7366f, 8.2011f, 9.0f, 8.837f, 9.0f, 9.5f)
                    close()
                    moveTo(24.0f, 12.0f)
                    verticalLineTo(10.0f)
                    curveTo(24.0f, 8.9391f, 23.5786f, 7.9217f, 22.8284f, 7.1716f)
                    curveTo(22.0783f, 6.4214f, 21.0609f, 6.0f, 20.0f, 6.0f)
                    horizontalLineTo(15.0f)
                    curveTo(13.9391f, 6.0f, 12.9217f, 6.4214f, 12.1716f, 7.1716f)
                    curveTo(11.4214f, 7.9217f, 11.0f, 8.9391f, 11.0f, 10.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(24.0f)
                    close()
                    moveTo(2.0f, 14.0f)
                    verticalLineTo(3.0f)
                    curveTo(2.0f, 2.7348f, 1.8946f, 2.4804f, 1.7071f, 2.2929f)
                    curveTo(1.5196f, 2.1054f, 1.2652f, 2.0f, 1.0f, 2.0f)
                    curveTo(0.7348f, 2.0f, 0.4804f, 2.1054f, 0.2929f, 2.2929f)
                    curveTo(0.1054f, 2.4804f, 0.0f, 2.7348f, 0.0f, 3.0f)
                    lineTo(0.0f, 21.0f)
                    curveTo(0.0f, 21.2652f, 0.1054f, 21.5196f, 0.2929f, 21.7071f)
                    curveTo(0.4804f, 21.8946f, 0.7348f, 22.0f, 1.0f, 22.0f)
                    curveTo(1.2652f, 22.0f, 1.5196f, 21.8946f, 1.7071f, 21.7071f)
                    curveTo(1.8946f, 21.5196f, 2.0f, 21.2652f, 2.0f, 21.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(21.0f)
                    curveTo(22.0f, 21.2652f, 22.1054f, 21.5196f, 22.2929f, 21.7071f)
                    curveTo(22.4804f, 21.8946f, 22.7348f, 22.0f, 23.0f, 22.0f)
                    curveTo(23.2652f, 22.0f, 23.5196f, 21.8946f, 23.7071f, 21.7071f)
                    curveTo(23.8946f, 21.5196f, 24.0f, 21.2652f, 24.0f, 21.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(2.0f)
                    close()
                }
            }
        }
        .build()
        return _bed!!
    }

private var _bed: ImageVector? = null
