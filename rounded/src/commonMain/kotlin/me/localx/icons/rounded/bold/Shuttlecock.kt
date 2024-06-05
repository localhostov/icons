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

public val Icons.Bold.Shuttlecock: ImageVector
    get() {
        if (_shuttlecock != null) {
            return _shuttlecock!!
        }
        _shuttlecock = Builder(name = "Shuttlecock", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.749f, 9.077f)
                arcToRelative(4.172f, 4.172f, 0.0f, false, false, -1.813f, -1.065f)
                arcTo(4.343f, 4.343f, 0.0f, false, false, 21.0f, 7.271f)
                arcToRelative(4.269f, 4.269f, 0.0f, false, false, -5.075f, -4.193f)
                arcToRelative(4.285f, 4.285f, 0.0f, false, false, -1.086f, -1.827f)
                arcTo(4.242f, 4.242f, 0.0f, false, false, 11.819f, 0.0f)
                arcTo(4.572f, 4.572f, 0.0f, false, false, 8.7f, 1.356f)
                curveTo(4.287f, 6.708f, 2.986f, 12.465f, 2.037f, 16.669f)
                lineToRelative(-0.1f, 0.445f)
                lineToRelative(-0.911f, 0.911f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 4.95f, 4.95f)
                lineToRelative(1.19f, -1.19f)
                lineToRelative(0.392f, -0.088f)
                curveToRelative(4.2f, -0.945f, 9.942f, -2.238f, 15.087f, -6.484f)
                arcTo(4.395f, 4.395f, 0.0f, false, false, 22.749f, 9.077f)
                close()
                moveTo(10.964f, 3.331f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, 1.754f, 0.042f)
                arcToRelative(1.332f, 1.332f, 0.0f, false, true, 0.386f, 0.939f)
                arcToRelative(1.267f, 1.267f, 0.0f, false, true, -0.359f, 0.912f)
                lineToRelative(0.02f, 0.02f)
                curveToRelative(-1.472f, 1.6f, -3.449f, 3.946f, -4.813f, 5.587f)
                lineToRelative(-0.86f, -0.86f)
                arcTo(25.042f, 25.042f, 0.0f, false, true, 10.964f, 3.331f)
                close()
                moveTo(7.3f, 18.679f)
                lineTo(5.146f, 16.525f)
                curveToRelative(0.242f, -1.056f, 0.516f, -2.2f, 0.864f, -3.394f)
                lineToRelative(4.71f, 4.71f)
                curveTo(9.534f, 18.169f, 8.385f, 18.435f, 7.3f, 18.679f)
                close()
                moveTo(10.082f, 12.962f)
                curveToRelative(1.644f, -1.981f, 4.344f, -5.186f, 5.748f, -6.59f)
                arcToRelative(1.271f, 1.271f, 0.0f, false, true, 1.8f, 0.0f)
                arcToRelative(1.258f, 1.258f, 0.0f, false, true, 0.372f, 0.9f)
                arcToRelative(2.739f, 2.739f, 0.0f, false, true, -0.464f, 1.0f)
                curveToRelative(-0.164f, 0.2f, -4.651f, 4.231f, -6.465f, 5.681f)
                close()
                moveTo(20.668f, 12.953f)
                arcTo(24.037f, 24.037f, 0.0f, false, true, 13.923f, 16.8f)
                lineToRelative(-0.718f, -0.718f)
                curveToRelative(1.721f, -1.38f, 4.168f, -3.4f, 5.7f, -4.9f)
                arcToRelative(1.292f, 1.292f, 0.0f, false, true, 0.855f, -0.341f)
                horizontalLineToRelative(0.015f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, 0.855f, 0.355f)
                arcTo(1.273f, 1.273f, 0.0f, false, true, 20.669f, 12.953f)
                close()
            }
        }
        .build()
        return _shuttlecock!!
    }

private var _shuttlecock: ImageVector? = null
