package me.localx.icons.rounded.bold

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

public val Icons.Bold.Cricket: ImageVector
    get() {
        if (_cricket != null) {
            return _cricket!!
        }
        _cricket = Builder(name = "Cricket", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -3.0f, -3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 24.0f, 21.0f)
                close()
                moveTo(21.0f, 5.121f)
                lineTo(17.164f, 8.958f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.18f, 2.18f, 0.0f, false, false, -0.664f, 1.521f)
                arcToRelative(2.043f, 2.043f, 0.0f, false, false, 0.179f, 0.815f)
                arcTo(3.547f, 3.547f, 0.0f, false, true, 16.0f, 15.274f)
                lineTo(8.335f, 22.937f)
                arcToRelative(3.485f, 3.485f, 0.0f, false, true, -1.993f, 0.993f)
                arcTo(6.971f, 6.971f, 0.0f, false, true, 5.355f, 24.0f)
                arcToRelative(5.311f, 5.311f, 0.0f, false, true, -3.842f, -1.514f)
                arcTo(5.541f, 5.541f, 0.0f, false, true, 0.069f, 17.659f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 1.0f, -1.995f)
                lineTo(8.728f, 8.0f)
                arcTo(3.535f, 3.535f, 0.0f, false, true, 12.7f, 7.319f)
                arcToRelative(2.41f, 2.41f, 0.0f, false, false, 0.841f, 0.181f)
                arcToRelative(2.189f, 2.189f, 0.0f, false, false, 1.5f, -0.664f)
                lineTo(18.879f, 3.0f)
                lineToRelative(-0.44f, -0.439f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.561f, 0.439f)
                lineToRelative(3.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.122f, 2.122f)
                close()
                moveTo(13.028f, 14.0f)
                curveToRelative(-0.6f, 0.0f, -1.243f, 0.0f, -1.6f, 0.0f)
                curveTo(11.0f, 14.0f, 10.0f, 14.0f, 10.0f, 12.671f)
                verticalLineToRelative(-1.7f)
                lineTo(3.185f, 17.786f)
                arcToRelative(0.518f, 0.518f, 0.0f, false, false, -0.146f, 0.3f)
                arcToRelative(2.649f, 2.649f, 0.0f, false, false, 0.595f, 2.283f)
                arcToRelative(2.644f, 2.644f, 0.0f, false, false, 2.285f, 0.594f)
                arcToRelative(0.513f, 0.513f, 0.0f, false, false, 0.294f, -0.144f)
                close()
            }
        }
        .build()
        return _cricket!!
    }

private var _cricket: ImageVector? = null
