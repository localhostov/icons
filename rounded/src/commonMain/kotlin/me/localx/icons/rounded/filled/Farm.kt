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

public val Icons.Filled.Farm: ImageVector
    get() {
        if (_farm != null) {
            return _farm!!
        }
        _farm = Builder(name = "Farm", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.579f, 15.0f)
                horizontalLineToRelative(6.842f)
                lineToRelative(-3.421f, 2.799f)
                lineToRelative(-3.421f, -2.799f)
                close()
                moveTo(16.421f, 24.0f)
                lineToRelative(-4.421f, -3.617f)
                lineToRelative(-4.421f, 3.617f)
                horizontalLineToRelative(8.842f)
                close()
                moveTo(13.579f, 19.091f)
                lineToRelative(3.421f, 2.799f)
                verticalLineToRelative(-5.598f)
                lineToRelative(-3.421f, 2.799f)
                close()
                moveTo(24.0f, 10.645f)
                verticalLineToRelative(8.355f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(8.0f, 13.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(0.0f, 10.645f)
                curveToRelative(0.0f, -0.792f, 0.232f, -1.56f, 0.672f, -2.219f)
                lineTo(3.673f, 3.923f)
                curveToRelative(0.432f, -0.647f, 1.038f, -1.151f, 1.752f, -1.458f)
                lineTo(10.424f, 0.324f)
                curveToRelative(1.001f, -0.43f, 2.15f, -0.43f, 3.152f, 0.0f)
                lineToRelative(4.998f, 2.142f)
                curveToRelative(0.715f, 0.307f, 1.321f, 0.811f, 1.752f, 1.458f)
                lineToRelative(3.001f, 4.502f)
                curveToRelative(0.439f, 0.659f, 0.672f, 1.426f, 0.672f, 2.219f)
                close()
                moveTo(15.0f, 7.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.449f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.449f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.449f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(7.0f, 16.292f)
                verticalLineToRelative(5.598f)
                lineToRelative(3.421f, -2.799f)
                lineToRelative(-3.421f, -2.799f)
                close()
            }
        }
        .build()
        return _farm!!
    }

private var _farm: ImageVector? = null
