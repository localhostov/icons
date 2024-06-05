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

public val Icons.Bold.TruckFlatbed: ImageVector
    get() {
        if (_truckFlatbed != null) {
            return _truckFlatbed!!
        }
        _truckFlatbed = Builder(name = "TruckFlatbed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 11.0f)
                horizontalLineToRelative(-0.782f)
                lineToRelative(-1.839f, -5.607f)
                curveToRelative(-0.478f, -1.432f, -1.812f, -2.393f, -3.32f, -2.393f)
                horizontalLineToRelative(-5.059f)
                verticalLineToRelative(12.0f)
                lineTo(0.0f, 15.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.052f)
                curveToRelative(-0.034f, 0.161f, -0.052f, 0.328f, -0.052f, 0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, -0.018f, -0.339f, -0.052f, -0.5f)
                horizontalLineToRelative(9.104f)
                curveToRelative(-0.034f, 0.161f, -0.052f, 0.328f, -0.052f, 0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, -0.018f, -0.339f, -0.052f, -0.5f)
                horizontalLineToRelative(3.052f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(16.059f, 6.0f)
                curveToRelative(0.216f, 0.0f, 0.406f, 0.138f, 0.475f, 0.342f)
                lineToRelative(1.552f, 4.658f)
                horizontalLineToRelative(-4.085f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.059f)
                close()
            }
        }
        .build()
        return _truckFlatbed!!
    }

private var _truckFlatbed: ImageVector? = null
