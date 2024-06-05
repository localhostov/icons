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

public val Icons.Filled.ClawMarks: ImageVector
    get() {
        if (_clawMarks != null) {
            return _clawMarks!!
        }
        _clawMarks = Builder(name = "ClawMarks", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.931f, 0.116f)
                curveToRelative(6.569f, 4.384f, 16.069f, 12.384f, 22.956f, 22.945f)
                curveToRelative(0.387f, 0.593f, -0.366f, 1.258f, -0.881f, 0.772f)
                curveTo(14.995f, 16.284f, 7.391f, 8.658f, 0.166f, 0.998f)
                curveTo(-0.319f, 0.483f, 0.342f, -0.277f, 0.931f, 0.116f)
                close()
                moveTo(11.17f, 1.062f)
                curveToRelative(3.83f, 4.438f, 7.33f, 7.938f, 11.767f, 11.77f)
                curveToRelative(0.555f, 0.479f, 1.355f, -0.192f, 0.957f, -0.808f)
                curveTo(19.841f, 5.753f, 15.033f, 2.029f, 11.959f, 0.102f)
                curveToRelative(-0.618f, -0.387f, -1.266f, 0.408f, -0.789f, 0.96f)
                close()
                moveTo(0.156f, 9.931f)
                curveToRelative(4.434f, 4.793f, 9.078f, 9.426f, 13.911f, 13.913f)
                curveToRelative(0.488f, 0.453f, 1.225f, -0.164f, 0.878f, -0.732f)
                curveTo(10.341f, 15.576f, 5.0f, 11.5f, 0.872f, 9.046f)
                curveToRelative(-0.566f, -0.336f, -1.163f, 0.402f, -0.715f, 0.885f)
                close()
            }
        }
        .build()
        return _clawMarks!!
    }

private var _clawMarks: ImageVector? = null
