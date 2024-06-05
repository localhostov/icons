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

public val Icons.Filled.Forward: ImageVector
    get() {
        if (_forward != null) {
            return _forward!!
        }
        _forward = Builder(name = "Forward", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.74f, 9.25f)
                lineTo(9.0f, 0.137f)
                verticalLineTo(6.485f)
                lineTo(0.0f, 0.057f)
                verticalLineTo(23.943f)
                lineToRelative(9.0f, -6.428f)
                verticalLineToRelative(6.428f)
                lineToRelative(13.741f, -9.811f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -4.882f)
                close()
            }
        }
        .build()
        return _forward!!
    }

private var _forward: ImageVector? = null
