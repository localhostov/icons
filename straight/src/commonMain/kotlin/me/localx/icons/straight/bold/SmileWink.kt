package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.SmileWink: ImageVector
    get() {
        if (_smileWink != null) {
            return _smileWink!!
        }
        _smileWink = Builder(name = "SmileWink", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 9.0f, 9.0f)
                arcTo(9.011f, 9.011f, 0.0f, false, false, 12.0f, 3.0f)
                close()
                moveTo(17.5f, 15.819f)
                lineTo(15.507f, 13.577f)
                arcTo(6.151f, 6.151f, 0.0f, false, true, 12.0f, 15.0f)
                arcToRelative(6.142f, 6.142f, 0.0f, false, true, -3.5f, -1.418f)
                lineToRelative(-2.0f, 2.237f)
                arcTo(9.17f, 9.17f, 0.0f, false, false, 12.0f, 18.0f)
                arcTo(9.162f, 9.162f, 0.0f, false, false, 17.5f, 15.819f)
                close()
                moveTo(13.0f, 9.667f)
                lineTo(13.0f, 11.0f)
                horizontalLineToRelative(5.0f)
                lineTo(18.0f, 9.667f)
                arcTo(2.587f, 2.587f, 0.0f, false, false, 15.5f, 7.0f)
                arcTo(2.587f, 2.587f, 0.0f, false, false, 13.0f, 9.667f)
                close()
                moveTo(11.0f, 8.0f)
                lineTo(6.0f, 8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _smileWink!!
    }

private var _smileWink: ImageVector? = null
