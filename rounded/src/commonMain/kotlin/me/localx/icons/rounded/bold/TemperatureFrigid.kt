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

public val Icons.Bold.TemperatureFrigid: ImageVector
    get() {
        if (_temperatureFrigid != null) {
            return _temperatureFrigid!!
        }
        _temperatureFrigid = Builder(name = "TemperatureFrigid", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 16.037f)
                arcToRelative(2.995f, 2.995f, 0.0f, true, true, -4.5f, -2.584f)
                lineTo(14.5f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(4.953f)
                arcTo(2.987f, 2.987f, 0.0f, false, true, 19.0f, 16.037f)
                close()
                moveTo(24.0f, 16.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, true, -8.0f, 8.0f)
                curveToRelative(-6.738f, 0.135f, -10.571f, -8.318f, -6.0f, -13.271f)
                lineTo(10.0f, 6.037f)
                curveToRelative(0.253f, -7.932f, 11.75f, -7.926f, 12.0f, 0.0f)
                verticalLineToRelative(4.692f)
                arcTo(7.907f, 7.907f, 0.0f, false, true, 24.0f, 16.0f)
                close()
                moveTo(21.0f, 16.0f)
                arcToRelative(4.952f, 4.952f, 0.0f, false, false, -1.541f, -3.59f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.0f, 11.33f)
                lineTo(19.0f, 6.037f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -6.0f, 0.0f)
                lineTo(13.0f, 11.33f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.459f, 1.08f)
                arcTo(4.994f, 4.994f, 0.0f, true, false, 21.0f, 16.0f)
                close()
                moveTo(8.0f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                lineTo(5.0f, 3.911f)
                lineToRelative(-2.092f, -1.2f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.492f, 2.6f)
                lineTo(3.484f, 6.5f)
                lineTo(1.416f, 7.686f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.492f, 2.6f)
                lineTo(5.0f, 9.089f)
                lineTo(5.0f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _temperatureFrigid!!
    }

private var _temperatureFrigid: ImageVector? = null
