package me.localx.icons.rounded.outline

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

public val Icons.Outline.Thunderstorm: ImageVector
    get() {
        if (_thunderstorm != null) {
            return _thunderstorm!!
        }
        _thunderstorm = Builder(name = "Thunderstorm", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.892f, 24.015f)
                arcToRelative(1.913f, 1.913f, 0.0f, false, true, -0.815f, -0.186f)
                arcToRelative(1.844f, 1.844f, 0.0f, false, true, -1.0f, -2.207f)
                lineTo(9.614f, 20.0f)
                lineTo(7.923f, 20.0f)
                arcToRelative(1.933f, 1.933f, 0.0f, false, true, -1.84f, -2.479f)
                lineToRelative(2.132f, -6.174f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.1f, 10.0f)
                lineTo(12.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.867f, 2.717f)
                lineTo(13.413f, 14.0f)
                horizontalLineToRelative(1.681f)
                arcToRelative(1.905f, 1.905f, 0.0f, false, true, 1.587f, 2.958f)
                lineTo(12.419f, 23.2f)
                arcTo(1.848f, 1.848f, 0.0f, false, true, 10.892f, 24.015f)
                close()
                moveTo(11.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.949f, 1.315f)
                lineToRelative(-0.662f, 1.993f)
                lineToRelative(3.66f, -5.357f)
                lineTo(12.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.943f, -1.333f)
                lineToRelative(0.932f, -2.642f)
                lineTo(10.1f, 12.0f)
                lineTo(8.021f, 18.031f)
                close()
                moveTo(19.0f, 19.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.385f, -1.923f)
                curveToRelative(4.967f, -2.007f, 4.218f, -9.468f, -1.032f, -10.472f)
                arcToRelative(3.011f, 3.011f, 0.0f, false, true, -2.158f, -1.672f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 4.086f, 6.967f)
                arcToRelative(6.159f, 6.159f, 0.0f, false, false, 0.023f, 2.18f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.962f, 2.762f)
                arcToRelative(3.523f, 3.523f, 0.0f, false, false, 0.41f, 5.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.114f, 1.662f)
                arcTo(5.536f, 5.536f, 0.0f, false, true, 1.8f, 10.43f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.345f, -0.9f)
                arcToRelative(8.146f, 8.146f, 0.0f, false, true, -0.033f, -2.889f)
                arcTo(7.946f, 7.946f, 0.0f, false, true, 8.5f, 0.137f)
                arcToRelative(8.057f, 8.057f, 0.0f, false, true, 8.734f, 4.44f)
                arcToRelative(1.04f, 1.04f, 0.0f, false, false, 0.743f, 0.569f)
                curveToRelative(7.187f, 1.424f, 8.193f, 11.483f, 1.411f, 14.278f)
                arcTo(0.987f, 0.987f, 0.0f, false, true, 19.0f, 19.5f)
                close()
            }
        }
        .build()
        return _thunderstorm!!
    }

private var _thunderstorm: ImageVector? = null
