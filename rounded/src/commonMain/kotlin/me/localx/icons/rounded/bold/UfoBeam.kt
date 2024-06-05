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

public val Icons.Bold.UfoBeam: ImageVector
    get() {
        if (_ufoBeam != null) {
            return _ufoBeam!!
        }
        _ufoBeam = Builder(name = "UfoBeam", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.823f, 4.552f)
                curveToRelative(-0.65f, -2.611f, -3.014f, -4.552f, -5.823f, -4.552f)
                reflectiveCurveToRelative(-5.173f, 1.941f, -5.823f, 4.552f)
                curveTo(2.182f, 5.366f, 0.0f, 6.927f, 0.0f, 9.0f)
                curveToRelative(0.0f, 3.454f, 6.027f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveToRelative(12.0f, -1.546f, 12.0f, -5.0f)
                curveToRelative(0.0f, -2.073f, -2.182f, -3.634f, -6.177f, -4.448f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(1.441f, 0.0f, 2.648f, 1.021f, 2.935f, 2.379f)
                curveToRelative(-0.443f, 0.263f, -1.339f, 0.621f, -2.935f, 0.621f)
                curveToRelative(-1.612f, 0.0f, -2.511f, -0.365f, -2.937f, -0.613f)
                curveToRelative(0.284f, -1.36f, 1.493f, -2.387f, 2.937f, -2.387f)
                close()
                moveTo(12.0f, 11.0f)
                curveToRelative(-5.381f, 0.0f, -8.434f, -1.354f, -8.955f, -1.999f)
                curveToRelative(0.294f, -0.353f, 1.469f, -1.048f, 3.802f, -1.523f)
                curveToRelative(0.763f, 0.653f, 2.312f, 1.522f, 5.153f, 1.522f)
                reflectiveCurveToRelative(4.389f, -0.868f, 5.153f, -1.522f)
                curveToRelative(2.334f, 0.475f, 3.508f, 1.169f, 3.802f, 1.523f)
                curveToRelative(-0.521f, 0.645f, -3.574f, 1.999f, -8.955f, 1.999f)
                close()
                moveTo(7.385f, 17.077f)
                lineToRelative(-2.5f, 6.0f)
                curveToRelative(-0.24f, 0.576f, -0.798f, 0.923f, -1.385f, 0.923f)
                curveToRelative(-0.192f, 0.0f, -0.388f, -0.037f, -0.577f, -0.115f)
                curveToRelative(-0.765f, -0.318f, -1.126f, -1.197f, -0.808f, -1.962f)
                lineToRelative(2.5f, -6.0f)
                curveToRelative(0.319f, -0.766f, 1.195f, -1.126f, 1.962f, -0.808f)
                curveToRelative(0.765f, 0.318f, 1.126f, 1.197f, 0.808f, 1.962f)
                close()
                moveTo(21.885f, 21.923f)
                curveToRelative(0.318f, 0.765f, -0.043f, 1.644f, -0.808f, 1.962f)
                curveToRelative(-0.189f, 0.078f, -0.384f, 0.115f, -0.577f, 0.115f)
                curveToRelative(-0.587f, 0.0f, -1.145f, -0.347f, -1.385f, -0.923f)
                lineToRelative(-2.5f, -6.0f)
                curveToRelative(-0.318f, -0.765f, 0.043f, -1.644f, 0.808f, -1.962f)
                curveToRelative(0.765f, -0.318f, 1.643f, 0.042f, 1.962f, 0.808f)
                lineToRelative(2.5f, 6.0f)
                close()
            }
        }
        .build()
        return _ufoBeam!!
    }

private var _ufoBeam: ImageVector? = null
