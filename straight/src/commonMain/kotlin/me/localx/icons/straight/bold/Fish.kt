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

public val Icons.Bold.Fish: ImageVector
    get() {
        if (_fish != null) {
            return _fish!!
        }
        _fish = Builder(name = "Fish", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.143f, 3.857f)
                arcTo(3.878f, 3.878f, 0.0f, false, false, 16.286f, 0.0f)
                curveTo(15.515f, 0.0f, 15.0f, 0.384f, 15.0f, 1.155f)
                lineTo(15.0f, 7.02f)
                lineToRelative(-0.97f, 0.01f)
                curveToRelative(-1.092f, 0.031f, -2.087f, 0.11f, -3.03f, 0.218f)
                verticalLineToRelative(-2.4f)
                arcToRelative(15.132f, 15.132f, 0.0f, false, false, -6.915f, 1.7f)
                arcTo(2.006f, 2.006f, 0.0f, false, false, 3.0f, 8.322f)
                verticalLineToRelative(2.3f)
                curveTo(0.833f, 13.033f, 0.0f, 16.821f, 0.0f, 22.5f)
                lineTo(0.0f, 24.0f)
                lineTo(1.5f, 24.0f)
                curveToRelative(8.345f, 0.0f, 12.6f, -1.812f, 14.4f, -7.0f)
                horizontalLineToRelative(1.114f)
                arcToRelative(1.978f, 1.978f, 0.0f, false, false, 1.953f, -1.662f)
                lineTo(19.343f, 13.0f)
                lineTo(16.752f, 13.0f)
                curveToRelative(0.108f, -0.943f, 0.187f, -1.938f, 0.218f, -3.03f)
                lineTo(16.98f, 9.0f)
                horizontalLineToRelative(5.865f)
                curveTo(23.616f, 9.0f, 24.0f, 8.485f, 24.0f, 7.714f)
                arcTo(3.878f, 3.878f, 0.0f, false, false, 20.143f, 3.857f)
                close()
                moveTo(4.5f, 21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 21.0f)
                close()
                moveTo(9.675f, 19.826f)
                arcTo(9.164f, 9.164f, 0.0f, false, false, 4.158f, 14.36f)
                curveToRelative(1.4f, -3.109f, 4.292f, -4.189f, 9.822f, -4.34f)
                curveTo(13.829f, 15.529f, 12.757f, 18.419f, 9.675f, 19.826f)
                close()
            }
        }
        .build()
        return _fish!!
    }

private var _fish: ImageVector? = null
