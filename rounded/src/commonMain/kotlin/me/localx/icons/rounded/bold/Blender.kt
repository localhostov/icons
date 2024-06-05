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

public val Icons.Bold.Blender: ImageVector
    get() {
        if (_blender != null) {
            return _blender!!
        }
        _blender = Builder(name = "Blender", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.281f, 16.368f)
                lineToRelative(2.671f, -12.293f)
                curveToRelative(0.17f, -1.017f, -0.115f, -2.051f, -0.781f, -2.838f)
                curveToRelative(-0.667f, -0.786f, -1.64f, -1.237f, -2.671f, -1.237f)
                lineTo(5.5f, -0.0f)
                curveTo(3.019f, 0.0f, 1.0f, 2.019f, 1.0f, 4.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3.257f)
                curveToRelative(-1.746f, 0.619f, -3.0f, 2.287f, -3.0f, 4.243f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.849f, -1.121f, -3.441f, -2.719f, -4.132f)
                close()
                moveTo(5.5f, 10.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(11.5f, 10.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(9.5f)
                curveToRelative(0.202f, 0.0f, 0.325f, 0.111f, 0.382f, 0.177f)
                curveToRelative(0.056f, 0.066f, 0.145f, 0.207f, 0.125f, 0.333f)
                lineToRelative(-2.716f, 12.49f)
                horizontalLineToRelative(-7.291f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(19.5f, 21.0f)
                lineTo(7.5f, 21.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.276f, -0.225f, 0.5f, -0.5f, 0.5f)
                close()
            }
        }
        .build()
        return _blender!!
    }

private var _blender: ImageVector? = null
