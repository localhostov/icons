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

public val Icons.Filled.Filters: ImageVector
    get() {
        if (_filters != null) {
            return _filters!!
        }
        _filters = Builder(name = "Filters", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 20.0f)
                lineToRelative(-6.0f, -4.5f)
                verticalLineToRelative(-3.086f)
                lineTo(4.0f, 5.414f)
                lineTo(4.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(2.414f)
                lineToRelative(-7.0f, 7.0f)
                verticalLineToRelative(7.586f)
                close()
                moveTo(9.0f, 13.243f)
                lineTo(2.0f, 6.243f)
                verticalLineToRelative(-2.058f)
                curveToRelative(-1.161f, 0.414f, -2.0f, 1.514f, -2.0f, 2.816f)
                verticalLineToRelative(2.414f)
                lineToRelative(7.0f, 7.0f)
                verticalLineToRelative(3.086f)
                lineToRelative(6.0f, 4.5f)
                verticalLineToRelative(-4.5f)
                lineToRelative(-4.0f, -3.0f)
                verticalLineToRelative(-3.257f)
                close()
            }
        }
        .build()
        return _filters!!
    }

private var _filters: ImageVector? = null
