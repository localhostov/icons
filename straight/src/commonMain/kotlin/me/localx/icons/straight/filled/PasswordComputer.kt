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

public val Icons.Filled.PasswordComputer: ImageVector
    get() {
        if (_passwordComputer != null) {
            return _passwordComputer!!
        }
        _passwordComputer = Builder(name = "PasswordComputer", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 19.0f)
                lineTo(24.0f, 4.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 1.0f)
                curveTo(1.346f, 1.0f, 0.0f, 2.346f, 0.0f, 4.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(16.155f, 8.465f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.503f, 1.503f)
                lineToRelative(1.503f, -1.503f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.503f, 1.503f)
                lineToRelative(1.503f, 1.503f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-1.503f, -1.503f)
                lineToRelative(-1.503f, 1.503f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.503f, -1.503f)
                lineToRelative(-1.503f, -1.503f)
                close()
                moveTo(7.844f, 11.471f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-1.503f, -1.503f)
                lineToRelative(-1.503f, 1.503f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.503f, -1.503f)
                lineToRelative(-1.503f, -1.503f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.503f, 1.503f)
                lineToRelative(1.503f, -1.503f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.503f, 1.503f)
                lineToRelative(1.503f, 1.503f)
                close()
                moveTo(10.496f, 12.885f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.503f, -1.503f)
                lineToRelative(-1.503f, -1.503f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.503f, 1.503f)
                lineToRelative(1.503f, -1.503f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.503f, 1.503f)
                lineToRelative(1.503f, 1.503f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-1.503f, -1.503f)
                lineToRelative(-1.503f, 1.503f)
                close()
            }
        }
        .build()
        return _passwordComputer!!
    }

private var _passwordComputer: ImageVector? = null
