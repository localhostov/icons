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

public val Icons.Bold.Copy: ImageVector
    get() {
        if (_copy != null) {
            return _copy!!
        }
        _copy = Builder(name = "Copy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 19.0f)
                horizontalLineToRelative(-19.0f)
                verticalLineToRelative(-15.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, -3.5f)
                horizontalLineToRelative(12.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, 3.5f)
                close()
                moveTo(3.0f, 16.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-12.5f)
                arcToRelative(0.507f, 0.507f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                close()
                moveTo(21.0f, 5.051f)
                verticalLineToRelative(15.949f)
                horizontalLineToRelative(-16.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(-15.5f)
                arcToRelative(3.494f, 3.494f, 0.0f, false, false, -3.0f, -3.449f)
                close()
            }
        }
        .build()
        return _copy!!
    }

private var _copy: ImageVector? = null
