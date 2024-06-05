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
                moveTo(6.0f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 8.5f)
                close()
                moveTo(11.5f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.5f, 8.0f)
                close()
                moveTo(23.0f, 15.723f)
                verticalLineTo(19.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 18.5f, 24.0f)
                horizontalLineTo(5.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 1.0f, 19.5f)
                verticalLineTo(15.723f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -3.446f)
                verticalLineTo(9.136f)
                arcTo(9.147f, 9.147f, 0.0f, false, true, 10.137f, 0.0f)
                horizontalLineToRelative(3.726f)
                arcTo(9.147f, 9.147f, 0.0f, false, true, 23.0f, 9.136f)
                verticalLineToRelative(3.141f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 23.0f, 15.723f)
                close()
                moveTo(4.0f, 9.136f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.136f)
                arcTo(6.144f, 6.144f, 0.0f, false, false, 13.863f, 3.0f)
                horizontalLineTo(10.137f)
                arcTo(6.144f, 6.144f, 0.0f, false, false, 4.0f, 9.136f)
                close()
                moveTo(20.0f, 19.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.0f)
                curveToRelative(-3.13f, 0.0f, -3.182f, 0.287f, -5.5f, 2.3f)
                arcToRelative(2.814f, 2.814f, 0.0f, false, true, -3.716f, 0.0f)
                curveTo(6.172f, 16.9f, 5.592f, 16.152f, 4.0f, 16.026f)
                verticalLineTo(19.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.5f, 21.0f)
                horizontalLineToRelative(13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.0f, 19.5f)
                close()
            }
        }
        .build()
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
