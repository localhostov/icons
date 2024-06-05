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

public val Icons.Bold.Tachometer: ImageVector
    get() {
        if (_tachometer != null) {
            return _tachometer!!
        }
        _tachometer = Builder(name = "Tachometer", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.9f, 11.4f)
                arcTo(12.039f, 12.039f, 0.0f, false, false, 13.381f, 1.077f)
                curveTo(2.019f, -0.212f, -4.6f, 13.774f, 3.761f, 21.629f)
                arcTo(5.181f, 5.181f, 0.0f, false, false, 7.336f, 23.0f)
                horizontalLineToRelative(9.323f)
                arcToRelative(5.308f, 5.308f, 0.0f, false, false, 3.726f, -1.512f)
                arcTo(11.859f, 11.859f, 0.0f, false, false, 23.9f, 11.4f)
                close()
                moveTo(18.292f, 19.344f)
                arcTo(2.327f, 2.327f, 0.0f, false, true, 16.659f, 20.0f)
                lineTo(7.336f, 20.0f)
                arcToRelative(2.225f, 2.225f, 0.0f, false, true, -1.52f, -0.557f)
                arcToRelative(8.972f, 8.972f, 0.0f, true, true, 15.109f, -7.67f)
                arcTo(8.889f, 8.889f, 0.0f, false, true, 18.292f, 19.339f)
                close()
                moveTo(16.561f, 8.444f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 2.122f)
                lineTo(14.0f, 13.125f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 11.875f, 11.0f)
                lineToRelative(2.564f, -2.565f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.561f, 8.439f)
                close()
            }
        }
        .build()
        return _tachometer!!
    }

private var _tachometer: ImageVector? = null
