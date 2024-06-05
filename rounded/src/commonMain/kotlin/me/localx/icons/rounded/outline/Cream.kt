package me.localx.icons.rounded.outline

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

public val Icons.Outline.Cream: ImageVector
    get() {
        if (_cream != null) {
            return _cream!!
        }
        _cream = Builder(name = "Cream", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.184f)
                lineTo(22.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.0f, -2.816f)
                arcTo(14.458f, 14.458f, 0.0f, false, false, 18.15f, 0.809f)
                arcToRelative(1.948f, 1.948f, 0.0f, false, false, -1.717f, -0.818f)
                arcToRelative(2.035f, 2.035f, 0.0f, false, false, -1.664f, 1.074f)
                curveTo(14.0f, 2.476f, 13.24f, 3.0f, 11.962f, 3.0f)
                lineTo(10.0f, 3.0f)
                arcTo(5.676f, 5.676f, 0.0f, false, false, 4.061f, 8.165f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 2.0f, 11.0f)
                verticalLineToRelative(1.184f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 15.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                lineTo(19.0f, 24.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(24.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 22.0f, 12.184f)
                close()
                moveTo(10.0f, 5.0f)
                horizontalLineToRelative(1.962f)
                arcToRelative(4.952f, 4.952f, 0.0f, false, false, 4.566f, -3.022f)
                arcTo(12.409f, 12.409f, 0.0f, false, true, 18.0f, 8.0f)
                lineTo(6.131f, 8.0f)
                arcTo(3.658f, 3.658f, 0.0f, false, true, 10.0f, 5.0f)
                close()
                moveTo(4.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineTo(19.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 12.0f)
                close()
                moveTo(22.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(5.0f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                lineTo(2.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineTo(21.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _cream!!
    }

private var _cream: ImageVector? = null
