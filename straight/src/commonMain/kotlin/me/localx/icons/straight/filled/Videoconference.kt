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

public val Icons.Filled.Videoconference: ImageVector
    get() {
        if (_videoconference != null) {
            return _videoconference!!
        }
        _videoconference = Builder(name = "Videoconference", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 20.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.145f)
                lineToRelative(0.846f, 1.0f)
                horizontalLineToRelative(6.023f)
                lineToRelative(0.846f, -1.0f)
                horizontalLineToRelative(8.14f)
                close()
                moveTo(21.952f, 0.0f)
                horizontalLineToRelative(-5.904f)
                curveToRelative(-1.129f, 0.0f, -2.048f, 0.918f, -2.048f, 2.048f)
                verticalLineToRelative(4.949f)
                horizontalLineToRelative(2.592f)
                lineToRelative(1.348f, 1.115f)
                curveToRelative(0.292f, 0.26f, 0.659f, 0.388f, 1.021f, 0.388f)
                curveToRelative(0.354f, 0.0f, 0.705f, -0.123f, 0.977f, -0.365f)
                lineToRelative(1.375f, -1.138f)
                horizontalLineToRelative(2.688f)
                lineTo(24.001f, 2.048f)
                curveToRelative(0.0f, -1.129f, -0.918f, -2.048f, -2.048f, -2.048f)
                close()
                moveTo(22.0f, 10.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-7.068f)
                lineToRelative(-0.846f, 1.0f)
                horizontalLineToRelative(-4.157f)
                lineToRelative(-0.846f, -1.0f)
                lineTo(2.0f, 18.0f)
                lineTo(2.0f, 6.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(6.0f, 10.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                close()
                moveTo(17.0f, 14.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.5f)
                close()
            }
        }
        .build()
        return _videoconference!!
    }

private var _videoconference: ImageVector? = null
