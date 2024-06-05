package me.localx.icons.rounded.outline

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

public val Icons.Outline.SortAlt: ImageVector
    get() {
        if (_sortAlt != null) {
            return _sortAlt!!
        }
        _sortAlt = Builder(name = "SortAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.293f, 17.707f)
                lineToRelative(-3.293f, 3.293f)
                verticalLineTo(1.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineTo(21.0f)
                lineToRelative(-3.293f, -3.293f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                reflectiveCurveToRelative(-0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(4.293f, 4.293f)
                curveToRelative(0.39f, 0.39f, 0.902f, 0.585f, 1.414f, 0.585f)
                reflectiveCurveToRelative(1.024f, -0.195f, 1.414f, -0.585f)
                lineToRelative(4.293f, -4.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(-1.023f, -0.391f, -1.414f, 0.0f)
                close()
                moveTo(22.707f, 6.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                lineTo(18.414f, 0.586f)
                curveTo(18.024f, 0.196f, 17.512f, 0.0f, 17.0f, 0.0f)
                reflectiveCurveToRelative(-1.024f, 0.195f, -1.414f, 0.585f)
                lineToRelative(-4.293f, 4.293f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                reflectiveCurveToRelative(1.023f, 0.391f, 1.414f, 0.0f)
                lineToRelative(3.293f, -3.293f)
                verticalLineTo(23.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineTo(3.0f)
                lineToRelative(3.293f, 3.293f)
                curveToRelative(0.391f, 0.391f, 1.023f, 0.391f, 1.414f, 0.0f)
                close()
            }
        }
        .build()
        return _sortAlt!!
    }

private var _sortAlt: ImageVector? = null
