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

public val Icons.Filled.PiggyBankBudget: ImageVector
    get() {
        if (_piggyBankBudget != null) {
            return _piggyBankBudget!!
        }
        _piggyBankBudget = Builder(name = "PiggyBankBudget", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 4.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                lineTo(8.0f, 1.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                close()
                moveTo(24.0f, 13.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-0.592f)
                curveToRelative(-0.806f, 1.98f, -2.386f, 3.606f, -4.438f, 4.427f)
                curveToRelative(-0.208f, 1.453f, -1.46f, 2.573f, -2.97f, 2.573f)
                curveToRelative(-1.304f, 0.0f, -2.416f, -0.836f, -2.829f, -2.0f)
                horizontalLineToRelative(-2.343f)
                curveToRelative(-0.413f, 1.164f, -1.525f, 2.0f, -2.829f, 2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-0.079f)
                curveTo(1.366f, 19.403f, -0.182f, 16.545f, 0.017f, 13.47f)
                curveToRelative(0.081f, -1.252f, 0.462f, -2.423f, 1.072f, -3.45f)
                curveTo(0.501f, 9.222f, 0.138f, 8.249f, 0.007f, 7.115f)
                curveToRelative(-0.063f, -0.549f, 0.33f, -1.045f, 0.878f, -1.108f)
                curveToRelative(0.553f, -0.067f, 1.046f, 0.33f, 1.108f, 0.878f)
                curveToRelative(0.064f, 0.553f, 0.204f, 1.044f, 0.416f, 1.469f)
                curveToRelative(0.984f, -0.954f, 2.218f, -1.661f, 3.591f, -2.04f)
                verticalLineToRelative(0.687f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.342f, -1.397f, 1.375f, -2.588f, 2.702f, -2.965f)
                curveToRelative(0.589f, -0.168f, 1.176f, 0.291f, 1.176f, 0.904f)
                verticalLineToRelative(2.909f)
                curveToRelative(2.124f, 1.022f, 3.763f, 2.887f, 4.365f, 5.153f)
                horizontalLineToRelative(0.257f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(19.0f, 12.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _piggyBankBudget!!
    }

private var _piggyBankBudget: ImageVector? = null
