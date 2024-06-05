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
                moveTo(17.368f, 8.019f)
                arcTo(5.227f, 5.227f, 0.0f, false, false, 18.0f, 5.546f)
                arcTo(5.793f, 5.793f, 0.0f, false, false, 12.0f, 0.0f)
                arcTo(5.793f, 5.793f, 0.0f, false, false, 6.0f, 5.546f)
                arcToRelative(5.23f, 5.23f, 0.0f, false, false, 0.632f, 2.473f)
                arcToRelative(5.994f, 5.994f, 0.0f, false, false, -0.526f, 11.912f)
                arcToRelative(5.942f, 5.942f, 0.0f, false, false, 4.816f, -1.454f)
                curveTo(10.729f, 20.853f, 10.078f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(16.0f)
                curveToRelative(-2.078f, 0.0f, -2.729f, -1.147f, -2.922f, -3.523f)
                arcToRelative(5.943f, 5.943f, 0.0f, false, false, 4.816f, 1.454f)
                arcToRelative(5.994f, 5.994f, 0.0f, false, false, -0.526f, -11.912f)
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
