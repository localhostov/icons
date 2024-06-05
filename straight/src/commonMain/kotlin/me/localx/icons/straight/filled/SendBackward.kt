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

public val Icons.Filled.SendBackward: ImageVector
    get() {
        if (_sendBackward != null) {
            return _sendBackward!!
        }
        _sendBackward = Builder(name = "SendBackward", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 11.0f)
                verticalLineToRelative(13.0f)
                lineTo(8.0f, 24.0f)
                verticalLineToRelative(-13.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(16.0f, 6.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.343f, 0.0f, 0.0f, 1.343f, 0.0f, 3.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.209f, 1.791f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _sendBackward!!
    }

private var _sendBackward: ImageVector? = null
