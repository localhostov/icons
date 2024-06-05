package me.localx.icons.rounded.filled

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

public val Icons.Filled.StarSharpHalf: ImageVector
    get() {
        if (_starSharpHalf != null) {
            return _starSharpHalf!!
        }
        _starSharpHalf = Builder(name = "StarSharpHalf", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.635f, 23.228f)
                curveToRelative(-0.749f, 0.0f, -1.432f, -0.273f, -1.919f, -0.625f)
                curveToRelative(-0.878f, -0.631f, -1.715f, -1.956f, -1.18f, -3.608f)
                lineToRelative(1.352f, -4.184f)
                lineToRelative(-3.561f, -2.603f)
                curveTo(-0.073f, 11.187f, -0.173f, 9.624f, 0.167f, 8.596f)
                curveToRelative(0.329f, -1.02f, 1.331f, -2.219f, 3.064f, -2.219f)
                horizontalLineToRelative(4.369f)
                lineToRelative(1.327f, -4.137f)
                curveToRelative(0.53f, -1.653f, 1.986f, -2.24f, 3.072f, -2.24f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(17.786f)
                curveToRelative(0.0f, 0.318f, -0.151f, 0.617f, -0.408f, 0.806f)
                lineToRelative(-4.075f, 2.995f)
                curveToRelative(-0.624f, 0.461f, -1.274f, 0.641f, -1.882f, 0.641f)
                close()
            }
        }
        .build()
        return _starSharpHalf!!
    }

private var _starSharpHalf: ImageVector? = null
