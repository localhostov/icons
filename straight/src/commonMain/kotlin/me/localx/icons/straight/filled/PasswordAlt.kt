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

public val Icons.Filled.PasswordAlt: ImageVector
    get() {
        if (_passwordAlt != null) {
            return _passwordAlt!!
        }
        _passwordAlt = Builder(name = "PasswordAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 22.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.552f, 0.449f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(22.0f, 21.0f)
                curveToRelative(0.0f, 0.552f, -0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(21.0f, 0.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                lineTo(7.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                lineTo(2.0f, 3.0f)
                close()
                moveTo(13.793f, 8.793f)
                lineToRelative(-1.793f, 1.793f)
                lineToRelative(-1.793f, -1.793f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(-1.793f, 1.793f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.793f, -1.793f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-1.793f, -1.793f)
                lineToRelative(1.793f, -1.793f)
                lineToRelative(-1.414f, -1.414f)
                close()
                moveTo(18.207f, 15.207f)
                lineToRelative(1.793f, -1.793f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-1.793f, -1.793f)
                lineToRelative(1.793f, -1.793f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-1.793f, 1.793f)
                lineToRelative(-1.793f, -1.793f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(-1.793f, 1.793f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(5.793f, 8.793f)
                lineToRelative(-1.793f, 1.793f)
                lineToRelative(-1.793f, -1.793f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(-1.793f, 1.793f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.793f, -1.793f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-1.793f, -1.793f)
                lineToRelative(1.793f, -1.793f)
                lineToRelative(-1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _passwordAlt!!
    }

private var _passwordAlt: ImageVector? = null
