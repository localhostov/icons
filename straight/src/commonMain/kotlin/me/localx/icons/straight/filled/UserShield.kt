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

public val Icons.Filled.UserShield: ImageVector
    get() {
        if (_userShield != null) {
            return _userShield!!
        }
        _userShield = Builder(name = "UserShield", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 12.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveTo(4.691f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(18.456f, 23.974f)
                lineToRelative(-0.604f, -0.302f)
                curveToRelative(-1.139f, -0.569f, -4.853f, -2.704f, -4.853f, -6.272f)
                verticalLineToRelative(-3.426f)
                curveToRelative(0.0f, -1.08f, 0.688f, -2.033f, 1.714f, -2.373f)
                lineToRelative(3.786f, -1.255f)
                lineToRelative(3.786f, 1.255f)
                curveToRelative(1.025f, 0.34f, 1.714f, 1.293f, 1.714f, 2.373f)
                verticalLineToRelative(3.426f)
                curveToRelative(0.0f, 4.03f, -3.764f, 5.858f, -4.917f, 6.322f)
                lineToRelative(-0.627f, 0.252f)
                close()
                moveTo(11.0f, 17.4f)
                verticalLineToRelative(-3.399f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(14.652f)
                curveToRelative(-1.731f, -1.351f, -3.652f, -3.539f, -3.652f, -6.601f)
                close()
            }
        }
        .build()
        return _userShield!!
    }

private var _userShield: ImageVector? = null
