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

public val Icons.Outline.StepBackward: ImageVector
    get() {
        if (_stepBackward != null) {
            return _stepBackward!!
        }
        _stepBackward = Builder(name = "StepBackward", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.809f, 0.44f)
                curveToRelative(-1.374f, -0.695f, -2.934f, -0.566f, -4.204f, 0.368f)
                lineToRelative(-9.604f, 7.675f)
                lineTo(5.001f, 1.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(22.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-7.482f)
                lineToRelative(9.637f, 7.706f)
                curveToRelative(0.697f, 0.513f, 1.512f, 0.784f, 2.354f, 0.784f)
                curveToRelative(0.628f, 0.0f, 1.24f, -0.148f, 1.818f, -0.44f)
                curveToRelative(1.372f, -0.696f, 2.19f, -2.029f, 2.19f, -3.567f)
                lineTo(21.0f, 4.007f)
                curveToRelative(0.0f, -1.538f, -0.818f, -2.871f, -2.191f, -3.567f)
                close()
                moveTo(19.0f, 20.001f)
                curveToRelative(0.0f, 0.781f, -0.399f, 1.431f, -1.094f, 1.783f)
                curveToRelative(-0.686f, 0.349f, -1.492f, 0.264f, -2.053f, -0.145f)
                lineTo(5.816f, 13.611f)
                curveToRelative(-0.519f, -0.38f, -0.816f, -0.967f, -0.816f, -1.611f)
                reflectiveCurveToRelative(0.298f, -1.231f, 0.816f, -1.611f)
                lineTo(15.82f, 2.396f)
                curveToRelative(0.359f, -0.264f, 0.761f, -0.397f, 1.17f, -0.397f)
                curveToRelative(0.307f, 0.0f, 0.616f, 0.075f, 0.915f, 0.226f)
                curveToRelative(0.695f, 0.353f, 1.095f, 1.002f, 1.095f, 1.783f)
                verticalLineToRelative(15.993f)
                close()
            }
        }
        .build()
        return _stepBackward!!
    }

private var _stepBackward: ImageVector? = null
