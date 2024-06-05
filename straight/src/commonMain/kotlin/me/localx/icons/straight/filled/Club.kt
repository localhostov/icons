package me.localx.icons.straight.filled

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

public val Icons.Filled.Club: ImageVector
    get() {
        if (_club != null) {
            return _club!!
        }
        _club = Builder(name = "Club", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 14.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.632f, -5.981f)
                arcTo(5.227f, 5.227f, 0.0f, false, false, 18.0f, 5.546f)
                arcTo(5.793f, 5.793f, 0.0f, false, false, 12.0f, 0.0f)
                arcTo(5.793f, 5.793f, 0.0f, false, false, 6.0f, 5.546f)
                arcToRelative(5.23f, 5.23f, 0.0f, false, false, 0.632f, 2.473f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 7.0f, 20.0f)
                arcToRelative(6.081f, 6.081f, 0.0f, false, false, 3.922f, -1.523f)
                curveTo(10.729f, 20.853f, 10.078f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(16.0f)
                curveToRelative(-2.078f, 0.0f, -2.729f, -1.147f, -2.922f, -3.523f)
                arcTo(6.081f, 6.081f, 0.0f, false, false, 17.0f, 20.0f)
                arcTo(6.006f, 6.006f, 0.0f, false, false, 23.0f, 14.0f)
                close()
                moveTo(11.971f, 22.0f)
                curveToRelative(0.009f, -0.016f, 0.02f, -0.031f, 0.029f, -0.047f)
                curveToRelative(0.009f, 0.016f, 0.02f, 0.031f, 0.029f, 0.047f)
                close()
            }
        }
        .build()
        return _club!!
    }

private var _club: ImageVector? = null
