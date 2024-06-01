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

public val Icons.Filled.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0f, 14.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(14.0f)
                    close()
                    moveTo(13.0f, 24.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(24.0f, 10.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(8.953f)
                    curveTo(12.674f, 8.982f, 12.342f, 9.0f, 12.0f, 9.0f)
                    curveTo(11.658f, 9.0f, 11.326f, 8.982f, 11.0f, 8.953f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(10.0f)
                    curveTo(0.0f, 9.2044f, 0.3161f, 8.4413f, 0.8787f, 7.8787f)
                    curveTo(1.4413f, 7.3161f, 2.2043f, 7.0f, 3.0f, 7.0f)
                    horizontalLineTo(6.134f)
                    curveTo(5.4409f, 6.3681f, 4.8917f, 5.5946f, 4.5235f, 4.732f)
                    curveTo(4.1553f, 3.8693f, 3.9768f, 2.9376f, 4.0f, 2.0f)
                    horizontalLineTo(6.0f)
                    curveTo(6.0f, 4.881f, 7.971f, 6.307f, 10.152f, 6.8f)
                    curveTo(9.4971f, 5.6318f, 9.104f, 4.3352f, 9.0f, 3.0f)
                    curveTo(9.0f, 2.2043f, 9.3161f, 1.4413f, 9.8787f, 0.8787f)
                    curveTo(10.4413f, 0.3161f, 11.2044f, 0.0f, 12.0f, 0.0f)
                    curveTo(12.7956f, 0.0f, 13.5587f, 0.3161f, 14.1213f, 0.8787f)
                    curveTo(14.6839f, 1.4413f, 15.0f, 2.2043f, 15.0f, 3.0f)
                    curveTo(14.896f, 4.3352f, 14.5029f, 5.6318f, 13.848f, 6.8f)
                    curveTo(16.029f, 6.307f, 18.0f, 4.881f, 18.0f, 2.0f)
                    horizontalLineTo(20.0f)
                    curveTo(20.0232f, 2.9376f, 19.8447f, 3.8693f, 19.4765f, 4.732f)
                    curveTo(19.1083f, 5.5946f, 18.5591f, 6.3681f, 17.866f, 7.0f)
                    horizontalLineTo(21.0f)
                    curveTo(21.7956f, 7.0f, 22.5587f, 7.3161f, 23.1213f, 7.8787f)
                    curveTo(23.6839f, 8.4413f, 24.0f, 9.2044f, 24.0f, 10.0f)
                    close()
                    moveTo(11.0f, 3.0f)
                    curveTo(11.1207f, 4.0628f, 11.4613f, 5.0889f, 12.0f, 6.013f)
                    curveTo(12.5387f, 5.0889f, 12.8793f, 4.0628f, 13.0f, 3.0f)
                    curveTo(13.0f, 2.7348f, 12.8946f, 2.4804f, 12.7071f, 2.2929f)
                    curveTo(12.5196f, 2.1054f, 12.2652f, 2.0f, 12.0f, 2.0f)
                    curveTo(11.7348f, 2.0f, 11.4804f, 2.1054f, 11.2929f, 2.2929f)
                    curveTo(11.1054f, 2.4804f, 11.0f, 2.7348f, 11.0f, 3.0f)
                    close()
                }
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
