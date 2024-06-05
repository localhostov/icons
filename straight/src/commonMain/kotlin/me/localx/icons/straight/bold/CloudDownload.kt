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

public val Icons.Bold.CloudDownload: ImageVector
    get() {
        if (_cloudDownload != null) {
            return _cloudDownload!!
        }
        _cloudDownload = Builder(name = "CloudDownload", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.768f, 23.0f)
                horizontalLineToRelative(-3.968f)
                arcToRelative(5.792f, 5.792f, 0.0f, false, true, -5.8f, -5.775f)
                arcToRelative(5.953f, 5.953f, 0.0f, false, true, 2.72f, -4.925f)
                arcToRelative(8.04f, 8.04f, 0.0f, false, true, 7.371f, -11.3f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 7.885f, 6.0f)
                arcToRelative(8.176f, 8.176f, 0.0f, false, true, 6.024f, 7.85f)
                arcToRelative(8.076f, 8.076f, 0.0f, false, true, -0.3f, 2.15f)
                horizontalLineToRelative(-3.19f)
                arcToRelative(5.066f, 5.066f, 0.0f, false, false, 0.49f, -2.15f)
                arcToRelative(5.172f, 5.172f, 0.0f, false, false, -4.49f, -5.1f)
                lineToRelative(-1.138f, -0.15f)
                lineToRelative(-0.151f, -1.137f)
                arcToRelative(5.18f, 5.18f, 0.0f, false, false, -5.13f, -4.463f)
                arcToRelative(4.935f, 4.935f, 0.0f, false, false, -5.062f, 5.03f)
                arcToRelative(5.093f, 5.093f, 0.0f, false, false, 1.019f, 3.055f)
                lineToRelative(1.333f, 1.792f)
                lineToRelative(-2.163f, 0.556f)
                arcToRelative(3.025f, 3.025f, 0.0f, false, false, -2.218f, 2.792f)
                arcToRelative(2.789f, 2.789f, 0.0f, false, false, 2.8f, 2.775f)
                horizontalLineToRelative(0.937f)
                close()
                moveTo(17.0f, 20.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(3.75f, 3.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                lineToRelative(3.836f, -3.707f)
                close()
            }
        }
        .build()
        return _cloudDownload!!
    }

private var _cloudDownload: ImageVector? = null
