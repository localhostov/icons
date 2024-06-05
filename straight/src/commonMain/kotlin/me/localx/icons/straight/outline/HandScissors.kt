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

public val Icons.Outline.HandScissors: ImageVector
    get() {
        if (_handScissors != null) {
            return _handScissors!!
        }
        _handScissors = Builder(name = "HandScissors", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.879f, 1.879f)
                curveToRelative(-1.134f, -1.134f, -3.104f, -1.14f, -4.249f, 0.006f)
                lineToRelative(-2.982f, 3.03f)
                lineToRelative(-7.975f, -1.838f)
                curveToRelative(-0.858f, -0.197f, -1.756f, -0.01f, -2.465f, 0.517f)
                curveTo(0.501f, 4.12f, 0.062f, 4.932f, 0.004f, 5.82f)
                curveToRelative(-0.094f, 1.443f, 0.949f, 2.788f, 2.425f, 3.128f)
                lineToRelative(2.387f, 0.553f)
                lineToRelative(-2.386f, 0.552f)
                curveTo(0.953f, 10.393f, -0.09f, 11.738f, 0.004f, 13.181f)
                curveToRelative(0.058f, 0.889f, 0.497f, 1.7f, 1.204f, 2.227f)
                curveToRelative(0.708f, 0.526f, 1.609f, 0.714f, 2.461f, 0.517f)
                lineToRelative(5.065f, -1.148f)
                lineToRelative(1.445f, 7.224f)
                horizontalLineToRelative(13.82f)
                lineTo(23.999f, 7.0f)
                lineToRelative(-5.121f, -5.121f)
                close()
                moveTo(22.0f, 20.0f)
                horizontalLineToRelative(-10.18f)
                lineToRelative(-1.526f, -7.628f)
                lineToRelative(-7.07f, 1.603f)
                curveToRelative(-0.285f, 0.067f, -0.585f, 0.003f, -0.822f, -0.172f)
                curveToRelative(-0.239f, -0.178f, -0.382f, -0.445f, -0.402f, -0.752f)
                curveToRelative(-0.031f, -0.467f, 0.355f, -0.928f, 0.88f, -1.049f)
                lineToRelative(10.803f, -2.502f)
                lineTo(2.88f, 6.999f)
                curveToRelative(-0.524f, -0.121f, -0.91f, -0.581f, -0.879f, -1.049f)
                curveToRelative(0.02f, -0.307f, 0.163f, -0.574f, 0.402f, -0.751f)
                curveToRelative(0.236f, -0.175f, 0.537f, -0.239f, 0.822f, -0.172f)
                lineToRelative(13.128f, 3.025f)
                lineToRelative(0.449f, -1.949f)
                lineToRelative(-2.866f, -0.66f)
                lineToRelative(2.115f, -2.149f)
                curveToRelative(0.377f, -0.378f, 1.036f, -0.378f, 1.414f, 0.0f)
                lineToRelative(4.536f, 4.535f)
                verticalLineToRelative(12.172f)
                close()
            }
        }
        .build()
        return _handScissors!!
    }

private var _handScissors: ImageVector? = null
