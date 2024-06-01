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

public val Icons.Outline.Duplicate: ImageVector
    get() {
        if (_duplicate != null) {
            return _duplicate!!
        }
        _duplicate = Builder(name = "Duplicate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0002f, 4.145f)
                    lineTo(17.9862f, 0.0f)
                    horizontalLineTo(10.0002f)
                    curveTo(9.2045f, 0.0f, 8.4414f, 0.3161f, 7.8788f, 0.8787f)
                    curveTo(7.3162f, 1.4413f, 7.0002f, 2.2043f, 7.0002f, 3.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(5.0002f)
                    curveTo(4.2045f, 4.0f, 3.4414f, 4.3161f, 2.8788f, 4.8787f)
                    curveTo(2.3162f, 5.4413f, 2.0001f, 6.2043f, 2.0001f, 7.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(18.0002f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(22.0002f)
                    verticalLineTo(4.145f)
                    close()
                    moveTo(16.0002f, 22.0f)
                    horizontalLineTo(4.0002f)
                    verticalLineTo(7.0f)
                    curveTo(4.0002f, 6.7348f, 4.1055f, 6.4804f, 4.293f, 6.2929f)
                    curveTo(4.4806f, 6.1054f, 4.7349f, 6.0f, 5.0002f, 6.0f)
                    horizontalLineTo(7.0002f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(16.0002f)
                    verticalLineTo(22.0f)
                    close()
                    moveTo(9.0001f, 17.0f)
                    verticalLineTo(3.0f)
                    curveTo(9.0001f, 2.7348f, 9.1055f, 2.4804f, 9.293f, 2.2929f)
                    curveTo(9.4806f, 2.1054f, 9.7349f, 2.0f, 10.0002f, 2.0f)
                    horizontalLineTo(16.0002f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(20.0002f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(9.0001f)
                    close()
                }
            }
        }
        .build()
        return _duplicate!!
    }

private var _duplicate: ImageVector? = null
