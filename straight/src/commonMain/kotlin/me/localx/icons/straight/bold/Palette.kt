package me.localx.icons.straight.bold

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
                moveTo(12.5f, 0.007f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 12.083f, 24.0f)
                curveToRelative(0.338f, 0.0f, 0.669f, -0.022f, 1.0f, -0.049f)
                lineToRelative(1.389f, -0.115f)
                lineToRelative(-0.043f, -4.818f)
                arcToRelative(2.86f, 2.86f, 0.0f, false, true, 4.881f, -2.047f)
                lineToRelative(0.1f, 0.1f)
                arcToRelative(2.377f, 2.377f, 0.0f, false, false, 2.19f, 0.644f)
                arcToRelative(2.347f, 2.347f, 0.0f, false, false, 1.709f, -1.463f)
                arcTo(11.919f, 11.919f, 0.0f, false, false, 24.08f, 11.7f)
                arcTo(12.156f, 12.156f, 0.0f, false, false, 12.5f, 0.007f)
                close()
                moveTo(20.785f, 14.293f)
                arcToRelative(5.861f, 5.861f, 0.0f, false, false, -9.359f, 4.751f)
                lineToRelative(0.017f, 1.934f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 12.082f, 3.0f)
                curveToRelative(0.1f, 0.0f, 0.211f, 0.0f, 0.318f, 0.0f)
                arcToRelative(9.114f, 9.114f, 0.0f, false, true, 8.68f, 8.768f)
                arcTo(8.91f, 8.91f, 0.0f, false, true, 20.787f, 14.293f)
                close()
            }
        }
        .build()
        return _palette!!
    }

private var _palette: ImageVector? = null
