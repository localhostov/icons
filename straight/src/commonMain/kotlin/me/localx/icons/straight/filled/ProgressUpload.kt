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

public val Icons.Filled.ProgressUpload: ImageVector
    get() {
        if (_progressUpload != null) {
            return _progressUpload!!
        }
        _progressUpload = Builder(name = "ProgressUpload", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.071f, 7.037f)
                lineToRelative(1.82f, 0.828f)
                curveToRelative(-0.393f, 0.864f, -0.659f, 1.778f, -0.792f, 2.718f)
                lineToRelative(-1.98f, -0.279f)
                curveToRelative(0.16f, -1.129f, 0.48f, -2.229f, 0.952f, -3.267f)
                close()
                moveTo(4.418f, 18.52f)
                lineToRelative(-1.516f, 1.305f)
                curveToRelative(0.744f, 0.864f, 1.605f, 1.618f, 2.562f, 2.24f)
                lineToRelative(1.091f, -1.676f)
                curveToRelative(-0.797f, -0.52f, -1.516f, -1.148f, -2.137f, -1.869f)
                close()
                moveTo(0.119f, 13.696f)
                curveToRelative(0.16f, 1.129f, 0.48f, 2.229f, 0.952f, 3.267f)
                lineToRelative(1.82f, -0.828f)
                curveToRelative(-0.393f, -0.864f, -0.659f, -1.778f, -0.792f, -2.718f)
                lineToRelative(-1.98f, 0.279f)
                close()
                moveTo(2.892f, 4.187f)
                lineToRelative(1.518f, 1.303f)
                curveToRelative(0.622f, -0.725f, 1.344f, -1.356f, 2.146f, -1.879f)
                lineToRelative(-1.092f, -1.676f)
                curveToRelative(-0.96f, 0.626f, -1.825f, 1.383f, -2.571f, 2.252f)
                close()
                moveTo(11.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 8.889f)
                lineToRelative(2.892f, 2.826f)
                lineToRelative(1.397f, -1.43f)
                lineToRelative(-3.718f, -3.634f)
                curveToRelative(-0.84f, -0.84f, -2.312f, -0.832f, -3.134f, -0.008f)
                lineToRelative(-3.726f, 3.642f)
                lineToRelative(1.397f, 1.43f)
                lineToRelative(2.892f, -2.825f)
                verticalLineToRelative(9.111f)
                close()
                moveTo(12.0f, 0.0f)
                curveToRelative(-1.166f, 0.0f, -2.319f, 0.167f, -3.428f, 0.496f)
                lineToRelative(0.569f, 1.918f)
                curveToRelative(0.924f, -0.274f, 1.886f, -0.414f, 2.858f, -0.414f)
                curveToRelative(5.514f, 0.0f, 10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                curveToRelative(-0.973f, 0.0f, -1.934f, -0.14f, -2.858f, -0.414f)
                lineToRelative(-0.569f, 1.918f)
                curveToRelative(1.109f, 0.329f, 2.262f, 0.496f, 3.428f, 0.496f)
                curveToRelative(6.617f, 0.0f, 12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _progressUpload!!
    }

private var _progressUpload: ImageVector? = null
