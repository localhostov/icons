package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.CalendarStar: ImageVector
    get() {
        if (_calendarStar != null) {
            return _calendarStar!!
        }
        _calendarStar = Builder(name = "CalendarStar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.365f, 14.183f)
                curveToRelative(0.0f, 0.379f, -0.264f, 0.698f, -0.566f, 0.866f)
                lineToRelative(-1.564f, 0.87f)
                lineToRelative(0.694f, 1.893f)
                curveToRelative(0.134f, 0.367f, 0.013f, 0.778f, -0.299f, 1.013f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.319f, 0.24f, -0.759f, 0.237f, -1.075f, -0.007f)
                lineToRelative(-1.556f, -1.203f)
                lineToRelative(-1.556f, 1.203f)
                curveToRelative(-0.316f, 0.244f, -0.756f, 0.247f, -1.075f, 0.007f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.312f, -0.235f, -0.433f, -0.646f, -0.299f, -1.013f)
                lineToRelative(0.694f, -1.893f)
                lineToRelative(-1.564f, -0.87f)
                curveToRelative(-0.302f, -0.168f, -0.566f, -0.487f, -0.566f, -0.866f)
                curveToRelative(0.0f, -0.321f, 0.279f, -0.676f, 0.731f, -0.676f)
                horizontalLineToRelative(2.247f)
                lineToRelative(0.596f, -2.283f)
                curveToRelative(0.094f, -0.362f, 0.419f, -0.614f, 0.792f, -0.621f)
                curveToRelative(0.373f, 0.007f, 0.698f, 0.259f, 0.792f, 0.621f)
                lineToRelative(0.596f, 2.283f)
                horizontalLineToRelative(2.247f)
                curveToRelative(0.452f, 0.0f, 0.731f, 0.354f, 0.731f, 0.676f)
                close()
                moveTo(18.5f, 2.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-0.5f)
                curveTo(2.467f, 2.0f, 0.0f, 4.467f, 0.0f, 7.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(24.0f, 7.5f)
                curveToRelative(0.0f, -3.033f, -2.467f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(18.5f, 21.0f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-9.5f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _calendarStar!!
    }

private var _calendarStar: ImageVector? = null
