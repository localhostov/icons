package me.localx.icons.straight.bold

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

public val Icons.Bold.Pause: ImageVector
    get() {
        if (_pause != null) {
            return _pause!!
        }
        _pause = Builder(name = "Pause", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.0f, 24.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(6.0f, 21.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(21.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.9999f, 24.0f)
                    horizontalLineTo(12.9999f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(20.9999f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(15.9999f, 21.0f)
                    horizontalLineTo(17.9999f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(15.9999f)
                    verticalLineTo(21.0f)
                    close()
                }
            }
        }
        .build()
        return _pause!!
    }

private var _pause: ImageVector? = null
