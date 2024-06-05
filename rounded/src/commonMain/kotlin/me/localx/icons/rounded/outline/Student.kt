package me.localx.icons.rounded.outline

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

public val Icons.Outline.Student: ImageVector
    get() {
        if (_student != null) {
            return _student!!
        }
        _student = Builder(name = "Student", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.004f, 4.498f)
                curveToRelative(0.001f, -0.865f, -0.525f, -1.61f, -1.34f, -1.898f)
                lineTo(14.199f, 0.319f)
                curveToRelative(-1.388f, -0.491f, -2.916f, -0.492f, -4.303f, -0.006f)
                lineTo(3.353f, 2.603f)
                curveToRelative(-0.818f, 0.286f, -1.346f, 1.03f, -1.346f, 1.896f)
                curveToRelative(0.0f, 0.867f, 0.529f, 1.611f, 1.347f, 1.896f)
                lineToRelative(2.646f, 0.923f)
                verticalLineToRelative(1.682f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                verticalLineToRelative(-1.682f)
                lineToRelative(2.0f, -0.698f)
                verticalLineToRelative(4.379f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-6.477f)
                curveToRelative(0.0f, -0.009f, 0.004f, -0.016f, 0.004f, -0.025f)
                close()
                moveTo(16.0f, 9.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineToRelative(-0.984f)
                lineToRelative(1.861f, 0.649f)
                curveToRelative(0.689f, 0.24f, 1.414f, 0.361f, 2.138f, 0.361f)
                reflectiveCurveToRelative(1.448f, -0.121f, 2.137f, -0.361f)
                lineToRelative(1.864f, -0.65f)
                verticalLineToRelative(0.984f)
                close()
                moveTo(13.478f, 6.777f)
                curveToRelative(-0.953f, 0.333f, -2.004f, 0.333f, -2.957f, 0.0f)
                lineToRelative(-6.507f, -2.287f)
                lineToRelative(6.544f, -2.29f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.478f, -0.167f, 0.979f, -0.251f, 1.482f, -0.251f)
                curveToRelative(0.506f, 0.0f, 1.012f, 0.085f, 1.494f, 0.255f)
                lineToRelative(6.465f, 2.298f)
                lineToRelative(-6.521f, 2.274f)
                close()
                moveTo(19.956f, 22.703f)
                curveToRelative(0.164f, 0.527f, -0.131f, 1.088f, -0.658f, 1.252f)
                curveToRelative(-0.099f, 0.031f, -0.199f, 0.045f, -0.297f, 0.045f)
                curveToRelative(-0.426f, 0.0f, -0.821f, -0.275f, -0.955f, -0.704f)
                curveToRelative(-0.787f, -2.53f, -3.272f, -4.297f, -6.045f, -4.297f)
                reflectiveCurveToRelative(-5.258f, 1.767f, -6.045f, 4.297f)
                curveToRelative(-0.164f, 0.528f, -0.728f, 0.821f, -1.252f, 0.658f)
                curveToRelative(-0.527f, -0.164f, -0.822f, -0.725f, -0.658f, -1.252f)
                curveToRelative(1.044f, -3.358f, 4.315f, -5.703f, 7.955f, -5.703f)
                reflectiveCurveToRelative(6.911f, 2.345f, 7.955f, 5.703f)
                close()
            }
        }
        .build()
        return _student!!
    }

private var _student: ImageVector? = null
