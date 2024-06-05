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

public val Icons.Bold.ArrowsToEye: ImageVector
    get() {
        if (_arrowsToEye != null) {
            return _arrowsToEye!!
        }
        _arrowsToEye = Builder(name = "ArrowsToEye", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.747f, 13.076f)
                curveToRelative(0.339f, -0.684f, 0.339f, -1.469f, 0.0f, -2.152f)
                curveToRelative(-0.797f, -1.607f, -3.737f, -4.924f, -7.747f, -4.924f)
                reflectiveCurveToRelative(-6.951f, 3.318f, -7.747f, 4.924f)
                curveToRelative(-0.34f, 0.685f, -0.34f, 1.469f, 0.0f, 2.152f)
                curveToRelative(0.797f, 1.606f, 3.738f, 4.924f, 7.747f, 4.924f)
                reflectiveCurveToRelative(6.951f, -3.318f, 7.747f, -4.924f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(-2.485f, 0.0f, -4.337f, -2.152f, -4.904f, -3.0f)
                curveToRelative(0.566f, -0.847f, 2.417f, -3.0f, 4.904f, -3.0f)
                reflectiveCurveToRelative(4.337f, 2.153f, 4.904f, 3.0f)
                curveToRelative(-0.567f, 0.847f, -2.418f, 3.0f, -4.904f, 3.0f)
                close()
                moveTo(14.0f, 12.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(17.0f, 6.0f)
                lineTo(17.0f, 1.0f)
                lineToRelative(1.939f, 1.939f)
                lineTo(21.844f, 0.035f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-2.904f, 2.904f)
                lineToRelative(1.939f, 1.939f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                close()
                moveTo(2.939f, 5.061f)
                lineTo(0.035f, 2.156f)
                lineTo(2.156f, 0.035f)
                lineToRelative(2.904f, 2.904f)
                lineToRelative(1.939f, -1.939f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(1.0f, 7.0f)
                lineToRelative(1.939f, -1.939f)
                close()
                moveTo(21.06f, 18.94f)
                lineToRelative(2.904f, 2.904f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-2.904f, -2.904f)
                lineToRelative(-1.939f, 1.939f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(-1.939f, 1.939f)
                close()
                moveTo(6.999f, 18.001f)
                verticalLineToRelative(5.0f)
                lineToRelative(-1.939f, -1.939f)
                lineToRelative(-2.904f, 2.904f)
                lineTo(0.035f, 21.844f)
                lineToRelative(2.904f, -2.904f)
                lineToRelative(-1.939f, -1.939f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _arrowsToEye!!
    }

private var _arrowsToEye: ImageVector? = null
