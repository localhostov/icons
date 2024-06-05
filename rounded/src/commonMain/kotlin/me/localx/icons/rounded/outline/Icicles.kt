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

public val Icons.Outline.Icicles: ImageVector
    get() {
        if (_icicles != null) {
            return _icicles!!
        }
        _icicles = Builder(name = "Icicles", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 24.0f)
                horizontalLineToRelative(-0.024f)
                curveToRelative(-0.468f, -0.012f, -0.864f, -0.346f, -0.956f, -0.804f)
                lineToRelative(-2.02f, -10.098f)
                lineToRelative(-1.02f, 5.098f)
                curveToRelative(-0.096f, 0.479f, -0.538f, 0.831f, -1.013f, 0.803f)
                curveToRelative(-0.488f, -0.016f, -0.894f, -0.382f, -0.959f, -0.866f)
                lineTo(0.043f, 3.473f)
                curveToRelative(-0.155f, -0.822f, 0.076f, -1.714f, 0.644f, -2.397f)
                reflectiveCurveTo(2.089f, 0.0f, 2.977f, 0.0f)
                horizontalLineToRelative(18.047f)
                curveToRelative(0.882f, 0.0f, 1.712f, 0.387f, 2.279f, 1.062f)
                curveToRelative(0.566f, 0.675f, 0.804f, 1.56f, 0.652f, 2.428f)
                lineToRelative(-2.972f, 18.209f)
                curveToRelative(-0.077f, 0.474f, -0.479f, 0.825f, -0.959f, 0.839f)
                curveToRelative(-0.514f, -0.008f, -0.901f, -0.316f, -1.005f, -0.784f)
                lineToRelative(-2.104f, -9.505f)
                lineToRelative(-1.449f, 5.507f)
                curveToRelative(-0.114f, 0.436f, -0.506f, 0.74f, -0.956f, 0.745f)
                curveToRelative(-0.473f, -0.017f, -0.849f, -0.292f, -0.973f, -0.725f)
                lineToRelative(-1.695f, -5.927f)
                lineToRelative(-2.873f, 11.396f)
                curveToRelative(-0.112f, 0.445f, -0.513f, 0.756f, -0.97f, 0.756f)
                close()
                moveTo(5.0f, 7.0f)
                curveToRelative(0.477f, 0.0f, 0.887f, 0.337f, 0.98f, 0.804f)
                lineToRelative(2.132f, 10.66f)
                lineToRelative(2.7f, -10.708f)
                curveToRelative(0.11f, -0.438f, 0.502f, -0.749f, 0.954f, -0.756f)
                curveToRelative(0.437f, -0.019f, 0.853f, 0.29f, 0.978f, 0.725f)
                lineToRelative(1.716f, 5.999f)
                lineToRelative(1.573f, -5.979f)
                curveToRelative(0.117f, -0.446f, 0.524f, -0.749f, 0.986f, -0.745f)
                curveToRelative(0.462f, 0.01f, 0.857f, 0.333f, 0.957f, 0.784f)
                lineToRelative(1.871f, 8.454f)
                lineToRelative(2.135f, -13.083f)
                curveToRelative(0.07f, -0.4f, -0.103f, -0.677f, -0.212f, -0.807f)
                curveToRelative(-0.108f, -0.131f, -0.352f, -0.349f, -0.747f, -0.349f)
                horizontalLineTo(2.977f)
                curveToRelative(-0.398f, 0.0f, -0.642f, 0.221f, -0.751f, 0.353f)
                reflectiveCurveToRelative(-0.282f, 0.411f, -0.208f, 0.804f)
                lineToRelative(1.177f, 8.773f)
                lineToRelative(0.825f, -4.126f)
                curveToRelative(0.094f, -0.467f, 0.504f, -0.804f, 0.98f, -0.804f)
                close()
            }
        }
        .build()
        return _icicles!!
    }

private var _icicles: ImageVector? = null
