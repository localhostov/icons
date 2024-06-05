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

public val Icons.Filled.CarTilt: ImageVector
    get() {
        if (_carTilt != null) {
            return _carTilt!!
        }
        _carTilt = Builder(name = "CarTilt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.98f, 8.733f)
                arcTo(4.984f, 4.984f, 0.0f, false, true, 3.388f, 4.357f)
                lineTo(10.26f, 0.74f)
                arcTo(4.955f, 4.955f, 0.0f, false, true, 15.2f, 0.688f)
                lineTo(19.49f, 3.509f)
                arcToRelative(5.439f, 5.439f, 0.0f, false, true, 0.852f, 0.611f)
                lineTo(1.809f, 14.674f)
                curveToRelative(-0.058f, -0.278f, -0.1f, -0.532f, -0.136f, -0.737f)
                curveTo(1.673f, 13.937f, 0.981f, 8.77f, 0.98f, 8.733f)
                close()
                moveTo(18.806f, 8.488f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.093f, 9.52f)
                lineToRelative(-0.56f, -0.929f)
                lineTo(7.565f, 13.7f)
                lineToRelative(0.461f, 0.751f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.7f, 1.047f)
                lineToRelative(-0.5f, -0.808f)
                lineTo(2.414f, 16.632f)
                arcToRelative(4.832f, 4.832f, 0.0f, false, false, 0.257f, 0.5f)
                lineToRelative(0.533f, 1.03f)
                arcTo(3.98f, 3.98f, 0.0f, false, false, 8.121f, 19.8f)
                lineToRelative(0.146f, 0.241f)
                arcToRelative(1.987f, 1.987f, 0.0f, true, false, 3.405f, -2.05f)
                lineToRelative(-0.066f, -0.111f)
                lineToRelative(7.01f, -3.929f)
                lineToRelative(0.193f, 0.321f)
                arcToRelative(1.988f, 1.988f, 0.0f, true, false, 3.406f, -2.051f)
                lineToRelative(-0.233f, -0.386f)
                arcToRelative(3.924f, 3.924f, 0.0f, false, false, 0.553f, -4.71f)
                lineTo(22.0f, 6.091f)
                curveToRelative(-0.094f, -0.155f, -0.2f, -0.3f, -0.3f, -0.443f)
                lineTo(18.272f, 7.6f)
                close()
                moveTo(23.0f, 22.0f)
                lineTo(1.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(23.0f, 24.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 22.0f)
                close()
            }
        }
        .build()
        return _carTilt!!
    }

private var _carTilt: ImageVector? = null
