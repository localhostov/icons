package me.localx.icons.straight.outline

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

public val Icons.Outline.UserHelmetSafety: ImageVector
    get() {
        if (_userHelmetSafety != null) {
            return _userHelmetSafety!!
        }
        _userHelmetSafety = Builder(name = "UserHelmetSafety", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 9.0f)
                curveToRelative(0.0f, 1.687f, 0.716f, 3.305f, 1.965f, 4.44f)
                curveToRelative(1.106f, 1.006f, 2.556f, 1.559f, 4.048f, 1.559f)
                curveToRelative(0.19f, 0.0f, 0.382f, -0.009f, 0.573f, -0.027f)
                curveToRelative(3.036f, -0.29f, 5.414f, -3.007f, 5.414f, -6.187f)
                verticalLineToRelative(-0.785f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -3.033f, -2.467f, -5.5f, -5.5f, -5.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, 2.467f, -5.5f, 5.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(16.0f, 8.785f)
                curveToRelative(0.0f, 2.16f, -1.583f, 4.003f, -3.604f, 4.196f)
                curveToRelative(-1.145f, 0.108f, -2.242f, -0.253f, -3.086f, -1.021f)
                curveToRelative(-0.833f, -0.757f, -1.31f, -1.836f, -1.31f, -2.96f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(0.785f)
                close()
                moveTo(8.0f, 5.5f)
                curveToRelative(0.0f, -1.76f, 1.306f, -3.221f, 3.0f, -3.464f)
                verticalLineToRelative(2.964f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.964f)
                curveToRelative(1.694f, 0.243f, 3.0f, 1.704f, 3.0f, 3.464f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(21.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _userHelmetSafety!!
    }

private var _userHelmetSafety: ImageVector? = null
