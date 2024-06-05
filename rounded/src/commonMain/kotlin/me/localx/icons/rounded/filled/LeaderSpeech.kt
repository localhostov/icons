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

public val Icons.Filled.LeaderSpeech: ImageVector
    get() {
        if (_leaderSpeech != null) {
            return _leaderSpeech!!
        }
        _leaderSpeech = Builder(name = "LeaderSpeech", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(11.0f, 14.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-6.018f)
                lineToRelative(5.342f, -6.335f)
                curveToRelative(0.366f, -0.433f, 0.299f, -1.083f, -0.146f, -1.433f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.423f, -0.332f, -1.032f, -0.271f, -1.381f, 0.138f)
                lineToRelative(-4.8f, 5.648f)
                horizontalLineToRelative(-5.028f)
                lineTo(7.309f, 0.361f)
                curveToRelative(-0.346f, -0.417f, -0.962f, -0.482f, -1.388f, -0.147f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.442f, 0.347f, -0.511f, 0.991f, -0.153f, 1.424f)
                lineToRelative(5.232f, 6.344f)
                verticalLineToRelative(6.018f)
                close()
                moveTo(23.0f, 18.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                lineTo(1.0f, 18.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.671f)
                curveToRelative(0.0f, -0.796f, 0.316f, -1.559f, 0.879f, -2.121f)
                lineToRelative(0.696f, -0.696f)
                curveToRelative(-0.136f, -0.511f, -0.146f, -1.073f, 0.505f, -1.789f)
                curveToRelative(0.413f, -0.454f, 0.982f, -0.768f, 1.594f, -0.716f)
                curveToRelative(0.966f, 0.083f, 1.736f, 0.853f, 1.819f, 1.819f)
                curveToRelative(0.052f, 0.612f, -0.262f, 1.181f, -0.716f, 1.594f)
                curveToRelative(-0.716f, 0.651f, -1.277f, 0.641f, -1.789f, 0.505f)
                lineToRelative(-0.988f, 0.988f)
                verticalLineToRelative(3.086f)
                horizontalLineToRelative(19.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _leaderSpeech!!
    }

private var _leaderSpeech: ImageVector? = null
