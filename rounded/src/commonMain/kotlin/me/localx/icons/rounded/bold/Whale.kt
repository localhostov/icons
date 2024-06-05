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

public val Icons.Bold.Whale: ImageVector
    get() {
        if (_whale != null) {
            return _whale!!
        }
        _whale = Builder(name = "Whale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 15.505f)
                verticalLineToRelative(2.995f)
                curveToRelative(0.0f, 3.033f, -2.468f, 5.5f, -5.5f, 5.5f)
                horizontalLineToRelative(-8.951f)
                curveTo(4.283f, 24.0f, 0.0f, 19.716f, 0.0f, 14.451f)
                curveToRelative(0.0f, -2.882f, 0.845f, -5.672f, 2.443f, -8.071f)
                lineToRelative(0.866f, -1.299f)
                curveTo(1.607f, 4.342f, 0.334f, 2.788f, 0.011f, 0.906f)
                curveTo(-0.076f, 0.399f, 0.372f, -0.051f, 0.883f, 0.006f)
                curveToRelative(3.436f, 0.382f, 4.617f, 2.76f, 4.617f, 2.76f)
                curveTo(5.5f, 2.766f, 6.639f, 0.383f, 10.117f, 0.005f)
                curveToRelative(0.511f, -0.056f, 0.959f, 0.393f, 0.872f, 0.9f)
                curveToRelative(-0.383f, 2.233f, -2.097f, 4.013f, -4.29f, 4.501f)
                lineToRelative(-1.76f, 2.639f)
                curveToRelative(-1.269f, 1.904f, -1.939f, 4.119f, -1.939f, 6.407f)
                curveToRelative(0.0f, 3.611f, 2.937f, 6.549f, 6.549f, 6.549f)
                horizontalLineToRelative(8.951f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-2.995f)
                curveToRelative(0.0f, -2.48f, -2.019f, -4.5f, -4.499f, -4.503f)
                lineToRelative(-2.002f, -0.002f)
                curveToRelative(-0.011f, 0.0f, -3.059f, 0.116f, -7.003f, 3.621f)
                curveToRelative(-0.62f, 0.551f, -1.568f, 0.493f, -2.117f, -0.125f)
                curveToRelative(-0.551f, -0.619f, -0.494f, -1.567f, 0.125f, -2.118f)
                curveToRelative(4.87f, -4.329f, 8.83f, -4.379f, 8.996f, -4.379f)
                lineToRelative(2.004f, 0.002f)
                curveToRelative(4.134f, 0.004f, 7.496f, 3.37f, 7.496f, 7.503f)
                close()
                moveTo(16.0f, 17.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _whale!!
    }

private var _whale: ImageVector? = null
