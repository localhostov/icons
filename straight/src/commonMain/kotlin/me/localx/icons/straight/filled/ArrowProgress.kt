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

public val Icons.Filled.ArrowProgress: ImageVector
    get() {
        if (_arrowProgress != null) {
            return _arrowProgress!!
        }
        _arrowProgress = Builder(name = "ArrowProgress", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 20.0f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                close()
                moveTo(21.5f, 6.5f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(20.5f, 14.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                lineTo(4.5f, 10.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(9.457f)
                lineToRelative(-1.639f, 1.639f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.761f, -2.761f)
                curveToRelative(0.336f, -0.336f, 0.522f, -0.784f, 0.522f, -1.259f)
                reflectiveCurveToRelative(-0.186f, -0.924f, -0.522f, -1.259f)
                lineTo(13.732f, 0.012f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(1.574f, 1.574f)
                lineTo(4.5f, 3.0f)
                curveTo(2.019f, 3.0f, 0.0f, 5.019f, 0.0f, 7.5f)
                reflectiveCurveToRelative(2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                close()
                moveTo(21.5f, 17.577f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(13.793f, 16.073f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(1.513f, 1.513f)
                horizontalLineToRelative(-6.892f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.957f)
                lineToRelative(-1.578f, 1.578f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.71f, -2.71f)
                curveToRelative(0.688f, -0.688f, 0.688f, -1.809f, 0.0f, -2.499f)
                lineToRelative(-2.71f, -2.71f)
                close()
            }
        }
        .build()
        return _arrowProgress!!
    }

private var _arrowProgress: ImageVector? = null
