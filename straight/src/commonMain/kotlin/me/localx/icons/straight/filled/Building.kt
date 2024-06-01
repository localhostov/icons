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

public val Icons.Filled.Building: ImageVector
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
                    moveTo(11.0f, 0.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 0.0f, 1.4413f, 0.3161f, 0.8787f, 0.8787f)
                    curveTo(0.3161f, 1.4413f, 0.0f, 2.2043f, 0.0f, 3.0f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(3.0f)
                    curveTo(14.0f, 2.2043f, 13.6839f, 1.4413f, 13.1213f, 0.8787f)
                    curveTo(12.5587f, 0.3161f, 11.7956f, 0.0f, 11.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(6.0f, 19.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(19.0f)
                    close()
                    moveTo(6.0f, 15.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(15.0f)
                    close()
                    moveTo(6.0f, 11.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(11.0f)
                    close()
                    moveTo(6.0f, 7.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(7.0f)
                    close()
                    moveTo(11.0f, 19.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(19.0f)
                    close()
                    moveTo(11.0f, 15.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(15.0f)
                    close()
                    moveTo(11.0f, 11.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(11.0f)
                    close()
                    moveTo(11.0f, 7.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(7.0f)
                    close()
                    moveTo(21.0f, 5.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(8.0f)
                    curveTo(24.0f, 7.2043f, 23.6839f, 6.4413f, 23.1213f, 5.8787f)
                    curveTo(22.5587f, 5.3161f, 21.7956f, 5.0f, 21.0f, 5.0f)
                    close()
                    moveTo(21.0f, 19.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(19.0f)
                    close()
                    moveTo(21.0f, 15.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(15.0f)
                    close()
                    moveTo(21.0f, 11.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(11.0f)
                    close()
                }
            }
        }
        .build()
        return _building!!
    }

private var _building: ImageVector? = null
