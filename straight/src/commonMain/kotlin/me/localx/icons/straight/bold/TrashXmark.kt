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

public val Icons.Bold.TrashXmark: ImageVector
    get() {
        if (_trashXmark != null) {
            return _trashXmark!!
        }
        _trashXmark = Builder(name = "TrashXmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                lineTo(1.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.62f)
                lineToRelative(1.233f, 14.791f)
                curveToRelative(0.15f, 1.799f, 1.682f, 3.209f, 3.488f, 3.209f)
                horizontalLineToRelative(9.319f)
                curveToRelative(1.806f, 0.0f, 3.338f, -1.41f, 3.488f, -3.209f)
                lineToRelative(1.233f, -14.791f)
                horizontalLineToRelative(1.62f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(17.158f, 20.541f)
                curveToRelative(-0.022f, 0.262f, -0.236f, 0.459f, -0.499f, 0.459f)
                lineTo(7.34f, 21.0f)
                curveToRelative(-0.262f, 0.0f, -0.477f, -0.197f, -0.499f, -0.459f)
                lineToRelative(-1.212f, -14.541f)
                horizontalLineToRelative(12.74f)
                lineToRelative(-1.212f, 14.541f)
                close()
                moveTo(7.689f, 15.189f)
                lineToRelative(2.189f, -2.189f)
                lineToRelative(-2.189f, -2.189f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(2.189f, 2.189f)
                lineToRelative(2.189f, -2.189f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-2.189f, 2.189f)
                lineToRelative(2.189f, 2.189f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-2.189f, -2.189f)
                lineToRelative(-2.189f, 2.189f)
                lineToRelative(-2.121f, -2.121f)
                close()
            }
        }
        .build()
        return _trashXmark!!
    }

private var _trashXmark: ImageVector? = null
