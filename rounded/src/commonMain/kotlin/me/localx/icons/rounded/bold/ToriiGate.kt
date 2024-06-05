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

public val Icons.Bold.ToriiGate: ImageVector
    get() {
        if (_toriiGate != null) {
            return _toriiGate!!
        }
        _toriiGate = Builder(name = "ToriiGate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 12.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-4.168f)
                curveToRelative(0.504f, -0.561f, 0.935f, -1.208f, 1.253f, -1.951f)
                lineToRelative(1.579f, -3.267f)
                curveToRelative(0.319f, -0.681f, 0.178f, -1.507f, -0.35f, -2.052f)
                curveToRelative(-0.612f, -0.636f, -1.597f, -0.743f, -2.359f, -0.246f)
                lineToRelative(-0.291f, 0.195f)
                curveToRelative(-0.934f, 0.628f, -2.212f, 1.489f, -3.569f, 1.489f)
                lineTo(6.737f, 2.0f)
                curveToRelative(-1.357f, 0.0f, -2.636f, -0.86f, -3.489f, -1.431f)
                curveToRelative(-0.735f, -0.569f, -1.242f, -0.569f, -1.409f, -0.569f)
                curveToRelative(-0.496f, 0.0f, -0.978f, 0.205f, -1.32f, 0.56f)
                curveTo(-0.011f, 1.108f, -0.149f, 1.94f, 0.183f, 2.646f)
                lineToRelative(1.507f, 3.112f)
                curveToRelative(0.337f, 0.784f, 0.787f, 1.462f, 1.31f, 2.046f)
                verticalLineToRelative(4.197f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(6.737f, 5.0f)
                horizontalLineToRelative(10.526f)
                curveToRelative(0.819f, 0.0f, 1.585f, -0.163f, 2.282f, -0.406f)
                lineToRelative(-0.021f, 0.042f)
                curveToRelative(-0.644f, 1.502f, -1.892f, 2.363f, -3.424f, 2.363f)
                lineTo(7.9f, 6.999f)
                curveToRelative(-1.506f, 0.0f, -2.748f, -0.854f, -3.445f, -2.406f)
                curveToRelative(0.696f, 0.244f, 1.462f, 0.406f, 2.282f, 0.406f)
                close()
                moveTo(6.0f, 9.726f)
                curveToRelative(0.602f, 0.177f, 1.238f, 0.274f, 1.9f, 0.274f)
                horizontalLineToRelative(2.6f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-2.274f)
                close()
                moveTo(13.5f, 12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.6f)
                curveToRelative(0.663f, 0.0f, 1.299f, -0.095f, 1.9f, -0.269f)
                verticalLineToRelative(2.269f)
                horizontalLineToRelative(-4.5f)
                close()
            }
        }
        .build()
        return _toriiGate!!
    }

private var _toriiGate: ImageVector? = null
