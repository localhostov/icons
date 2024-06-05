package me.localx.icons.straight.filled

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
import me.localx.icons.straight.Icons

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
                arcToRelative(3.494f, 3.494f, 0.0f, false, false, -2.149f, -3.225f)
                arcTo(9.974f, 9.974f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(12.0f, 0.0f)
                arcTo(9.974f, 9.974f, 0.0f, false, false, 2.149f, 8.274f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 3.268f, 14.99f)
                arcToRelative(10.3f, 10.3f, 0.0f, false, false, 1.471f, 2.3f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.0f, 20.0f)
                verticalLineToRelative(4.0f)
                lineTo(21.0f, 24.0f)
                lineTo(21.0f, 20.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.738f, -2.711f)
                arcToRelative(10.327f, 10.327f, 0.0f, false, false, 1.47f, -2.3f)
                arcTo(3.505f, 3.505f, 0.0f, false, false, 24.0f, 11.5f)
                close()
                moveTo(20.248f, 12.973f)
                lineTo(19.413f, 12.825f)
                lineTo(19.131f, 13.625f)
                curveTo(18.215f, 16.221f, 15.13f, 19.0f, 12.0f, 19.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(-3.13f, 0.0f, -6.214f, -2.78f, -7.131f, -5.376f)
                lineToRelative(-0.28f, -0.793f)
                lineToRelative(-0.83f, 0.14f)
                arcTo(1.567f, 1.567f, 0.0f, false, true, 3.5f, 13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.27f, -2.97f)
                lineToRelative(0.738f, -0.134f)
                lineToRelative(0.078f, -0.744f)
                arcTo(7.969f, 7.969f, 0.0f, false, true, 8.584f, 2.765f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 6.833f, 0.0f)
                arcToRelative(7.966f, 7.966f, 0.0f, false, true, 4.537f, 6.384f)
                lineToRelative(0.078f, 0.744f)
                lineToRelative(0.738f, 0.133f)
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
