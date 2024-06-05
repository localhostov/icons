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

public val Icons.Bold.Filters: ImageVector
    get() {
        if (_filters != null) {
            return _filters!!
        }
        _filters = Builder(name = "Filters", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 20.93f)
                lineToRelative(-8.0f, -6.194f)
                verticalLineToRelative(-2.615f)
                lineTo(4.0f, 6.121f)
                lineTo(4.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(2.621f)
                lineToRelative(-6.0f, 6.0f)
                verticalLineToRelative(8.809f)
                close()
                moveTo(13.0f, 13.264f)
                lineToRelative(2.0f, 1.549f)
                verticalLineToRelative(-3.934f)
                lineToRelative(6.0f, -6.0f)
                verticalLineToRelative(-1.379f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                lineTo(7.5f, 3.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(1.379f)
                lineToRelative(6.0f, 6.0f)
                verticalLineToRelative(2.385f)
                close()
                moveTo(0.0f, 6.5f)
                verticalLineToRelative(2.621f)
                lineToRelative(6.0f, 6.0f)
                verticalLineToRelative(2.615f)
                lineToRelative(8.0f, 6.194f)
                verticalLineToRelative(-3.794f)
                lineToRelative(-5.0f, -3.872f)
                verticalLineToRelative(-2.385f)
                lineTo(2.0f, 7.0f)
                lineTo(2.0f, 3.338f)
                curveTo(0.819f, 3.901f, 0.0f, 5.107f, 0.0f, 6.5f)
                close()
            }
        }
        .build()
        return _filters!!
    }

private var _filters: ImageVector? = null
