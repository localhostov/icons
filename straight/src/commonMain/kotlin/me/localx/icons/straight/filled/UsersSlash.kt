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

public val Icons.Filled.UsersSlash: ImageVector
    get() {
        if (_usersSlash != null) {
            return _usersSlash!!
        }
        _usersSlash = Builder(name = "UsersSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.349f)
                curveToRelative(0.741f, -2.066f, 0.284f, -4.372f, -1.188f, -6.0f)
                horizontalLineToRelative(4.537f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(0.238f, 0.0f, 0.47f, -0.021f, 0.697f, -0.061f)
                lineToRelative(-4.636f, -4.636f)
                curveToRelative(-0.04f, 0.226f, -0.061f, 0.459f, -0.061f, 0.697f)
                curveToRelative(0.0f, 2.209f, 1.791f, 4.0f, 4.0f, 4.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveToRelative(0.0f, -2.209f, -1.791f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-0.474f, 0.0f, -0.929f, 0.083f, -1.352f, 0.234f)
                lineToRelative(-2.129f, -2.129f)
                curveToRelative(0.903f, -0.733f, 1.48f, -1.852f, 1.48f, -3.106f)
                curveToRelative(0.0f, -2.209f, -1.791f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-1.254f, 0.0f, -2.372f, 0.577f, -3.106f, 1.48f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-8.191f, -8.191f)
                curveToRelative(0.152f, -0.422f, 0.234f, -0.877f, 0.234f, -1.352f)
                close()
                moveTo(18.0f, 8.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, -1.791f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.791f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.791f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.791f, 4.0f, 4.0f, 4.0f)
                close()
                moveTo(9.0f, 18.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.757f)
                lineToRelative(-4.243f, -4.243f)
                horizontalLineToRelative(-4.757f)
                close()
                moveTo(6.0f, 13.0f)
                curveToRelative(0.0f, -0.796f, 0.159f, -1.576f, 0.459f, -2.298f)
                lineToRelative(-1.702f, -1.702f)
                horizontalLineToRelative(-1.757f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.349f)
                curveToRelative(-0.23f, -0.642f, -0.348f, -1.318f, -0.349f, -2.0f)
                close()
            }
        }
        .build()
        return _usersSlash!!
    }

private var _usersSlash: ImageVector? = null
