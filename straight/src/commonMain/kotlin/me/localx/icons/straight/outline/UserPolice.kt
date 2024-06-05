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

public val Icons.Outline.UserPolice: ImageVector
    get() {
        if (_userPolice != null) {
            return _userPolice!!
        }
        _userPolice = Builder(name = "UserPolice", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.229f, -0.729f, -2.301f, -1.823f, -2.762f)
                lineToRelative(-5.177f, 5.176f)
                lineToRelative(-5.177f, -5.176f)
                curveToRelative(-1.095f, 0.461f, -1.823f, 1.533f, -1.823f, 2.762f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.346f, 1.595f, -4.35f, 3.878f, -4.873f)
                lineToRelative(0.539f, -0.124f)
                lineToRelative(4.583f, 4.583f)
                lineToRelative(4.583f, -4.583f)
                lineToRelative(0.539f, 0.124f)
                curveToRelative(2.283f, 0.523f, 3.878f, 2.527f, 3.878f, 4.873f)
                close()
                moveTo(6.0f, 6.0f)
                lineToRelative(-2.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                lineTo(10.302f, 0.209f)
                curveToRelative(1.115f, -0.279f, 2.281f, -0.279f, 3.396f, 0.0f)
                lineToRelative(6.302f, 1.791f)
                verticalLineToRelative(3.0f)
                lineToRelative(-2.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(16.0f, 7.615f)
                curveToRelative(-0.976f, 0.206f, -2.309f, 0.385f, -4.0f, 0.385f)
                reflectiveCurveToRelative(-3.024f, -0.179f, -4.0f, -0.385f)
                verticalLineToRelative(1.385f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-1.385f)
                close()
                moveTo(10.0f, 4.065f)
                curveToRelative(0.0f, 1.331f, 1.552f, 2.211f, 2.001f, 2.435f)
                curveToRelative(0.447f, -0.18f, 1.999f, -0.922f, 1.999f, -2.435f)
                verticalLineToRelative(-1.45f)
                curveToRelative(0.0f, -0.191f, -0.122f, -0.36f, -0.304f, -0.421f)
                lineToRelative(-1.696f, -0.562f)
                lineToRelative(-1.696f, 0.562f)
                curveToRelative(-0.182f, 0.06f, -0.304f, 0.229f, -0.304f, 0.421f)
                verticalLineToRelative(1.45f)
                close()
            }
        }
        .build()
        return _userPolice!!
    }

private var _userPolice: ImageVector? = null
