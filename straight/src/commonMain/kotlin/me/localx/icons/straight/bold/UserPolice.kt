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

public val Icons.Bold.UserPolice: ImageVector
    get() {
        if (_userPolice != null) {
            return _userPolice!!
        }
        _userPolice = Builder(name = "UserPolice", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 8.984f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                verticalLineToRelative(-2.984f)
                lineToRelative(2.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                lineTo(13.698f, 0.209f)
                curveToRelative(-1.115f, -0.279f, -2.281f, -0.279f, -3.396f, 0.0f)
                lineToRelative(-6.302f, 1.791f)
                verticalLineToRelative(3.0f)
                lineToRelative(2.0f, 1.0f)
                verticalLineToRelative(2.984f)
                close()
                moveTo(10.0f, 2.615f)
                curveToRelative(0.0f, -0.191f, 0.122f, -0.36f, 0.304f, -0.421f)
                lineToRelative(1.696f, -0.562f)
                lineToRelative(1.696f, 0.562f)
                curveToRelative(0.182f, 0.06f, 0.304f, 0.229f, 0.304f, 0.421f)
                verticalLineToRelative(1.45f)
                curveToRelative(0.0f, 1.513f, -1.552f, 2.255f, -1.999f, 2.435f)
                curveToRelative(-0.448f, -0.224f, -2.001f, -1.104f, -2.001f, -2.435f)
                verticalLineToRelative(-1.45f)
                close()
                moveTo(9.0f, 7.792f)
                curveToRelative(0.828f, 0.121f, 1.828f, 0.207f, 3.0f, 0.207f)
                reflectiveCurveToRelative(2.172f, -0.086f, 3.0f, -0.207f)
                verticalLineToRelative(1.192f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-1.192f)
                close()
                moveTo(21.0f, 21.499f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.906f, -0.48f, -1.711f, -1.229f, -2.149f)
                lineToRelative(-4.771f, 4.771f)
                lineToRelative(-4.771f, -4.771f)
                curveToRelative(-0.749f, 0.438f, -1.229f, 1.243f, -1.229f, 2.149f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -2.576f, 1.757f, -4.778f, 4.272f, -5.354f)
                lineToRelative(0.809f, -0.186f)
                lineToRelative(3.919f, 3.919f)
                lineToRelative(3.919f, -3.919f)
                lineToRelative(0.809f, 0.186f)
                curveToRelative(2.516f, 0.576f, 4.272f, 2.778f, 4.272f, 5.354f)
                close()
            }
        }
        .build()
        return _userPolice!!
    }

private var _userPolice: ImageVector? = null
