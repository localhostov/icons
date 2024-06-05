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

public val Icons.Filled.Tie: ImageVector
    get() {
        if (_tie != null) {
            return _tie!!
        }
        _tie = Builder(name = "Tie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 4.0f)
                lineToRelative(-1.0f, -4.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(-1.0f, 4.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(10.0f, 6.0f)
                lineToRelative(-3.5f, 13.0f)
                lineToRelative(5.5f, 5.0f)
                lineToRelative(5.5f, -5.0f)
                lineToRelative(-3.5f, -13.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _tie!!
    }

private var _tie: ImageVector? = null
