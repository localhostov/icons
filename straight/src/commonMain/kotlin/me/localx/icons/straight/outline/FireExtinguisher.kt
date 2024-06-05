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

public val Icons.Outline.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) {
            return _fireExtinguisher!!
        }
        _fireExtinguisher = Builder(name = "FireExtinguisher", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.05f)
                curveToRelative(-1.803f, 0.163f, -3.533f, 0.761f, -5.051f, 1.763f)
                lineToRelative(1.102f, 1.669f)
                curveToRelative(1.19f, -0.785f, 2.541f, -1.253f, 3.95f, -1.409f)
                verticalLineToRelative(2.018f)
                curveToRelative(-2.833f, 0.478f, -5.0f, 2.942f, -5.0f, 5.91f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-11.0f)
                curveToRelative(0.0f, -2.967f, -2.167f, -5.431f, -5.0f, -5.91f)
                verticalLineToRelative(-2.09f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(7.001f, 1.0f)
                close()
                moveTo(10.0f, 13.0f)
                verticalLineToRelative(9.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 18.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                close()
                moveTo(15.0f, 2.73f)
                verticalLineToRelative(2.539f)
                lineToRelative(9.0f, 2.704f)
                lineTo(24.0f, 0.027f)
                lineToRelative(-9.0f, 2.704f)
                close()
                moveTo(22.0f, 5.283f)
                lineToRelative(-4.274f, -1.284f)
                lineToRelative(4.274f, -1.284f)
                verticalLineToRelative(2.567f)
                close()
            }
        }
        .build()
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null
