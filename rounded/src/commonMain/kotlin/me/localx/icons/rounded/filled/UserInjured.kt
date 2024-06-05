package me.localx.icons.rounded.filled

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
                moveTo(15.0f, 23.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.28f)
                lineToRelative(-1.973f, -7.892f)
                curveToRelative(-3.816f, 0.605f, -6.747f, 3.908f, -6.747f, 7.892f)
                curveToRelative(0.0f, 0.97f, 0.701f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                close()
                moveTo(12.79f, 14.04f)
                lineToRelative(1.497f, 5.989f)
                curveToRelative(1.518f, 0.147f, 2.712f, 1.415f, 2.712f, 2.971f)
                curveToRelative(0.0f, 0.352f, -0.072f, 0.686f, -0.184f, 1.0f)
                horizontalLineToRelative(2.184f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -4.144f, -3.168f, -7.562f, -7.21f, -7.96f)
                close()
            }
        }
        .build()
        return _userInjured!!
    }

private var _userInjured: ImageVector? = null
