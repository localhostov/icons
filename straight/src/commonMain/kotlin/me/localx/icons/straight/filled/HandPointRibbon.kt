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

public val Icons.Filled.HandPointRibbon: ImageVector
    get() {
        if (_handPointRibbon != null) {
            return _handPointRibbon!!
        }
        _handPointRibbon = Builder(name = "HandPointRibbon", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 13.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(20.5f, 8.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(7.0f, 7.0f)
                verticalLineToRelative(2.037f)
                curveToRelative(0.836f, -0.005f, 1.672f, 0.233f, 2.369f, 0.753f)
                curveToRelative(0.238f, 0.178f, 0.443f, 0.383f, 0.631f, 0.601f)
                lineTo(10.0f, 4.0f)
                lineTo(2.0f, 4.0f)
                lineToRelative(2.0f, 1.5f)
                lineToRelative(-2.0f, 1.5f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(12.5f, 15.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(18.5f, 16.37f)
                curveToRelative(-0.609f, 0.425f, -1.358f, 0.663f, -2.163f, 0.626f)
                curveToRelative(-0.68f, -0.031f, -1.297f, -0.274f, -1.814f, -0.651f)
                curveToRelative(-0.573f, 0.409f, -1.268f, 0.655f, -2.024f, 0.655f)
                curveToRelative(-1.086f, 0.0f, -2.053f, -0.501f, -2.695f, -1.28f)
                lineToRelative(-2.171f, 2.181f)
                lineToRelative(-1.446f, -1.382f)
                lineToRelative(2.213f, -2.1f)
                curveToRelative(0.088f, -0.088f, 0.201f, -0.24f, 0.333f, -0.441f)
                curveToRelative(0.47f, -0.843f, 0.284f, -1.954f, -0.561f, -2.584f)
                curveToRelative(-0.81f, -0.604f, -1.965f, -0.437f, -2.68f, 0.276f)
                lineToRelative(-2.497f, 2.455f)
                curveToRelative(-1.325f, 1.303f, -1.33f, 3.438f, -0.01f, 4.746f)
                lineToRelative(5.177f, 5.131f)
                horizontalLineToRelative(13.836f)
                verticalLineToRelative(-7.338f)
                curveToRelative(-0.455f, 0.217f, -0.964f, 0.338f, -1.5f, 0.338f)
                curveToRelative(-0.743f, 0.0f, -1.433f, -0.233f, -2.0f, -0.63f)
                close()
                moveTo(10.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-0.5f)
                close()
            }
        }
        .build()
        return _handPointRibbon!!
    }

private var _handPointRibbon: ImageVector? = null
