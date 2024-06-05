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

public val Icons.Bold.HandScissors: ImageVector
    get() {
        if (_handScissors != null) {
            return _handScissors!!
        }
        _handScissors = Builder(name = "HandScissors", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 10.531f)
                verticalLineToRelative(5.969f)
                curveToRelative(0.0f, 3.033f, -2.467f, 5.5f, -5.5f, 5.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-2.671f, 0.0f, -4.902f, -1.931f, -5.425f, -4.696f)
                lineToRelative(-0.682f, -3.484f)
                lineToRelative(-7.153f, 1.161f)
                curveToRelative(-0.815f, 0.128f, -1.588f, -0.422f, -1.721f, -1.24f)
                curveToRelative(-0.133f, -0.817f, 0.422f, -1.588f, 1.24f, -1.721f)
                lineToRelative(8.586f, -1.394f)
                curveToRelative(0.8f, -0.13f, 1.557f, 0.398f, 1.712f, 1.192f)
                lineToRelative(0.962f, 4.919f)
                curveToRelative(0.261f, 1.378f, 1.233f, 2.263f, 2.479f, 2.263f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-5.969f)
                curveToRelative(0.0f, -1.469f, -0.572f, -2.851f, -1.611f, -3.889f)
                lineToRelative(-2.308f, -2.309f)
                curveToRelative(-0.215f, -0.215f, -0.501f, -0.333f, -0.806f, -0.333f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.305f, 0.0f, -0.591f, 0.12f, -0.807f, 0.336f)
                lineToRelative(-2.512f, 2.408f)
                lineToRelative(1.773f, 0.273f)
                curveToRelative(0.819f, 0.126f, 1.38f, 0.892f, 1.254f, 1.71f)
                curveToRelative(-0.114f, 0.742f, -0.753f, 1.272f, -1.48f, 1.272f)
                curveToRelative(-0.076f, 0.0f, -0.153f, -0.005f, -0.23f, -0.018f)
                lineTo(1.272f, 7.982f)
                curveTo(0.453f, 7.856f, -0.108f, 7.091f, 0.018f, 6.272f)
                curveToRelative(0.125f, -0.82f, 0.896f, -1.385f, 1.71f, -1.254f)
                lineToRelative(7.491f, 1.153f)
                lineToRelative(4.145f, -3.974f)
                curveToRelative(0.755f, -0.76f, 1.795f, -1.194f, 2.904f, -1.196f)
                horizontalLineToRelative(0.007f)
                curveToRelative(1.105f, 0.0f, 2.145f, 0.43f, 2.926f, 1.212f)
                lineToRelative(2.308f, 2.308f)
                curveToRelative(1.605f, 1.604f, 2.49f, 3.739f, 2.49f, 6.01f)
                close()
            }
        }
        .build()
        return _handScissors!!
    }

private var _handScissors: ImageVector? = null
