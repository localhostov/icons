package me.localx.icons.rounded.outline

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

public val Icons.Outline.HouseLock: ImageVector
    get() {
        if (_houseLock != null) {
            return _houseLock!!
        }
        _houseLock = Builder(name = "HouseLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.0f, 9.724f)
                verticalLineToRelative(9.276f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-9.276f)
                curveToRelative(0.0f, -1.665f, 0.824f, -3.214f, 2.204f, -4.145f)
                lineTo(9.203f, 0.855f)
                curveToRelative(1.699f, -1.146f, 3.895f, -1.146f, 5.594f, 0.0f)
                lineToRelative(7.203f, 4.881f)
                curveToRelative(0.641f, 0.482f, 1.166f, 1.106f, 1.512f, 1.833f)
                curveToRelative(0.237f, 0.499f, 0.026f, 1.096f, -0.472f, 1.333f)
                curveToRelative(-0.5f, 0.238f, -1.095f, 0.026f, -1.333f, -0.472f)
                curveToRelative(-0.229f, -0.482f, -0.585f, -0.895f, -1.028f, -1.193f)
                lineToRelative(-7.001f, -4.724f)
                curveToRelative(-1.019f, -0.689f, -2.336f, -0.689f, -3.355f, 0.0f)
                lineTo(3.322f, 7.237f)
                curveToRelative(-0.828f, 0.559f, -1.322f, 1.487f, -1.322f, 2.486f)
                close()
                moveTo(24.0f, 18.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.474f, 0.81f, -2.75f, 2.0f, -3.444f)
                verticalLineToRelative(-1.556f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(1.556f)
                curveToRelative(1.19f, 0.694f, 2.0f, 1.97f, 2.0f, 3.444f)
                close()
                moveTo(16.0f, 14.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(22.0f, 18.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(18.0f, 17.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _houseLock!!
    }

private var _houseLock: ImageVector? = null
