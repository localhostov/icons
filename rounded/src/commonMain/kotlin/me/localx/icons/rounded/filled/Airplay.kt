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

public val Icons.Filled.Airplay: ImageVector
    get() {
        if (_airplay != null) {
            return _airplay!!
        }
        _airplay = Builder(name = "Airplay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.607f, 23.0f)
                lineTo(5.393f, 23.0f)
                curveToRelative(-0.729f, 0.0f, -1.375f, -0.409f, -1.687f, -1.067f)
                reflectiveCurveToRelative(-0.219f, -1.418f, 0.243f, -1.981f)
                lineToRelative(5.55f, -6.775f)
                curveToRelative(0.625f, -0.749f, 1.535f, -1.176f, 2.502f, -1.176f)
                reflectiveCurveToRelative(1.877f, 0.427f, 2.497f, 1.169f)
                lineToRelative(5.555f, 6.781f)
                curveToRelative(0.462f, 0.565f, 0.555f, 1.325f, 0.242f, 1.983f)
                curveToRelative(-0.312f, 0.657f, -0.958f, 1.066f, -1.687f, 1.066f)
                close()
                moveTo(19.0f, 1.0f)
                lineTo(5.0f, 1.0f)
                curveTo(2.239f, 1.0f, 0.0f, 3.239f, 0.0f, 6.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.901f, 1.079f, 3.539f, 2.646f, 4.384f)
                lineToRelative(5.304f, -6.476f)
                curveToRelative(1.015f, -1.218f, 2.487f, -1.908f, 4.049f, -1.908f)
                reflectiveCurveToRelative(3.03f, 0.688f, 4.032f, 1.887f)
                lineToRelative(5.322f, 6.497f)
                curveToRelative(1.567f, -0.845f, 2.646f, -2.482f, 2.646f, -4.384f)
                lineTo(23.999f, 6.0f)
                curveToRelative(0.0f, -2.761f, -2.239f, -5.0f, -5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _airplay!!
    }

private var _airplay: ImageVector? = null
