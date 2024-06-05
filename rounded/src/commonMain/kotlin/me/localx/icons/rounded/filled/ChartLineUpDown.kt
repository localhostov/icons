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

public val Icons.Filled.ChartLineUpDown: ImageVector
    get() {
        if (_chartLineUpDown != null) {
            return _chartLineUpDown!!
        }
        _chartLineUpDown = Builder(name = "ChartLineUpDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(0.0f, 1.0f)
                curveTo(0.0f, 0.447f, 0.447f, 0.0f, 1.0f, 0.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(20.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(20.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(22.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.563f)
                lineToRelative(-4.856f, 4.707f)
                curveToRelative(-0.391f, 0.391f, -1.023f, 0.391f, -1.414f, 0.0f)
                curveToRelative(-0.04f, -0.04f, -0.084f, -0.077f, -0.13f, -0.109f)
                lineToRelative(-1.109f, -0.784f)
                curveToRelative(-1.175f, -1.104f, -3.028f, -1.081f, -4.161f, 0.052f)
                lineToRelative(-4.586f, 4.414f)
                curveToRelative(-0.398f, 0.383f, -0.41f, 1.017f, -0.027f, 1.414f)
                curveToRelative(0.196f, 0.204f, 0.458f, 0.307f, 0.721f, 0.307f)
                curveToRelative(0.25f, 0.0f, 0.5f, -0.093f, 0.693f, -0.279f)
                lineToRelative(4.6f, -4.428f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                curveToRelative(0.04f, 0.04f, 0.084f, 0.077f, 0.13f, 0.109f)
                lineToRelative(1.109f, 0.784f)
                curveToRelative(1.14f, 1.072f, 3.075f, 1.035f, 4.164f, -0.055f)
                lineToRelative(4.89f, -4.739f)
                verticalLineToRelative(2.607f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(23.0f, 12.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(2.615f)
                lineToRelative(-3.47f, -3.326f)
                curveToRelative(-0.399f, -0.382f, -1.031f, -0.368f, -1.414f, 0.029f)
                curveToRelative(-0.383f, 0.399f, -0.369f, 1.032f, 0.029f, 1.414f)
                lineToRelative(3.409f, 3.269f)
                horizontalLineToRelative(-2.555f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _chartLineUpDown!!
    }

private var _chartLineUpDown: ImageVector? = null
