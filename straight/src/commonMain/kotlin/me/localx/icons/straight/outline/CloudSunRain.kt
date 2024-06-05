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

public val Icons.Outline.CloudSunRain: ImageVector
    get() {
        if (_cloudSunRain != null) {
            return _cloudSunRain!!
        }
        _cloudSunRain = Builder(name = "CloudSunRain", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                lineTo(10.0f, 24.0f)
                close()
                moveTo(7.415f, 12.12f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 4.7f, -4.719f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.409f, 0.7f)
                lineToRelative(4.761f, -2.771f)
                lineTo(16.281f, 3.6f)
                lineTo(13.158f, 5.423f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -0.587f, -0.585f)
                lineToRelative(1.813f, -3.116f)
                lineTo(12.655f, 0.716f)
                lineTo(10.844f, 3.83f)
                arcTo(5.275f, 5.275f, 0.0f, false, false, 10.0f, 3.6f)
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
                arcToRelative(5.978f, 5.978f, 0.0f, false, true, 1.286f, -0.9f)
                curveTo(7.3f, 12.49f, 7.354f, 12.3f, 7.415f, 12.12f)
                close()
                moveTo(14.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                lineTo(16.0f, 19.0f)
                lineTo(14.0f, 19.0f)
                close()
                moveTo(18.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                lineTo(20.0f, 19.0f)
                lineTo(18.0f, 19.0f)
                close()
                moveTo(19.436f, 12.017f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -10.4f, 2.1f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 21.447f)
                lineTo(8.0f, 18.0f)
                arcToRelative(2.022f, 2.022f, 0.0f, false, true, 2.055f, -2.0f)
                horizontalLineToRelative(1.113f)
                lineToRelative(-0.119f, -1.106f)
                arcToRelative(3.658f, 3.658f, 0.0f, false, true, -0.022f, -0.394f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 6.8f, -1.167f)
                lineToRelative(0.236f, 0.667f)
                horizontalLineToRelative(0.964f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                arcToRelative(2.972f, 2.972f, 0.0f, false, true, -0.027f, 0.4f)
                verticalLineToRelative(3.615f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -2.564f, -9.0f)
                close()
            }
        }
        .build()
        return _cloudSunRain!!
    }

private var _cloudSunRain: ImageVector? = null
