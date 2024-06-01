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

public val Icons.Filled.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = Builder(name = "Filter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.0001f, 24.0f)
                    lineTo(9.0001f, 19.5f)
                    verticalLineTo(14.38f)
                    lineTo(1.0001f, 5.38f)
                    verticalLineTo(3.0f)
                    curveTo(1.0001f, 2.2043f, 1.3161f, 1.4413f, 1.8787f, 0.8787f)
                    curveTo(2.4413f, 0.3161f, 3.2044f, 0.0f, 4.0001f, 0.0f)
                    lineTo(20.0001f, 0.0f)
                    curveTo(20.7957f, 0.0f, 21.5588f, 0.3161f, 22.1214f, 0.8787f)
                    curveTo(22.684f, 1.4413f, 23.0001f, 2.2043f, 23.0001f, 3.0f)
                    verticalLineTo(5.38f)
                    lineTo(15.0001f, 14.38f)
                    verticalLineTo(24.0f)
                    close()
                }
            }
        }
        .build()
        return _filter!!
    }

private var _filter: ImageVector? = null
