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

public val Icons.Outline.Videoconference: ImageVector
    get() {
        if (_videoconference != null) {
            return _videoconference!!
        }
        _videoconference = Builder(name = "Videoconference", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 15.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                lineTo(6.0f, 17.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(9.0f, 13.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(15.0f, 13.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(24.0f, 2.048f)
                verticalLineToRelative(5.952f)
                horizontalLineToRelative(-2.688f)
                lineToRelative(-1.375f, 1.138f)
                curveToRelative(-0.272f, 0.243f, -0.622f, 0.365f, -0.977f, 0.365f)
                curveToRelative(-0.363f, 0.0f, -0.729f, -0.128f, -1.021f, -0.388f)
                lineToRelative(-1.348f, -1.115f)
                horizontalLineToRelative(-2.592f)
                lineTo(13.999f, 2.048f)
                curveToRelative(0.0f, -1.129f, 0.918f, -2.048f, 2.048f, -2.048f)
                horizontalLineToRelative(5.904f)
                curveToRelative(1.129f, 0.0f, 2.048f, 0.918f, 2.048f, 2.048f)
                close()
                moveTo(22.0f, 2.048f)
                lineToRelative(-5.952f, -0.048f)
                lineToRelative(-0.038f, 4.0f)
                horizontalLineToRelative(1.303f)
                lineToRelative(1.64f, 1.358f)
                lineToRelative(1.639f, -1.358f)
                horizontalLineToRelative(1.408f)
                verticalLineToRelative(-3.952f)
                close()
                moveTo(22.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(2.0f, 6.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 8.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(4.914f)
                lineToRelative(1.0f, 1.0f)
                horizontalLineToRelative(4.172f)
                lineToRelative(1.0f, -1.0f)
                horizontalLineToRelative(4.914f)
                verticalLineToRelative(-6.711f)
                curveToRelative(0.458f, -0.14f, 0.88f, -0.359f, 1.213f, -0.658f)
                lineToRelative(0.787f, -0.651f)
                verticalLineToRelative(8.02f)
                close()
                moveTo(22.0f, 20.0f)
                horizontalLineToRelative(-6.086f)
                lineToRelative(-1.0f, 1.0f)
                horizontalLineToRelative(-5.828f)
                lineToRelative(-1.0f, -1.0f)
                lineTo(2.0f, 20.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _videoconference!!
    }

private var _videoconference: ImageVector? = null
