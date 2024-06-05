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

public val Icons.Outline.SortCircleDown: ImageVector
    get() {
        if (_sortCircleDown != null) {
            return _sortCircleDown!!
        }
        _sortCircleDown = Builder(name = "SortCircleDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(5.25f, 13.0f)
                horizontalLineToRelative(13.5f)
                lineToRelative(-5.689f, 5.561f)
                curveToRelative(-0.586f, 0.586f, -1.535f, 0.586f, -2.121f, 0.0f)
                lineToRelative(-5.69f, -5.561f)
                close()
                moveTo(12.897f, 5.439f)
                curveToRelative(-0.293f, -0.293f, -0.677f, -0.439f, -1.061f, -0.439f)
                reflectiveCurveToRelative(-0.768f, 0.146f, -1.061f, 0.439f)
                lineToRelative(-5.604f, 5.561f)
                horizontalLineToRelative(13.328f)
                lineToRelative(-5.603f, -5.561f)
                close()
                moveTo(11.836f, 7.204f)
                lineToRelative(2.313f, 2.296f)
                horizontalLineToRelative(-4.627f)
                lineToRelative(2.314f, -2.296f)
                close()
            }
        }
        .build()
        return _sortCircleDown!!
    }

private var _sortCircleDown: ImageVector? = null
