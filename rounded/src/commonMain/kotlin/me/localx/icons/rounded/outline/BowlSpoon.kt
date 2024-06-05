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

public val Icons.Outline.BowlSpoon: ImageVector
    get() {
        if (_bowlSpoon != null) {
            return _bowlSpoon!!
        }
        _bowlSpoon = Builder(name = "BowlSpoon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.293f, 8.0f)
                curveToRelative(1.974f, 0.0f, 3.624f, -1.279f, 4.099f, -3.0f)
                horizontalLineToRelative(12.607f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-12.607f)
                curveToRelative(-0.475f, -1.721f, -2.125f, -3.0f, -4.099f, -3.0f)
                curveTo(4.132f, 0.0f, 0.0f, 1.558f, 0.0f, 4.0f)
                reflectiveCurveToRelative(4.132f, 4.0f, 6.293f, 4.0f)
                close()
                moveTo(6.293f, 2.0f)
                curveToRelative(1.241f, 0.0f, 2.25f, 0.897f, 2.25f, 2.0f)
                reflectiveCurveToRelative(-1.009f, 2.0f, -2.25f, 2.0f)
                curveToRelative(-1.727f, 0.0f, -4.293f, -1.312f, -4.293f, -2.0f)
                reflectiveCurveToRelative(2.566f, -2.0f, 4.293f, -2.0f)
                close()
                moveTo(23.327f, 12.498f)
                curveToRelative(-0.714f, -0.952f, -1.806f, -1.498f, -2.997f, -1.498f)
                lineTo(3.669f, 11.0f)
                curveToRelative(-1.19f, 0.0f, -2.283f, 0.546f, -2.997f, 1.498f)
                curveToRelative(-0.72f, 0.961f, -0.939f, 2.174f, -0.602f, 3.329f)
                curveToRelative(0.652f, 2.233f, 1.834f, 4.248f, 3.419f, 5.826f)
                curveToRelative(1.498f, 1.491f, 3.613f, 2.347f, 5.805f, 2.347f)
                horizontalLineToRelative(5.411f)
                curveToRelative(2.191f, 0.0f, 4.307f, -0.855f, 5.805f, -2.347f)
                curveToRelative(1.585f, -1.578f, 2.767f, -3.593f, 3.419f, -5.826f)
                curveToRelative(0.337f, -1.155f, 0.118f, -2.368f, -0.602f, -3.329f)
                close()
                moveTo(22.009f, 15.267f)
                curveToRelative(-0.55f, 1.883f, -1.583f, 3.647f, -2.911f, 4.969f)
                curveToRelative(-1.126f, 1.122f, -2.727f, 1.765f, -4.394f, 1.765f)
                horizontalLineToRelative(-5.411f)
                curveToRelative(-1.667f, 0.0f, -3.268f, -0.643f, -4.394f, -1.765f)
                curveToRelative(-1.327f, -1.321f, -2.361f, -3.086f, -2.911f, -4.969f)
                curveToRelative(-0.159f, -0.545f, -0.057f, -1.117f, 0.282f, -1.568f)
                curveToRelative(0.333f, -0.443f, 0.842f, -0.698f, 1.396f, -0.698f)
                horizontalLineToRelative(16.662f)
                curveToRelative(0.555f, 0.0f, 1.064f, 0.255f, 1.396f, 0.698f)
                curveToRelative(0.339f, 0.451f, 0.441f, 1.023f, 0.282f, 1.568f)
                close()
            }
        }
        .build()
        return _bowlSpoon!!
    }

private var _bowlSpoon: ImageVector? = null
