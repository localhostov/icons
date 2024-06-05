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

public val Icons.Bold.Sparkles: ImageVector
    get() {
        if (_sparkles != null) {
            return _sparkles!!
        }
        _sparkles = Builder(name = "Sparkles", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 24.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.393f, -0.943f)
                lineTo(17.482f, 21.5f)
                lineToRelative(-1.564f, -0.66f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.051f, -2.785f)
                lineToRelative(1.526f, -0.577f)
                lineToRelative(0.612f, -1.531f)
                arcToRelative(1.51f, 1.51f, 0.0f, false, true, 2.786f, 0.0f)
                lineToRelative(0.619f, 1.546f)
                lineToRelative(1.545f, 0.618f)
                arcToRelative(1.51f, 1.51f, 0.0f, false, true, 0.0f, 2.786f)
                lineToRelative(-1.545f, 0.618f)
                lineToRelative(-0.619f, 1.546f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 24.0f)
                close()
                moveTo(10.0f, 21.0f)
                arcToRelative(2.465f, 2.465f, 0.0f, false, true, -2.357f, -1.721f)
                lineTo(6.2f, 14.781f)
                lineTo(1.689f, 13.27f)
                arcToRelative(2.475f, 2.475f, 0.0f, false, true, 0.064f, -4.714f)
                lineToRelative(4.47f, -1.365f)
                lineToRelative(1.507f, -4.5f)
                arcTo(2.438f, 2.438f, 0.0f, false, true, 10.11f, 1.0f)
                arcToRelative(2.467f, 2.467f, 0.0f, false, true, 2.334f, 1.753f)
                lineTo(13.806f, 7.21f)
                lineToRelative(4.473f, 1.433f)
                arcToRelative(2.488f, 2.488f, 0.0f, false, true, 0.0f, 4.714f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-4.486f, 1.436f)
                lineToRelative(-1.436f, 4.486f)
                arcTo(2.465f, 2.465f, 0.0f, false, true, 10.0f, 21.0f)
                close()
                moveTo(4.2f, 10.946f)
                lineToRelative(3.678f, 1.231f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.953f, 0.966f)
                lineTo(10.0f, 16.8f)
                lineToRelative(1.171f, -3.659f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.972f, -0.972f)
                lineTo(15.8f, 11.0f)
                lineToRelative(-3.66f, -1.171f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.978f, -0.991f)
                lineTo(10.054f, 5.2f)
                lineTo(8.823f, 8.876f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.985f, 0.958f)
                close()
                moveTo(17.756f, 4.5f)
                lineToRelative(1.355f, 0.387f)
                lineTo(19.5f, 6.244f)
                arcToRelative(1.042f, 1.042f, 0.0f, false, false, 2.0f, 0.0f)
                lineToRelative(0.387f, -1.355f)
                lineTo(23.244f, 4.5f)
                arcToRelative(1.042f, 1.042f, 0.0f, false, false, 0.0f, -2.0f)
                lineToRelative(-1.355f, -0.387f)
                lineTo(21.5f, 0.756f)
                arcToRelative(1.042f, 1.042f, 0.0f, false, false, -2.0f, 0.0f)
                lineToRelative(-0.387f, 1.355f)
                lineTo(17.756f, 2.5f)
                arcTo(1.042f, 1.042f, 0.0f, false, false, 17.756f, 4.5f)
                close()
            }
        }
        .build()
        return _sparkles!!
    }

private var _sparkles: ImageVector? = null
