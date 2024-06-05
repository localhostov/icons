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

public val Icons.Filled.OctagonDivide: ImageVector
    get() {
        if (_octagonDivide != null) {
            return _octagonDivide!!
        }
        _octagonDivide = Builder(name = "OctagonDivide", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.243f, 5.272f)
                lineToRelative(-3.515f, -3.515f)
                curveToRelative(-1.134f, -1.133f, -2.641f, -1.757f, -4.243f, -1.757f)
                horizontalLineToRelative(-4.971f)
                curveToRelative(-1.602f, 0.0f, -3.109f, 0.624f, -4.243f, 1.757f)
                lineToRelative(-3.515f, 3.515f)
                curveToRelative(-1.133f, 1.134f, -1.757f, 2.641f, -1.757f, 4.243f)
                verticalLineToRelative(4.971f)
                curveToRelative(0.0f, 1.602f, 0.624f, 3.109f, 1.757f, 4.243f)
                lineToRelative(3.515f, 3.515f)
                curveToRelative(1.134f, 1.133f, 2.641f, 1.757f, 4.243f, 1.757f)
                horizontalLineToRelative(4.971f)
                curveToRelative(1.602f, 0.0f, 3.109f, -0.624f, 4.243f, -1.757f)
                lineToRelative(3.515f, -3.515f)
                curveToRelative(1.133f, -1.134f, 1.757f, -2.641f, 1.757f, -4.243f)
                verticalLineToRelative(-4.971f)
                curveToRelative(0.0f, -1.602f, -0.624f, -3.109f, -1.757f, -4.243f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(17.0f, 13.0f)
                lineTo(7.0f, 13.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _octagonDivide!!
    }

private var _octagonDivide: ImageVector? = null
