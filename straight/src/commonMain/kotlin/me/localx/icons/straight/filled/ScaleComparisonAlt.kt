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

public val Icons.Filled.ScaleComparisonAlt: ImageVector
    get() {
        if (_scaleComparisonAlt != null) {
            return _scaleComparisonAlt!!
        }
        _scaleComparisonAlt = Builder(name = "ScaleComparisonAlt", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.955f, 12.105f)
                lineToRelative(0.082f, -1.105f)
                lineTo(-0.036f, 11.0f)
                lineToRelative(0.082f, 1.106f)
                curveToRelative(0.315f, 2.199f, 2.23f, 3.858f, 4.454f, 3.858f)
                reflectiveCurveToRelative(4.141f, -1.659f, 4.455f, -3.859f)
                close()
                moveTo(24.037f, 14.0f)
                lineToRelative(-0.082f, 1.105f)
                curveToRelative(-0.313f, 2.2f, -2.229f, 3.859f, -4.455f, 3.859f)
                reflectiveCurveToRelative(-4.139f, -1.659f, -4.454f, -3.858f)
                lineToRelative(-0.082f, -1.106f)
                horizontalLineToRelative(9.072f)
                close()
                moveTo(13.001f, 22.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.0f)
                lineTo(11.0f, 4.802f)
                lineTo(2.783f, 2.976f)
                lineToRelative(0.434f, -1.952f)
                lineToRelative(7.783f, 1.73f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.198f)
                lineToRelative(8.217f, 1.826f)
                lineToRelative(-0.434f, 1.952f)
                lineToRelative(-7.783f, -1.73f)
                verticalLineToRelative(16.754f)
                close()
                moveTo(1.793f, 8.793f)
                lineToRelative(1.293f, -1.293f)
                lineToRelative(-1.293f, -1.293f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.293f, 1.293f)
                lineToRelative(1.293f, -1.293f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.293f, 1.293f)
                lineToRelative(1.293f, 1.293f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-1.293f, -1.293f)
                lineToRelative(-1.293f, 1.293f)
                lineToRelative(-1.414f, -1.414f)
                close()
                moveTo(19.295f, 10.406f)
                lineToRelative(2.67f, -2.67f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-4.098f, 4.099f)
                lineToRelative(-2.649f, -2.702f)
                lineToRelative(1.428f, -1.4f)
                lineToRelative(1.235f, 1.26f)
                close()
            }
        }
        .build()
        return _scaleComparisonAlt!!
    }

private var _scaleComparisonAlt: ImageVector? = null
