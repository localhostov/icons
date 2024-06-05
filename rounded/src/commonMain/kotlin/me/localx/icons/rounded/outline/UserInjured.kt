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

public val Icons.Outline.UserInjured: ImageVector
    get() {
        if (_userInjured != null) {
            return _userInjured!!
        }
        _userInjured = Builder(name = "UserInjured", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 6.0f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                curveToRelative(1.212f, 0.0f, 2.339f, 0.364f, 3.283f, 0.984f)
                lineToRelative(-7.283f, 5.016f)
                curveToRelative(0.0f, 2.209f, 1.791f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.791f, 4.0f, -4.0f)
                horizontalLineToRelative(-4.635f)
                lineToRelative(5.397f, -3.636f)
                curveToRelative(0.773f, 1.01f, 1.238f, 2.268f, 1.238f, 3.636f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                close()
                moveTo(20.0f, 22.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                curveToRelative(-0.24f, 0.0f, -0.476f, 0.018f, -0.708f, 0.046f)
                lineToRelative(1.489f, 5.954f)
                horizontalLineToRelative(2.22f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                lineTo(6.0f, 24.0f)
                curveToRelative(-1.299f, 0.0f, -2.0f, -1.03f, -2.0f, -2.0f)
                curveToRelative(0.0f, -4.411f, 3.589f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.589f, 8.0f, 8.0f)
                close()
                moveTo(9.373f, 16.614f)
                curveToRelative(-1.994f, 0.976f, -3.373f, 3.02f, -3.373f, 5.386f)
                horizontalLineToRelative(4.72f)
                lineToRelative(-1.347f, -5.386f)
                close()
            }
        }
        .build()
        return _userInjured!!
    }

private var _userInjured: ImageVector? = null
