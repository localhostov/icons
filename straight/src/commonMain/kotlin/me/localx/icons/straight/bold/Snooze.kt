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

public val Icons.Bold.Snooze: ImageVector
    get() {
        if (_snooze != null) {
            return _snooze!!
        }
        _snooze = Builder(name = "Snooze", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.001f, 21.0f)
                horizontalLineToRelative(5.999f)
                verticalLineToRelative(3.0f)
                lineTo(2.139f, 24.0f)
                curveToRelative(-0.868f, 0.0f, -1.643f, -0.518f, -1.975f, -1.319f)
                curveToRelative(-0.322f, -0.776f, -0.161f, -1.66f, 0.408f, -2.272f)
                lineToRelative(5.426f, -6.408f)
                lineTo(0.0f, 14.001f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(7.861f)
                curveToRelative(0.867f, 0.0f, 1.643f, 0.518f, 1.975f, 1.319f)
                curveToRelative(0.322f, 0.777f, 0.161f, 1.661f, -0.408f, 2.273f)
                lineToRelative(-5.426f, 6.408f)
                close()
                moveTo(23.523f, 16.134f)
                curveToRelative(0.479f, -0.538f, 0.61f, -1.3f, 0.332f, -1.972f)
                curveToRelative(-0.292f, -0.706f, -0.975f, -1.162f, -1.739f, -1.162f)
                horizontalLineToRelative(-5.117f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.781f)
                lineToRelative(-2.305f, 2.866f)
                curveToRelative(-0.479f, 0.538f, -0.61f, 1.3f, -0.332f, 1.972f)
                curveToRelative(0.292f, 0.706f, 0.975f, 1.162f, 1.739f, 1.162f)
                horizontalLineToRelative(5.117f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.781f)
                lineToRelative(2.305f, -2.866f)
                close()
                moveTo(18.949f, 7.0f)
                horizontalLineToRelative(-3.696f)
                lineToRelative(3.226f, -3.729f)
                curveToRelative(0.518f, -0.558f, 0.665f, -1.362f, 0.372f, -2.069f)
                curveToRelative(-0.303f, -0.729f, -1.008f, -1.201f, -1.798f, -1.201f)
                horizontalLineToRelative(-6.053f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.747f)
                lineToRelative(-3.226f, 3.729f)
                curveToRelative(-0.518f, 0.558f, -0.665f, 1.361f, -0.371f, 2.069f)
                curveToRelative(0.302f, 0.73f, 1.008f, 1.202f, 1.798f, 1.202f)
                horizontalLineToRelative(6.002f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _snooze!!
    }

private var _snooze: ImageVector? = null
