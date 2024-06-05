package me.localx.icons.straight.outline

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

public val Icons.Outline.CloudsSun: ImageVector
    get() {
        if (_cloudsSun != null) {
            return _cloudsSun!!
        }
        _cloudsSun = Builder(name = "CloudsSun", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.909f, 11.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.291f, 1.106f)
                lineToRelative(3.528f, 2.054f)
                lineToRelative(-1.005f, 1.728f)
                lineTo(16.8f, 12.855f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.544f, -5.767f)
                lineTo(8.128f, 1.856f)
                lineTo(9.856f, 0.851f)
                lineToRelative(2.051f, 3.526f)
                arcTo(6.1f, 6.1f, 0.0f, false, true, 13.0f, 4.09f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(15.0f, 4.09f)
                arcToRelative(6.035f, 6.035f, 0.0f, false, true, 1.1f, 0.3f)
                lineTo(18.157f, 0.851f)
                lineToRelative(1.729f, 1.005f)
                lineTo(17.832f, 5.388f)
                arcToRelative(6.021f, 6.021f, 0.0f, false, true, 0.774f, 0.774f)
                lineTo(22.146f, 4.1f)
                lineToRelative(1.006f, 1.728f)
                lineTo(19.61f, 7.891f)
                arcTo(5.987f, 5.987f, 0.0f, false, true, 19.91f, 9.0f)
                lineTo(24.0f, 9.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(20.0f, 19.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 15.5f, 24.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.441f, -6.693f)
                arcTo(5.566f, 5.566f, 0.0f, false, true, 6.0f, 16.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 10.848f, -1.294f)
                arcTo(4.52f, 4.52f, 0.0f, false, true, 20.0f, 19.5f)
                close()
                moveTo(18.0f, 19.5f)
                arcToRelative(2.507f, 2.507f, 0.0f, false, false, -2.159f, -2.477f)
                lineToRelative(-0.779f, -0.106f)
                lineToRelative(-0.082f, -0.782f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 8.2f, 17.675f)
                lineToRelative(0.433f, 1.211f)
                lineToRelative(-1.28f, 0.121f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 22.0f)
                horizontalLineToRelative(8.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.0f, 19.5f)
                close()
                moveTo(3.355f, 15.019f)
                lineToRelative(1.28f, -0.121f)
                lineTo(4.2f, 13.687f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 9.1f, 9.4f)
                arcTo(7.459f, 7.459f, 0.0f, false, true, 11.5f, 9.0f)
                curveToRelative(0.081f, 0.0f, 0.162f, 0.0f, 0.243f, 0.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 2.0f, 12.512f)
                arcToRelative(5.556f, 5.556f, 0.0f, false, false, 0.059f, 0.807f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, 6.381f)
                arcToRelative(5.508f, 5.508f, 0.0f, false, true, 0.654f, -1.911f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.642f, -2.77f)
                close()
            }
        }
        .build()
        return _cloudsSun!!
    }

private var _cloudsSun: ImageVector? = null
