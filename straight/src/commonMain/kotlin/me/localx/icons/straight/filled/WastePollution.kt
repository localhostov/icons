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

public val Icons.Filled.WastePollution: ImageVector
    get() {
        if (_wastePollution != null) {
            return _wastePollution!!
        }
        _wastePollution = Builder(name = "WastePollution", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 20.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                verticalLineToRelative(-4.499f)
                curveToRelative(0.354f, -0.212f, 1.017f, -0.501f, 2.0f, -0.501f)
                reflectiveCurveToRelative(1.65f, 0.291f, 2.0f, 0.499f)
                verticalLineToRelative(4.501f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(17.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-5.414f)
                lineToRelative(-0.293f, -0.293f)
                curveToRelative(-0.132f, -0.133f, -1.36f, -1.293f, -3.707f, -1.293f)
                reflectiveCurveToRelative(-3.575f, 1.16f, -3.707f, 1.293f)
                lineToRelative(-0.293f, 0.293f)
                verticalLineToRelative(5.414f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(20.0f, 12.0f)
                curveToRelative(0.0f, -4.411f, -3.589f, -8.0f, -8.0f, -8.0f)
                reflectiveCurveTo(4.0f, 7.589f, 4.0f, 12.0f)
                curveToRelative(0.0f, 2.021f, 0.759f, 3.864f, 2.0f, 5.274f)
                verticalLineToRelative(-5.274f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                verticalLineToRelative(5.274f)
                curveToRelative(1.241f, -1.41f, 2.0f, -3.253f, 2.0f, -5.274f)
                close()
                moveTo(18.0f, 22.0f)
                curveToRelative(-1.201f, 0.0f, -2.266f, -0.542f, -3.0f, -1.382f)
                curveToRelative(-0.734f, 0.84f, -1.799f, 1.382f, -3.0f, 1.382f)
                reflectiveCurveToRelative(-2.266f, -0.542f, -3.0f, -1.382f)
                curveToRelative(-0.734f, 0.84f, -1.799f, 1.382f, -3.0f, 1.382f)
                reflectiveCurveToRelative(-2.266f, -0.542f, -3.0f, -1.382f)
                curveToRelative(-0.734f, 0.84f, -1.799f, 1.382f, -3.0f, 1.382f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-1.201f, 0.0f, -2.266f, -0.542f, -3.0f, -1.382f)
                curveToRelative(-0.734f, 0.84f, -1.799f, 1.382f, -3.0f, 1.382f)
                close()
            }
        }
        .build()
        return _wastePollution!!
    }

private var _wastePollution: ImageVector? = null
