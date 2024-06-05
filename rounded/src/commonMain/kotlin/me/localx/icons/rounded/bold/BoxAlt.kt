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

public val Icons.Bold.BoxAlt: ImageVector
    get() {
        if (_boxAlt != null) {
            return _boxAlt!!
        }
        _boxAlt = Builder(name = "BoxAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 0.0f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, false, -5.5f, 5.5f)
                verticalLineToRelative(13.0f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, false, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, false, 5.5f, -5.5f)
                verticalLineToRelative(-13.0f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, false, -5.5f, -5.5f)
                close()
                moveTo(20.949f, 5.0f)
                horizontalLineToRelative(-4.949f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.449f, 2.0f)
                close()
                moveTo(11.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                close()
                moveTo(5.5f, 3.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.949f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.449f, -2.0f)
                close()
                moveTo(18.5f, 21.0f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                verticalLineToRelative(-10.5f)
                horizontalLineToRelative(5.142f)
                arcToRelative(3.981f, 3.981f, 0.0f, false, false, 7.716f, 0.0f)
                horizontalLineToRelative(5.142f)
                verticalLineToRelative(10.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                close()
                moveTo(19.0f, 17.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _boxAlt!!
    }

private var _boxAlt: ImageVector? = null
