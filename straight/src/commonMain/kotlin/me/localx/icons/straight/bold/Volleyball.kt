package me.localx.icons.straight.bold

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

public val Icons.Bold.Volleyball: ImageVector
    get() {
        if (_volleyball != null) {
            return _volleyball!!
        }
        _volleyball = Builder(name = "Volleyball", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, false, -12.0f, -12.0f)
                close()
                moveTo(20.036f, 16.029f)
                arcToRelative(15.779f, 15.779f, 0.0f, false, true, -9.464f, -0.562f)
                arcToRelative(9.434f, 9.434f, 0.0f, false, true, 1.674f, -1.757f)
                arcToRelative(12.493f, 12.493f, 0.0f, false, false, 4.367f, 0.8f)
                arcToRelative(12.593f, 12.593f, 0.0f, false, false, 4.209f, -0.734f)
                arcToRelative(8.9f, 8.9f, 0.0f, false, true, -0.786f, 2.253f)
                close()
                moveTo(12.436f, 3.022f)
                arcToRelative(15.763f, 15.763f, 0.0f, false, true, 3.492f, 8.451f)
                arcToRelative(9.447f, 9.447f, 0.0f, false, true, -2.494f, -0.527f)
                arcToRelative(12.543f, 12.543f, 0.0f, false, false, -3.516f, -7.693f)
                arcToRelative(8.984f, 8.984f, 0.0f, false, true, 2.082f, -0.253f)
                curveToRelative(0.146f, 0.0f, 0.288f, 0.015f, 0.432f, 0.022f)
                close()
                moveTo(20.87f, 10.507f)
                arcToRelative(9.467f, 9.467f, 0.0f, false, true, -1.952f, 0.714f)
                arcToRelative(18.772f, 18.772f, 0.0f, false, false, -1.956f, -6.721f)
                arcToRelative(9.009f, 9.009f, 0.0f, false, true, 3.904f, 6.007f)
                close()
                moveTo(6.917f, 4.58f)
                arcToRelative(9.515f, 9.515f, 0.0f, false, true, 1.283f, 1.256f)
                arcToRelative(18.711f, 18.711f, 0.0f, false, false, -5.18f, 5.8f)
                arcToRelative(8.993f, 8.993f, 0.0f, false, true, 3.897f, -7.056f)
                close()
                moveTo(4.211f, 16.488f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, true, 5.57f, -8.1f)
                arcToRelative(9.488f, 9.488f, 0.0f, false, true, 0.673f, 2.921f)
                arcToRelative(12.543f, 12.543f, 0.0f, false, false, -4.5f, 7.336f)
                arcToRelative(9.052f, 9.052f, 0.0f, false, true, -1.743f, -2.157f)
                close()
                moveTo(8.742f, 20.38f)
                arcToRelative(9.508f, 9.508f, 0.0f, false, true, 0.441f, -2.252f)
                arcToRelative(18.788f, 18.788f, 0.0f, false, false, 7.022f, 1.39f)
                curveToRelative(0.258f, 0.0f, 0.516f, -0.017f, 0.774f, -0.027f)
                arcToRelative(8.931f, 8.931f, 0.0f, false, true, -8.237f, 0.889f)
                close()
            }
        }
        .build()
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
