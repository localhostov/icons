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
                moveToRelative(18.357f, 7.361f)
                arcToRelative(1.087f, 1.087f, 0.0f, false, true, -0.722f, -0.733f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.49f, 0.842f)
                arcToRelative(7.648f, 7.648f, 0.0f, false, false, 0.8f, 5.179f)
                arcToRelative(5.448f, 5.448f, 0.0f, false, false, -2.888f, 5.651f)
                arcToRelative(5.843f, 5.843f, 0.0f, false, false, 5.626f, 4.7f)
                horizontalLineToRelative(9.1f)
                curveToRelative(5.073f, 0.0f, 8.851f, -3.027f, 9.189f, -7.362f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, false, -5.615f, -8.277f)
                close()
                moveTo(18.665f, 18.747f)
                lineTo(17.079f, 20.161f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, true, -2.064f, 0.839f)
                arcToRelative(3.013f, 3.013f, 0.0f, false, true, -2.136f, -0.882f)
                lineToRelative(-1.544f, -1.374f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.33f, -1.494f)
                lineToRelative(1.335f, 1.194f)
                verticalLineToRelative(-7.444f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(7.445f)
                lineToRelative(1.335f, -1.192f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.33f, 1.494f)
                close()
            }
        }
        .build()
        return _cloudDownload!!
    }

private var _cloudDownload: ImageVector? = null
