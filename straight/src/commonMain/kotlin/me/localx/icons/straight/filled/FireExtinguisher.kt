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

public val Icons.Filled.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) {
            return _fireExtinguisher!!
        }
        _fireExtinguisher = Builder(name = "FireExtinguisher", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.09f)
                curveToRelative(2.833f, 0.478f, 5.0f, 2.942f, 5.0f, 5.91f)
                verticalLineToRelative(11.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 18.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.967f, 2.167f, -5.431f, 5.0f, -5.91f)
                verticalLineToRelative(-2.018f)
                curveToRelative(-1.409f, 0.156f, -2.76f, 0.625f, -3.95f, 1.409f)
                lineTo(-0.051f, 4.813f)
                curveToRelative(1.518f, -1.002f, 3.248f, -1.6f, 5.051f, -1.763f)
                lineTo(5.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(15.0f, 2.73f)
                verticalLineToRelative(2.539f)
                lineToRelative(9.0f, 2.704f)
                lineTo(24.0f, 0.027f)
                lineToRelative(-9.0f, 2.704f)
                close()
            }
        }
        .build()
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null
