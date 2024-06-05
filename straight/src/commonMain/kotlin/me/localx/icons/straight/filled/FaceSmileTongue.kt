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

public val Icons.Filled.FaceSmileTongue: ImageVector
    get() {
        if (_faceSmileTongue != null) {
            return _faceSmileTongue!!
        }
        _faceSmileTongue = Builder(name = "FaceSmileTongue", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.972f, 16.886f)
                curveToRelative(0.342f, 0.567f, 0.373f, 1.411f, -0.131f, 1.716f)
                curveToRelative(-0.215f, 0.129f, -0.469f, 0.141f, -0.754f, 0.03f)
                curveToRelative(-0.323f, -0.124f, -0.632f, -0.39f, -0.826f, -0.711f)
                lineToRelative(-0.32f, -0.53f)
                curveToRelative(0.709f, -0.288f, 1.314f, -0.634f, 1.772f, -0.934f)
                lineToRelative(0.259f, 0.429f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.054f, 0.679f, -2.0f, 1.0f, -2.0f)
                reflectiveCurveToRelative(1.0f, 0.946f, 1.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.892f, -1.232f, -4.0f, -3.0f, -4.0f)
                reflectiveCurveToRelative(-3.0f, 2.108f, -3.0f, 4.0f)
                close()
                moveTo(5.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.054f, 0.679f, -2.0f, 1.0f, -2.0f)
                reflectiveCurveToRelative(1.0f, 0.946f, 1.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.892f, -1.232f, -4.0f, -3.0f, -4.0f)
                reflectiveCurveToRelative(-3.0f, 2.108f, -3.0f, 4.0f)
                close()
                moveTo(18.684f, 15.852f)
                lineToRelative(-1.45f, -2.393f)
                lineToRelative(-0.898f, 0.793f)
                curveToRelative(-0.02f, 0.018f, -2.005f, 1.748f, -4.336f, 1.748f)
                reflectiveCurveToRelative(-4.316f, -1.73f, -4.336f, -1.748f)
                lineToRelative(-1.33f, 1.493f)
                curveToRelative(0.103f, 0.092f, 2.559f, 2.254f, 5.666f, 2.254f)
                curveToRelative(0.318f, 0.0f, 0.629f, -0.022f, 0.932f, -0.063f)
                lineToRelative(0.616f, 1.019f)
                curveToRelative(0.604f, 1.0f, 1.743f, 1.753f, 2.922f, 1.753f)
                curveToRelative(0.472f, 0.0f, 0.951f, -0.121f, 1.404f, -0.395f)
                curveToRelative(1.585f, -0.958f, 1.654f, -3.062f, 0.809f, -4.461f)
                close()
            }
        }
        .build()
        return _faceSmileTongue!!
    }

private var _faceSmileTongue: ImageVector? = null
