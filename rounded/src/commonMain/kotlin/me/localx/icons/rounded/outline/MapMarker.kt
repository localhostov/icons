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

public val Icons.Outline.MapMarker: ImageVector
    get() {
        if (_mapMarker != null) {
            return _mapMarker!!
        }
        _mapMarker = Builder(name = "MapMarker", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 12.0f)
                close()
                moveTo(12.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 6.0f)
                close()
                moveTo(20.66f, 9.157f)
                lineTo(19.941f, 8.918f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcTo(7.993f, 7.993f, 0.0f, false, false, 4.086f, 9.092f)
                arcToRelative(5.045f, 5.045f, 0.0f, false, false, -2.548f, 1.3f)
                arcTo(4.946f, 4.946f, 0.0f, false, false, 0.0f, 14.0f)
                verticalLineToRelative(4.075f)
                arcToRelative(5.013f, 5.013f, 0.0f, false, false, 3.6f, 4.8f)
                lineToRelative(2.87f, 0.9f)
                arcTo(4.981f, 4.981f, 0.0f, false, false, 7.959f, 24.0f)
                arcToRelative(5.076f, 5.076f, 0.0f, false, false, 1.355f, -0.186f)
                lineToRelative(5.78f, -1.71f)
                arcToRelative(2.987f, 2.987f, 0.0f, false, true, 1.573f, 0.0f)
                lineToRelative(2.387f, 0.8f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 24.0f, 19.021f)
                lineTo(24.0f, 13.872f)
                arcTo(5.015f, 5.015f, 0.0f, false, false, 20.66f, 9.156f)
                close()
                moveTo(7.758f, 3.762f)
                arcToRelative(5.987f, 5.987f, 0.0f, false, true, 8.484f, 0.0f)
                arcToRelative(6.037f, 6.037f, 0.0f, false, true, 0.011f, 8.5f)
                lineTo(12.7f, 15.717f)
                arcToRelative(0.992f, 0.992f, 0.0f, false, true, -1.389f, 0.0f)
                lineTo(7.758f, 12.277f)
                arcTo(6.04f, 6.04f, 0.0f, false, true, 7.758f, 3.762f)
                close()
                moveTo(22.0f, 19.021f)
                arcToRelative(1.991f, 1.991f, 0.0f, false, true, -0.764f, 1.572f)
                arcToRelative(1.969f, 1.969f, 0.0f, false, true, -1.626f, 0.395f)
                lineTo(17.265f, 20.2f)
                arcToRelative(5.023f, 5.023f, 0.0f, false, false, -2.717f, -0.016f)
                lineTo(8.764f, 21.892f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.694f, -0.029f)
                lineToRelative(-2.894f, -0.9f)
                arcTo(3.013f, 3.013f, 0.0f, false, true, 2.0f, 18.075f)
                lineTo(2.0f, 14.0f)
                arcToRelative(2.964f, 2.964f, 0.0f, false, true, 0.92f, -2.163f)
                arcToRelative(3.024f, 3.024f, 0.0f, false, true, 1.669f, -0.806f)
                arcTo(8.021f, 8.021f, 0.0f, false, false, 6.354f, 13.7f)
                lineToRelative(3.567f, 3.453f)
                arcToRelative(2.983f, 2.983f, 0.0f, false, false, 4.174f, 0.0f)
                lineToRelative(3.563f, -3.463f)
                arcToRelative(7.962f, 7.962f, 0.0f, false, false, 1.813f, -2.821f)
                lineToRelative(0.537f, 0.178f)
                arcTo(3.006f, 3.006f, 0.0f, false, true, 22.0f, 13.872f)
                close()
            }
        }
        .build()
        return _mapMarker!!
    }

private var _mapMarker: ImageVector? = null
