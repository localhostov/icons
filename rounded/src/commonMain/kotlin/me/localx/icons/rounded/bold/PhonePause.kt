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

public val Icons.Bold.PhonePause: ImageVector
    get() {
        if (_phonePause != null) {
            return _phonePause!!
        }
        _phonePause = Builder(name = "PhonePause", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.0f, 6.5f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 21.5f, 8.0f)
                close()
                moveTo(18.0f, 6.5f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
                moveTo(22.062f, 22.138f)
                curveToRelative(0.024f, -0.025f, 0.954f, -1.092f, 0.954f, -1.092f)
                arcToRelative(3.509f, 3.509f, 0.0f, false, false, -0.081f, -4.946f)
                lineTo(20.7f, 14.025f)
                arcToRelative(3.584f, 3.584f, 0.0f, false, false, -4.945f, 0.0f)
                lineToRelative(-0.41f, 0.4f)
                arcTo(11.6f, 11.6f, 0.0f, false, true, 9.586f, 8.647f)
                lineToRelative(0.389f, -0.394f)
                arcToRelative(3.521f, 3.521f, 0.0f, false, false, 0.039f, -4.909f)
                lineTo(7.861f, 1.025f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 2.954f, 0.984f)
                reflectiveCurveToRelative(-1.066f, 0.93f, -1.091f, 0.954f)
                curveTo(-5.073f, 9.785f, 9.342f, 24.224f, 17.5f, 24.0f)
                arcTo(6.4f, 6.4f, 0.0f, false, false, 22.062f, 22.138f)
                close()
                moveTo(5.033f, 3.146f)
                arcToRelative(0.494f, 0.494f, 0.0f, false, true, 0.668f, -0.04f)
                lineTo(7.854f, 5.425f)
                arcToRelative(0.482f, 0.482f, 0.0f, false, true, -0.009f, 0.715f)
                lineTo(6.736f, 7.267f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.322f, 1.611f)
                arcTo(14.849f, 14.849f, 0.0f, false, false, 15.146f, 17.6f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.587f, -0.332f)
                lineToRelative(1.135f, -1.117f)
                curveToRelative(0.28f, -0.213f, 0.451f, -0.21f, 0.748f, 0.04f)
                lineToRelative(2.238f, 2.074f)
                arcToRelative(0.482f, 0.482f, 0.0f, false, true, 0.0f, 0.706f)
                curveToRelative(-0.025f, 0.025f, -0.949f, 1.084f, -0.949f, 1.084f)
                curveTo(14.654f, 24.773f, -0.911f, 10.127f, 3.95f, 4.1f)
                curveTo(3.95f, 4.1f, 5.009f, 3.171f, 5.033f, 3.146f)
                close()
            }
        }
        .build()
        return _phonePause!!
    }

private var _phonePause: ImageVector? = null
