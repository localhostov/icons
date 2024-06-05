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

public val Icons.Bold.VectorAlt: ImageVector
    get() {
        if (_vectorAlt != null) {
            return _vectorAlt!!
        }
        _vectorAlt = Builder(name = "VectorAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 15.036f)
                lineTo(21.0f, 11.5f)
                arcToRelative(9.006f, 9.006f, 0.0f, false, false, -4.578f, -7.836f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -8.844f, 0.0f)
                arcTo(9.006f, 9.006f, 0.0f, false, false, 3.0f, 11.5f)
                verticalLineToRelative(3.536f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 18.5f)
                verticalLineToRelative(2.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 3.5f, 24.0f)
                horizontalLineToRelative(2.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 9.0f, 20.5f)
                verticalLineToRelative(-2.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.0f, -3.464f)
                lineTo(6.0f, 11.5f)
                arcTo(5.988f, 5.988f, 0.0f, false, true, 8.181f, 6.877f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 7.638f, 0.0f)
                arcTo(5.988f, 5.988f, 0.0f, false, true, 18.0f, 11.5f)
                verticalLineToRelative(3.536f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 15.0f, 18.5f)
                verticalLineToRelative(2.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 18.5f, 24.0f)
                horizontalLineToRelative(2.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 24.0f, 20.5f)
                verticalLineToRelative(-2.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 21.0f, 15.036f)
                close()
                moveTo(6.0f, 20.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                close()
                moveTo(12.0f, 6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.5f, -1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 6.0f)
                close()
                moveTo(21.0f, 20.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                close()
            }
        }
        .build()
        return _vectorAlt!!
    }

private var _vectorAlt: ImageVector? = null
