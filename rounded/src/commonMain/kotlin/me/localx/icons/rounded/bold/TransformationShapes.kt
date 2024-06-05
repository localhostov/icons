package me.localx.icons.rounded.bold

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

public val Icons.Bold.TransformationShapes: ImageVector
    get() {
        if (_transformationShapes != null) {
            return _transformationShapes!!
        }
        _transformationShapes = Builder(name = "TransformationShapes", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.5f, 0.0f)
                curveTo(2.916f, 0.0f, 0.0f, 2.916f, 0.0f, 6.5f)
                reflectiveCurveToRelative(2.916f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.916f, 6.5f, -6.5f)
                reflectiveCurveTo(10.084f, 0.0f, 6.5f, 0.0f)
                close()
                moveTo(6.5f, 10.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(24.0f, 7.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(1.53f)
                curveToRelative(0.0f, 0.863f, -1.043f, 1.295f, -1.653f, 0.685f)
                lineToRelative(-3.063f, -3.063f)
                curveToRelative(-0.378f, -0.378f, -0.378f, -0.991f, 0.0f, -1.369f)
                lineToRelative(3.063f, -3.063f)
                curveToRelative(0.61f, -0.61f, 1.653f, -0.178f, 1.653f, 0.685f)
                verticalLineToRelative(1.597f)
                horizontalLineToRelative(0.5f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                close()
                moveTo(20.5f, 12.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 20.5f)
                curveToRelative(0.0f, 0.275f, -0.225f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.275f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(9.716f, 18.782f)
                curveToRelative(0.378f, 0.378f, 0.378f, 0.991f, 0.0f, 1.369f)
                lineToRelative(-3.063f, 3.063f)
                curveToRelative(-0.61f, 0.61f, -1.653f, 0.178f, -1.653f, -0.685f)
                verticalLineToRelative(-1.53f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-1.597f)
                curveToRelative(0.0f, -0.863f, 1.043f, -1.295f, 1.653f, -0.685f)
                lineToRelative(3.063f, 3.063f)
                close()
            }
        }
        .build()
        return _transformationShapes!!
    }

private var _transformationShapes: ImageVector? = null
