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

public val Icons.Bold.TrashSlash: ImageVector
    get() {
        if (_trashSlash != null) {
            return _trashSlash!!
        }
        _trashSlash = Builder(name = "TrashSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.36f, 18.239f)
                lineToRelative(1.02f, -12.239f)
                horizontalLineToRelative(1.62f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-0.879f)
                lineTo(2.123f, 0.002f)
                lineTo(0.002f, 2.123f)
                lineToRelative(21.875f, 21.875f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-3.638f, -3.638f)
                close()
                moveTo(17.581f, 15.46f)
                lineTo(8.121f, 6.0f)
                horizontalLineToRelative(10.249f)
                lineToRelative(-0.788f, 9.461f)
                close()
                moveTo(16.05f, 20.999f)
                lineToRelative(2.462f, 2.462f)
                curveToRelative(-0.541f, 0.341f, -1.178f, 0.538f, -1.853f, 0.538f)
                lineTo(7.34f, 23.999f)
                curveToRelative(-1.806f, 0.0f, -3.338f, -1.41f, -3.488f, -3.209f)
                lineToRelative(-1.09f, -13.079f)
                lineToRelative(3.284f, 3.284f)
                lineToRelative(0.795f, 9.545f)
                curveToRelative(0.022f, 0.262f, 0.236f, 0.459f, 0.499f, 0.459f)
                horizontalLineToRelative(8.71f)
                close()
            }
        }
        .build()
        return _trashSlash!!
    }

private var _trashSlash: ImageVector? = null
