package me.localx.icons.straight.outline

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

public val Icons.Outline.CloudDownload: ImageVector
    get() {
        if (_cloudDownload != null) {
            return _cloudDownload!!
        }
        _cloudDownload = Builder(name = "CloudDownload", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.535f, 18.666f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.2f, 3.2f)
                arcToRelative(2.475f, 2.475f, 0.0f, false, true, -3.494f, 0.0f)
                lineToRelative(-3.2f, -3.2f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.531f, 2.534f)
                verticalLineToRelative(-8.2f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.2f)
                close()
                moveTo(17.79f, 7.209f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.79f, 1.791f)
                arcToRelative(7.912f, 7.912f, 0.0f, false, false, 0.9f, 3.671f)
                arcToRelative(5.49f, 5.49f, 0.0f, false, false, 2.6f, 10.329f)
                horizontalLineToRelative(4.642f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(-2.642f)
                arcToRelative(3.491f, 3.491f, 0.0f, false, true, -0.872f, -6.874f)
                lineToRelative(1.437f, -0.371f)
                lineToRelative(-0.883f, -1.192f)
                arcToRelative(5.939f, 5.939f, 0.0f, false, true, -1.182f, -3.563f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.939f, -0.8f)
                lineToRelative(0.1f, 0.758f)
                lineToRelative(0.759f, 0.1f)
                arcToRelative(5.988f, 5.988f, 0.0f, false, true, 4.202f, 9.247f)
                lineToRelative(1.43f, 1.43f)
                arcToRelative(7.976f, 7.976f, 0.0f, false, false, -4.64f, -12.526f)
                close()
            }
        }
        .build()
        return _cloudDownload!!
    }

private var _cloudDownload: ImageVector? = null
