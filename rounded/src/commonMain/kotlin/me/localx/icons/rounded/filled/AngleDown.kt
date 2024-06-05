package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.AngleDown: ImageVector
    get() {
        if (_angleDown != null) {
            return _angleDown!!
        }
        _angleDown = Builder(name = "AngleDown", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.51f, 6.079f)
                arcToRelative(1.492f, 1.492f, 0.0f, false, true, 1.06f, 0.44f)
                lineToRelative(7.673f, 7.672f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 3.536f, 0.0f)
                lineTo(21.44f, 6.529f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 23.561f, 8.65f)
                lineTo(15.9f, 16.312f)
                arcToRelative(5.505f, 5.505f, 0.0f, false, true, -7.778f, 0.0f)
                lineTo(0.449f, 8.64f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.51f, 6.079f)
                close()
            }
        }
        .build()
        return _angleDown!!
    }

private var _angleDown: ImageVector? = null
