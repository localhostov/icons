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

public val Icons.Filled.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) {
            return _phoneSlash!!
        }
        _phoneSlash = Builder(name = "PhoneSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.957f, 1.457f)
                lineToRelative(-22.5f, 22.5f)
                lineTo(0.043f, 22.543f)
                lineToRelative(4.782f, -4.782f)
                curveTo(1.791f, 14.5f, 0.0f, 10.741f, 0.0f, 7.5f)
                arcTo(5.9f, 5.9f, 0.0f, false, true, 1.716f, 3.292f)
                lineTo(4.887f, 0.122f)
                lineToRelative(6.265f, 6.265f)
                lineTo(7.028f, 10.511f)
                arcToRelative(13.47f, 13.47f, 0.0f, false, false, 1.93f, 3.117f)
                lineTo(22.543f, 0.043f)
                close()
                moveTo(13.48f, 16.98f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, true, -1.461f, -0.76f)
                lineTo(7.783f, 20.456f)
                curveTo(10.7f, 22.694f, 13.835f, 24.0f, 16.5f, 24.0f)
                arcToRelative(5.889f, 5.889f, 0.0f, false, false, 4.207f, -1.716f)
                lineToRelative(3.171f, -3.171f)
                lineToRelative(-6.265f, -6.265f)
                close()
            }
        }
        .build()
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
