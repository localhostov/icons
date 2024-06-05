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

public val Icons.Bold.Resize: ImageVector
    get() {
        if (_resize != null) {
            return _resize!!
        }
        _resize = Builder(name = "Resize", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 0.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, false, -5.5f, 5.5f)
                verticalLineToRelative(4.525f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, false, -5.0f, 5.475f)
                verticalLineToRelative(3.0f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, false, 5.5f, 5.5f)
                horizontalLineToRelative(3.0f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, false, 5.475f, -5.0f)
                horizontalLineToRelative(4.525f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, false, 5.5f, -5.5f)
                verticalLineToRelative(-8.0f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, false, -5.5f, -5.5f)
                close()
                moveTo(8.5f, 21.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                verticalLineToRelative(-3.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.0f, -2.449f)
                verticalLineToRelative(0.449f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, false, 5.5f, 5.5f)
                horizontalLineToRelative(0.449f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.449f, 2.0f)
                close()
                moveTo(21.0f, 13.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-0.5f)
                arcToRelative(5.456f, 5.456f, 0.0f, false, false, -0.7f, -2.678f)
                lineToRelative(2.7f, -2.7f)
                verticalLineToRelative(1.378f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, -3.5f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(1.379f)
                lineToRelative(-2.7f, 2.7f)
                arcToRelative(5.456f, 5.456f, 0.0f, false, false, -2.679f, -0.7f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-4.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, -2.5f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _resize!!
    }

private var _resize: ImageVector? = null
