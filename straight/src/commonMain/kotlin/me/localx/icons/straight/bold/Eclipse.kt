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

public val Icons.Bold.Eclipse: ImageVector
    get() {
        if (_eclipse != null) {
            return _eclipse!!
        }
        _eclipse = Builder(name = "Eclipse", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 19.467f)
                lineTo(13.5f, 24.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 19.854f)
                arcToRelative(7.966f, 7.966f, 0.0f, false, true, -2.991f, -1.241f)
                lineTo(4.575f, 21.546f)
                lineTo(2.454f, 19.425f)
                lineToRelative(2.932f, -2.932f)
                arcTo(7.947f, 7.947f, 0.0f, false, true, 4.142f, 13.5f)
                lineTo(0.0f, 13.5f)
                verticalLineToRelative(-3.0f)
                lineTo(4.142f, 10.5f)
                arcTo(7.947f, 7.947f, 0.0f, false, true, 5.386f, 7.507f)
                lineTo(2.454f, 4.575f)
                lineTo(4.575f, 2.454f)
                lineTo(7.509f, 5.387f)
                arcTo(7.966f, 7.966f, 0.0f, false, true, 10.5f, 4.146f)
                lineTo(10.5f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.5f, 4.533f)
                arcToRelative(8.53f, 8.53f, 0.0f, false, false, -3.06f, 2.741f)
                arcToRelative(4.966f, 4.966f, 0.0f, false, false, 0.0f, 9.452f)
                arcTo(8.53f, 8.53f, 0.0f, false, false, 13.5f, 19.467f)
                close()
                moveTo(24.0f, 12.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, -6.5f, -6.5f)
                arcTo(6.508f, 6.508f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -3.5f, 3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 21.0f, 12.0f)
                close()
            }
        }
        .build()
        return _eclipse!!
    }

private var _eclipse: ImageVector? = null
