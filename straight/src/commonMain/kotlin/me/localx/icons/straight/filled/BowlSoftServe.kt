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

public val Icons.Filled.BowlSoftServe: ImageVector
    get() {
        if (_bowlSoftServe != null) {
            return _bowlSoftServe!!
        }
        _bowlSoftServe = Builder(name = "BowlSoftServe", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.094f, 16.0f)
                horizontalLineToRelative(17.801f)
                lineToRelative(-0.398f, 1.014f)
                curveToRelative(-1.633f, 2.725f, -3.929f, 3.006f, -6.409f, 3.006f)
                curveToRelative(-0.321f, 0.0f, -0.762f, -0.005f, -1.088f, -0.01f)
                verticalLineToRelative(1.99f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.99f)
                curveToRelative(-2.848f, 0.042f, -5.652f, 0.081f, -7.497f, -2.996f)
                lineToRelative(-0.41f, -1.014f)
                close()
                moveTo(21.5f, 9.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-3.145f)
                curveToRelative(-0.487f, -1.868f, -2.169f, -3.0f, -3.855f, -3.0f)
                curveToRelative(0.0f, 1.5f, -0.25f, 2.25f, -1.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.5f, 9.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(19.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _bowlSoftServe!!
    }

private var _bowlSoftServe: ImageVector? = null
