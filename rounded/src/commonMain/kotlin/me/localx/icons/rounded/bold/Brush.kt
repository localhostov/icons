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

public val Icons.Bold.Brush: ImageVector
    get() {
        if (_brush != null) {
            return _brush!!
        }
        _brush = Builder(name = "Brush", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 0.0f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, false, -5.5f, 5.5f)
                verticalLineToRelative(5.0f)
                arcToRelative(7.508f, 7.508f, 0.0f, false, false, 7.5f, 7.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(7.508f, 7.508f, 0.0f, false, false, 7.5f, -7.5f)
                verticalLineToRelative(-5.0f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, false, -5.5f, -5.5f)
                close()
                moveTo(5.5f, 3.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-4.449f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.0f, 2.449f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-18.0f)
                verticalLineToRelative(-4.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, -2.5f)
                close()
                moveTo(16.5f, 15.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -3.738f, -2.0f)
                horizontalLineToRelative(16.476f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -3.738f, 2.0f)
                close()
            }
        }
        .build()
        return _brush!!
    }

private var _brush: ImageVector? = null
