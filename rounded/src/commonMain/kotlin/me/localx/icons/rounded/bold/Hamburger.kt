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

public val Icons.Bold.Hamburger: ImageVector
    get() {
        if (_hamburger != null) {
            return _hamburger!!
        }
        _hamburger = Builder(name = "Hamburger", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 14.0f)
                arcToRelative(1.994f, 1.994f, 0.0f, false, false, -1.0f, -1.723f)
                lineTo(23.0f, 10.5f)
                arcTo(10.512f, 10.512f, 0.0f, false, false, 12.5f, 0.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(10.512f, 10.512f, 0.0f, false, false, 1.0f, 10.5f)
                verticalLineToRelative(1.777f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 3.446f)
                lineTo(1.0f, 16.5f)
                arcTo(7.508f, 7.508f, 0.0f, false, false, 8.5f, 24.0f)
                horizontalLineToRelative(7.0f)
                arcTo(7.508f, 7.508f, 0.0f, false, false, 23.0f, 16.5f)
                verticalLineToRelative(-0.777f)
                arcTo(1.994f, 1.994f, 0.0f, false, false, 24.0f, 14.0f)
                close()
                moveTo(11.5f, 3.0f)
                horizontalLineToRelative(1.0f)
                arcTo(7.508f, 7.508f, 0.0f, false, true, 20.0f, 10.5f)
                lineTo(20.0f, 12.0f)
                lineTo(4.0f, 12.0f)
                lineTo(4.0f, 10.5f)
                arcTo(7.508f, 7.508f, 0.0f, false, true, 11.5f, 3.0f)
                close()
                moveTo(15.5f, 21.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 4.0f, 16.5f)
                verticalLineToRelative(-0.474f)
                curveToRelative(1.592f, 0.126f, 2.172f, 0.874f, 3.784f, 2.273f)
                arcToRelative(2.814f, 2.814f, 0.0f, false, false, 3.716f, 0.0f)
                curveTo(13.818f, 16.287f, 13.87f, 16.0f, 17.0f, 16.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 15.5f, 21.0f)
                close()
                moveTo(6.0f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 8.5f)
                close()
                moveTo(10.0f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.0f, 6.5f)
                close()
            }
        }
        .build()
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
