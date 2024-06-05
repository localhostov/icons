package me.localx.icons.straight.filled

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

public val Icons.Filled.CloudSunRain: ImageVector
    get() {
        if (_cloudSunRain != null) {
            return _cloudSunRain!!
        }
        _cloudSunRain = Builder(name = "CloudSunRain", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                lineTo(14.0f, 24.0f)
                close()
                moveTo(18.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                lineTo(20.0f, 19.0f)
                lineTo(18.0f, 19.0f)
                close()
                moveTo(10.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                lineTo(12.0f, 19.0f)
                lineTo(10.0f, 19.0f)
                close()
                moveTo(19.436f, 12.017f)
                curveToRelative(-2.445f, -4.936f, -10.065f, -3.392f, -10.4f, 2.1f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 21.447f)
                lineTo(8.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(9.989f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 1.989f)
                lineTo(22.0f, 21.017f)
                arcTo(5.034f, 5.034f, 0.0f, false, false, 19.436f, 12.017f)
                close()
                moveTo(7.253f, 12.671f)
                arcTo(7.524f, 7.524f, 0.0f, false, true, 14.406f, 7.01f)
                lineToRelative(2.881f, -1.677f)
                lineTo(16.281f, 3.6f)
                lineTo(13.158f, 5.423f)
                arcToRelative(5.658f, 5.658f, 0.0f, false, false, -0.589f, -0.58f)
                lineToRelative(1.815f, -3.121f)
                lineTo(12.655f, 0.716f)
                lineToRelative(-1.809f, 3.11f)
                arcTo(5.4f, 5.4f, 0.0f, false, false, 10.0f, 3.6f)
                lineTo(10.0f, 0.0f)
                lineTo(8.0f, 0.0f)
                lineTo(8.0f, 3.6f)
                arcToRelative(5.419f, 5.419f, 0.0f, false, false, -0.836f, 0.226f)
                lineTo(5.357f, 0.716f)
                lineTo(3.629f, 1.722f)
                lineToRelative(1.8f, 3.1f)
                arcToRelative(5.515f, 5.515f, 0.0f, false, false, -0.593f, 0.591f)
                lineTo(1.73f, 3.6f)
                lineToRelative(-1.0f, 1.729f)
                lineTo(3.831f, 7.141f)
                arcTo(5.26f, 5.26f, 0.0f, false, false, 3.6f, 8.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.6f, 10.0f)
                arcToRelative(5.368f, 5.368f, 0.0f, false, false, 0.228f, 0.852f)
                lineToRelative(-3.1f, 1.8f)
                lineToRelative(1.006f, 1.729f)
                lineToRelative(3.1f, -1.807f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 1.126f, 1.0f)
                arcToRelative(5.981f, 5.981f, 0.0f, false, true, 1.189f, -0.845f)
                curveTo(7.188f, 12.718f, 7.216f, 12.69f, 7.253f, 12.671f)
                close()
            }
        }
        .build()
        return _cloudSunRain!!
    }

private var _cloudSunRain: ImageVector? = null
