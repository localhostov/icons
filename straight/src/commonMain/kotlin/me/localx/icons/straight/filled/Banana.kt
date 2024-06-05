package me.localx.icons.straight.filled

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

public val Icons.Filled.Banana: ImageVector
    get() {
        if (_banana != null) {
            return _banana!!
        }
        _banana = Builder(name = "Banana", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.379f, 10.119f)
                curveToRelative(2.368f, 0.558f, 4.328f, -1.342f, 4.328f, -1.342f)
                curveTo(19.416f, 2.818f, 18.082f, 0.013f, 15.571f, 0.005f)
                horizontalLineToRelative(-0.014f)
                curveTo(12.973f, 0.005f, 11.718f, 2.815f, 11.035f, 6.171f)
                curveToRelative(-0.015f, 0.072f, 1.119f, 3.188f, 4.344f, 3.948f)
                close()
                moveTo(24.0f, 15.574f)
                curveToRelative(-0.813f, -2.055f, -2.38f, -3.593f, -4.258f, -4.422f)
                curveToRelative(0.0f, 0.0f, -1.588f, 1.463f, -4.742f, 0.93f)
                curveToRelative(-3.534f, -0.597f, -4.601f, -3.794f, -4.743f, -3.83f)
                curveToRelative(-0.21f, -0.053f, -0.439f, -0.1f, -0.691f, -0.143f)
                curveToRelative(-2.125f, -0.359f, -4.273f, 0.132f, -6.035f, 1.383f)
                lineToRelative(0.471f, 1.504f)
                curveToRelative(3.083f, -0.715f, 4.638f, -0.275f, 5.991f, 1.147f)
                curveToRelative(-0.206f, 0.594f, -0.506f, 1.265f, -0.925f, 1.954f)
                curveToRelative(-0.005f, -0.005f, -0.01f, -0.01f, -0.015f, -0.015f)
                curveToRelative(-0.774f, 1.272f, -1.951f, 2.585f, -3.781f, 3.501f)
                curveToRelative(-2.89f, 1.245f, -4.087f, 3.26f, -4.137f, 3.345f)
                lineToRelative(-0.015f, 0.026f)
                lineTo(0.0f, 20.954f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.068f)
                lineToRelative(0.216f, 0.222f)
                curveToRelative(0.296f, 0.305f, 1.173f, 0.817f, 3.714f, 0.817f)
                curveToRelative(0.0f, 0.0f, 0.002f, 0.0f, 0.002f, 0.0f)
                curveToRelative(4.73f, 0.0f, 7.924f, -1.364f, 10.086f, -3.127f)
                curveToRelative(-0.273f, -3.998f, -1.693f, -4.388f, -2.742f, -4.666f)
                lineToRelative(-0.422f, -0.107f)
                lineToRelative(0.935f, -1.826f)
                curveToRelative(2.106f, 0.56f, 4.006f, 1.872f, 4.25f, 6.841f)
                lineToRelative(1.392f, 0.386f)
                curveToRelative(1.075f, -2.168f, 1.433f, -4.545f, 0.859f, -6.59f)
                curveToRelative(1.068f, 0.178f, 2.199f, 0.604f, 3.423f, 1.442f)
                lineToRelative(1.219f, -0.775f)
                close()
            }
        }
        .build()
        return _banana!!
    }

private var _banana: ImageVector? = null
