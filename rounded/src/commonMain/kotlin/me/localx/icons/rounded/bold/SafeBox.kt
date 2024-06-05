package me.localx.icons.rounded.bold

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

public val Icons.Bold.SafeBox: ImageVector
    get() {
        if (_safeBox != null) {
            return _safeBox!!
        }
        _safeBox = Builder(name = "SafeBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 5.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.704f, -0.779f, 3.23f, -2.0f, 4.24f)
                verticalLineToRelative(1.76f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-0.523f)
                curveToRelative(-0.165f, 0.015f, -0.331f, 0.023f, -0.5f, 0.023f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.207f, 0.0f, 2.217f, -0.86f, 2.45f, -2.0f)
                horizontalLineToRelative(-0.45f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.45f)
                curveToRelative(-0.232f, -1.14f, -1.242f, -2.0f, -2.45f, -2.0f)
                lineTo(5.5f, 3.0f)
                curveToRelative(-0.89f, 0.0f, -1.72f, 0.479f, -2.167f, 1.251f)
                curveToRelative(-0.415f, 0.717f, -1.332f, 0.961f, -2.049f, 0.547f)
                curveToRelative(-0.717f, -0.415f, -0.962f, -1.332f, -0.547f, -2.049f)
                curveTo(1.717f, 1.053f, 3.542f, 0.0f, 5.5f, 0.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                close()
                moveTo(14.0f, 14.667f)
                curveToRelative(1.893f, -0.712f, 3.246f, -2.525f, 3.246f, -4.667f)
                curveToRelative(0.0f, -2.761f, -2.239f, -5.0f, -5.0f, -5.0f)
                curveToRelative(-0.469f, 0.0f, -0.916f, 0.078f, -1.344f, 0.199f)
                curveToRelative(1.905f, 1.076f, 3.098f, 2.791f, 3.098f, 4.801f)
                verticalLineToRelative(4.667f)
                close()
                moveTo(12.0f, 10.0f)
                verticalLineToRelative(10.25f)
                curveToRelative(0.0f, 2.173f, -2.523f, 3.75f, -6.0f, 3.75f)
                reflectiveCurveToRelative(-6.0f, -1.577f, -6.0f, -3.75f)
                verticalLineToRelative(-10.25f)
                curveToRelative(0.0f, -2.28f, 2.58f, -4.0f, 6.0f, -4.0f)
                reflectiveCurveToRelative(6.0f, 1.72f, 6.0f, 4.0f)
                close()
                moveTo(9.0f, 13.498f)
                curveToRelative(-0.872f, 0.322f, -1.892f, 0.502f, -3.0f, 0.502f)
                reflectiveCurveToRelative(-2.128f, -0.181f, -3.0f, -0.502f)
                verticalLineToRelative(1.502f)
                curveToRelative(0.078f, 0.263f, 1.121f, 1.0f, 3.0f, 1.0f)
                curveToRelative(1.868f, 0.0f, 2.909f, -0.728f, 3.0f, -1.012f)
                verticalLineToRelative(-1.49f)
                close()
                moveTo(3.0f, 10.012f)
                verticalLineToRelative(0.01f)
                curveToRelative(0.091f, 0.25f, 1.132f, 0.978f, 3.0f, 0.978f)
                curveToRelative(1.842f, 0.0f, 2.881f, -0.708f, 2.996f, -1.0f)
                curveToRelative(-0.115f, -0.292f, -1.154f, -1.0f, -2.996f, -1.0f)
                curveToRelative(-1.868f, 0.0f, -2.909f, 0.728f, -3.0f, 1.012f)
                close()
                moveTo(9.0f, 20.162f)
                verticalLineToRelative(-1.664f)
                curveToRelative(-0.872f, 0.322f, -1.892f, 0.502f, -3.0f, 0.502f)
                reflectiveCurveToRelative(-2.128f, -0.181f, -3.0f, -0.502f)
                verticalLineToRelative(1.664f)
                curveToRelative(0.217f, 0.275f, 1.275f, 0.838f, 3.0f, 0.838f)
                reflectiveCurveToRelative(2.783f, -0.563f, 3.0f, -0.838f)
                close()
            }
        }
        .build()
        return _safeBox!!
    }

private var _safeBox: ImageVector? = null
