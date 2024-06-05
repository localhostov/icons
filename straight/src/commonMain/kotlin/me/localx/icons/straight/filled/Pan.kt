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

public val Icons.Filled.Pan: ImageVector
    get() {
        if (_pan != null) {
            return _pan!!
        }
        _pan = Builder(name = "Pan", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 0.0f)
                arcTo(9.979f, 9.979f, 0.0f, false, false, 5.448f, 15.156f)
                lineTo(0.0f, 20.605f)
                lineTo(3.4f, 24.0f)
                lineToRelative(5.449f, -5.448f)
                arcTo(9.994f, 9.994f, 0.0f, true, false, 14.0f, 0.0f)
                close()
                moveTo(14.0f, 17.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 14.0f, 3.0f)
                lineTo(14.0f, 5.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 5.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                arcTo(7.009f, 7.009f, 0.0f, false, true, 14.0f, 17.0f)
                close()
            }
        }
        .build()
        return _pan!!
    }

private var _pan: ImageVector? = null
