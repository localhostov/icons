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

public val Icons.Outline.Banana: ImageVector
    get() {
        if (_banana != null) {
            return _banana!!
        }
        _banana = Builder(name = "Banana", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 15.574f)
                curveToRelative(-0.809f, -2.045f, -2.369f, -3.565f, -4.235f, -4.397f)
                curveTo(19.731f, 3.572f, 18.397f, 0.015f, 15.571f, 0.005f)
                horizontalLineToRelative(-0.014f)
                curveTo(12.419f, 0.005f, 11.238f, 4.148f, 10.665f, 8.382f)
                curveToRelative(-0.319f, -0.107f, -0.668f, -0.199f, -1.098f, -0.272f)
                curveToRelative(-2.125f, -0.359f, -4.273f, 0.132f, -6.035f, 1.383f)
                lineToRelative(0.471f, 1.504f)
                curveToRelative(3.084f, -0.715f, 4.64f, -0.282f, 5.994f, 1.142f)
                curveToRelative(-0.573f, 1.642f, -1.864f, 4.014f, -4.723f, 5.446f)
                curveToRelative(-2.89f, 1.245f, -4.087f, 3.26f, -4.137f, 3.345f)
                lineToRelative(-0.015f, 0.026f)
                lineTo(0.0f, 20.956f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.068f)
                lineToRelative(0.216f, 0.222f)
                curveToRelative(0.296f, 0.305f, 1.173f, 0.817f, 3.714f, 0.817f)
                curveToRelative(0.0f, 0.0f, 0.002f, 0.0f, 0.002f, 0.0f)
                curveToRelative(4.73f, 0.0f, 7.924f, -1.364f, 10.086f, -3.127f)
                curveToRelative(-0.066f, -0.981f, -0.193f, -1.763f, -0.381f, -2.371f)
                curveToRelative(-2.213f, 2.313f, -5.456f, 3.497f, -9.705f, 3.497f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.026f, 0.0f, -1.648f, -0.093f, -2.0f, -0.177f)
                verticalLineToRelative(-0.076f)
                curveToRelative(0.337f, -0.45f, 1.306f, -1.564f, 3.115f, -2.345f)
                curveToRelative(2.846f, -1.423f, 4.418f, -3.59f, 5.282f, -5.428f)
                curveToRelative(2.612f, 0.451f, 5.411f, 1.036f, 5.711f, 7.141f)
                lineToRelative(1.392f, 0.386f)
                curveToRelative(1.075f, -2.168f, 1.433f, -4.545f, 0.859f, -6.59f)
                curveToRelative(1.068f, 0.178f, 2.199f, 0.604f, 3.423f, 1.442f)
                lineToRelative(1.219f, -0.775f)
                close()
                moveTo(15.0f, 12.083f)
                curveToRelative(-0.606f, -0.038f, -2.267f, -0.532f, -2.471f, -2.467f)
                curveToRelative(0.73f, -6.249f, 2.036f, -7.611f, 3.03f, -7.611f)
                horizontalLineToRelative(0.004f)
                curveToRelative(0.985f, 0.004f, 2.125f, 2.341f, 2.198f, 8.797f)
                curveToRelative(-0.207f, 0.386f, -0.886f, 1.281f, -2.761f, 1.281f)
                close()
            }
        }
        .build()
        return _banana!!
    }

private var _banana: ImageVector? = null
