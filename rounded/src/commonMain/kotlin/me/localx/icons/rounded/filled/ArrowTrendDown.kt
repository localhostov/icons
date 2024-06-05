package me.localx.icons.rounded.filled

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

public val Icons.Filled.ArrowTrendDown: ImageVector
    get() {
        if (_arrowTrendDown != null) {
            return _arrowTrendDown!!
        }
        _arrowTrendDown = Builder(name = "ArrowTrendDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 8.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(5.586f)
                lineToRelative(-6.563f, -6.562f)
                curveToRelative(-1.344f, -1.344f, -3.531f, -1.344f, -4.875f, 0.0f)
                lineToRelative(-2.577f, 2.577f)
                curveToRelative(-0.543f, 0.543f, -1.428f, 0.543f, -1.971f, 0.0f)
                lineTo(1.707f, 6.293f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                reflectiveCurveToRelative(-0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(4.308f, 4.308f)
                curveToRelative(1.322f, 1.322f, 3.477f, 1.322f, 4.799f, 0.0f)
                lineToRelative(2.577f, -2.577f)
                curveToRelative(0.564f, -0.564f, 1.482f, -0.564f, 2.047f, 0.0f)
                lineToRelative(6.562f, 6.562f)
                horizontalLineToRelative(-5.586f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _arrowTrendDown!!
    }

private var _arrowTrendDown: ImageVector? = null
