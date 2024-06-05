package me.localx.icons.straight.outline

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

public val Icons.Outline.PenSwirl: ImageVector
    get() {
        if (_penSwirl != null) {
            return _penSwirl!!
        }
        _penSwirl = Builder(name = "PenSwirl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                curveToRelative(0.0f, 4.307f, -3.503f, 7.81f, -7.81f, 7.81f)
                reflectiveCurveToRelative(-7.81f, -3.503f, -7.81f, -7.81f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 3.203f, 2.606f, 5.81f, 5.81f, 5.81f)
                reflectiveCurveToRelative(5.81f, -2.606f, 5.81f, -5.81f)
                curveToRelative(0.0f, -0.893f, -0.129f, -1.755f, -0.35f, -2.58f)
                lineToRelative(1.588f, -1.588f)
                curveToRelative(0.484f, 1.3f, 0.762f, 2.701f, 0.762f, 4.168f)
                close()
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.486f, 6.486f, 2.0f, 12.0f, 2.0f)
                curveToRelative(0.893f, 0.0f, 1.755f, 0.129f, 2.58f, 0.35f)
                lineToRelative(1.588f, -1.588f)
                curveToRelative(-1.301f, -0.484f, -2.701f, -0.762f, -4.168f, -0.762f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                curveToRelative(0.0f, 4.96f, 2.669f, 9.288f, 7.324f, 11.874f)
                lineToRelative(0.972f, -1.748f)
                curveToRelative(-4.001f, -2.223f, -6.295f, -5.913f, -6.295f, -10.126f)
                close()
                moveTo(12.0f, 7.758f)
                lineTo(18.879f, 0.879f)
                curveToRelative(1.133f, -1.133f, 3.109f, -1.133f, 4.243f, 0.0f)
                curveToRelative(1.169f, 1.17f, 1.169f, 3.072f, 0.0f, 4.242f)
                lineToRelative(-6.878f, 6.879f)
                horizontalLineToRelative(-4.243f)
                verticalLineToRelative(-4.242f)
                close()
                moveTo(14.0f, 10.0f)
                horizontalLineToRelative(1.415f)
                lineToRelative(6.292f, -6.293f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0.0f, -1.414f)
                curveToRelative(-0.378f, -0.379f, -1.037f, -0.379f, -1.414f, 0.0f)
                lineToRelative(-6.293f, 6.293f)
                verticalLineToRelative(1.414f)
                close()
            }
        }
        .build()
        return _penSwirl!!
    }

private var _penSwirl: ImageVector? = null
