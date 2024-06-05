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

public val Icons.Outline.MessageImage: ImageVector
    get() {
        if (_messageImage != null) {
            return _messageImage!!
        }
        _messageImage = Builder(name = "MessageImage", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 6.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(-6.853f)
                lineToRelative(-3.846f, 3.18f)
                curveToRelative(-0.362f, 0.322f, -0.825f, 0.485f, -1.292f, 0.485f)
                curveToRelative(-0.476f, 0.0f, -0.956f, -0.169f, -1.338f, -0.509f)
                lineToRelative(-3.748f, -3.156f)
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(2.0f, 3.0f)
                verticalLineToRelative(13.586f)
                lineTo(11.0f, 7.586f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(7.0f, -7.0f)
                verticalLineToRelative(-1.586f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                close()
                moveTo(22.0f, 18.0f)
                lineTo(22.0f, 7.414f)
                lineToRelative(-7.0f, 7.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-7.586f, 7.586f)
                horizontalLineToRelative(4.24f)
                lineToRelative(4.326f, 3.645f)
                lineToRelative(4.449f, -3.645f)
                horizontalLineToRelative(5.571f)
                close()
            }
        }
        .build()
        return _messageImage!!
    }

private var _messageImage: ImageVector? = null
