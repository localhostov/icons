package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.PlaneDeparture: ImageVector
    get() {
        if (_planeDeparture != null) {
            return _planeDeparture!!
        }
        _planeDeparture = Builder(name = "PlaneDeparture", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.354f, 12.134f)
                lineToRelative(5.311f, 3.532f)
                curveToRelative(0.582f, 0.388f, 1.261f, 0.583f, 1.941f, 0.583f)
                curveToRelative(0.611f, 0.0f, 1.223f, -0.157f, 1.766f, -0.475f)
                lineToRelative(11.44f, -6.693f)
                curveToRelative(2.0f, -1.073f, 2.782f, -3.51f, 1.782f, -5.546f)
                curveToRelative(-0.502f, -1.023f, -1.375f, -1.782f, -2.458f, -2.138f)
                curveToRelative(-1.083f, -0.355f, -2.235f, -0.263f, -3.247f, 0.266f)
                curveToRelative(-0.018f, 0.009f, -0.036f, 0.019f, -0.054f, 0.029f)
                lineToRelative(-4.766f, 2.735f)
                lineTo(8.485f, 0.61f)
                curveTo(7.774f, 0.004f, 6.789f, -0.165f, 5.916f, 0.169f)
                lineToRelative(-1.043f, 0.557f)
                curveToRelative(-1.349f, 0.72f, -1.625f, 2.536f, -0.551f, 3.624f)
                lineToRelative(3.209f, 3.255f)
                lineToRelative(-0.751f, 0.431f)
                lineToRelative(-2.781f, -1.021f)
                curveToRelative(-0.726f, -0.265f, -1.515f, -0.233f, -2.22f, 0.091f)
                curveToRelative(-0.951f, 0.44f, -1.575f, 1.326f, -1.671f, 2.369f)
                curveToRelative(-0.096f, 1.042f, 0.356f, 2.026f, 1.248f, 2.659f)
                close()
                moveTo(6.401f, 11.094f)
                curveToRelative(0.417f, 0.153f, 0.878f, 0.114f, 1.264f, -0.107f)
                lineToRelative(11.631f, -6.674f)
                curveToRelative(0.283f, -0.141f, 0.603f, -0.162f, 0.903f, -0.064f)
                curveToRelative(0.309f, 0.102f, 0.557f, 0.317f, 0.701f, 0.609f)
                curveToRelative(0.285f, 0.58f, 0.062f, 1.274f, -0.556f, 1.607f)
                lineToRelative(-11.488f, 6.72f)
                curveToRelative(-0.166f, 0.097f, -0.368f, 0.093f, -0.53f, -0.016f)
                lineToRelative(-4.594f, -3.056f)
                lineToRelative(2.668f, 0.98f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.505f, 21.0f)
                horizontalLineTo(1.505f)
                curveTo(0.677f, 21.0f, 0.005f, 21.672f, 0.005f, 22.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineTo(22.505f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _planeDeparture!!
    }

private var _planeDeparture: ImageVector? = null
