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

public val Icons.Outline.MicrophoneSlash: ImageVector
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
                moveTo(4.0f, 8.243f)
                verticalLineToRelative(3.757f)
                curveToRelative(0.0f, 4.411f, 3.589f, 8.0f, 8.0f, 8.0f)
                curveToRelative(1.093f, 0.0f, 2.151f, -0.217f, 3.126f, -0.631f)
                lineToRelative(-1.571f, -1.571f)
                curveToRelative(-0.501f, 0.133f, -1.022f, 0.202f, -1.555f, 0.202f)
                curveToRelative(-2.968f, 0.0f, -5.439f, -2.166f, -5.916f, -5.0f)
                horizontalLineToRelative(2.674f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(-0.757f)
                verticalLineToRelative(-0.757f)
                lineToRelative(-2.0f, -2.0f)
                close()
                moveTo(21.453f, 20.039f)
                lineToRelative(2.504f, 2.504f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.043f, 1.457f)
                lineTo(1.457f, 0.043f)
                lineToRelative(3.74f, 3.74f)
                curveToRelative(1.44f, -2.335f, 3.984f, -3.783f, 6.803f, -3.783f)
                curveToRelative(4.411f, 0.0f, 8.0f, 3.589f, 8.0f, 8.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.797f, -0.591f, 3.508f, -1.68f, 4.906f)
                lineToRelative(1.712f, 1.712f)
                curveToRelative(1.275f, -1.59f, 1.968f, -3.554f, 1.968f, -5.618f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.598f, -0.899f, 5.066f, -2.547f, 7.039f)
                close()
                moveTo(17.917f, 13.0f)
                horizontalLineToRelative(-3.503f)
                lineToRelative(2.477f, 2.477f)
                curveToRelative(0.527f, -0.739f, 0.877f, -1.583f, 1.026f, -2.477f)
                close()
                moveTo(6.665f, 5.25f)
                lineToRelative(7.335f, 7.335f)
                verticalLineToRelative(-1.586f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.916f)
                curveToRelative(-0.477f, -2.834f, -2.948f, -5.0f, -5.916f, -5.0f)
                curveToRelative(-2.275f, 0.0f, -4.313f, 1.259f, -5.335f, 3.25f)
                close()
            }
        }
        .build()
        return _microphoneSlash!!
    }

private var _microphoneSlash: ImageVector? = null
