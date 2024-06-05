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

public val Icons.Bold.MoneyCheckEdit: ImageVector
    get() {
        if (_moneyCheckEdit != null) {
            return _moneyCheckEdit!!
        }
        _moneyCheckEdit = Builder(name = "MoneyCheckEdit", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 7.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(20.275f, 13.639f)
                lineToRelative(-7.275f, 7.275f)
                verticalLineToRelative(3.086f)
                horizontalLineToRelative(3.086f)
                lineToRelative(7.275f, -7.275f)
                curveToRelative(0.852f, -0.852f, 0.852f, -2.234f, 0.0f, -3.086f)
                reflectiveCurveToRelative(-2.234f, -0.852f, -3.086f, 0.0f)
                close()
                moveTo(14.0f, 14.5f)
                curveToRelative(0.0f, -1.544f, -0.984f, -2.909f, -2.448f, -3.397f)
                lineToRelative(-3.154f, -1.052f)
                curveToRelative(-0.238f, -0.08f, -0.397f, -0.301f, -0.397f, -0.551f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.758f, -1.308f, -3.204f, -3.0f, -3.449f)
                verticalLineToRelative(-1.051f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.051f)
                curveToRelative(-1.692f, 0.245f, -3.0f, 1.691f, -3.0f, 3.449f)
                curveToRelative(0.0f, 1.544f, 0.984f, 2.909f, 2.448f, 3.397f)
                lineToRelative(3.154f, 1.052f)
                curveToRelative(0.238f, 0.08f, 0.397f, 0.301f, 0.397f, 0.551f)
                curveToRelative(0.0f, 0.276f, -0.225f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.758f, 1.308f, 3.204f, 3.0f, 3.449f)
                verticalLineToRelative(1.051f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.051f)
                curveToRelative(1.692f, -0.245f, 3.0f, -1.691f, 3.0f, -3.449f)
                close()
                moveTo(20.5f, 1.0f)
                lineTo(3.5f, 1.0f)
                curveTo(1.57f, 1.0f, 0.0f, 2.57f, 0.0f, 4.5f)
                lineTo(0.0f, 23.0f)
                lineTo(11.0f, 23.0f)
                verticalLineToRelative(-3.0f)
                lineTo(3.0f, 20.0f)
                lineTo(3.0f, 4.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 4.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(6.585f)
                curveToRelative(1.017f, -0.201f, 2.091f, -0.015f, 3.0f, 0.542f)
                lineTo(24.0f, 4.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _moneyCheckEdit!!
    }

private var _moneyCheckEdit: ImageVector? = null
