package me.localx.icons.rounded.outline

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

public val Icons.Outline.Farm: ImageVector
    get() {
        if (_farm != null) {
            return _farm!!
        }
        _farm = Builder(name = "Farm", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.328f, 8.426f)
                lineToRelative(-3.001f, -4.502f)
                curveToRelative(-0.432f, -0.647f, -1.038f, -1.151f, -1.752f, -1.458f)
                lineTo(13.576f, 0.324f)
                curveToRelative(-1.002f, -0.43f, -2.151f, -0.43f, -3.152f, 0.0f)
                lineTo(5.426f, 2.466f)
                curveToRelative(-0.715f, 0.307f, -1.321f, 0.811f, -1.752f, 1.458f)
                lineTo(0.672f, 8.426f)
                curveToRelative(-0.439f, 0.659f, -0.672f, 1.426f, -0.672f, 2.219f)
                verticalLineToRelative(8.355f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 10.645f)
                curveToRelative(0.0f, -0.792f, -0.232f, -1.56f, -0.672f, -2.219f)
                close()
                moveTo(13.579f, 18.091f)
                lineToRelative(3.421f, -2.799f)
                verticalLineToRelative(5.598f)
                lineToRelative(-3.421f, -2.799f)
                close()
                moveTo(15.198f, 22.0f)
                horizontalLineToRelative(-6.397f)
                lineToRelative(3.199f, -2.617f)
                lineToRelative(3.199f, 2.617f)
                close()
                moveTo(11.999f, 16.799f)
                lineToRelative(-3.421f, -2.799f)
                horizontalLineToRelative(6.842f)
                lineToRelative(-3.421f, 2.799f)
                close()
                moveTo(6.999f, 15.292f)
                lineToRelative(3.421f, 2.799f)
                lineToRelative(-3.421f, 2.799f)
                verticalLineToRelative(-5.598f)
                close()
                moveTo(21.999f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(8.0f, 12.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(2.0f, 10.645f)
                curveToRelative(0.0f, -0.396f, 0.116f, -0.78f, 0.336f, -1.109f)
                lineToRelative(3.001f, -4.502f)
                curveToRelative(0.216f, -0.323f, 0.519f, -0.576f, 0.876f, -0.729f)
                lineToRelative(4.999f, -2.142f)
                curveToRelative(0.25f, -0.107f, 0.519f, -0.161f, 0.787f, -0.161f)
                reflectiveCurveToRelative(0.537f, 0.054f, 0.788f, 0.161f)
                lineToRelative(4.999f, 2.142f)
                curveToRelative(0.357f, 0.153f, 0.661f, 0.406f, 0.876f, 0.729f)
                lineToRelative(3.001f, 4.502f)
                curveToRelative(0.22f, 0.33f, 0.336f, 0.713f, 0.336f, 1.109f)
                verticalLineToRelative(8.355f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.449f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _farm!!
    }

private var _farm: ImageVector? = null
