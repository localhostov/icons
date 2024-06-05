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

public val Icons.Bold.TrashCheck: ImageVector
    get() {
        if (_trashCheck != null) {
            return _trashCheck!!
        }
        _trashCheck = Builder(name = "TrashCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.783f, 13.853f)
                lineToRelative(2.084f, -2.158f)
                lineToRelative(2.182f, 2.108f)
                lineToRelative(4.076f, -3.997f)
                lineToRelative(2.1f, 2.143f)
                lineToRelative(-4.416f, 4.33f)
                curveToRelative(-0.481f, 0.48f, -1.117f, 0.722f, -1.754f, 0.722f)
                curveToRelative(-0.641f, 0.0f, -1.283f, -0.243f, -1.771f, -0.732f)
                lineToRelative(-2.501f, -2.415f)
                close()
                moveTo(23.0f, 6.0f)
                horizontalLineToRelative(-1.62f)
                lineToRelative(-1.233f, 14.791f)
                curveToRelative(-0.149f, 1.799f, -1.681f, 3.209f, -3.487f, 3.209f)
                lineTo(7.34f, 24.0f)
                curveToRelative(-1.806f, 0.0f, -3.338f, -1.41f, -3.488f, -3.209f)
                lineToRelative(-1.233f, -14.791f)
                horizontalLineToRelative(-1.62f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(18.369f, 6.0f)
                lineTo(5.63f, 6.0f)
                lineToRelative(1.212f, 14.541f)
                curveToRelative(0.022f, 0.262f, 0.236f, 0.459f, 0.499f, 0.459f)
                horizontalLineToRelative(9.32f)
                curveToRelative(0.262f, 0.0f, 0.476f, -0.197f, 0.497f, -0.458f)
                lineToRelative(1.212f, -14.542f)
                close()
            }
        }
        .build()
        return _trashCheck!!
    }

private var _trashCheck: ImageVector? = null
