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

public val Icons.Filled.PhonePause: ImageVector
    get() {
        if (_phonePause != null) {
            return _phonePause!!
        }
        _phonePause = Builder(name = "PhonePause", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.878f, 19.113f)
                lineToRelative(-3.171f, 3.172f)
                arcTo(5.893f, 5.893f, 0.0f, false, true, 16.5f, 24.0f)
                curveTo(9.252f, 24.0f, 0.0f, 14.748f, 0.0f, 7.5f)
                arcTo(5.887f, 5.887f, 0.0f, false, true, 1.717f, 3.292f)
                lineTo(4.887f, 0.122f)
                lineToRelative(6.264f, 6.265f)
                lineTo(7.027f, 10.512f)
                arcToRelative(12.135f, 12.135f, 0.0f, false, false, 6.453f, 6.469f)
                lineToRelative(4.133f, -4.133f)
                close()
                moveTo(22.0f, 0.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 0.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _phonePause!!
    }

private var _phonePause: ImageVector? = null
