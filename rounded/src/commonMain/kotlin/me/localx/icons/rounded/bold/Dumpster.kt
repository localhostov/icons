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

public val Icons.Bold.Dumpster: ImageVector
    get() {
        if (_dumpster != null) {
            return _dumpster!!
        }
        _dumpster = Builder(name = "Dumpster", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 7.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                lineTo(5.5f, 0.0f)
                curveTo(2.467f, 0.0f, 0.0f, 2.468f, 0.0f, 5.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.023f, 0.0f, 0.045f, 0.002f, 0.067f)
                curveToRelative(0.0f, 0.013f, 0.002f, 0.027f, 0.003f, 0.04f)
                curveToRelative(0.0f, 0.006f, 0.0f, 0.012f, 0.001f, 0.018f)
                lineToRelative(0.694f, 8.332f)
                curveToRelative(0.171f, 2.061f, 1.496f, 3.795f, 3.3f, 4.585f)
                verticalLineToRelative(0.958f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, 0.002f, -0.339f, 0.005f, -0.5f)
                horizontalLineToRelative(5.995f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                verticalLineToRelative(-0.958f)
                curveToRelative(1.804f, -0.79f, 3.129f, -2.525f, 3.301f, -4.585f)
                lineToRelative(0.694f, -8.332f)
                curveToRelative(0.0f, -0.012f, 0.001f, -0.024f, 0.002f, -0.037f)
                curveToRelative(0.0f, -0.006f, 0.0f, -0.012f, 0.001f, -0.018f)
                curveToRelative(0.001f, -0.023f, 0.002f, -0.047f, 0.002f, -0.07f)
                close()
                moveTo(21.0f, 5.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.95f)
                curveToRelative(1.14f, 0.232f, 2.0f, 1.242f, 2.0f, 2.45f)
                close()
                moveTo(13.5f, 6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(8.0f, 6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(5.0f, 3.05f)
                verticalLineToRelative(2.95f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.208f, 0.86f, -2.217f, 2.0f, -2.45f)
                close()
                moveTo(17.819f, 18.0f)
                lineTo(6.181f, 18.0f)
                curveToRelative(-1.29f, 0.0f, -2.384f, -1.007f, -2.492f, -2.293f)
                lineToRelative(-0.559f, -6.707f)
                horizontalLineToRelative(17.74f)
                lineToRelative(-0.559f, 6.707f)
                curveToRelative(-0.106f, 1.286f, -1.201f, 2.293f, -2.491f, 2.293f)
                close()
            }
        }
        .build()
        return _dumpster!!
    }

private var _dumpster: ImageVector? = null
