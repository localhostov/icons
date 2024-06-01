package me.localx.icons.rounded.outline

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
import me.localx.icons.rounded.Icons

public val Icons.Outline.Plus: ImageVector
    get() {
        if (_plus != null) {
            return _plus!!
        }
        _plus = Builder(name = "Plus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.0f, 11.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(1.0f)
                    curveTo(13.0f, 0.7348f, 12.8946f, 0.4804f, 12.7071f, 0.2929f)
                    curveTo(12.5196f, 0.1054f, 12.2652f, 0.0f, 12.0f, 0.0f)
                    verticalLineTo(0.0f)
                    curveTo(11.7348f, 0.0f, 11.4804f, 0.1054f, 11.2929f, 0.2929f)
                    curveTo(11.1054f, 0.4804f, 11.0f, 0.7348f, 11.0f, 1.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(1.0f)
                    curveTo(0.7348f, 11.0f, 0.4804f, 11.1054f, 0.2929f, 11.2929f)
                    curveTo(0.1054f, 11.4804f, 0.0f, 11.7348f, 0.0f, 12.0f)
                    horizontalLineTo(0.0f)
                    curveTo(0.0f, 12.2652f, 0.1054f, 12.5196f, 0.2929f, 12.7071f)
                    curveTo(0.4804f, 12.8946f, 0.7348f, 13.0f, 1.0f, 13.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(23.0f)
                    curveTo(11.0f, 23.2652f, 11.1054f, 23.5196f, 11.2929f, 23.7071f)
                    curveTo(11.4804f, 23.8946f, 11.7348f, 24.0f, 12.0f, 24.0f)
                    curveTo(12.2652f, 24.0f, 12.5196f, 23.8946f, 12.7071f, 23.7071f)
                    curveTo(12.8946f, 23.5196f, 13.0f, 23.2652f, 13.0f, 23.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(23.0f)
                    curveTo(23.2652f, 13.0f, 23.5196f, 12.8946f, 23.7071f, 12.7071f)
                    curveTo(23.8946f, 12.5196f, 24.0f, 12.2652f, 24.0f, 12.0f)
                    curveTo(24.0f, 11.7348f, 23.8946f, 11.4804f, 23.7071f, 11.2929f)
                    curveTo(23.5196f, 11.1054f, 23.2652f, 11.0f, 23.0f, 11.0f)
                    close()
                }
            }
        }
        .build()
        return _plus!!
    }

private var _plus: ImageVector? = null
