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

public val Icons.Bold.Tooth: ImageVector
    get() {
        if (_tooth != null) {
            return _tooth!!
        }
        _tooth = Builder(name = "Tooth", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.728f, 0.0f)
                arcToRelative(12.208f, 12.208f, 0.0f, false, false, -3.909f, 0.641f)
                arcTo(5.935f, 5.935f, 0.0f, false, true, 12.0f, 1.0f)
                arcTo(5.947f, 5.947f, 0.0f, false, true, 10.18f, 0.641f)
                arcTo(12.2f, 12.2f, 0.0f, false, false, 6.272f, 0.0f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 0.0f, 6.272f)
                curveTo(0.0f, 12.4f, 3.083f, 18.389f, 5.4f, 22.362f)
                arcTo(3.325f, 3.325f, 0.0f, false, false, 8.37f, 24.0f)
                arcTo(2.782f, 2.782f, 0.0f, false, false, 11.0f, 21.183f)
                verticalLineTo(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(6.183f)
                arcTo(2.783f, 2.783f, 0.0f, false, false, 15.628f, 24.0f)
                arcToRelative(3.326f, 3.326f, 0.0f, false, false, 2.97f, -1.636f)
                curveTo(20.917f, 18.389f, 24.0f, 12.4f, 24.0f, 6.272f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 17.728f, 0.0f)
                close()
                moveTo(16.0f, 20.86f)
                horizontalLineToRelative(0.0f)
                verticalLineTo(15.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(5.86f)
                horizontalLineTo(8.0f)
                curveTo(5.855f, 17.188f, 3.0f, 11.676f, 3.0f, 6.272f)
                arcTo(3.125f, 3.125f, 0.0f, false, true, 6.272f, 3.0f)
                arcToRelative(9.238f, 9.238f, 0.0f, false, true, 3.036f, 0.511f)
                arcTo(8.687f, 8.687f, 0.0f, false, false, 12.0f, 4.0f)
                arcToRelative(8.68f, 8.68f, 0.0f, false, false, 2.691f, -0.489f)
                arcTo(9.244f, 9.244f, 0.0f, false, true, 17.728f, 3.0f)
                arcTo(3.121f, 3.121f, 0.0f, false, true, 21.0f, 6.272f)
                curveTo(21.0f, 11.676f, 18.145f, 17.188f, 16.0f, 20.86f)
                close()
            }
        }
        .build()
        return _tooth!!
    }

private var _tooth: ImageVector? = null
