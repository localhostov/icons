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

public val Icons.Filled.Wheat: ImageVector
    get() {
        if (_wheat != null) {
            return _wheat!!
        }
        _wheat = Builder(name = "Wheat", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.123f, 6.085f)
                curveToRelative(1.13f, -1.13f, 1.641f, -3.4f, 1.86f, -4.868f)
                arcToRelative(1.058f, 1.058f, 0.0f, false, false, -1.205f, -1.2f)
                curveToRelative(-3.442f, 0.562f, -6.136f, 1.4f, -5.77f, 5.566f)
                lineTo(15.723f, 6.863f)
                curveToRelative(0.854f, -1.838f, -0.476f, -4.386f, -1.471f, -5.518f)
                arcToRelative(0.992f, 0.992f, 0.0f, false, false, -1.5f, 0.0f)
                arcTo(7.194f, 7.194f, 0.0f, false, false, 11.0f, 5.5f)
                arcToRelative(4.988f, 4.988f, 0.0f, false, false, 2.262f, 3.824f)
                lineToRelative(-2.539f, 2.539f)
                curveToRelative(0.854f, -1.838f, -0.476f, -4.386f, -1.471f, -5.518f)
                arcToRelative(0.992f, 0.992f, 0.0f, false, false, -1.5f, 0.0f)
                arcTo(7.194f, 7.194f, 0.0f, false, false, 6.0f, 10.5f)
                arcToRelative(4.988f, 4.988f, 0.0f, false, false, 2.262f, 3.824f)
                lineTo(5.723f, 16.863f)
                curveToRelative(0.854f, -1.838f, -0.476f, -4.386f, -1.471f, -5.518f)
                arcToRelative(0.992f, 0.992f, 0.0f, false, false, -1.5f, 0.0f)
                arcTo(7.194f, 7.194f, 0.0f, false, false, 1.0f, 15.5f)
                arcToRelative(4.988f, 4.988f, 0.0f, false, false, 2.262f, 3.824f)
                lineTo(0.293f, 22.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 1.414f)
                lineToRelative(2.969f, -2.969f)
                arcTo(4.988f, 4.988f, 0.0f, false, false, 8.5f, 23.0f)
                arcToRelative(7.194f, 7.194f, 0.0f, false, false, 4.155f, -1.748f)
                arcToRelative(0.992f, 0.992f, 0.0f, false, false, 0.0f, -1.5f)
                curveToRelative(-1.132f, -1.0f, -3.679f, -2.325f, -5.518f, -1.471f)
                lineToRelative(2.539f, -2.539f)
                arcTo(4.988f, 4.988f, 0.0f, false, false, 13.5f, 18.0f)
                arcToRelative(7.194f, 7.194f, 0.0f, false, false, 4.155f, -1.748f)
                arcToRelative(0.992f, 0.992f, 0.0f, false, false, 0.0f, -1.5f)
                curveToRelative(-1.132f, -0.995f, -3.679f, -2.325f, -5.518f, -1.471f)
                lineToRelative(2.539f, -2.539f)
                arcTo(4.988f, 4.988f, 0.0f, false, false, 18.5f, 13.0f)
                arcToRelative(7.194f, 7.194f, 0.0f, false, false, 4.155f, -1.748f)
                arcToRelative(0.992f, 0.992f, 0.0f, false, false, 0.0f, -1.5f)
                curveToRelative(-1.132f, -0.995f, -3.679f, -2.325f, -5.518f, -1.471f)
                lineToRelative(1.286f, -1.286f)
                curveTo(19.6f, 7.034f, 21.282f, 6.926f, 22.123f, 6.085f)
                close()
            }
        }
        .build()
        return _wheat!!
    }

private var _wheat: ImageVector? = null
