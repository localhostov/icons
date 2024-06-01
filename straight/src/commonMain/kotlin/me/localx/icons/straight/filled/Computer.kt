package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Computer: ImageVector
    get() {
        if (_computer != null) {
            return _computer!!
        }
        _computer = Builder(name = "Computer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 12.9999f)
                    verticalLineTo(3.9999f)
                    curveTo(24.0f, 3.2042f, 23.6839f, 2.4412f, 23.1213f, 1.8786f)
                    curveTo(22.5587f, 1.316f, 21.7956f, 0.9999f, 21.0f, 0.9999f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 0.9999f, 1.4413f, 1.316f, 0.8787f, 1.8786f)
                    curveTo(0.3161f, 2.4412f, 0.0f, 3.2042f, 0.0f, 3.9999f)
                    lineTo(0.0f, 12.9999f)
                    horizontalLineTo(24.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 19.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(23.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(24.0f)
                    close()
                }
            }
        }
        .build()
        return _computer!!
    }

private var _computer: ImageVector? = null
