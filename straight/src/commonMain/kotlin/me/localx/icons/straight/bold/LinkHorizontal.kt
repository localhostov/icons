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

public val Icons.Bold.LinkHorizontal: ImageVector
    get() {
        if (_linkHorizontal != null) {
            return _linkHorizontal!!
        }
        _linkHorizontal = Builder(name = "LinkHorizontal", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.492f, 12.091f)
                curveToRelative(-0.314f, 0.914f, -0.492f, 1.89f, -0.492f, 2.909f)
                curveToRelative(0.0f, 0.109f, 0.013f, 0.215f, 0.016f, 0.323f)
                curveTo(1.647f, 14.2f, 0.0f, 11.791f, 0.0f, 9.0f)
                curveTo(0.0f, 5.141f, 3.14f, 2.0f, 7.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(3.859f, 0.0f, 7.0f, 3.141f, 7.0f, 7.0f)
                curveToRelative(0.0f, 3.768f, -2.995f, 6.842f, -6.729f, 6.986f)
                curveToRelative(-0.167f, -0.292f, -0.271f, -0.626f, -0.271f, -0.986f)
                curveToRelative(0.0f, -0.907f, 0.324f, -1.555f, 1.548f, -2.312f)
                curveToRelative(1.439f, -0.606f, 2.452f, -2.03f, 2.452f, -3.688f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                lineTo(7.0f, 5.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                curveToRelative(0.0f, 1.252f, 0.589f, 2.357f, 1.492f, 3.091f)
                close()
                moveTo(19.984f, 8.678f)
                curveToRelative(0.004f, 0.108f, 0.016f, 0.214f, 0.016f, 0.323f)
                curveToRelative(0.0f, 1.019f, -0.178f, 1.995f, -0.492f, 2.909f)
                curveToRelative(0.903f, 0.734f, 1.492f, 1.839f, 1.492f, 3.091f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                curveToRelative(0.0f, -1.657f, 1.013f, -3.081f, 2.452f, -3.688f)
                curveToRelative(1.224f, -0.757f, 1.548f, -1.406f, 1.548f, -2.312f)
                curveToRelative(0.0f, -0.36f, -0.103f, -0.694f, -0.271f, -0.986f)
                curveToRelative(-3.734f, 0.144f, -6.729f, 3.218f, -6.729f, 6.986f)
                curveToRelative(0.0f, 3.859f, 3.14f, 7.0f, 7.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(3.859f, 0.0f, 7.0f, -3.141f, 7.0f, -7.0f)
                curveToRelative(0.0f, -2.791f, -1.647f, -5.2f, -4.016f, -6.323f)
                close()
            }
        }
        .build()
        return _linkHorizontal!!
    }

private var _linkHorizontal: ImageVector? = null
