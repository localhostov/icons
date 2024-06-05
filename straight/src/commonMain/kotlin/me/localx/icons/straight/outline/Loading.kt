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

public val Icons.Outline.Loading: ImageVector
    get() {
        if (_loading != null) {
            return _loading!!
        }
        _loading = Builder(name = "Loading", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(4.0f, 11.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(24.0f, 11.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(22.875f, 17.165f)
                lineTo(19.417f, 15.155f)
                lineTo(18.411f, 16.884f)
                lineTo(21.869f, 18.894f)
                close()
                moveTo(18.891f, 2.126f)
                lineTo(17.162f, 1.126f)
                lineTo(15.152f, 4.585f)
                lineTo(16.881f, 5.585f)
                close()
                moveTo(22.883f, 6.826f)
                lineTo(21.875f, 5.094f)
                lineTo(18.42f, 7.107f)
                lineTo(19.428f, 8.836f)
                close()
                moveTo(18.918f, 21.864f)
                lineTo(16.9f, 18.408f)
                lineTo(15.172f, 19.416f)
                lineTo(17.185f, 22.872f)
                close()
                moveTo(5.6f, 16.884f)
                lineTo(4.6f, 15.155f)
                lineTo(1.141f, 17.165f)
                lineTo(2.141f, 18.894f)
                close()
                moveTo(8.86f, 4.584f)
                lineTo(6.854f, 1.122f)
                lineTo(5.126f, 2.122f)
                lineTo(7.136f, 5.581f)
                close()
                moveTo(5.6f, 7.107f)
                lineTo(2.141f, 5.094f)
                lineTo(1.133f, 6.822f)
                lineTo(4.589f, 8.836f)
                close()
                moveTo(8.841f, 19.416f)
                lineTo(7.112f, 18.408f)
                lineTo(5.1f, 21.864f)
                lineTo(6.828f, 22.872f)
                close()
            }
        }
        .build()
        return _loading!!
    }

private var _loading: ImageVector? = null
