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

public val Icons.Outline.OctagonDivide: ImageVector
    get() {
        if (_octagonDivide != null) {
            return _octagonDivide!!
        }
        _octagonDivide = Builder(name = "OctagonDivide", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 16.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(12.0f, 9.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 8.272f)
                verticalLineToRelative(7.456f)
                curveToRelative(0.0f, 0.801f, -0.312f, 1.554f, -0.879f, 2.121f)
                lineToRelative(-5.272f, 5.272f)
                curveToRelative(-0.567f, 0.567f, -1.32f, 0.879f, -2.121f, 0.879f)
                horizontalLineToRelative(-7.456f)
                curveToRelative(-0.801f, 0.0f, -1.554f, -0.312f, -2.121f, -0.879f)
                lineTo(0.879f, 17.849f)
                curveToRelative(-0.567f, -0.567f, -0.879f, -1.32f, -0.879f, -2.121f)
                verticalLineToRelative(-7.456f)
                curveToRelative(0.0f, -0.801f, 0.312f, -1.554f, 0.879f, -2.121f)
                lineTo(6.151f, 0.879f)
                curveToRelative(0.567f, -0.567f, 1.32f, -0.879f, 2.121f, -0.879f)
                horizontalLineToRelative(7.456f)
                curveToRelative(0.801f, 0.0f, 1.554f, 0.312f, 2.121f, 0.879f)
                lineToRelative(5.272f, 5.272f)
                curveToRelative(0.567f, 0.567f, 0.879f, 1.32f, 0.879f, 2.121f)
                close()
                moveTo(22.0f, 8.272f)
                curveToRelative(0.0f, -0.263f, -0.107f, -0.521f, -0.293f, -0.707f)
                lineToRelative(-5.272f, -5.272f)
                curveToRelative(-0.187f, -0.186f, -0.444f, -0.293f, -0.707f, -0.293f)
                horizontalLineToRelative(-7.456f)
                curveToRelative(-0.263f, 0.0f, -0.521f, 0.107f, -0.707f, 0.293f)
                lineTo(2.293f, 7.565f)
                curveToRelative(-0.186f, 0.187f, -0.293f, 0.444f, -0.293f, 0.707f)
                verticalLineToRelative(7.456f)
                curveToRelative(0.0f, 0.263f, 0.107f, 0.521f, 0.293f, 0.707f)
                lineToRelative(5.272f, 5.272f)
                curveToRelative(0.187f, 0.186f, 0.444f, 0.293f, 0.707f, 0.293f)
                horizontalLineToRelative(7.456f)
                curveToRelative(0.263f, 0.0f, 0.521f, -0.107f, 0.707f, -0.293f)
                lineToRelative(5.272f, -5.272f)
                curveToRelative(0.186f, -0.187f, 0.293f, -0.444f, 0.293f, -0.707f)
                verticalLineToRelative(-7.456f)
                close()
                moveTo(7.0f, 13.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                lineTo(7.0f, 11.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _octagonDivide!!
    }

private var _octagonDivide: ImageVector? = null
