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

public val Icons.Filled.UserXmark: ImageVector
    get() {
        if (_userXmark != null) {
            return _userXmark!!
        }
        _userXmark = Builder(name = "UserXmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(11.309f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveTo(2.0f, 2.691f, 2.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(11.0f, 14.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(20.914f, 11.5f)
                lineToRelative(2.793f, 2.793f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.793f, -2.793f)
                lineToRelative(-2.793f, 2.793f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.793f, -2.793f)
                lineToRelative(-2.793f, -2.793f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.793f, 2.793f)
                lineToRelative(2.793f, -2.793f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.793f, 2.793f)
                close()
            }
        }
        .build()
        return _userXmark!!
    }

private var _userXmark: ImageVector? = null
