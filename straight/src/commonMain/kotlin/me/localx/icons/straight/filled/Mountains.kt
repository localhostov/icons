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

public val Icons.Filled.Mountains: ImageVector
    get() {
        if (_mountains != null) {
            return _mountains!!
        }
        _mountains = Builder(name = "Mountains", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 20.0f, 8.0f)
                close()
                moveTo(11.0f, 24.0f)
                verticalLineTo(22.781f)
                lineToRelative(4.277f, -9.343f)
                arcToRelative(2.462f, 2.462f, 0.0f, false, true, 4.446f, 0.0f)
                lineTo(24.0f, 22.737f)
                verticalLineToRelative(1.219f)
                close()
                moveTo(12.248f, 6.541f)
                arcToRelative(2.662f, 2.662f, 0.0f, false, false, -4.81f, 0.0f)
                lineTo(0.0f, 22.781f)
                verticalLineTo(24.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                lineToRelative(4.46f, -9.4f)
                arcToRelative(4.487f, 4.487f, 0.0f, false, true, 0.959f, -1.343f)
                close()
            }
        }
        .build()
        return _mountains!!
    }

private var _mountains: ImageVector? = null
