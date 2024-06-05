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

public val Icons.Filled.SortCircle: ImageVector
    get() {
        if (_sortCircle != null) {
            return _sortCircle!!
        }
        _sortCircle = Builder(name = "SortCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(13.061f, 18.561f)
                curveToRelative(-0.586f, 0.586f, -1.535f, 0.586f, -2.121f, 0.0f)
                lineToRelative(-5.69f, -5.561f)
                horizontalLineToRelative(13.5f)
                lineToRelative(-5.689f, 5.561f)
                close()
                moveTo(5.25f, 11.0f)
                lineToRelative(5.69f, -5.561f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                lineToRelative(5.689f, 5.561f)
                lineTo(5.25f, 11.0f)
                close()
            }
        }
        .build()
        return _sortCircle!!
    }

private var _sortCircle: ImageVector? = null
