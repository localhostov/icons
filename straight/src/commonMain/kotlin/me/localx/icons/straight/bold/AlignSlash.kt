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

public val Icons.Bold.AlignSlash: ImageVector
    get() {
        if (_alignSlash != null) {
            return _alignSlash!!
        }
        _alignSlash = Builder(name = "AlignSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.05f, 11.0f)
                lineTo(0.0f, 11.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.05f)
                lineToRelative(3.0f, 3.0f)
                close()
                moveTo(0.0f, 18.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(16.05f)
                lineToRelative(-3.0f, -3.0f)
                lineTo(0.0f, 18.0f)
                close()
                moveTo(8.05f, 13.0f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(11.05f)
                lineToRelative(-3.0f, -3.0f)
                close()
                moveTo(24.0f, 6.0f)
                verticalLineToRelative(-3.0f)
                lineTo(5.121f, 3.0f)
                lineTo(2.161f, 0.04f)
                lineTo(0.04f, 2.161f)
                lineToRelative(21.8f, 21.8f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-0.839f, -0.839f)
                horizontalLineToRelative(0.879f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.879f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(5.879f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-8.879f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(10.879f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-13.879f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(15.879f)
                close()
            }
        }
        .build()
        return _alignSlash!!
    }

private var _alignSlash: ImageVector? = null
