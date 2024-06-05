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

public val Icons.Outline.WhiteSpace: ImageVector
    get() {
        if (_whiteSpace != null) {
            return _whiteSpace!!
        }
        _whiteSpace = Builder(name = "WhiteSpace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 1.0f)
                verticalLineTo(23.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineTo(12.012f)
                curveToRelative(-0.009f, 0.501f, -0.201f, 1.0f, -0.583f, 1.382f)
                lineToRelative(-3.199f, 3.302f)
                curveToRelative(-0.195f, 0.203f, -0.457f, 0.305f, -0.718f, 0.305f)
                curveToRelative(-0.251f, 0.0f, -0.502f, -0.094f, -0.695f, -0.282f)
                curveToRelative(-0.397f, -0.384f, -0.407f, -1.017f, -0.022f, -1.413f)
                lineToRelative(2.232f, -2.305f)
                horizontalLineTo(4.995f)
                lineToRelative(2.223f, 2.305f)
                curveToRelative(0.385f, 0.396f, 0.375f, 1.029f, -0.022f, 1.413f)
                curveToRelative(-0.193f, 0.188f, -0.444f, 0.282f, -0.695f, 0.282f)
                curveToRelative(-0.261f, 0.0f, -0.522f, -0.102f, -0.718f, -0.305f)
                lineToRelative(-3.21f, -3.313f)
                curveToRelative(-0.375f, -0.374f, -0.564f, -0.868f, -0.572f, -1.366f)
                verticalLineToRelative(10.984f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineTo(1.0f)
                curveTo(0.0f, 0.447f, 0.447f, 0.0f, 1.0f, 0.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineTo(11.942f)
                curveToRelative(0.01f, -0.499f, 0.202f, -0.996f, 0.583f, -1.376f)
                lineToRelative(3.203f, -3.266f)
                curveToRelative(0.386f, -0.394f, 1.021f, -0.401f, 1.414f, -0.014f)
                curveToRelative(0.395f, 0.387f, 0.4f, 1.02f, 0.014f, 1.414f)
                lineToRelative(-2.256f, 2.3f)
                horizontalLineToRelative(14.069f)
                lineToRelative(-2.241f, -2.3f)
                curveToRelative(-0.387f, -0.395f, -0.381f, -1.027f, 0.014f, -1.414f)
                curveToRelative(0.393f, -0.388f, 1.026f, -0.38f, 1.414f, 0.014f)
                lineToRelative(3.21f, 3.272f)
                curveToRelative(0.378f, 0.378f, 0.569f, 0.875f, 0.576f, 1.376f)
                verticalLineTo(1.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _whiteSpace!!
    }

private var _whiteSpace: ImageVector? = null
