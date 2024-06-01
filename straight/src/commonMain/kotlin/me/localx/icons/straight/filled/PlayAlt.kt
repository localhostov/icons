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

public val Icons.Filled.PlayAlt: ImageVector
    get() {
        if (_playAlt != null) {
            return _playAlt!!
        }
        _playAlt = Builder(name = "PlayAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.984f, 12.0f)
                    lineTo(10.0f, 14.277f)
                    verticalLineTo(9.723f)
                    lineTo(13.984f, 12.0f)
                    close()
                    moveTo(24.0f, 3.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(3.0f)
                    curveTo(0.0f, 2.2043f, 0.3161f, 1.4413f, 0.8787f, 0.8787f)
                    curveTo(1.4413f, 0.3161f, 2.2043f, 0.0f, 3.0f, 0.0f)
                    lineTo(21.0f, 0.0f)
                    curveTo(21.7956f, 0.0f, 22.5587f, 0.3161f, 23.1213f, 0.8787f)
                    curveTo(23.6839f, 1.4413f, 24.0f, 2.2043f, 24.0f, 3.0f)
                    close()
                    moveTo(18.016f, 12.0f)
                    lineTo(8.0f, 6.277f)
                    verticalLineTo(17.723f)
                    lineTo(18.016f, 12.0f)
                    close()
                }
            }
        }
        .build()
        return _playAlt!!
    }

private var _playAlt: ImageVector? = null
