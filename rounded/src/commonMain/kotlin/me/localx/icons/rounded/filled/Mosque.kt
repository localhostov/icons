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

public val Icons.Filled.Mosque: ImageVector
    get() {
        if (_mosque != null) {
            return _mosque!!
        }
        _mosque = Builder(name = "Mosque", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 9.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.933f, 0.0f, -3.5f, -1.567f, -3.5f, -3.5f)
                verticalLineToRelative(-11.5f)
                close()
                moveTo(10.58f, 12.966f)
                lineToRelative(10.796f, 0.034f)
                curveToRelative(1.61f, -1.221f, 2.624f, -2.925f, 2.624f, -4.419f)
                curveToRelative(0.0f, -3.824f, -3.985f, -5.181f, -6.329f, -6.478f)
                curveToRelative(0.0f, 0.0f, -0.432f, -0.192f, -0.603f, -1.202f)
                curveToRelative(-0.088f, -0.519f, -0.542f, -0.902f, -1.069f, -0.902f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.523f, 0.0f, -0.979f, 0.375f, -1.067f, 0.891f)
                curveToRelative(-0.18f, 1.056f, -0.655f, 1.243f, -0.655f, 1.243f)
                curveToRelative(-2.351f, 1.288f, -6.277f, 2.653f, -6.277f, 6.448f)
                curveToRelative(0.0f, 1.479f, 0.996f, 3.168f, 2.58f, 4.385f)
                close()
                moveTo(4.005f, 0.441f)
                curveTo(3.469f, -0.147f, 2.531f, -0.147f, 1.995f, 0.441f)
                curveToRelative(-0.872f, 0.957f, -1.995f, 2.487f, -1.995f, 4.017f)
                verticalLineToRelative(2.542f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.542f)
                curveToRelative(0.0f, -1.53f, -1.123f, -3.06f, -1.995f, -4.017f)
                close()
                moveTo(8.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.933f, 0.0f, 3.5f, -1.567f, 3.5f, -3.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-12.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _mosque!!
    }

private var _mosque: ImageVector? = null
