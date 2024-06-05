package me.localx.icons.straight.bold

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

public val Icons.Bold.FaceDisappointed: ImageVector
    get() {
        if (_faceDisappointed != null) {
            return _faceDisappointed!!
        }
        _faceDisappointed = Builder(name = "FaceDisappointed", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.037f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.037f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(2.094f, 0.0f, 3.718f, 1.164f, 3.896f, 1.297f)
                lineToRelative(-1.791f, 2.406f)
                reflectiveCurveToRelative(-0.987f, -0.703f, -2.104f, -0.703f)
                reflectiveCurveToRelative(-2.103f, 0.702f, -2.112f, 0.709f)
                lineToRelative(-1.783f, -2.412f)
                curveToRelative(0.178f, -0.133f, 1.802f, -1.297f, 3.896f, -1.297f)
                close()
                moveTo(10.509f, 12.969f)
                lineToRelative(-4.0f, 1.442f)
                lineToRelative(-1.018f, -2.822f)
                lineToRelative(4.0f, -1.442f)
                lineToRelative(1.018f, 2.822f)
                close()
                moveTo(18.509f, 11.589f)
                lineToRelative(-1.018f, 2.822f)
                lineToRelative(-4.0f, -1.442f)
                lineToRelative(1.018f, -2.822f)
                lineToRelative(4.0f, 1.442f)
                close()
            }
        }
        .build()
        return _faceDisappointed!!
    }

private var _faceDisappointed: ImageVector? = null
