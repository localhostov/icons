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

public val Icons.Bold.BowlScoop: ImageVector
    get() {
        if (_bowlScoop != null) {
            return _bowlScoop!!
        }
        _bowlScoop = Builder(name = "BowlScoop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.137f, 9.266f)
                curveTo(1.987f, 3.896f, 6.557f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(10.013f, 3.896f, 10.863f, 9.266f)
                curveToRelative(0.13f, 0.817f, -0.429f, 1.586f, -1.247f, 1.716f)
                curveToRelative(-0.079f, 0.013f, -0.158f, 0.019f, -0.236f, 0.019f)
                curveToRelative(-0.725f, 0.0f, -1.362f, -0.526f, -1.479f, -1.266f)
                curveToRelative(-0.619f, -3.902f, -3.941f, -6.734f, -7.9f, -6.734f)
                reflectiveCurveToRelative(-7.281f, 2.832f, -7.9f, 6.734f)
                curveToRelative(-0.13f, 0.818f, -0.901f, 1.376f, -1.716f, 1.247f)
                curveToRelative(-0.818f, -0.13f, -1.377f, -0.898f, -1.247f, -1.716f)
                close()
                moveTo(22.795f, 13.0f)
                lineTo(1.205f, 13.0f)
                curveToRelative(-0.847f, 0.0f, -1.429f, 0.851f, -1.122f, 1.641f)
                lineToRelative(0.723f, 1.859f)
                curveToRelative(1.488f, 2.483f, 4.025f, 2.535f, 6.842f, 2.5f)
                horizontalLineToRelative(2.851f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.851f)
                curveToRelative(2.817f, 0.035f, 5.354f, -0.017f, 6.842f, -2.5f)
                lineToRelative(0.723f, -1.859f)
                curveToRelative(0.307f, -0.789f, -0.275f, -1.641f, -1.122f, -1.641f)
                close()
            }
        }
        .build()
        return _bowlScoop!!
    }

private var _bowlScoop: ImageVector? = null
