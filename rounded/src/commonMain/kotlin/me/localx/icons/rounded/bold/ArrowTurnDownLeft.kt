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

public val Icons.Bold.ArrowTurnDownLeft: ImageVector
    get() {
        if (_arrowTurnDownLeft != null) {
            return _arrowTurnDownLeft!!
        }
        _arrowTurnDownLeft = Builder(name = "ArrowTurnDownLeft", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 3.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
                horizontalLineTo(4.25f)
                lineToRelative(3.33f, 3.46f)
                curveToRelative(0.57f, 0.6f, 0.56f, 1.55f, -0.04f, 2.12f)
                curveToRelative(-0.29f, 0.28f, -0.67f, 0.42f, -1.04f, 0.42f)
                curveToRelative(-0.39f, 0.0f, -0.79f, -0.15f, -1.08f, -0.46f)
                lineTo(1.01f, 16.95f)
                curveToRelative(-1.34f, -1.34f, -1.34f, -3.56f, 0.02f, -4.93f)
                lineTo(5.42f, 7.46f)
                curveToRelative(0.57f, -0.6f, 1.52f, -0.61f, 2.12f, -0.04f)
                curveToRelative(0.6f, 0.58f, 0.62f, 1.52f, 0.04f, 2.12f)
                lineToRelative(-3.33f, 3.46f)
                horizontalLineToRelative(14.25f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineTo(3.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _arrowTurnDownLeft!!
    }

private var _arrowTurnDownLeft: ImageVector? = null
