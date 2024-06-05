package me.localx.icons.straight.filled

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

public val Icons.Filled.CloudDownload: ImageVector
    get() {
        if (_cloudDownload != null) {
            return _cloudDownload!!
        }
        _cloudDownload = Builder(name = "CloudDownload", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.79f, 7.209f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.79f, 1.791f)
                arcToRelative(7.912f, 7.912f, 0.0f, false, false, 0.9f, 3.671f)
                arcToRelative(5.49f, 5.49f, 0.0f, false, false, 2.6f, 10.329f)
                horizontalLineToRelative(10.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.79f, -15.791f)
                close()
                moveTo(16.747f, 20.276f)
                arcToRelative(2.472f, 2.472f, 0.0f, false, true, -3.494f, 0.0f)
                lineToRelative(-3.2f, -3.2f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.533f, 2.538f)
                verticalLineToRelative(-8.2f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.2f)
                lineToRelative(2.535f, -2.535f)
                lineToRelative(1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _cloudDownload!!
    }

private var _cloudDownload: ImageVector? = null
