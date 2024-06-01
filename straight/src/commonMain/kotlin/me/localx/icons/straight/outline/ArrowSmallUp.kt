package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.ArrowSmallUp: ImageVector
    get() {
        if (_arrowSmallUp != null) {
            return _arrowSmallUp!!
        }
        _arrowSmallUp = Builder(name = "ArrowSmallUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7072f, 9.8789f)
                lineTo(13.4142f, 5.5859f)
                curveTo(13.0391f, 5.211f, 12.5305f, 5.0004f, 12.0002f, 5.0004f)
                curveTo(11.4698f, 5.0004f, 10.9612f, 5.211f, 10.5862f, 5.5859f)
                lineTo(6.2931f, 9.8789f)
                lineTo(7.7071f, 11.2929f)
                lineTo(11.0002f, 7.9999f)
                verticalLineTo(18.9999f)
                horizontalLineTo(13.0002f)
                verticalLineTo(7.9999f)
                lineTo(16.2932f, 11.2929f)
                lineTo(17.7072f, 9.8789f)
                close()
            }
        }
        .build()
        return _arrowSmallUp!!
    }

private var _arrowSmallUp: ImageVector? = null
