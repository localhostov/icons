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

public val Icons.Bold.Butterfly: ImageVector
    get() {
        if (_butterfly != null) {
            return _butterfly!!
        }
        _butterfly = Builder(name = "Butterfly", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 2.0f)
                close()
                moveTo(21.554f, 13.6f)
                curveToRelative(2.822f, 3.318f, 0.792f, 8.28f, -0.6f, 9.741f)
                lineToRelative(-0.6f, 0.707f)
                lineToRelative(-0.9f, -0.225f)
                arcToRelative(15.612f, 15.612f, 0.0f, false, true, -5.945f, -3.2f)
                lineTo(13.509f, 23.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.509f, 20.618f)
                arcToRelative(15.612f, 15.612f, 0.0f, false, true, -5.945f, 3.2f)
                lineToRelative(-0.9f, 0.225f)
                lineToRelative(-0.6f, -0.707f)
                curveToRelative(-1.412f, -1.489f, -3.418f, -6.423f, -0.6f, -9.741f)
                arcTo(7.092f, 7.092f, 0.0f, false, true, 0.006f, 8.529f)
                arcTo(12.333f, 12.333f, 0.0f, false, true, 1.4f, 2.688f)
                arcTo(3.408f, 3.408f, 0.0f, false, true, 5.683f, 1.264f)
                arcTo(20.187f, 20.187f, 0.0f, false, true, 12.0f, 6.034f)
                arcToRelative(20.187f, 20.187f, 0.0f, false, true, 6.317f, -4.77f)
                arcToRelative(3.408f, 3.408f, 0.0f, false, true, 4.288f, 1.424f)
                arcToRelative(12.333f, 12.333f, 0.0f, false, true, 1.389f, 5.841f)
                arcTo(7.092f, 7.092f, 0.0f, false, true, 21.554f, 13.6f)
                close()
                moveTo(10.5f, 14.994f)
                arcToRelative(10.924f, 10.924f, 0.0f, false, true, -3.068f, 0.433f)
                arcToRelative(7.483f, 7.483f, 0.0f, false, true, -2.313f, -0.334f)
                curveToRelative(-1.652f, 1.538f, -1.184f, 4.055f, -0.308f, 5.508f)
                curveToRelative(2.96f, -1.106f, 5.689f, -3.7f, 5.689f, -5.11f)
                close()
                moveTo(10.5f, 8.861f)
                arcToRelative(18.275f, 18.275f, 0.0f, false, false, -5.976f, -4.83f)
                arcTo(0.412f, 0.412f, 0.0f, false, false, 4.0f, 4.169f)
                arcTo(9.4f, 9.4f, 0.0f, false, false, 3.0f, 8.416f)
                arcToRelative(4.339f, 4.339f, 0.0f, false, false, 4.389f, 4.011f)
                arcToRelative(6.017f, 6.017f, 0.0f, false, false, 3.107f, -0.7f)
                close()
                moveTo(20.0f, 17.747f)
                arcToRelative(3.76f, 3.76f, 0.0f, false, false, -1.119f, -2.654f)
                arcToRelative(7.483f, 7.483f, 0.0f, false, true, -2.313f, 0.334f)
                arcToRelative(10.924f, 10.924f, 0.0f, false, true, -3.068f, -0.433f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.412f, 2.729f, 4.0f, 5.689f, 5.11f)
                arcTo(5.966f, 5.966f, 0.0f, false, false, 20.0f, 17.747f)
                close()
                moveTo(20.0f, 4.169f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, false, -0.52f, -0.138f)
                arcTo(18.275f, 18.275f, 0.0f, false, false, 13.5f, 8.861f)
                verticalLineToRelative(2.871f)
                arcToRelative(6.017f, 6.017f, 0.0f, false, false, 3.107f, 0.7f)
                arcTo(4.339f, 4.339f, 0.0f, false, false, 21.0f, 8.416f)
                arcTo(9.4f, 9.4f, 0.0f, false, false, 20.0f, 4.169f)
                close()
            }
        }
        .build()
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
