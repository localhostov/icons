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
                moveToRelative(24.0f, 10.074f)
                verticalLineToRelative(0.901f)
                lineTo(12.674f, 2.232f)
                curveToRelative(-0.396f, -0.311f, -0.952f, -0.311f, -1.349f, 0.0f)
                lineTo(2.421f, 9.209f)
                curveToRelative(-0.268f, 0.21f, -0.421f, 0.524f, -0.421f, 0.865f)
                verticalLineToRelative(11.926f)
                horizontalLineToRelative(8.101f)
                curveToRelative(0.152f, 0.743f, 0.482f, 1.416f, 0.924f, 2.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-13.926f)
                curveToRelative(0.0f, -0.96f, 0.433f, -1.849f, 1.188f, -2.439f)
                lineTo(10.092f, 0.658f)
                curveToRelative(1.123f, -0.879f, 2.692f, -0.881f, 3.815f, 0.0f)
                lineToRelative(8.905f, 6.977f)
                curveToRelative(0.754f, 0.591f, 1.188f, 1.479f, 1.188f, 2.439f)
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
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.552f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _houseLock!!
    }

private var _houseLock: ImageVector? = null
