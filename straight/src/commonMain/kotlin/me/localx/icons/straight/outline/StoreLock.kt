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

public val Icons.Outline.StoreLock: ImageVector
    get() {
        if (_storeLock != null) {
            return _storeLock!!
        }
        _storeLock = Builder(name = "StoreLock", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 11.874f)
                verticalLineToRelative(9.126f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.078f)
                curveToRelative(0.151f, 0.744f, 0.481f, 1.416f, 0.922f, 2.0f)
                lineTo(4.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(1.0f, 10.643f)
                curveToRelative(-0.622f, -0.705f, -1.0f, -1.631f, -1.0f, -2.643f)
                lineTo(2.246f, 0.0f)
                lineTo(21.754f, 0.0f)
                lineToRelative(2.246f, 8.0f)
                curveToRelative(0.0f, 0.825f, -0.251f, 1.592f, -0.681f, 2.23f)
                curveToRelative(-0.348f, -0.667f, -0.818f, -1.258f, -1.38f, -1.748f)
                curveToRelative(0.029f, -0.115f, 0.049f, -0.233f, 0.057f, -0.355f)
                lineToRelative(-1.75f, -6.126f)
                horizontalLineToRelative(-3.246f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(15.0f, 2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(7.0f, 2.0f)
                lineTo(3.754f, 2.0f)
                lineToRelative(-1.75f, 6.126f)
                curveToRelative(0.065f, 1.045f, 0.936f, 1.874f, 1.996f, 1.874f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(1.809f)
                curveToRelative(-0.352f, 0.608f, -0.599f, 1.282f, -0.719f, 2.0f)
                horizontalLineToRelative(-1.09f)
                curveToRelative(-1.194f, 0.0f, -2.267f, -0.525f, -3.0f, -1.357f)
                curveToRelative(-0.733f, 0.832f, -1.806f, 1.357f, -3.0f, 1.357f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.345f, 0.0f, -0.68f, -0.044f, -1.0f, -0.126f)
                close()
                moveTo(19.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(22.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(16.0f, 14.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(22.0f, 16.0f)
                lineTo(14.0f, 16.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _storeLock!!
    }

private var _storeLock: ImageVector? = null
