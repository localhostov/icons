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

public val Icons.Filled.Effect: ImageVector
    get() {
        if (_effect != null) {
            return _effect!!
        }
        _effect = Builder(name = "Effect", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(1.0f)
                curveTo(0.448f, 0.0f, 0.0f, 0.448f, 0.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(15.163f)
                curveToRelative(-1.646f, 0.495f, -2.795f, 2.152f, -2.433f, 4.027f)
                curveToRelative(0.253f, 1.315f, 1.291f, 2.407f, 2.596f, 2.712f)
                curveToRelative(2.291f, 0.535f, 4.337f, -1.199f, 4.337f, -3.402f)
                curveToRelative(0.0f, -1.58f, -1.059f, -2.903f, -2.5f, -3.337f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(15.163f)
                curveToRelative(-1.646f, 0.495f, -2.795f, 2.152f, -2.433f, 4.027f)
                curveToRelative(0.253f, 1.315f, 1.291f, 2.407f, 2.596f, 2.712f)
                curveToRelative(2.291f, 0.535f, 4.337f, -1.199f, 4.337f, -3.402f)
                curveToRelative(0.0f, -1.58f, -1.059f, -2.903f, -2.5f, -3.337f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(2.109f)
                lineToRelative(4.928f, 15.605f)
                curveToRelative(-1.117f, 0.76f, -1.775f, 2.148f, -1.457f, 3.653f)
                curveToRelative(0.273f, 1.291f, 1.307f, 2.351f, 2.593f, 2.647f)
                curveToRelative(2.287f, 0.527f, 4.327f, -1.205f, 4.327f, -3.405f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-0.019f, 0.0f, -0.036f, 0.005f, -0.055f, 0.006f)
                lineTo(15.706f, 2.0f)
                horizontalLineToRelative(7.294f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _effect!!
    }

private var _effect: ImageVector? = null
