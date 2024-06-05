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

public val Icons.Bold.AxeBattle: ImageVector
    get() {
        if (_axeBattle != null) {
            return _axeBattle!!
        }
        _axeBattle = Builder(name = "AxeBattle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.391f, 1.022f)
                lineTo(19.342f, -0.005f)
                lineToRelative(-1.049f, 1.027f)
                curveToRelative(-0.928f, 0.908f, -2.651f, 2.319f, -4.792f, 2.806f)
                lineTo(13.501f, 1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.828f)
                curveToRelative(-2.141f, -0.487f, -3.865f, -1.898f, -4.792f, -2.806f)
                lineTo(4.658f, -0.005f)
                lineToRelative(-1.049f, 1.027f)
                curveTo(1.383f, 3.201f, 0.0f, 6.641f, 0.0f, 10.0f)
                curveToRelative(0.0f, 3.292f, 1.349f, 6.578f, 3.609f, 8.79f)
                lineToRelative(1.049f, 1.027f)
                lineToRelative(1.049f, -1.027f)
                curveToRelative(0.878f, -0.859f, 2.552f, -2.199f, 4.792f, -2.642f)
                verticalLineToRelative(7.852f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.852f)
                curveToRelative(2.241f, 0.443f, 3.914f, 1.783f, 4.792f, 2.642f)
                lineToRelative(1.049f, 1.027f)
                lineToRelative(1.049f, -1.027f)
                curveToRelative(2.26f, -2.212f, 3.609f, -5.498f, 3.609f, -8.79f)
                curveToRelative(0.0f, -3.359f, -1.383f, -6.799f, -3.609f, -8.978f)
                close()
                moveTo(4.805f, 15.599f)
                curveToRelative(-1.146f, -1.572f, -1.805f, -3.58f, -1.805f, -5.599f)
                curveToRelative(0.0f, -2.042f, 0.686f, -4.175f, 1.809f, -5.77f)
                curveToRelative(1.786f, 1.43f, 3.739f, 2.338f, 5.691f, 2.649f)
                verticalLineToRelative(6.229f)
                curveToRelative(-2.009f, 0.286f, -3.963f, 1.141f, -5.695f, 2.491f)
                close()
                moveTo(19.196f, 15.599f)
                curveToRelative(-1.732f, -1.351f, -3.686f, -2.205f, -5.695f, -2.491f)
                verticalLineToRelative(-6.229f)
                curveToRelative(1.953f, -0.311f, 3.906f, -1.219f, 5.691f, -2.649f)
                curveToRelative(1.123f, 1.595f, 1.809f, 3.728f, 1.809f, 5.77f)
                curveToRelative(0.0f, 2.019f, -0.659f, 4.027f, -1.805f, 5.599f)
                close()
            }
        }
        .build()
        return _axeBattle!!
    }

private var _axeBattle: ImageVector? = null
