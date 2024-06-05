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

public val Icons.Filled.Marketplace: ImageVector
    get() {
        if (_marketplace != null) {
            return _marketplace!!
        }
        _marketplace = Builder(name = "Marketplace", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.411f, 15.866f)
                curveToRelative(-0.369f, -0.427f, -0.867f, -0.707f, -1.411f, -0.814f)
                verticalLineToRelative(-0.552f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(0.552f)
                curveToRelative(-0.544f, 0.107f, -1.042f, 0.387f, -1.411f, 0.814f)
                curveToRelative(-0.475f, 0.55f, -0.687f, 1.278f, -0.582f, 1.997f)
                lineToRelative(0.524f, 3.573f)
                curveToRelative(0.215f, 1.462f, 1.491f, 2.564f, 2.968f, 2.564f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.477f, 0.0f, 2.753f, -1.102f, 2.968f, -2.564f)
                lineToRelative(0.524f, -3.573f)
                curveToRelative(0.105f, -0.719f, -0.106f, -1.447f, -0.582f, -1.997f)
                close()
                moveTo(17.5f, 12.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(20.956f, 9.0f)
                horizontalLineToRelative(3.044f)
                verticalLineToRelative(4.754f)
                curveToRelative(-0.016f, -0.011f, -0.03f, -0.024f, -0.047f, -0.035f)
                curveToRelative(-0.239f, -1.987f, -1.379f, -3.699f, -2.997f, -4.719f)
                close()
                moveTo(10.076f, 14.558f)
                curveToRelative(-0.855f, 0.99f, -1.237f, 2.3f, -1.047f, 3.595f)
                lineToRelative(0.525f, 3.574f)
                curveToRelative(0.014f, 0.094f, 0.047f, 0.181f, 0.066f, 0.273f)
                horizontalLineToRelative(-4.619f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(14.044f)
                curveToRelative(-1.618f, 1.02f, -2.759f, 2.732f, -2.997f, 4.719f)
                curveToRelative(-0.362f, 0.231f, -0.689f, 0.513f, -0.971f, 0.839f)
                close()
                moveTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(4.5f, 5.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(8.5f, 5.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _marketplace!!
    }

private var _marketplace: ImageVector? = null
