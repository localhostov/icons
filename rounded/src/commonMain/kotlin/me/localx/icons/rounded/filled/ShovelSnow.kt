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

public val Icons.Filled.ShovelSnow: ImageVector
    get() {
        if (_shovelSnow != null) {
            return _shovelSnow!!
        }
        _shovelSnow = Builder(name = "ShovelSnow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.706f, 4.292f)
                lineTo(19.695f, 0.281f)
                curveToRelative(-0.391f, -0.391f, -1.024f, -0.391f, -1.414f, 0.0f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.024f, 0.0f, 1.414f)
                lineToRelative(1.305f, 1.305f)
                lineToRelative(-8.337f, 8.302f)
                lineToRelative(-1.508f, -1.508f)
                curveToRelative(-1.562f, -1.562f, -4.095f, -1.562f, -5.657f, 0.0f)
                lineToRelative(-3.206f, 3.206f)
                curveToRelative(-1.172f, 1.172f, -1.172f, 3.071f, 0.0f, 4.243f)
                lineToRelative(5.879f, 5.879f)
                curveToRelative(1.172f, 1.172f, 3.071f, 1.172f, 4.243f, 0.0f)
                lineToRelative(3.206f, -3.206f)
                curveToRelative(1.562f, -1.562f, 1.562f, -4.095f, 0.0f, -5.657f)
                lineToRelative(-1.543f, -1.543f)
                lineToRelative(8.337f, -8.302f)
                lineToRelative(1.292f, 1.292f)
                curveToRelative(0.39f, 0.391f, 1.024f, 0.391f, 1.414f, 0.0f)
                curveToRelative(0.39f, -0.391f, 0.39f, -1.024f, 0.0f, -1.414f)
                close()
                moveTo(2.293f, 15.707f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.024f, 0.0f, -1.414f)
                lineToRelative(2.0f, -2.0f)
                curveToRelative(0.39f, -0.391f, 1.024f, -0.391f, 1.414f, 0.0f)
                curveToRelative(0.39f, 0.391f, 0.39f, 1.024f, 0.0f, 1.414f)
                lineToRelative(-2.0f, 2.0f)
                curveToRelative(-0.391f, 0.391f, -1.024f, 0.391f, -1.414f, 0.0f)
                close()
                moveTo(6.707f, 18.707f)
                curveToRelative(-0.391f, 0.391f, -1.024f, 0.391f, -1.414f, 0.0f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.024f, 0.0f, -1.414f)
                lineToRelative(2.0f, -2.0f)
                curveToRelative(0.39f, -0.391f, 1.024f, -0.391f, 1.414f, 0.0f)
                curveToRelative(0.39f, 0.391f, 0.39f, 1.024f, 0.0f, 1.414f)
                lineToRelative(-2.0f, 2.0f)
                close()
                moveTo(11.707f, 19.707f)
                lineToRelative(-2.0f, 2.0f)
                curveToRelative(-0.391f, 0.39f, -1.024f, 0.39f, -1.414f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.024f, 0.0f, -1.414f)
                lineToRelative(2.0f, -2.0f)
                curveToRelative(0.39f, -0.39f, 1.023f, -0.391f, 1.414f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.024f, 0.0f, 1.414f)
                close()
            }
        }
        .build()
        return _shovelSnow!!
    }

private var _shovelSnow: ImageVector? = null
