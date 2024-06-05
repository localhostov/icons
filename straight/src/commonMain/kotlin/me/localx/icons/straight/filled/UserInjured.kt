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

public val Icons.Filled.UserInjured: ImageVector
    get() {
        if (_userInjured != null) {
            return _userInjured!!
        }
        _userInjured = Builder(name = "UserInjured", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.91f, 7.0f)
                curveToRelative(-0.478f, 2.833f, -2.942f, 5.0f, -5.91f, 5.0f)
                reflectiveCurveToRelative(-5.431f, -2.167f, -5.91f, -5.0f)
                horizontalLineToRelative(11.819f)
                close()
                moveTo(17.916f, 5.0f)
                curveToRelative(-0.167f, -0.979f, -0.573f, -1.877f, -1.154f, -2.636f)
                lineToRelative(-3.912f, 2.636f)
                horizontalLineToRelative(5.066f)
                close()
                moveTo(9.452f, 5.0f)
                lineTo(15.283f, 0.984f)
                curveToRelative(-0.944f, -0.62f, -2.072f, -0.984f, -3.283f, -0.984f)
                curveToRelative(-2.967f, 0.0f, -5.431f, 2.167f, -5.91f, 5.0f)
                horizontalLineToRelative(3.362f)
                close()
                moveTo(16.5f, 14.0f)
                horizontalLineToRelative(-4.38f)
                lineToRelative(1.6f, 6.0f)
                horizontalLineToRelative(3.28f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(7.5f, 14.0f)
                horizontalLineToRelative(2.395f)
                lineToRelative(2.105f, 8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                close()
            }
        }
        .build()
        return _userInjured!!
    }

private var _userInjured: ImageVector? = null
