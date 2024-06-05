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

public val Icons.Filled.FaceSmileHalo: ImageVector
    get() {
        if (_faceSmileHalo != null) {
            return _faceSmileHalo!!
        }
        _faceSmileHalo = Builder(name = "FaceSmileHalo", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.604f, 6.388f)
                curveToRelative(-2.111f, 1.078f, -5.623f, 1.612f, -10.604f, 1.612f)
                reflectiveCurveTo(3.507f, 7.465f, 1.396f, 6.388f)
                curveToRelative(-0.889f, 1.675f, -1.396f, 3.584f, -1.396f, 5.612f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                curveToRelative(0.0f, -2.029f, -0.508f, -3.937f, -1.396f, -5.612f)
                close()
                moveTo(8.0f, 10.0f)
                curveToRelative(1.768f, 0.0f, 3.0f, 2.108f, 3.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.054f, -0.68f, -2.0f, -1.0f, -2.0f)
                reflectiveCurveToRelative(-1.0f, 0.946f, -1.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.892f, 1.232f, -4.0f, 3.0f, -4.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-3.107f, 0.0f, -5.563f, -2.162f, -5.666f, -2.254f)
                lineToRelative(1.33f, -1.493f)
                curveToRelative(0.02f, 0.018f, 2.005f, 1.748f, 4.336f, 1.748f)
                reflectiveCurveToRelative(4.316f, -1.73f, 4.336f, -1.748f)
                lineToRelative(1.33f, 1.493f)
                curveToRelative(-0.103f, 0.092f, -2.559f, 2.254f, -5.666f, 2.254f)
                close()
                moveTo(17.0f, 14.0f)
                curveToRelative(0.0f, -1.054f, -0.68f, -2.0f, -1.0f, -2.0f)
                reflectiveCurveToRelative(-1.0f, 0.946f, -1.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.892f, 1.232f, -4.0f, 3.0f, -4.0f)
                reflectiveCurveToRelative(3.0f, 2.108f, 3.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(-2.58f, 0.0f, -11.0f, -0.216f, -11.0f, -3.0f)
                reflectiveCurveTo(9.42f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(11.0f, 0.216f, 11.0f, 3.0f)
                reflectiveCurveToRelative(-8.42f, 3.0f, -11.0f, 3.0f)
                close()
                moveTo(3.502f, 3.0f)
                curveToRelative(1.222f, 0.449f, 4.139f, 1.0f, 8.498f, 1.0f)
                reflectiveCurveToRelative(7.276f, -0.551f, 8.498f, -1.0f)
                curveToRelative(-1.222f, -0.449f, -4.139f, -1.0f, -8.498f, -1.0f)
                reflectiveCurveToRelative(-7.276f, 0.551f, -8.498f, 1.0f)
                close()
            }
        }
        .build()
        return _faceSmileHalo!!
    }

private var _faceSmileHalo: ImageVector? = null
