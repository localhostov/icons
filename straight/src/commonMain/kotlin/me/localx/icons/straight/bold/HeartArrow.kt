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

public val Icons.Bold.HeartArrow: ImageVector
    get() {
        if (_heartArrow != null) {
            return _heartArrow!!
        }
        _heartArrow = Builder(name = "HeartArrow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.561f, 19.439f)
                lineTo(19.4f, 17.28f)
                curveToRelative(1.929f, -2.121f, 3.6f, -4.659f, 3.6f, -7.119f)
                arcTo(5.973f, 5.973f, 0.0f, false, false, 17.25f, 4.0f)
                arcTo(5.99f, 5.99f, 0.0f, false, false, 13.0f, 5.934f)
                arcTo(5.99f, 5.99f, 0.0f, false, false, 8.75f, 4.0f)
                arcToRelative(5.383f, 5.383f, 0.0f, false, false, -2.17f, 0.459f)
                lineTo(2.121f, 0.0f)
                lineTo(0.0f, 2.121f)
                lineTo(4.236f, 6.357f)
                arcTo(6.409f, 6.409f, 0.0f, false, false, 3.0f, 10.161f)
                curveToRelative(0.0f, 5.259f, 7.609f, 10.9f, 9.135f, 11.974f)
                lineToRelative(0.865f, 0.61f)
                lineToRelative(0.865f, -0.61f)
                arcToRelative(38.45f, 38.45f, 0.0f, false, false, 3.408f, -2.74f)
                lineToRelative(2.166f, 2.166f)
                lineTo(17.0f, 24.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(13.0f, 19.051f)
                curveToRelative(-3.606f, -2.732f, -7.0f, -6.476f, -7.0f, -8.89f)
                arcTo(2.98f, 2.98f, 0.0f, false, true, 8.75f, 7.0f)
                curveToRelative(1.757f, 0.0f, 2.921f, 2.071f, 2.929f, 2.085f)
                lineTo(12.986f, 11.5f)
                lineToRelative(1.331f, -2.409f)
                curveTo(14.329f, 9.071f, 15.493f, 7.0f, 17.25f, 7.0f)
                arcTo(2.98f, 2.98f, 0.0f, false, true, 20.0f, 10.161f)
                curveTo(20.0f, 12.575f, 16.606f, 16.319f, 13.0f, 19.051f)
                close()
            }
        }
        .build()
        return _heartArrow!!
    }

private var _heartArrow: ImageVector? = null
