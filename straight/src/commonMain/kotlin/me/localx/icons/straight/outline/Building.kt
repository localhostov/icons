package me.localx.icons.straight.outline

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

public val Icons.Outline.Building: ImageVector
    get() {
        if (_building != null) {
            return _building!!
        }
        _building = Builder(name = "Building", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(4.0f, 13.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(13.0f)
                    close()
                    moveTo(9.0f, 15.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(15.0f)
                    close()
                    moveTo(4.0f, 19.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(19.0f)
                    close()
                    moveTo(9.0f, 19.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(19.0f)
                    close()
                    moveTo(4.0f, 7.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(7.0f)
                    close()
                    moveTo(9.0f, 7.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(7.0f)
                    close()
                    moveTo(4.0f, 11.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(11.0f)
                    close()
                    moveTo(9.0f, 11.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(11.0f)
                    close()
                    moveTo(24.0f, 8.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(3.0f)
                    curveTo(0.0f, 2.2043f, 0.3161f, 1.4413f, 0.8787f, 0.8787f)
                    curveTo(1.4413f, 0.3161f, 2.2043f, 0.0f, 3.0f, 0.0f)
                    lineTo(13.0f, 0.0f)
                    curveTo(13.7956f, 0.0f, 14.5587f, 0.3161f, 15.1213f, 0.8787f)
                    curveTo(15.6839f, 1.4413f, 16.0f, 2.2043f, 16.0f, 3.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(21.0f)
                    curveTo(21.7956f, 5.0f, 22.5587f, 5.3161f, 23.1213f, 5.8787f)
                    curveTo(23.6839f, 6.4413f, 24.0f, 7.2043f, 24.0f, 8.0f)
                    close()
                    moveTo(14.0f, 3.0f)
                    curveTo(14.0f, 2.7348f, 13.8946f, 2.4804f, 13.7071f, 2.2929f)
                    curveTo(13.5196f, 2.1054f, 13.2652f, 2.0f, 13.0f, 2.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.7348f, 2.0f, 2.4804f, 2.1054f, 2.2929f, 2.2929f)
                    curveTo(2.1054f, 2.4804f, 2.0f, 2.7348f, 2.0f, 3.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(3.0f)
                    close()
                    moveTo(22.0f, 8.0f)
                    curveTo(22.0f, 7.7348f, 21.8946f, 7.4804f, 21.7071f, 7.2929f)
                    curveTo(21.5196f, 7.1054f, 21.2652f, 7.0f, 21.0f, 7.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(8.0f)
                    close()
                    moveTo(18.0f, 15.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(15.0f)
                    close()
                    moveTo(18.0f, 19.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(19.0f)
                    close()
                    moveTo(18.0f, 11.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(11.0f)
                    close()
                }
            }
        }
        .build()
        return _building!!
    }

private var _building: ImageVector? = null
