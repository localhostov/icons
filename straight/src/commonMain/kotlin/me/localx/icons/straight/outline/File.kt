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

public val Icons.Outline.File: ImageVector
    get() {
        if (_file != null) {
            return _file!!
        }
        _file = Builder(name = "File", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.4137f, 0.0f)
                    horizontalLineTo(4.9997f)
                    curveTo(4.2041f, 0.0f, 3.441f, 0.3161f, 2.8784f, 0.8787f)
                    curveTo(2.3158f, 1.4413f, 1.9997f, 2.2043f, 1.9997f, 3.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(21.9997f)
                    verticalLineTo(7.586f)
                    lineTo(14.4137f, 0.0f)
                    close()
                    moveTo(14.9997f, 3.414f)
                    lineTo(18.5857f, 7.0f)
                    horizontalLineTo(14.9997f)
                    verticalLineTo(3.414f)
                    close()
                    moveTo(3.9997f, 22.0f)
                    verticalLineTo(3.0f)
                    curveTo(3.9997f, 2.7348f, 4.1051f, 2.4804f, 4.2926f, 2.2929f)
                    curveTo(4.4801f, 2.1054f, 4.7345f, 2.0f, 4.9997f, 2.0f)
                    horizontalLineTo(12.9997f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(19.9997f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(3.9997f)
                    close()
                }
            }
        }
        .build()
        return _file!!
    }

private var _file: ImageVector? = null
