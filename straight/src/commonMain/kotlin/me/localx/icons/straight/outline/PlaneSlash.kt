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

public val Icons.Outline.PlaneSlash: ImageVector
    get() {
        if (_planeSlash != null) {
            return _planeSlash!!
        }
        _planeSlash = Builder(name = "PlaneSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.699f, 17.942f)
                lineToRelative(1.47f, 1.47f)
                lineToRelative(-1.689f, 3.033f)
                curveToRelative(-0.521f, 0.957f, -1.531f, 1.556f, -2.629f, 1.556f)
                horizontalLineToRelative(-3.667f)
                lineToRelative(2.5f, -9.0f)
                horizontalLineToRelative(-2.658f)
                lineToRelative(-1.085f, 1.653f)
                curveToRelative(-0.559f, 0.845f, -1.494f, 1.347f, -2.503f, 1.347f)
                lineTo(0.082f, 18.001f)
                lineToRelative(2.197f, -5.999f)
                lineTo(0.065f, 6.0f)
                horizontalLineToRelative(1.692f)
                lineToRelative(0.739f, 0.739f)
                lineToRelative(1.913f, 5.26f)
                lineToRelative(-1.466f, 4.001f)
                horizontalLineToRelative(0.495f)
                curveToRelative(0.336f, 0.0f, 0.648f, -0.167f, 0.833f, -0.447f)
                lineToRelative(1.676f, -2.553f)
                horizontalLineToRelative(2.81f)
                lineToRelative(2.784f, 2.784f)
                lineToRelative(-1.727f, 6.216f)
                horizontalLineToRelative(1.036f)
                curveToRelative(0.366f, 0.0f, 0.703f, -0.199f, 0.878f, -0.521f)
                lineToRelative(1.97f, -3.538f)
                close()
                moveTo(17.192f, 15.779f)
                lineToRelative(6.764f, 6.764f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.043f, 1.457f)
                lineTo(1.457f, 0.043f)
                lineToRelative(7.947f, 7.947f)
                lineTo(7.185f, 0.0f)
                horizontalLineToRelative(3.667f)
                curveToRelative(1.099f, 0.0f, 2.108f, 0.599f, 2.634f, 1.563f)
                lineToRelative(4.142f, 7.437f)
                horizontalLineToRelative(3.305f)
                curveToRelative(1.516f, 0.0f, 2.834f, 1.076f, 3.066f, 2.503f)
                curveToRelative(0.143f, 0.88f, -0.103f, 1.769f, -0.674f, 2.44f)
                curveToRelative(-0.571f, 0.671f, -1.404f, 1.057f, -2.286f, 1.057f)
                horizontalLineToRelative(-3.412f)
                lineToRelative(-0.434f, 0.779f)
                close()
                moveTo(12.277f, 10.864f)
                lineToRelative(3.445f, 3.445f)
                lineToRelative(0.728f, -1.308f)
                horizontalLineToRelative(4.588f)
                curveToRelative(0.293f, 0.0f, 0.571f, -0.129f, 0.762f, -0.353f)
                curveToRelative(0.193f, -0.228f, 0.272f, -0.52f, 0.224f, -0.823f)
                curveToRelative(-0.076f, -0.462f, -0.556f, -0.824f, -1.093f, -0.824f)
                horizontalLineToRelative(-4.481f)
                lineTo(11.733f, 2.528f)
                curveToRelative(-0.18f, -0.329f, -0.516f, -0.528f, -0.882f, -0.528f)
                horizontalLineToRelative(-1.036f)
                lineToRelative(2.462f, 8.863f)
                close()
            }
        }
        .build()
        return _planeSlash!!
    }

private var _planeSlash: ImageVector? = null
