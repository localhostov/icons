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

public val Icons.Filled.UserVisor: ImageVector
    get() {
        if (_userVisor != null) {
            return _userVisor!!
        }
        _userVisor = Builder(name = "UserVisor", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 14.0f)
                curveToRelative(-4.963f, 0.0f, -9.0f, 4.037f, -9.0f, 9.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                curveToRelative(0.0f, -4.963f, -4.037f, -9.0f, -9.0f, -9.0f)
                close()
                moveTo(16.59f, 21.914f)
                curveToRelative(-0.365f, -0.257f, -0.789f, -0.462f, -1.15f, -0.462f)
                curveToRelative(-0.474f, 0.0f, -1.194f, 0.524f, -1.726f, 0.97f)
                curveToRelative(-0.257f, 0.216f, -0.643f, 0.0f, -0.595f, -0.332f)
                curveToRelative(0.099f, -0.685f, 0.245f, -1.288f, 0.414f, -1.818f)
                curveToRelative(0.273f, -0.807f, 0.667f, -1.497f, 1.146f, -2.075f)
                curveToRelative(0.216f, -0.261f, 0.609f, -0.262f, 0.825f, -0.002f)
                curveToRelative(0.471f, 0.566f, 0.859f, 1.221f, 1.132f, 1.887f)
                curveToRelative(0.219f, 0.521f, 0.367f, 0.987f, 0.472f, 1.49f)
                curveToRelative(0.062f, 0.297f, -0.269f, 0.518f, -0.518f, 0.343f)
                close()
                moveTo(17.0f, 8.0f)
                lineTo(7.0f, 8.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(7.54f, 2.0f)
                curveToRelative(1.099f, -1.224f, 2.688f, -2.0f, 4.46f, -2.0f)
                reflectiveCurveToRelative(3.36f, 0.776f, 4.46f, 2.0f)
                lineTo(7.54f, 2.0f)
                close()
                moveTo(16.459f, 10.0f)
                curveToRelative(-1.099f, 1.224f, -2.688f, 2.0f, -4.46f, 2.0f)
                reflectiveCurveToRelative(-3.36f, -0.776f, -4.46f, -2.0f)
                horizontalLineToRelative(8.919f)
                close()
            }
        }
        .build()
        return _userVisor!!
    }

private var _userVisor: ImageVector? = null
