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

public val Icons.Bold.ListCheck: ImageVector
    get() {
        if (_listCheck != null) {
            return _listCheck!!
        }
        _listCheck = Builder(name = "ListCheck", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 7.0f)
                arcTo(3.477f, 3.477f, 0.0f, false, true, 2.025f, 5.975f)
                lineTo(0.5f, 4.62f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.0f, -2.24f)
                lineTo(4.084f, 3.794f)
                arcTo(0.584f, 0.584f, 0.0f, false, false, 4.5f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.353f, -0.146f)
                lineTo(8.466f, 0.414f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.068f, 2.172f)
                lineTo(6.948f, 6.0f)
                arcTo(3.449f, 3.449f, 0.0f, false, true, 4.5f, 7.0f)
                close()
                moveTo(24.0f, 3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.5f, 2.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 24.0f, 3.5f)
                close()
                moveTo(6.948f, 14.0f)
                lineToRelative(3.586f, -3.414f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.466f, 8.414f)
                lineToRelative(-3.613f, 3.44f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.707f, 0.0f)
                lineTo(2.561f, 10.268f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.439f, 12.39f)
                lineToRelative(1.586f, 1.585f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 6.948f, 14.0f)
                close()
                moveTo(24.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.5f, 10.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 24.0f, 11.5f)
                close()
                moveTo(6.948f, 22.0f)
                lineToRelative(3.586f, -3.414f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.068f, -2.172f)
                lineToRelative(-3.613f, 3.44f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 4.5f, 20.0f)
                arcToRelative(0.584f, 0.584f, 0.0f, false, true, -0.416f, -0.206f)
                lineTo(2.5f, 18.38f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.0f, 2.24f)
                lineToRelative(1.523f, 1.355f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 6.948f, 22.0f)
                close()
                moveTo(24.0f, 19.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.5f, 18.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 24.0f, 19.5f)
                close()
            }
        }
        .build()
        return _listCheck!!
    }

private var _listCheck: ImageVector? = null
