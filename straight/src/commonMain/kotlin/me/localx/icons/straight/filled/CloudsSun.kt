package me.localx.icons.straight.filled

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
import me.localx.icons.straight.Icons

public val Icons.Filled.CloudsSun: ImageVector
    get() {
        if (_cloudsSun != null) {
            return _cloudsSun!!
        }
        _cloudsSun = Builder(name = "CloudsSun", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.848f, 15.206f)
                curveToRelative(-1.738f, -6.7f, -11.665f, -4.8f, -10.789f, 2.1f)
                arcTo(3.512f, 3.512f, 0.0f, false, false, 7.5f, 24.0f)
                horizontalLineToRelative(8.0f)
                arcTo(4.507f, 4.507f, 0.0f, false, false, 16.848f, 15.206f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.778f, 11.6f)
                curveToRelative(0.008f, -0.028f, 0.015f, -0.056f, 0.022f, -0.084f)
                curveToRelative(0.044f, -0.168f, 0.081f, -0.34f, 0.11f, -0.514f)
                horizontalLineTo(24.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.91f)
                arcToRelative(5.867f, 5.867f, 0.0f, false, false, -0.3f, -1.109f)
                lineToRelative(3.541f, -2.062f)
                lineTo(22.146f, 4.1f)
                lineTo(18.609f, 6.16f)
                arcToRelative(6.109f, 6.109f, 0.0f, false, false, -0.776f, -0.775f)
                lineToRelative(2.053f, -3.529f)
                lineTo(18.157f, 0.851f)
                lineTo(16.1f, 4.386f)
                arcToRelative(5.964f, 5.964f, 0.0f, false, false, -1.1f, -0.3f)
                verticalLineTo(0.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.09f)
                quadToRelative(-0.255f, 0.043f, -0.5f, 0.107f)
                lineToRelative(-0.095f, 0.025f)
                curveToRelative(-0.133f, 0.036f, -0.263f, 0.077f, -0.392f, 0.123f)
                curveToRelative(-0.034f, 0.012f, -0.07f, 0.02f, -0.1f, 0.032f)
                lineTo(9.856f, 0.851f)
                lineTo(8.128f, 1.856f)
                lineToRelative(2.088f, 3.49f)
                reflectiveCurveToRelative(0.076f, 0.134f, 0.143f, 0.247f)
                arcTo(7.432f, 7.432f, 0.0f, false, true, 14.406f, 9.6f)
                arcToRelative(7.434f, 7.434f, 0.0f, false, true, 4.066f, 4.123f)
                curveToRelative(0.02f, 0.048f, 0.032f, 0.071f, 0.025f, 0.066f)
                lineToRelative(3.644f, 2.1f)
                lineToRelative(1.005f, -1.728f)
                lineToRelative(-3.528f, -2.054f)
                curveToRelative(0.013f, -0.036f, 0.022f, -0.073f, 0.034f, -0.108f)
                curveTo(19.7f, 11.866f, 19.741f, 11.733f, 19.778f, 11.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 16.248f)
                arcToRelative(7.486f, 7.486f, 0.0f, false, true, 7.732f, -7.23f)
                curveToRelative(-3.421f, -4.263f, -10.525f, -1.153f, -9.677f, 4.3f)
                arcTo(3.52f, 3.52f, 0.0f, false, false, 2.066f, 19.7f)
                arcTo(5.507f, 5.507f, 0.0f, false, true, 4.0f, 16.248f)
                close()
            }
        }
        .build()
        return _cloudsSun!!
    }

private var _cloudsSun: ImageVector? = null
