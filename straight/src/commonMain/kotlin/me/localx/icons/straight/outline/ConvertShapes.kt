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

public val Icons.Outline.ConvertShapes: ImageVector
    get() {
        if (_convertShapes != null) {
            return _convertShapes!!
        }
        _convertShapes = Builder(name = "ConvertShapes", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 24.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-10.0f)
                lineTo(0.0f, 14.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(2.0f, 16.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(6.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(24.0f, 5.5f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.468f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.468f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.468f, 5.5f, -5.5f)
                close()
                moveTo(15.0f, 5.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(5.362f, 2.0f)
                horizontalLineToRelative(-3.362f)
                lineTo(2.0f, 0.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.665f)
                curveToRelative(-3.079f, 1.765f, -5.0f, 5.025f, -5.0f, 8.665f)
                lineTo(0.0f, 12.0f)
                curveTo(0.0f, 7.89f, 2.044f, 4.189f, 5.362f, 2.0f)
                close()
                moveTo(18.638f, 22.0f)
                horizontalLineToRelative(3.362f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.666f)
                curveToRelative(3.079f, -1.765f, 5.0f, -5.025f, 5.0f, -8.666f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 4.109f, -2.043f, 7.812f, -5.362f, 10.0f)
                close()
            }
        }
        .build()
        return _convertShapes!!
    }

private var _convertShapes: ImageVector? = null
