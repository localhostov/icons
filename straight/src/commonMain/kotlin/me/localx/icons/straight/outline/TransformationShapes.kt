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

public val Icons.Outline.TransformationShapes: ImageVector
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
                moveTo(6.5f, 11.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                reflectiveCurveTo(4.019f, 2.0f, 6.5f, 2.0f)
                reflectiveCurveToRelative(4.5f, 2.019f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.019f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(12.0f, 24.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(14.0f, 14.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(8.419f, 18.594f)
                curveToRelative(0.774f, 0.775f, 0.774f, 2.037f, 0.0f, 2.812f)
                lineToRelative(-2.508f, 2.507f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.499f, -1.498f)
                horizontalLineToRelative(-2.997f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.006f)
                lineToRelative(-1.508f, -1.498f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.507f, 2.506f)
                close()
                moveTo(24.0f, 6.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.006f)
                lineToRelative(1.508f, 1.498f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.507f, -2.506f)
                curveToRelative(-0.774f, -0.775f, -0.774f, -2.037f, 0.0f, -2.812f)
                lineTo(18.088f, 0.088f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.499f, 1.498f)
                horizontalLineToRelative(2.997f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _transformationShapes!!
    }

private var _transformationShapes: ImageVector? = null
