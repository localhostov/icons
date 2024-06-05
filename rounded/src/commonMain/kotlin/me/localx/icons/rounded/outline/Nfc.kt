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

public val Icons.Outline.Nfc: ImageVector
    get() {
        if (_nfc != null) {
            return _nfc!!
        }
        _nfc = Builder(name = "Nfc", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.24f, 0.0f, 0.0f, 2.24f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(22.0f, 19.0f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(20.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                lineTo(6.0f, 20.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                lineTo(4.0f, 6.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.4f, 0.0f, 0.77f, 0.24f, 0.92f, 0.62f)
                curveToRelative(0.16f, 0.37f, 0.07f, 0.8f, -0.22f, 1.09f)
                lineToRelative(-2.71f, 2.71f)
                verticalLineToRelative(9.59f)
                horizontalLineToRelative(12.0f)
                lineTo(17.99f, 6.0f)
                horizontalLineToRelative(-3.67f)
                curveToRelative(-0.26f, 0.0f, -0.52f, 0.11f, -0.71f, 0.29f)
                lineToRelative(-3.33f, 3.33f)
                curveToRelative(-0.19f, 0.19f, -0.29f, 0.44f, -0.29f, 0.71f)
                verticalLineToRelative(3.67f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineToRelative(-3.67f)
                curveToRelative(0.0f, -0.8f, 0.31f, -1.56f, 0.88f, -2.12f)
                lineToRelative(3.33f, -3.33f)
                curveToRelative(0.57f, -0.57f, 1.32f, -0.88f, 2.12f, -0.88f)
                horizontalLineToRelative(3.67f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _nfc!!
    }

private var _nfc: ImageVector? = null
