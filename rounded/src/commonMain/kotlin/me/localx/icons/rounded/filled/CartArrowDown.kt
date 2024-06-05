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

public val Icons.Filled.CartArrowDown: ImageVector
    get() {
        if (_cartArrowDown != null) {
            return _cartArrowDown!!
        }
        _cartArrowDown = Builder(name = "CartArrowDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                close()
                moveTo(17.0f, 20.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(23.32f, 4.1f)
                curveToRelative(-0.57f, -0.7f, -1.42f, -1.1f, -2.32f, -1.1f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(6.5f)
                lineToRelative(1.32f, -1.23f)
                curveToRelative(0.41f, -0.38f, 1.04f, -0.36f, 1.41f, 0.05f)
                curveToRelative(0.38f, 0.4f, 0.35f, 1.04f, -0.05f, 1.41f)
                lineToRelative(-1.59f, 1.48f)
                curveToRelative(-0.57f, 0.57f, -1.33f, 0.86f, -2.09f, 0.86f)
                reflectiveCurveToRelative(-1.54f, -0.29f, -2.13f, -0.88f)
                lineToRelative(-1.56f, -1.46f)
                curveToRelative(-0.4f, -0.38f, -0.42f, -1.01f, -0.05f, -1.41f)
                curveToRelative(0.38f, -0.4f, 1.01f, -0.43f, 1.41f, -0.05f)
                lineToRelative(1.32f, 1.23f)
                lineTo(11.99f, 3.0f)
                lineTo(5.24f, 3.0f)
                lineToRelative(-0.04f, -0.35f)
                curveToRelative(-0.18f, -1.51f, -1.46f, -2.65f, -2.98f, -2.65f)
                lineTo(1.0f, 0.0f)
                curveTo(0.45f, 0.0f, 0.0f, 0.45f, 0.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.22f)
                curveToRelative(0.51f, 0.0f, 0.93f, 0.38f, 0.99f, 0.88f)
                lineToRelative(1.38f, 11.7f)
                curveToRelative(0.3f, 2.52f, 2.43f, 4.42f, 4.97f, 4.42f)
                horizontalLineToRelative(9.44f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(9.56f, 17.0f)
                curveToRelative(-1.29f, 0.0f, -2.4f, -0.83f, -2.82f, -2.0f)
                horizontalLineToRelative(11.42f)
                curveToRelative(2.38f, 0.0f, 4.44f, -1.69f, 4.9f, -4.02f)
                lineToRelative(0.88f, -4.39f)
                curveToRelative(0.18f, -0.88f, -0.05f, -1.79f, -0.62f, -2.49f)
                close()
            }
        }
        .build()
        return _cartArrowDown!!
    }

private var _cartArrowDown: ImageVector? = null
