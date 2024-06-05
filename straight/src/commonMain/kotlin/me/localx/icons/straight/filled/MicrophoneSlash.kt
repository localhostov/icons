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

public val Icons.Filled.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) {
            return _microphoneSlash!!
        }
        _microphoneSlash = Builder(name = "MicrophoneSlash", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.883f, 21.125f)
                lineToRelative(1.483f, 1.483f)
                curveToRelative(-1.62f, 0.908f, -3.453f, 1.392f, -5.366f, 1.392f)
                horizontalLineToRelative(-2.0f)
                curveTo(4.935f, 24.0f, 0.0f, 19.065f, 0.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 4.962f, 4.038f, 9.0f, 9.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.368f, 0.0f, 2.687f, -0.302f, 3.883f, -0.875f)
                close()
                moveTo(24.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 2.075f, -0.7f, 4.048f, -1.987f, 5.642f)
                lineToRelative(-1.736f, -1.736f)
                curveToRelative(0.885f, -1.136f, 1.441f, -2.478f, 1.618f, -3.906f)
                horizontalLineToRelative(-5.895f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.957f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.957f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.895f)
                curveToRelative(-0.494f, -3.941f, -3.865f, -7.0f, -7.938f, -7.0f)
                curveToRelative(-2.818f, 0.0f, -5.362f, 1.448f, -6.803f, 3.783f)
                lineTo(1.414f, 0.043f)
                lineTo(0.0f, 1.457f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.48f, -2.48f)
                curveToRelative(1.661f, -1.977f, 2.566f, -4.454f, 2.566f, -7.063f)
                close()
                moveTo(4.0f, 11.0f)
                horizontalLineToRelative(2.757f)
                lineToRelative(-2.757f, -2.757f)
                verticalLineToRelative(2.757f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(1.093f, 0.0f, 2.151f, -0.217f, 3.126f, -0.631f)
                lineToRelative(-6.369f, -6.369f)
                horizontalLineToRelative(-4.695f)
                curveToRelative(0.494f, 3.941f, 3.865f, 7.0f, 7.938f, 7.0f)
                close()
            }
        }
        .build()
        return _microphoneSlash!!
    }

private var _microphoneSlash: ImageVector? = null
