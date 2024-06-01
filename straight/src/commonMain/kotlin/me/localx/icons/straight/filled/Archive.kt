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

public val Icons.Filled.Archive: ImageVector
    get() {
        if (_archive != null) {
            return _archive!!
        }
        _archive = Builder(name = "Archive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0002f, 0.0f)
                    horizontalLineTo(5.0002f)
                    curveTo(4.2045f, 0.0f, 3.4414f, 0.3161f, 2.8788f, 0.8787f)
                    curveTo(2.3162f, 1.4413f, 2.0001f, 2.2043f, 2.0001f, 3.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(22.0002f)
                    verticalLineTo(3.0f)
                    curveTo(22.0002f, 2.2043f, 21.6841f, 1.4413f, 21.1215f, 0.8787f)
                    curveTo(20.5589f, 0.3161f, 19.7958f, 0.0f, 19.0002f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(14.0002f, 7.0f)
                    horizontalLineTo(10.0002f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(14.0002f)
                    verticalLineTo(7.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0001f, 13.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(22.0002f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(2.0001f)
                    close()
                    moveTo(14.0002f, 19.0f)
                    horizontalLineTo(10.0002f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(14.0002f)
                    verticalLineTo(19.0f)
                    close()
                }
            }
        }
        .build()
        return _archive!!
    }

private var _archive: ImageVector? = null
