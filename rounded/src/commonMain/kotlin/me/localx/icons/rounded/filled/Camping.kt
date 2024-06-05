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

public val Icons.Filled.Camping: ImageVector
    get() {
        if (_camping != null) {
            return _camping!!
        }
        _camping = Builder(name = "Camping", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.887f, 16.573f)
                lineTo(16.451f, 24.0f)
                lineTo(7.188f, 24.0f)
                lineToRelative(3.933f, -7.438f)
                arcToRelative(0.971f, 0.971f, 0.0f, false, true, 1.766f, 0.011f)
                close()
                moveTo(23.522f, 16.868f)
                lineTo(16.535f, 2.9f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -9.057f, -0.026f)
                lineTo(0.47f, 16.9f)
                arcTo(4.995f, 4.995f, 0.0f, false, false, 4.929f, 24.0f)
                lineToRelative(4.4f, -8.322f)
                arcToRelative(2.97f, 2.97f, 0.0f, false, true, 5.366f, 0.047f)
                lineTo(18.669f, 24.0f)
                lineTo(19.0f, 24.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 4.522f, -7.132f)
                close()
            }
        }
        .build()
        return _camping!!
    }

private var _camping: ImageVector? = null
