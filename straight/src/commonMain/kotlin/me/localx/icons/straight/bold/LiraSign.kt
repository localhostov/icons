package me.localx.icons.straight.bold

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

public val Icons.Bold.LiraSign: ImageVector
    get() {
        if (_liraSign != null) {
            return _liraSign!!
        }
        _liraSign = Builder(name = "LiraSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 13.0f)
                curveToRelative(0.0f, 4.561f, -3.654f, 8.0f, -8.5f, 8.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-6.716f)
                lineToRelative(8.0f, -2.195f)
                verticalLineToRelative(-3.089f)
                lineToRelative(-8.0f, 2.195f)
                verticalLineToRelative(-2.115f)
                lineToRelative(8.0f, -2.195f)
                verticalLineTo(3.796f)
                lineToRelative(-8.0f, 2.195f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(6.814f)
                lineToRelative(-4.0f, 1.097f)
                verticalLineToRelative(3.089f)
                lineToRelative(4.0f, -1.097f)
                verticalLineToRelative(2.115f)
                lineToRelative(-4.0f, 1.097f)
                verticalLineToRelative(3.089f)
                lineToRelative(4.0f, -1.097f)
                verticalLineToRelative(8.893f)
                horizontalLineToRelative(4.5f)
                curveToRelative(6.449f, 0.0f, 11.5f, -4.832f, 11.5f, -11.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _liraSign!!
    }

private var _liraSign: ImageVector? = null
