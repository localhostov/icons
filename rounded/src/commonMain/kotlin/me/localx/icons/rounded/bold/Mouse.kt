package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Mouse: ImageVector
    get() {
        if (_mouse != null) {
            return _mouse!!
        }
        _mouse = Builder(name = "Mouse", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 3.0f)
                verticalLineTo(1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                verticalLineTo(3.0f)
                arcTo(7.508f, 7.508f, 0.0f, false, false, 3.0f, 10.5f)
                verticalLineToRelative(4.182f)
                arcToRelative(9.212f, 9.212f, 0.0f, false, false, 8.384f, 9.3f)
                arcTo(9.009f, 9.009f, 0.0f, false, false, 21.0f, 15.0f)
                verticalLineTo(10.5f)
                arcTo(7.508f, 7.508f, 0.0f, false, false, 13.5f, 3.0f)
                close()
                moveTo(18.0f, 15.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 6.0f, 15.0f)
                verticalLineTo(10.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 10.5f, 6.0f)
                horizontalLineToRelative(3.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 18.0f, 10.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _mouse!!
    }

private var _mouse: ImageVector? = null
