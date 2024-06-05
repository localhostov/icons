package me.localx.icons.rounded.filled

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

public val Icons.Filled.ChildHead: ImageVector
    get() {
        if (_childHead != null) {
            return _childHead!!
        }
        _childHead = Builder(name = "ChildHead", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.149f, -3.226f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -19.7f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.119f, 6.718f)
                arcToRelative(10.607f, 10.607f, 0.0f, false, false, 2.071f, 2.955f)
                arcToRelative(8.908f, 8.908f, 0.0f, false, false, -2.272f, 4.928f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.06f, 24.0f)
                lineTo(19.919f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.992f, -1.124f)
                arcToRelative(8.9f, 8.9f, 0.0f, false, false, -2.261f, -4.918f)
                arcToRelative(10.622f, 10.622f, 0.0f, false, false, 2.082f, -2.966f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 24.0f, 11.5f)
                close()
                moveTo(20.248f, 12.973f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, false, -1.117f, 0.651f)
                curveTo(18.215f, 16.222f, 15.13f, 19.0f, 12.0f, 19.0f)
                reflectiveCurveToRelative(-6.215f, -2.78f, -7.131f, -5.378f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, false, -1.117f, -0.651f)
                arcTo(1.606f, 1.606f, 0.0f, false, true, 3.5f, 13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.27f, -2.972f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.816f, -0.878f)
                arcTo(7.966f, 7.966f, 0.0f, false, true, 8.711f, 2.71f)
                arcToRelative(3.534f, 3.534f, 0.0f, true, false, 6.578f, 0.0f)
                arcToRelative(7.966f, 7.966f, 0.0f, false, true, 4.665f, 6.44f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.816f, 0.878f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.5f, 13.0f)
                arcTo(1.606f, 1.606f, 0.0f, false, true, 20.248f, 12.973f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 11.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 11.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
        }
        .build()
        return _childHead!!
    }

private var _childHead: ImageVector? = null
