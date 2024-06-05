package me.localx.icons.rounded.filled

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

public val Icons.Filled.Trophy: ImageVector
    get() {
        if (_trophy != null) {
            return _trophy!!
        }
        _trophy = Builder(name = "Trophy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.09f, 16.0f)
                horizontalLineToRelative(0.91f)
                curveToRelative(6.643f, 0.0f, 9.0f, -3.5f, 9.0f, -6.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.84f, -3.433f)
                arcToRelative(7.564f, 7.564f, 0.0f, false, false, 0.409f, -1.0f)
                arcToRelative(3.887f, 3.887f, 0.0f, false, false, -0.626f, -3.458f)
                arcToRelative(3.979f, 3.979f, 0.0f, false, false, -3.214f, -1.609f)
                horizontalLineToRelative(-11.458f)
                arcToRelative(3.979f, 3.979f, 0.0f, false, false, -3.214f, 1.612f)
                arcToRelative(3.887f, 3.887f, 0.0f, false, false, -0.626f, 3.458f)
                arcToRelative(7.564f, 7.564f, 0.0f, false, false, 0.409f, 1.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.84f, 3.43f)
                curveToRelative(0.0f, 3.0f, 2.357f, 6.5f, 9.0f, 6.5f)
                horizontalLineToRelative(0.91f)
                arcToRelative(5.027f, 5.027f, 0.0f, false, true, 0.09f, 0.921f)
                verticalLineToRelative(3.079f)
                arcToRelative(1.883f, 1.883f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(-1.994f)
                arcToRelative(1.885f, 1.885f, 0.0f, false, true, -2.006f, -2.0f)
                verticalLineToRelative(-3.08f)
                arcToRelative(5.025f, 5.025f, 0.0f, false, true, 0.09f, -0.92f)
                close()
                moveTo(15.726f, 13.149f)
                arcToRelative(23.486f, 23.486f, 0.0f, false, false, 4.4f, -5.225f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.374f, 0.076f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                curveToRelative(0.0f, 2.176f, -1.839f, 4.5f, -7.0f, 4.5f)
                horizontalLineToRelative(-0.056f)
                arcToRelative(4.805f, 4.805f, 0.0f, false, true, 0.782f, -0.851f)
                close()
                moveTo(9.0f, 14.0f)
                curveToRelative(-5.161f, 0.0f, -7.0f, -2.324f, -7.0f, -4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, -1.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.375f, -0.076f)
                arcToRelative(23.486f, 23.486f, 0.0f, false, false, 4.4f, 5.225f)
                arcToRelative(4.805f, 4.805f, 0.0f, false, true, 0.781f, 0.851f)
                close()
            }
        }
        .build()
        return _trophy!!
    }

private var _trophy: ImageVector? = null
