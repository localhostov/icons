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

public val Icons.Outline.Checkbox: ImageVector
    get() {
        if (_checkbox != null) {
            return _checkbox!!
        }
        _checkbox = Builder(name = "Checkbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 24.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(3.0f)
                    curveTo(0.0f, 2.2043f, 0.3161f, 1.4413f, 0.8787f, 0.8787f)
                    curveTo(1.4413f, 0.3161f, 2.2043f, 0.0f, 3.0f, 0.0f)
                    lineTo(21.0f, 0.0f)
                    curveTo(21.7956f, 0.0f, 22.5587f, 0.3161f, 23.1213f, 0.8787f)
                    curveTo(23.6839f, 1.4413f, 24.0f, 2.2043f, 24.0f, 3.0f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(2.0f, 22.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(3.0f)
                    curveTo(22.0f, 2.7348f, 21.8946f, 2.4804f, 21.7071f, 2.2929f)
                    curveTo(21.5196f, 2.1054f, 21.2652f, 2.0f, 21.0f, 2.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.7348f, 2.0f, 2.4804f, 2.1054f, 2.2929f, 2.2929f)
                    curveTo(2.1054f, 2.4804f, 2.0f, 2.7348f, 2.0f, 3.0f)
                    verticalLineTo(22.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.3331f, 17.9192f)
                    curveTo(9.0704f, 17.92f, 8.8101f, 17.8686f, 8.5674f, 17.768f)
                    curveTo(8.3247f, 17.6674f, 8.1043f, 17.5196f, 7.9191f, 17.3332f)
                    lineTo(3.2931f, 12.7072f)
                    lineTo(4.7071f, 11.2932f)
                    lineTo(9.3331f, 15.9192f)
                    lineTo(19.2932f, 5.9602f)
                    lineTo(20.7072f, 7.3742f)
                    lineTo(10.7482f, 17.3332f)
                    curveTo(10.5628f, 17.5196f, 10.3423f, 17.6674f, 10.0994f, 17.768f)
                    curveTo(9.8565f, 17.8686f, 9.5961f, 17.92f, 9.3331f, 17.9192f)
                    close()
                }
            }
        }
        .build()
        return _checkbox!!
    }

private var _checkbox: ImageVector? = null
