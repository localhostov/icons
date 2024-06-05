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

public val Icons.Bold.BowlScoops: ImageVector
    get() {
        if (_bowlScoops != null) {
            return _bowlScoops!!
        }
        _bowlScoops = Builder(name = "BowlScoops", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 13.0f)
                lineToRelative(-1.361f, 3.5f)
                curveToRelative(-1.488f, 2.483f, -4.025f, 2.55f, -6.842f, 2.515f)
                curveToRelative(-0.287f, -0.004f, -1.354f, -0.008f, -2.296f, -0.011f)
                verticalLineToRelative(1.996f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-1.996f)
                curveToRelative(-0.942f, 0.003f, -2.01f, 0.008f, -2.296f, 0.011f)
                curveToRelative(-2.817f, 0.035f, -5.354f, -0.033f, -6.842f, -2.515f)
                lineToRelative(-1.361f, -3.5f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(3.076f, 11.0f)
                lineTo(0.044f, 11.0f)
                curveToRelative(0.319f, -2.867f, 2.438f, -5.198f, 5.199f, -5.83f)
                curveToRelative(0.807f, -2.975f, 3.53f, -5.17f, 6.757f, -5.17f)
                reflectiveCurveToRelative(5.95f, 2.195f, 6.757f, 5.17f)
                curveToRelative(2.761f, 0.632f, 4.88f, 2.963f, 5.199f, 5.83f)
                horizontalLineToRelative(-3.032f)
                curveToRelative(-0.349f, -1.709f, -1.863f, -3.0f, -3.674f, -3.0f)
                reflectiveCurveToRelative(-3.326f, 1.291f, -3.674f, 3.0f)
                horizontalLineToRelative(-3.152f)
                curveToRelative(-0.349f, -1.709f, -1.863f, -3.0f, -3.674f, -3.0f)
                reflectiveCurveToRelative(-3.326f, 1.291f, -3.674f, 3.0f)
                close()
                moveTo(8.423f, 5.211f)
                curveToRelative(1.429f, 0.367f, 2.676f, 1.191f, 3.577f, 2.306f)
                curveToRelative(0.901f, -1.115f, 2.148f, -1.939f, 3.577f, -2.306f)
                curveToRelative(-0.658f, -1.31f, -2.014f, -2.211f, -3.577f, -2.211f)
                reflectiveCurveToRelative(-2.919f, 0.901f, -3.577f, 2.211f)
                close()
            }
        }
        .build()
        return _bowlScoops!!
    }

private var _bowlScoops: ImageVector? = null
