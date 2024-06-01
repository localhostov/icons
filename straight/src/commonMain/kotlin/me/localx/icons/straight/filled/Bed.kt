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
                    moveTo(2.0f, 14.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(14.0f)
                    close()
                    moveTo(5.5f, 12.0f)
                    curveTo(5.9945f, 12.0f, 6.4778f, 11.8534f, 6.8889f, 11.5787f)
                    curveTo(7.3f, 11.304f, 7.6205f, 10.9135f, 7.8097f, 10.4567f)
                    curveTo(7.9989f, 9.9999f, 8.0484f, 9.4972f, 7.952f, 9.0123f)
                    curveTo(7.8555f, 8.5273f, 7.6174f, 8.0819f, 7.2678f, 7.7322f)
                    curveTo(6.9181f, 7.3826f, 6.4727f, 7.1445f, 5.9877f, 7.048f)
                    curveTo(5.5028f, 6.9516f, 5.0001f, 7.0011f, 4.5433f, 7.1903f)
                    curveTo(4.0865f, 7.3795f, 3.696f, 7.7f, 3.4213f, 8.1111f)
                    curveTo(3.1466f, 8.5222f, 3.0f, 9.0056f, 3.0f, 9.5f)
                    curveTo(3.0f, 9.8283f, 3.0647f, 10.1534f, 3.1903f, 10.4567f)
                    curveTo(3.3159f, 10.76f, 3.5001f, 11.0356f, 3.7322f, 11.2678f)
                    curveTo(4.2011f, 11.7366f, 4.837f, 12.0f, 5.5f, 12.0f)
                    close()
                    moveTo(21.0f, 6.0f)
                    horizontalLineTo(12.0f)
                    curveTo(11.2044f, 6.0f, 10.4413f, 6.3161f, 9.8787f, 6.8787f)
                    curveTo(9.3161f, 7.4413f, 9.0f, 8.2044f, 9.0f, 9.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(9.0f)
                    curveTo(24.0f, 8.2044f, 23.6839f, 7.4413f, 23.1213f, 6.8787f)
                    curveTo(22.5587f, 6.3161f, 21.7956f, 6.0f, 21.0f, 6.0f)
                    close()
                }
            }
        }
        .build()
        return _bed!!
    }

private var _bed: ImageVector? = null
