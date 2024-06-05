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

public val Icons.Bold.EyeDropper: ImageVector
    get() {
        if (_eyeDropper != null) {
            return _eyeDropper!!
        }
        _eyeDropper = Builder(name = "EyeDropper", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.965f, 6.019f)
                arcToRelative(3.525f, 3.525f, 0.0f, false, false, 0.0f, -4.987f)
                arcToRelative(3.608f, 3.608f, 0.0f, false, false, -4.982f, 0.0f)
                lineToRelative(-1.436f, 1.438f)
                curveToRelative(-0.834f, 0.835f, -2.718f, 0.6f, -3.984f, -0.1f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, -3.653f, 4.938f)
                lineToRelative(1.077f, 1.077f)
                lineToRelative(-7.815f, 8.054f)
                arcToRelative(3.942f, 3.942f, 0.0f, false, false, -0.921f, 4.189f)
                lineToRelative(-0.812f, 0.811f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, 2.122f)
                lineToRelative(0.706f, -0.707f)
                arcToRelative(3.957f, 3.957f, 0.0f, false, false, 4.577f, -0.774f)
                lineToRelative(7.8f, -8.038f)
                lineToRelative(1.048f, 1.048f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, 4.935f, -3.652f)
                curveToRelative(-0.7f, -1.267f, -0.932f, -3.15f, -0.1f, -3.985f)
                close()
                moveTo(5.707f, 19.975f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.4f, -1.431f)
                lineToRelative(7.8f, -8.038f)
                lineToRelative(1.413f, 1.414f)
                close()
                moveTo(20.846f, 3.9f)
                lineTo(19.409f, 5.332f)
                curveToRelative(-1.934f, 1.933f, -1.67f, 5.262f, -0.445f, 7.637f)
                arcToRelative(0.108f, 0.108f, 0.0f, false, true, -0.151f, 0.0f)
                lineToRelative(-7.782f, -7.782f)
                curveToRelative(-0.031f, -0.036f, -0.031f, -0.116f, 0.085f, -0.187f)
                curveToRelative(2.289f, 1.26f, 5.619f, 1.524f, 7.552f, -0.409f)
                lineToRelative(1.439f, -1.439f)
                arcToRelative(0.524f, 0.524f, 0.0f, false, true, 0.739f, 0.742f)
                close()
            }
        }
        .build()
        return _eyeDropper!!
    }

private var _eyeDropper: ImageVector? = null
