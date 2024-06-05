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

public val Icons.Bold.SortAlt: ImageVector
    get() {
        if (_sortAlt != null) {
            return _sortAlt!!
        }
        _sortAlt = Builder(name = "SortAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.018f, 18.518f)
                lineToRelative(-4.75f, 4.75f)
                curveToRelative(-0.487f, 0.487f, -1.127f, 0.731f, -1.768f, 0.731f)
                reflectiveCurveToRelative(-1.28f, -0.244f, -1.768f, -0.731f)
                lineTo(-0.018f, 18.518f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(2.896f, 2.896f)
                lineTo(4.999f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(7.999f, 19.293f)
                lineToRelative(2.896f, -2.896f)
                lineToRelative(2.121f, 2.121f)
                close()
                moveTo(13.104f, 7.604f)
                lineToRelative(2.896f, -2.896f)
                lineTo(16.0f, 24.0f)
                horizontalLineToRelative(3.0f)
                lineTo(19.0f, 4.707f)
                lineToRelative(2.896f, 2.896f)
                lineToRelative(2.121f, -2.121f)
                lineTo(19.268f, 0.732f)
                curveTo(18.78f, 0.245f, 18.141f, 0.0f, 17.5f, 0.0f)
                reflectiveCurveToRelative(-1.28f, 0.244f, -1.768f, 0.731f)
                lineToRelative(-4.75f, 4.75f)
                lineToRelative(2.121f, 2.121f)
                close()
            }
        }
        .build()
        return _sortAlt!!
    }

private var _sortAlt: ImageVector? = null
