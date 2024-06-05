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

public val Icons.Bold.CloudSunRain: ImageVector
    get() {
        if (_cloudSunRain != null) {
            return _cloudSunRain!!
        }
        _cloudSunRain = Builder(name = "CloudSunRain", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 17.526f)
                arcToRelative(5.243f, 5.243f, 0.0f, false, true, -3.0f, 4.724f)
                lineTo(21.0f, 17.526f)
                arcToRelative(2.253f, 2.253f, 0.0f, false, false, -2.25f, -2.25f)
                lineTo(17.124f, 15.276f)
                lineToRelative(-0.166f, -1.312f)
                arcTo(2.488f, 2.488f, 0.0f, false, false, 12.0f, 14.276f)
                verticalLineToRelative(2.5f)
                lineTo(10.5f, 16.776f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                lineTo(9.0f, 22.5f)
                arcToRelative(4.487f, 4.487f, 0.0f, false, true, 0.005f, -8.468f)
                arcTo(5.486f, 5.486f, 0.0f, false, true, 19.629f, 12.35f)
                arcTo(5.259f, 5.259f, 0.0f, false, true, 24.0f, 17.526f)
                close()
                moveTo(11.0f, 24.0f)
                horizontalLineToRelative(3.0f)
                lineTo(14.0f, 19.0f)
                lineTo(11.0f, 19.0f)
                close()
                moveTo(16.0f, 24.0f)
                horizontalLineToRelative(3.0f)
                lineTo(19.0f, 19.0f)
                lineTo(16.0f, 19.0f)
                close()
                moveTo(8.171f, 10.961f)
                lineTo(7.8f, 10.889f)
                arcToRelative(2.493f, 2.493f, 0.0f, true, true, 3.059f, -3.174f)
                arcToRelative(7.476f, 7.476f, 0.0f, false, true, 2.873f, -0.9f)
                arcToRelative(5.573f, 5.573f, 0.0f, false, false, -0.435f, -1.0f)
                lineTo(15.571f, 3.55f)
                lineTo(13.45f, 1.429f)
                lineTo(11.18f, 3.7f)
                arcTo(5.493f, 5.493f, 0.0f, false, false, 10.0f, 3.208f)
                lineTo(10.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                lineTo(7.0f, 3.208f)
                arcTo(5.472f, 5.472f, 0.0f, false, false, 5.82f, 3.7f)
                lineTo(3.55f, 1.429f)
                lineTo(1.429f, 3.55f)
                lineTo(3.7f, 5.82f)
                arcTo(5.472f, 5.472f, 0.0f, false, false, 3.208f, 7.0f)
                lineTo(0.0f, 7.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.21f, 10.0f)
                arcTo(5.441f, 5.441f, 0.0f, false, false, 3.7f, 11.175f)
                lineTo(1.429f, 13.45f)
                lineTo(3.55f, 15.571f)
                close()
            }
        }
        .build()
        return _cloudSunRain!!
    }

private var _cloudSunRain: ImageVector? = null
