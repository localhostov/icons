package me.localx.icons.straight.filled

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

public val Icons.Filled.ArrowSmallDown: ImageVector
    get() {
        if (_arrowSmallDown != null) {
            return _arrowSmallDown!!
        }
        _arrowSmallDown = Builder(name = "ArrowSmallDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.2932f, 12.707f)
                lineTo(13.0002f, 16.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0002f)
                verticalLineTo(16.0f)
                lineTo(7.7071f, 12.707f)
                lineTo(6.2931f, 14.121f)
                lineTo(10.5862f, 18.414f)
                curveTo(10.9612f, 18.7889f, 11.4698f, 18.9996f, 12.0002f, 18.9996f)
                curveTo(12.5305f, 18.9996f, 13.0391f, 18.7889f, 13.4142f, 18.414f)
                lineTo(17.7072f, 14.121f)
                lineTo(16.2932f, 12.707f)
                close()
            }
        }
        .build()
        return _arrowSmallDown!!
    }

private var _arrowSmallDown: ImageVector? = null
