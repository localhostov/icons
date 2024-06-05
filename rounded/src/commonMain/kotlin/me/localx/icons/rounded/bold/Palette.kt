package me.localx.icons.rounded.bold

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

public val Icons.Bold.Palette: ImageVector
    get() {
        if (_palette != null) {
            return _palette!!
        }
        _palette = Builder(name = "Palette", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 8.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 15.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.036f, 10.928f)
                arcTo(12.144f, 12.144f, 0.0f, false, false, 12.5f, 0.008f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 12.083f, 24.0f)
                curveToRelative(0.338f, 0.0f, 0.669f, -0.022f, 1.0f, -0.049f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.376f, -1.508f)
                lineToRelative(-0.03f, -3.425f)
                arcToRelative(2.859f, 2.859f, 0.0f, false, true, 4.88f, -2.047f)
                lineToRelative(0.1f, 0.1f)
                arcToRelative(2.38f, 2.38f, 0.0f, false, false, 2.19f, 0.644f)
                arcTo(2.344f, 2.344f, 0.0f, false, false, 23.3f, 16.25f)
                arcTo(11.909f, 11.909f, 0.0f, false, false, 24.036f, 10.928f)
                close()
                moveTo(20.787f, 14.294f)
                arcToRelative(5.86f, 5.86f, 0.0f, false, false, -9.359f, 4.75f)
                lineToRelative(0.017f, 1.933f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 12.082f, 3.0f)
                curveToRelative(0.1f, 0.0f, 0.212f, 0.0f, 0.318f, 0.006f)
                arcToRelative(9.105f, 9.105f, 0.0f, false, true, 8.648f, 8.185f)
                arcTo(8.964f, 8.964f, 0.0f, false, true, 20.787f, 14.294f)
                close()
            }
        }
        .build()
        return _palette!!
    }

private var _palette: ImageVector? = null
