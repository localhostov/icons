package me.localx.icons.rounded.outline

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

public val Icons.Outline.ArrowTurnDownLeft: ImageVector
    get() {
        if (_arrowTurnDownLeft != null) {
            return _arrowTurnDownLeft!!
        }
        _arrowTurnDownLeft = Builder(name = "ArrowTurnDownLeft", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineTo(11.0f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                horizontalLineTo(2.58f)
                lineToRelative(5.14f, -5.3f)
                curveToRelative(0.38f, -0.4f, 0.37f, -1.03f, -0.02f, -1.41f)
                curveToRelative(-0.4f, -0.38f, -1.03f, -0.38f, -1.41f, 0.02f)
                lineTo(0.88f, 12.88f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.07f, -0.01f, 4.23f)
                lineToRelative(5.41f, 5.59f)
                curveToRelative(0.2f, 0.2f, 0.46f, 0.3f, 0.72f, 0.3f)
                reflectiveCurveToRelative(0.5f, -0.09f, 0.7f, -0.28f)
                curveToRelative(0.4f, -0.38f, 0.41f, -1.02f, 0.02f, -1.41f)
                lineToRelative(-5.14f, -5.3f)
                horizontalLineTo(19.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _arrowTurnDownLeft!!
    }

private var _arrowTurnDownLeft: ImageVector? = null
