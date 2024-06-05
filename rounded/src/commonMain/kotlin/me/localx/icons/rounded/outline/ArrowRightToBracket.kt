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

public val Icons.Outline.ArrowRightToBracket: ImageVector
    get() {
        if (_arrowRightToBracket != null) {
            return _arrowRightToBracket!!
        }
        _arrowRightToBracket = Builder(name = "ArrowRightToBracket", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                lineTo(22.0f, 5.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                close()
                moveTo(18.0f, 12.0f)
                curveToRelative(0.0f, -0.8f, -0.31f, -1.55f, -0.87f, -2.11f)
                lineToRelative(-4.41f, -4.59f)
                curveToRelative(-0.38f, -0.4f, -1.02f, -0.41f, -1.41f, -0.03f)
                curveToRelative(-0.4f, 0.38f, -0.41f, 1.02f, -0.03f, 1.41f)
                lineToRelative(4.15f, 4.31f)
                lineTo(1.0f, 10.99f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                lineTo(15.42f, 12.99f)
                lineToRelative(-4.15f, 4.31f)
                curveToRelative(-0.38f, 0.4f, -0.37f, 1.03f, 0.03f, 1.41f)
                curveToRelative(0.19f, 0.19f, 0.44f, 0.28f, 0.69f, 0.28f)
                curveToRelative(0.26f, 0.0f, 0.52f, -0.1f, 0.72f, -0.31f)
                lineToRelative(4.4f, -4.57f)
                curveToRelative(0.57f, -0.57f, 0.88f, -1.32f, 0.88f, -2.12f)
                close()
            }
        }
        .build()
        return _arrowRightToBracket!!
    }

private var _arrowRightToBracket: ImageVector? = null
