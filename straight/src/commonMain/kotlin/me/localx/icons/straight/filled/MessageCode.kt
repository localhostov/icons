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

public val Icons.Filled.MessageCode: ImageVector
    get() {
        if (_messageCode != null) {
            return _messageCode!!
        }
        _messageCode = Builder(name = "MessageCode", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                lineTo(0.0f, 20.0f)
                lineTo(6.923f, 20.0f)
                lineToRelative(3.748f, 3.156f)
                curveToRelative(0.382f, 0.34f, 0.862f, 0.509f, 1.338f, 0.509f)
                curveToRelative(0.467f, 0.0f, 0.931f, -0.163f, 1.292f, -0.485f)
                lineToRelative(3.847f, -3.18f)
                horizontalLineToRelative(6.852f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(10.294f, 13.293f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.298f, -3.299f)
                curveToRelative(-0.375f, -0.375f, -0.583f, -0.874f, -0.583f, -1.405f)
                reflectiveCurveToRelative(0.207f, -1.031f, 0.583f, -1.407f)
                lineToRelative(3.298f, -3.298f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.298f, 3.299f)
                lineToRelative(3.298f, 3.282f)
                close()
                moveTo(18.417f, 11.409f)
                lineToRelative(-3.298f, 3.298f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.298f, -3.299f)
                lineToRelative(-3.298f, -3.282f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(3.298f, 3.299f)
                curveToRelative(0.375f, 0.375f, 0.583f, 0.874f, 0.583f, 1.406f)
                reflectiveCurveToRelative(-0.207f, 1.03f, -0.583f, 1.406f)
                close()
            }
        }
        .build()
        return _messageCode!!
    }

private var _messageCode: ImageVector? = null
