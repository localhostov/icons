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

public val Icons.Bold.BusinessTime: ImageVector
    get() {
        if (_businessTime != null) {
            return _businessTime!!
        }
        _businessTime = Builder(name = "BusinessTime", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 11.0f)
                curveToRelative(-3.59f, 0.0f, -6.5f, 2.91f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.91f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.91f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.91f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(18.783f, 20.904f)
                lineToRelative(-2.783f, -2.783f)
                verticalLineToRelative(-4.121f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.879f)
                lineToRelative(1.904f, 1.904f)
                lineToRelative(-2.121f, 2.121f)
                close()
                moveTo(24.0f, 6.0f)
                verticalLineToRelative(6.028f)
                curveToRelative(-0.813f, -0.964f, -1.837f, -1.741f, -3.0f, -2.268f)
                verticalLineToRelative(-3.76f)
                lineTo(3.0f, 6.0f)
                verticalLineToRelative(5.0f)
                lineTo(12.028f, 11.0f)
                curveToRelative(-0.964f, 0.813f, -1.741f, 1.837f, -2.268f, 3.0f)
                lineTo(3.0f, 14.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(6.76f)
                curveToRelative(0.527f, 1.163f, 1.304f, 2.187f, 2.268f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 6.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _businessTime!!
    }

private var _businessTime: ImageVector? = null
