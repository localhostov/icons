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

public val Icons.Bold.Gallery: ImageVector
    get() {
        if (_gallery != null) {
            return _gallery!!
        }
        _gallery = Builder(name = "Gallery", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 0.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 8.015f, 5.21f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -4.0f, 5.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 0.0f, 15.5f)
                verticalLineToRelative(3.0f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 5.5f, 24.0f)
                horizontalLineToRelative(5.0f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 16.0f, 18.5f)
                verticalLineToRelative(-0.213f)
                arcToRelative(5.512f, 5.512f, 0.0f, false, false, 3.919f, -4.38f)
                arcTo(5.162f, 5.162f, 0.0f, false, false, 24.0f, 8.5f)
                verticalLineToRelative(-3.0f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 18.5f, 0.0f)
                close()
                moveTo(3.0f, 15.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 13.0f)
                horizontalLineToRelative(5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 13.0f, 15.5f)
                verticalLineToRelative(0.2f)
                lineToRelative(-2.115f, 2.115f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.415f, 0.0f)
                lineTo(9.0f, 17.335f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.347f, -0.061f)
                lineToRelative(-3.7f, 3.176f)
                arcTo(2.488f, 2.488f, 0.0f, false, true, 3.0f, 18.5f)
                close()
                moveTo(17.0f, 13.0f)
                arcToRelative(2.492f, 2.492f, 0.0f, false, true, -1.025f, 2.008f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 10.5f, 10.0f)
                lineTo(7.051f, 10.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 9.5f, 8.0f)
                horizontalLineToRelative(5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.0f, 10.5f)
                close()
                moveTo(21.0f, 8.5f)
                arcToRelative(2.719f, 2.719f, 0.0f, false, true, -1.0f, 2.226f)
                lineTo(20.0f, 10.5f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 14.5f, 5.0f)
                lineTo(11.051f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 13.5f, 3.0f)
                horizontalLineToRelative(5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.0f, 5.5f)
                close()
                moveTo(4.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 5.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 15.5f)
                close()
            }
        }
        .build()
        return _gallery!!
    }

private var _gallery: ImageVector? = null
