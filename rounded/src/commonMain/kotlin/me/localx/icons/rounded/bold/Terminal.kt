package me.localx.icons.rounded.bold

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

public val Icons.Bold.Terminal: ImageVector
    get() {
        if (_terminal != null) {
            return _terminal!!
        }
        _terminal = Builder(name = "Terminal", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.97f, 14.47f)
                lineToRelative(-7.44f, 7.11f)
                curveToRelative(-0.29f, 0.28f, -0.66f, 0.42f, -1.04f, 0.42f)
                curveToRelative(-0.4f, 0.0f, -0.79f, -0.16f, -1.08f, -0.46f)
                curveToRelative(-0.57f, -0.6f, -0.55f, -1.55f, 0.05f, -2.12f)
                lineToRelative(7.41f, -7.09f)
                curveToRelative(0.17f, -0.17f, 0.17f, -0.49f, -0.02f, -0.68f)
                lineTo(0.46f, 4.58f)
                curveToRelative(-0.6f, -0.57f, -0.62f, -1.52f, -0.05f, -2.12f)
                curveToRelative(0.57f, -0.6f, 1.52f, -0.62f, 2.12f, -0.05f)
                lineToRelative(7.41f, 7.09f)
                curveToRelative(1.39f, 1.39f, 1.39f, 3.61f, 0.02f, 4.97f)
                close()
                moveTo(22.5f, 19.0f)
                lineTo(11.5f, 19.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _terminal!!
    }

private var _terminal: ImageVector? = null
