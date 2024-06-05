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

public val Icons.Bold.CloudRainbow: ImageVector
    get() {
        if (_cloudRainbow != null) {
            return _cloudRainbow!!
        }
        _cloudRainbow = Builder(name = "CloudRainbow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.769f, 24.0f)
                arcToRelative(4.21f, 4.21f, 0.0f, false, true, -0.941f, -0.127f)
                arcToRelative(3.814f, 3.814f, 0.0f, false, true, -2.7f, -2.652f)
                arcToRelative(3.837f, 3.837f, 0.0f, false, true, 1.93f, -4.3f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 2.0f, 15.971f)
                arcToRelative(6.109f, 6.109f, 0.0f, false, true, 5.142f, -5.906f)
                arcToRelative(6.232f, 6.232f, 0.0f, false, true, 6.629f, 3.676f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.777f, 1.777f, 0.0f, false, false, 0.34f, 0.1f)
                arcToRelative(5.149f, 5.149f, 0.0f, false, true, -0.156f, 10.023f)
                arcTo(5.589f, 5.589f, 0.0f, false, true, 12.845f, 24.0f)
                close()
                moveTo(8.041f, 13.0f)
                arcToRelative(3.375f, 3.375f, 0.0f, false, false, -0.479f, 0.034f)
                arcToRelative(3.018f, 3.018f, 0.0f, false, false, -2.473f, 2.306f)
                arcToRelative(2.957f, 2.957f, 0.0f, false, false, -0.025f, 1.368f)
                arcTo(2.448f, 2.448f, 0.0f, false, true, 3.62f, 19.491f)
                curveToRelative(-0.3f, 0.125f, -0.721f, 0.492f, -0.6f, 0.95f)
                arcToRelative(0.788f, 0.788f, 0.0f, false, false, 0.551f, 0.525f)
                arcTo(1.036f, 1.036f, 0.0f, false, false, 3.812f, 21.0f)
                horizontalLineToRelative(9.005f)
                arcToRelative(2.577f, 2.577f, 0.0f, false, false, 0.483f, -0.062f)
                arcToRelative(2.149f, 2.149f, 0.0f, false, false, 0.043f, -4.194f)
                arcToRelative(3.049f, 3.049f, 0.0f, false, true, -2.335f, -1.827f)
                verticalLineToRelative(0.0f)
                arcTo(3.2f, 3.2f, 0.0f, false, false, 8.041f, 13.0f)
                close()
                moveTo(11.624f, 7.91f)
                arcTo(14.516f, 14.516f, 0.0f, false, true, 22.5f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                arcTo(17.514f, 17.514f, 0.0f, false, false, 9.375f, 5.924f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.624f, 7.91f)
                close()
                moveTo(15.98f, 10.591f)
                arcTo(9.457f, 9.457f, 0.0f, false, true, 22.5f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                arcToRelative(12.453f, 12.453f, 0.0f, false, false, -8.58f, 3.409f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.06f, 2.182f)
                close()
                moveTo(19.5f, 14.146f)
                arcTo(4.491f, 4.491f, 0.0f, false, true, 22.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 24.0f, 11.5f)
                curveToRelative(-0.347f, -3.014f, -5.192f, -0.874f, -6.5f, 0.41f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.0f, 2.236f)
                close()
            }
        }
        .build()
        return _cloudRainbow!!
    }

private var _cloudRainbow: ImageVector? = null
