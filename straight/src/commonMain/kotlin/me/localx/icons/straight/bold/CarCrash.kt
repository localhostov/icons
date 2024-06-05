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

public val Icons.Bold.CarCrash: ImageVector
    get() {
        if (_carCrash != null) {
            return _carCrash!!
        }
        _carCrash = Builder(name = "CarCrash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.109f, 11.0f)
                lineTo(-0.081f, 11.0f)
                lineToRelative(2.8f, -3.5f)
                lineTo(-0.081f, 4.0f)
                lineTo(4.0f, 4.0f)
                lineTo(4.0f, -0.032f)
                lineTo(7.5f, 2.723f)
                lineTo(11.0f, -0.081f)
                lineTo(11.0f, 2.191f)
                arcToRelative(5.927f, 5.927f, 0.0f, false, false, -1.164f, 0.839f)
                lineTo(6.694f, 5.936f)
                arcTo(15.088f, 15.088f, 0.0f, false, false, 3.109f, 11.0f)
                close()
                moveTo(23.145f, 19.387f)
                lineTo(21.787f, 22.864f)
                lineTo(19.924f, 22.137f)
                lineTo(19.2f, 24.0f)
                lineToRelative(-4.657f, -1.818f)
                lineToRelative(0.727f, -1.864f)
                lineToRelative(-4.9f, -1.94f)
                lineToRelative(-0.728f, 1.863f)
                lineTo(4.982f, 18.423f)
                lineToRelative(0.727f, -1.863f)
                lineToRelative(-1.863f, -0.728f)
                lineTo(5.2f, 12.355f)
                arcTo(12.574f, 12.574f, 0.0f, false, true, 8.339f, 7.744f)
                lineToRelative(3.134f, -2.913f)
                arcToRelative(3.518f, 3.518f, 0.0f, false, true, 3.655f, -0.7f)
                lineToRelative(6.288f, 2.483f)
                arcToRelative(3.52f, 3.52f, 0.0f, false, true, 2.216f, 2.989f)
                lineToRelative(0.331f, 4.266f)
                arcTo(12.578f, 12.578f, 0.0f, false, true, 23.145f, 19.387f)
                close()
                moveTo(10.257f, 11.846f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.521f, 1.521f, 0.0f, false, false, -1.971f, 0.865f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.523f, 1.523f, 0.0f, false, false, 0.864f, 1.972f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.524f, 1.524f, 0.0f, false, false, 1.972f, -0.865f)
                horizontalLineToRelative(0.0f)
                arcTo(1.522f, 1.522f, 0.0f, false, false, 10.257f, 11.846f)
                close()
                moveTo(20.875f, 12.846f)
                lineTo(20.641f, 9.837f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.317f, -0.428f)
                lineTo(14.037f, 6.929f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.522f, 0.1f)
                lineTo(11.306f, 9.081f)
                close()
                moveTo(19.775f, 15.587f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.523f, 1.523f, 0.0f, false, false, -1.972f, 0.864f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.524f, 1.524f, 0.0f, false, false, 0.865f, 1.972f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.523f, 1.523f, 0.0f, false, false, 1.972f, -0.864f)
                horizontalLineToRelative(0.0f)
                arcTo(1.521f, 1.521f, 0.0f, false, false, 19.772f, 15.589f)
                close()
            }
        }
        .build()
        return _carCrash!!
    }

private var _carCrash: ImageVector? = null
