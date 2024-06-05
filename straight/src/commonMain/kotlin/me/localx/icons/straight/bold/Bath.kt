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

public val Icons.Bold.Bath: ImageVector
    get() {
        if (_bath != null) {
            return _bath!!
        }
        _bath = Builder(name = "Bath", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.478f, 16.131f)
                lineToRelative(0.517f, -4.131f)
                lineTo(3.0f, 12.0f)
                verticalLineToRelative(-7.167f)
                curveToRelative(0.0f, -1.011f, 0.822f, -1.833f, 1.833f, -1.833f)
                curveToRelative(0.574f, 0.0f, 1.122f, 0.274f, 1.467f, 0.733f)
                lineToRelative(0.541f, 0.721f)
                lineToRelative(-0.456f, 2.613f)
                lineToRelative(1.071f, 1.67f)
                lineToRelative(5.777f, -4.333f)
                lineToRelative(-1.071f, -1.67f)
                lineToRelative(-2.96f, -0.132f)
                lineToRelative(-0.503f, -0.67f)
                curveToRelative(-0.908f, -1.21f, -2.354f, -1.933f, -3.866f, -1.933f)
                curveTo(2.168f, 0.0f, 0.0f, 2.168f, 0.0f, 4.833f)
                verticalLineToRelative(7.167f)
                lineToRelative(0.548f, 4.13f)
                curveToRelative(0.235f, 1.882f, 1.13f, 3.542f, 2.434f, 4.758f)
                lineToRelative(-0.778f, 3.112f)
                horizontalLineToRelative(3.092f)
                lineToRelative(0.367f, -1.468f)
                curveToRelative(0.836f, 0.303f, 1.734f, 0.468f, 2.667f, 0.468f)
                horizontalLineToRelative(7.365f)
                curveToRelative(0.924f, 0.0f, 1.815f, -0.162f, 2.644f, -0.46f)
                lineToRelative(0.365f, 1.46f)
                horizontalLineToRelative(3.092f)
                lineToRelative(-0.773f, -3.093f)
                curveToRelative(1.315f, -1.218f, 2.218f, -2.885f, 2.455f, -4.776f)
                close()
                moveTo(8.331f, 20.0f)
                curveToRelative(-2.438f, 0.0f, -4.504f, -1.823f, -4.806f, -4.242f)
                lineToRelative(-0.095f, -0.758f)
                horizontalLineToRelative(17.166f)
                lineToRelative(-0.095f, 0.759f)
                curveToRelative(-0.302f, 2.418f, -2.368f, 4.241f, -4.806f, 4.241f)
                horizontalLineToRelative(-7.365f)
                close()
            }
        }
        .build()
        return _bath!!
    }

private var _bath: ImageVector? = null
