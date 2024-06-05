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

public val Icons.Filled.Procedures: ImageVector
    get() {
        if (_procedures != null) {
            return _procedures!!
        }
        _procedures = Builder(name = "Procedures", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.031f)
                lineToRelative(-3.257f, 3.908f)
                lineToRelative(-2.416f, -5.799f)
                lineToRelative(-1.261f, 1.891f)
                horizontalLineToRelative(-7.035f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.965f)
                lineTo(14.704f, -0.109f)
                lineToRelative(2.584f, 6.201f)
                lineToRelative(1.743f, -2.092f)
                horizontalLineToRelative(4.969f)
                close()
                moveTo(5.5f, 14.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(2.0f, 4.0f)
                lineTo(0.0f, 4.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                lineTo(2.0f, 16.0f)
                lineTo(2.0f, 4.0f)
                close()
                moveTo(21.0f, 8.0f)
                horizontalLineToRelative(-0.095f)
                lineToRelative(-3.334f, 4.0f)
                horizontalLineToRelative(-2.155f)
                lineToRelative(-1.667f, -4.0f)
                horizontalLineToRelative(-1.75f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _procedures!!
    }

private var _procedures: ImageVector? = null
