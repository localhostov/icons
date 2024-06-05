package me.localx.icons.rounded.outline

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

public val Icons.Outline.Blender: ImageVector
    get() {
        if (_blender != null) {
            return _blender!!
        }
        _blender = Builder(name = "Blender", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.187f, 17.18f)
                lineToRelative(2.772f, -13.687f)
                curveToRelative(0.146f, -0.872f, -0.099f, -1.758f, -0.67f, -2.432f)
                reflectiveCurveToRelative(-1.406f, -1.061f, -2.29f, -1.061f)
                lineTo(5.5f, 0.0f)
                curveTo(3.019f, 0.0f, 1.0f, 2.019f, 1.0f, 4.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(2.127f)
                curveToRelative(-1.723f, 0.445f, -3.0f, 2.013f, -3.0f, 3.873f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.793f, -1.185f, -3.314f, -2.813f, -3.82f)
                close()
                moveTo(5.5f, 13.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-0.5f)
                close()
                moveTo(10.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(10.999f)
                curveToRelative(0.299f, 0.0f, 0.57f, 0.125f, 0.764f, 0.354f)
                curveToRelative(0.193f, 0.228f, 0.272f, 0.516f, 0.229f, 0.776f)
                lineToRelative(-2.81f, 13.87f)
                horizontalLineToRelative(-9.182f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(19.0f, 22.0f)
                lineTo(6.0f, 22.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _blender!!
    }

private var _blender: ImageVector? = null
