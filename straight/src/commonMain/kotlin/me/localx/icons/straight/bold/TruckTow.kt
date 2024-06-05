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

public val Icons.Bold.TruckTow: ImageVector
    get() {
        if (_truckTow != null) {
            return _truckTow!!
        }
        _truckTow = Builder(name = "TruckTow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 11.5f)
                curveToRelative(0.0f, -3.033f, -2.467f, -5.5f, -5.5f, -5.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(5.715f)
                lineTo(4.726f, 0.0f)
                horizontalLineToRelative(-2.726f)
                verticalLineToRelative(7.0f)
                lineTo(0.0f, 7.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-1.82f)
                lineToRelative(5.399f, 6.82f)
                lineTo(3.5f, 12.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(3.052f)
                curveToRelative(-0.034f, 0.161f, -0.052f, 0.328f, -0.052f, 0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, -0.018f, -0.339f, -0.052f, -0.5f)
                horizontalLineToRelative(8.104f)
                curveToRelative(-0.034f, 0.161f, -0.052f, 0.328f, -0.052f, 0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, -0.018f, -0.339f, -0.052f, -0.5f)
                horizontalLineToRelative(3.052f)
                verticalLineToRelative(-9.5f)
                close()
                moveTo(18.5f, 9.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(14.0f, 18.0f)
                lineTo(3.0f, 18.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _truckTow!!
    }

private var _truckTow: ImageVector? = null
