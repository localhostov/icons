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

public val Icons.Outline.ListTimeline: ImageVector
    get() {
        if (_listTimeline != null) {
            return _listTimeline!!
        }
        _listTimeline = Builder(name = "ListTimeline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 15.0f)
                lineTo(9.02f, 15.0f)
                lineToRelative(-3.0f, -3.0f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(12.98f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(9.85f, 13.0f)
                horizontalLineToRelative(12.15f)
                verticalLineToRelative(-2.0f)
                lineTo(9.85f, 11.0f)
                lineToRelative(-1.0f, 1.0f)
                lineToRelative(1.0f, 1.0f)
                close()
                moveTo(19.0f, 6.0f)
                lineTo(9.02f, 6.0f)
                lineToRelative(-3.0f, -3.0f)
                lineTo(9.02f, 0.0f)
                horizontalLineToRelative(9.98f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(9.85f, 4.0f)
                horizontalLineToRelative(9.15f)
                lineTo(19.0f, 2.0f)
                lineTo(9.85f, 2.0f)
                lineToRelative(-1.0f, 1.0f)
                lineToRelative(1.0f, 1.0f)
                close()
                moveTo(17.0f, 24.0f)
                horizontalLineToRelative(-7.98f)
                lineToRelative(-3.0f, -3.0f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(7.98f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(9.85f, 22.0f)
                horizontalLineToRelative(7.15f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-7.15f)
                lineToRelative(-1.0f, 1.0f)
                lineToRelative(1.0f, 1.0f)
                close()
                moveTo(2.0f, 19.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(2.0f, 10.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(2.0f, 1.0f)
                curveTo(0.9f, 1.0f, 0.0f, 1.9f, 0.0f, 3.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveTo(3.1f, 1.0f, 2.0f, 1.0f)
                close()
            }
        }
        .build()
        return _listTimeline!!
    }

private var _listTimeline: ImageVector? = null
