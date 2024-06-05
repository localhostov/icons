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

public val Icons.Filled.MapMarker: ImageVector
    get() {
        if (_mapMarker != null) {
            return _mapMarker!!
        }
        _mapMarker = Builder(name = "MapMarker", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 7.0f)
                close()
                moveTo(16.958f, 12.184f)
                lineTo(13.9f, 15.215f)
                arcToRelative(2.669f, 2.669f, 0.0f, false, true, -3.79f, 0.0f)
                lineTo(7.054f, 12.2f)
                arcTo(7.262f, 7.262f, 0.0f, false, true, 7.042f, 2.1f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, true, 9.916f, 0.0f)
                arcTo(7.257f, 7.257f, 0.0f, false, true, 16.958f, 12.184f)
                close()
                moveTo(16.0f, 7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 7.0f)
                close()
                moveTo(20.753f, 9.2f)
                arcToRelative(9.1f, 9.1f, 0.0f, false, true, -2.364f, 4.384f)
                lineToRelative(-3.078f, 3.053f)
                arcToRelative(4.667f, 4.667f, 0.0f, false, true, -3.3f, 1.371f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.665f, 4.665f, 0.0f, false, true, -3.3f, -1.366f)
                lineTo(5.648f, 13.619f)
                arcTo(9.2f, 9.2f, 0.0f, false, true, 3.283f, 9.308f)
                arcToRelative(5.066f, 5.066f, 0.0f, false, false, -1.745f, 1.083f)
                arcTo(4.946f, 4.946f, 0.0f, false, false, 0.0f, 14.0f)
                verticalLineToRelative(4.075f)
                arcToRelative(5.013f, 5.013f, 0.0f, false, false, 3.6f, 4.8f)
                lineToRelative(2.87f, 0.9f)
                arcTo(4.981f, 4.981f, 0.0f, false, false, 7.959f, 24.0f)
                arcToRelative(5.076f, 5.076f, 0.0f, false, false, 1.355f, -0.186f)
                lineToRelative(5.78f, -1.71f)
                arcToRelative(2.976f, 2.976f, 0.0f, false, true, 1.573f, 0.0f)
                lineToRelative(2.387f, 0.8f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 24.0f, 19.021f)
                lineTo(24.0f, 13.872f)
                arcTo(5.009f, 5.009f, 0.0f, false, false, 20.753f, 9.2f)
                close()
            }
        }
        .build()
        return _mapMarker!!
    }

private var _mapMarker: ImageVector? = null
