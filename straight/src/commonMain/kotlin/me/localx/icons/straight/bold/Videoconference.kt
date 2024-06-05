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

public val Icons.Bold.Videoconference: ImageVector
    get() {
        if (_videoconference != null) {
            return _videoconference!!
        }
        _videoconference = Builder(name = "Videoconference", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 16.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                lineTo(6.0f, 18.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(9.0f, 14.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(15.0f, 14.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(22.0f, 10.4f)
                lineToRelative(-0.674f, 0.719f)
                curveToRelative(-0.64f, 0.568f, -1.466f, 0.881f, -2.326f, 0.881f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-3.308f)
                lineToRelative(-0.923f, 1.0f)
                horizontalLineToRelative(-5.538f)
                lineToRelative(-0.923f, -1.0f)
                horizontalLineToRelative(-3.308f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-3.0f)
                lineTo(2.0f, 6.0f)
                verticalLineToRelative(13.0f)
                lineTo(0.0f, 19.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.6f)
                close()
                moveTo(24.0f, 2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.34f)
                lineToRelative(-1.271f, 1.388f)
                curveToRelative(-0.362f, 0.391f, -0.868f, 0.612f, -1.392f, 0.612f)
                horizontalLineToRelative(-0.004f)
                curveToRelative(-0.526f, -0.001f, -1.032f, -0.224f, -1.388f, -0.611f)
                lineToRelative(-1.267f, -1.389f)
                horizontalLineToRelative(-2.338f)
                lineTo(14.0f, 2.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(21.0f, 3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(0.662f)
                lineToRelative(1.336f, 1.465f)
                lineToRelative(1.342f, -1.465f)
                horizontalLineToRelative(0.66f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _videoconference!!
    }

private var _videoconference: ImageVector? = null
