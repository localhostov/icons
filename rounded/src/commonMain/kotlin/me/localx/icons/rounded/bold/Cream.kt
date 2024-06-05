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
                verticalLineToRelative(-1.851f)
                arcToRelative(3.494f, 3.494f, 0.0f, false, false, -3.037f, -3.453f)
                arcToRelative(12.693f, 12.693f, 0.0f, false, false, -1.624f, -5.641f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, false, -1.692f, 0.15f)
                arcToRelative(3.938f, 3.938f, 0.0f, false, true, -3.685f, 2.457f)
                horizontalLineToRelative(-1.962f)
                curveToRelative(-3.08f, 0.0f, -4.26f, 1.7f, -4.714f, 3.009f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.286f, 3.478f)
                verticalLineToRelative(1.851f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.0f, 3.149f)
                verticalLineToRelative(4.0f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, false, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, false, 5.5f, -5.5f)
                verticalLineToRelative(-4.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.0f, -3.149f)
                close()
                moveTo(5.5f, 9.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-14.0f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                close()
                moveTo(21.0f, 18.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                verticalLineToRelative(-4.0f)
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
