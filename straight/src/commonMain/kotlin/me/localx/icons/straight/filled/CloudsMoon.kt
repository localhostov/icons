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

public val Icons.Filled.CloudsMoon: ImageVector
    get() {
        if (_cloudsMoon != null) {
            return _cloudsMoon!!
        }
        _cloudsMoon = Builder(name = "CloudsMoon", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 24.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(3.512f, 3.512f, 0.0f, false, true, -1.441f, -6.693f)
                curveToRelative(-0.876f, -6.909f, 9.054f, -8.8f, 10.789f, -2.1f)
                arcTo(4.507f, 4.507f, 0.0f, false, true, 15.5f, 24.0f)
                close()
                moveTo(2.065f, 19.7f)
                arcTo(5.505f, 5.505f, 0.0f, false, true, 4.0f, 16.248f)
                arcToRelative(7.485f, 7.485f, 0.0f, false, true, 7.747f, -7.229f)
                lineTo(11.743f, 9.0f)
                curveTo(8.313f, 4.763f, 1.21f, 7.864f, 2.059f, 13.319f)
                arcToRelative(3.525f, 3.525f, 0.0f, false, false, 0.0f, 6.381f)
                close()
                moveTo(22.232f, 9.064f)
                arcToRelative(5.06f, 5.06f, 0.0f, false, true, -5.023f, -2.243f)
                horizontalLineToRelative(0.0f)
                arcToRelative(5.462f, 5.462f, 0.0f, false, true, -0.017f, -5.33f)
                lineTo(18.028f, 0.0f)
                horizontalLineTo(16.319f)
                arcToRelative(6.625f, 6.625f, 0.0f, false, false, -3.574f, 1.039f)
                arcTo(7.34f, 7.34f, 0.0f, false, false, 9.464f, 5.281f)
                horizontalLineToRelative(0.0f)
                arcToRelative(7.46f, 7.46f, 0.0f, false, true, 3.82f, 2.448f)
                lineToRelative(0.219f, 0.322f)
                lineToRelative(0.937f, 1.562f)
                arcToRelative(7.435f, 7.435f, 0.0f, false, true, 4.032f, 4.109f)
                arcToRelative(6.393f, 6.393f, 0.0f, false, true, 0.83f, 0.521f)
                horizontalLineToRelative(0.0f)
                arcToRelative(7.229f, 7.229f, 0.0f, false, false, 3.956f, -3.768f)
                lineTo(24.0f, 8.857f)
                close()
            }
        }
        .build()
        return _cloudsMoon!!
    }

private var _cloudsMoon: ImageVector? = null
