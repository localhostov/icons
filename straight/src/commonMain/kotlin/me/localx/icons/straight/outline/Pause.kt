package me.localx.icons.straight.outline

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

public val Icons.Outline.Pause: ImageVector
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
                    moveTo(10.0f, 24.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(5.0f, 22.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(22.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0001f, 24.0f)
                    horizontalLineTo(14.0001f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(21.0001f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(16.0001f, 22.0f)
                    horizontalLineTo(19.0001f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(16.0001f)
                    verticalLineTo(22.0f)
                    close()
                }
            }
        }
        .build()
        return _pause!!
    }

private var _pause: ImageVector? = null
