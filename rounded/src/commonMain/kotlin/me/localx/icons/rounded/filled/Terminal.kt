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

public val Icons.Filled.Terminal: ImageVector
    get() {
        if (_terminal != null) {
            return _terminal!!
        }
        _terminal = Builder(name = "Terminal", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.13f, 9.89f)
                curveToRelative(1.16f, 1.16f, 1.16f, 3.06f, 0.0f, 4.23f)
                lineTo(1.72f, 21.7f)
                curveToRelative(-0.2f, 0.2f, -0.46f, 0.3f, -0.72f, 0.3f)
                reflectiveCurveToRelative(-0.5f, -0.09f, -0.7f, -0.29f)
                curveToRelative(-0.4f, -0.39f, -0.4f, -1.02f, -0.02f, -1.41f)
                lineToRelative(7.41f, -7.59f)
                curveToRelative(0.4f, -0.4f, 0.4f, -1.03f, 0.0f, -1.42f)
                lineTo(0.28f, 3.7f)
                curveToRelative(-0.39f, -0.4f, -0.38f, -1.03f, 0.02f, -1.41f)
                reflectiveCurveToRelative(1.03f, -0.38f, 1.41f, 0.02f)
                lineToRelative(7.41f, 7.59f)
                close()
                moveTo(23.0f, 20.0f)
                lineTo(11.0f, 20.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _terminal!!
    }

private var _terminal: ImageVector? = null
