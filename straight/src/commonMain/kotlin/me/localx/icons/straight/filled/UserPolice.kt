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

public val Icons.Filled.UserPolice: ImageVector
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
                lineTo(3.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.276f, 1.502f, -4.231f, 3.677f, -4.823f)
                lineToRelative(5.323f, 5.323f)
                lineToRelative(5.323f, -5.323f)
                curveToRelative(2.175f, 0.592f, 3.677f, 2.546f, 3.677f, 4.823f)
                close()
                moveTo(17.998f, 9.146f)
                curveToRelative(-0.078f, 3.241f, -2.738f, 5.854f, -5.998f, 5.854f)
                reflectiveCurveToRelative(-5.92f, -2.613f, -5.998f, -5.854f)
                curveToRelative(1.068f, 0.36f, 3.068f, 0.854f, 5.998f, 0.854f)
                reflectiveCurveToRelative(4.93f, -0.494f, 5.998f, -0.854f)
                close()
                moveTo(13.698f, 0.209f)
                curveToRelative(-1.115f, -0.279f, -2.281f, -0.279f, -3.396f, 0.0f)
                lineToRelative(-6.302f, 1.791f)
                verticalLineToRelative(3.0f)
                lineToRelative(2.0f, 1.0f)
                verticalLineToRelative(1.0f)
                reflectiveCurveToRelative(2.0f, 1.0f, 6.0f, 1.0f)
                reflectiveCurveToRelative(6.0f, -1.0f, 6.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                lineToRelative(2.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                lineTo(13.698f, 0.209f)
                close()
                moveTo(14.0f, 4.065f)
                curveToRelative(0.0f, 1.513f, -1.459f, 2.218f, -1.907f, 2.397f)
                lineToRelative(-0.093f, 0.037f)
                lineToRelative(-0.089f, -0.045f)
                curveToRelative(-0.448f, -0.224f, -1.911f, -1.059f, -1.911f, -2.39f)
                verticalLineToRelative(-1.45f)
                curveToRelative(0.0f, -0.191f, 0.122f, -0.36f, 0.304f, -0.421f)
                lineToRelative(1.696f, -0.562f)
                lineToRelative(1.696f, 0.562f)
                curveToRelative(0.182f, 0.06f, 0.304f, 0.229f, 0.304f, 0.421f)
                verticalLineToRelative(1.45f)
                close()
            }
        }
        .build()
        return _userPolice!!
    }

private var _userPolice: ImageVector? = null
