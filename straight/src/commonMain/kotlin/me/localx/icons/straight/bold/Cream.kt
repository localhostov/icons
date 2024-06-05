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

public val Icons.Bold.Cream: ImageVector
    get() {
        if (_cream != null) {
            return _cream!!
        }
        _cream = Builder(name = "Cream", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 11.351f)
                verticalLineToRelative(-5.351f)
                horizontalLineToRelative(-3.045f)
                arcToRelative(8.079f, 8.079f, 0.0f, false, false, -2.955f, -6.0f)
                arcToRelative(2.938f, 2.938f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-3.066f, 0.0f, -4.249f, 1.691f, -4.707f, 3.0f)
                horizontalLineToRelative(-3.293f)
                verticalLineToRelative(5.351f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.0f, 3.149f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-9.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.0f, -3.149f)
                close()
                moveTo(19.0f, 9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-14.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-18.0f)
                verticalLineToRelative(-6.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                close()
            }
        }
        .build()
        return _cream!!
    }

private var _cream: ImageVector? = null
