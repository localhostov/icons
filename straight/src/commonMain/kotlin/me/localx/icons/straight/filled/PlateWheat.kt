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

public val Icons.Filled.PlateWheat: ImageVector
    get() {
        if (_plateWheat != null) {
            return _plateWheat!!
        }
        _plateWheat = Builder(name = "PlateWheat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.532f, 14.151f)
                curveToRelative(0.517f, 0.771f, 0.611f, 1.745f, 0.256f, 2.605f)
                curveToRelative(-1.12f, 2.705f, -4.076f, 5.48f, -7.552f, 7.243f)
                lineTo(7.764f, 23.999f)
                curveToRelative(-3.476f, -1.763f, -6.432f, -4.539f, -7.552f, -7.243f)
                lineTo(0.212f, 16.756f)
                curveToRelative(-0.355f, -0.861f, -0.261f, -1.834f, 0.256f, -2.606f)
                curveToRelative(0.481f, -0.721f, 1.271f, -1.151f, 2.111f, -1.151f)
                horizontalLineToRelative(18.842f)
                curveToRelative(0.84f, 0.0f, 1.63f, 0.43f, 2.111f, 1.151f)
                close()
                moveTo(20.152f, 5.004f)
                lineToRelative(0.008f, -0.005f)
                reflectiveCurveToRelative(-1.182f, -2.921f, -1.982f, -3.722f)
                reflectiveCurveToRelative(-4.177f, -1.278f, -4.177f, -1.278f)
                curveToRelative(0.0f, 0.0f, 0.431f, 3.33f, 1.232f, 4.13f)
                curveToRelative(0.487f, 0.487f, 1.138f, 0.742f, 1.787f, 0.87f)
                lineToRelative(0.006f, 0.004f)
                horizontalLineToRelative(-3.37f)
                reflectiveCurveToRelative(0.005f, -0.004f, 0.005f, -0.004f)
                curveToRelative(0.0f, 0.0f, -1.182f, -2.921f, -1.982f, -3.722f)
                reflectiveCurveTo(7.5f, 0.0f, 7.5f, 0.0f)
                curveToRelative(0.0f, 0.0f, 0.431f, 3.33f, 1.232f, 4.13f)
                curveToRelative(0.487f, 0.487f, 1.138f, 0.742f, 1.787f, 0.87f)
                lineToRelative(0.004f, 0.003f)
                horizontalLineToRelative(-3.253f)
                curveToRelative(-0.864f, -0.648f, -1.99f, -1.37f, -2.712f, -1.37f)
                curveTo(3.249f, 3.633f, 0.0f, 6.002f, 0.0f, 6.002f)
                curveToRelative(0.0f, 0.0f, 3.249f, 2.369f, 4.557f, 2.369f)
                curveToRelative(0.722f, 0.0f, 1.848f, -0.722f, 2.712f, -1.369f)
                horizontalLineToRelative(3.235f)
                curveToRelative(-0.646f, 0.129f, -1.293f, 0.384f, -1.777f, 0.869f)
                curveToRelative(-0.802f, 0.802f, -1.226f, 4.129f, -1.226f, 4.129f)
                curveToRelative(0.0f, 0.0f, 3.328f, -0.425f, 4.129f, -1.226f)
                curveToRelative(0.787f, -0.787f, 1.987f, -3.665f, 2.031f, -3.77f)
                horizontalLineToRelative(3.337f)
                curveToRelative(-0.644f, 0.13f, -1.288f, 0.385f, -1.771f, 0.868f)
                curveToRelative(-0.802f, 0.802f, -1.226f, 4.129f, -1.226f, 4.129f)
                curveToRelative(0.0f, 0.0f, 3.328f, -0.425f, 4.129f, -1.226f)
                curveToRelative(0.784f, -0.784f, 1.979f, -3.646f, 2.03f, -3.769f)
                horizontalLineToRelative(3.841f)
                reflectiveCurveToRelative(0.0f, -1.999f, 0.0f, -1.999f)
                horizontalLineToRelative(-3.848f)
                close()
            }
        }
        .build()
        return _plateWheat!!
    }

private var _plateWheat: ImageVector? = null
