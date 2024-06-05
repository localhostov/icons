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

public val Icons.Filled.NfcPen: ImageVector
    get() {
        if (_nfcPen != null) {
            return _nfcPen!!
        }
        _nfcPen = Builder(name = "NfcPen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.27f, 19.48f)
                curveToRelative(-0.81f, 0.81f, -1.27f, 1.92f, -1.27f, 3.06f)
                verticalLineToRelative(1.45f)
                horizontalLineToRelative(1.45f)
                curveToRelative(1.15f, 0.0f, 2.25f, -0.46f, 3.06f, -1.27f)
                lineToRelative(6.81f, -6.81f)
                curveToRelative(0.9f, -0.9f, 0.9f, -2.35f, 0.0f, -3.25f)
                curveToRelative(-0.9f, -0.9f, -2.35f, -0.9f, -3.25f, 0.0f)
                lineToRelative(-6.81f, 6.81f)
                close()
                moveTo(10.03f, 22.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                lineTo(0.0f, 5.0f)
                curveTo(0.0f, 2.24f, 2.24f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                verticalLineToRelative(5.03f)
                curveToRelative(-0.1f, 0.0f, -0.2f, -0.03f, -0.3f, -0.03f)
                curveToRelative(-1.0f, 0.0f, -1.94f, 0.36f, -2.7f, 0.98f)
                lineTo(19.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-3.67f)
                curveToRelative(-0.8f, 0.0f, -1.56f, 0.32f, -2.12f, 0.88f)
                lineToRelative(-3.33f, 3.33f)
                curveToRelative(-0.56f, 0.56f, -0.88f, 1.33f, -0.88f, 2.12f)
                verticalLineToRelative(3.67f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.67f)
                curveToRelative(0.0f, -0.27f, 0.11f, -0.52f, 0.29f, -0.71f)
                lineToRelative(3.33f, -3.33f)
                curveToRelative(0.19f, -0.19f, 0.44f, -0.29f, 0.71f, -0.29f)
                horizontalLineToRelative(3.67f)
                verticalLineToRelative(7.92f)
                lineToRelative(-4.08f, 4.08f)
                lineTo(5.0f, 17.0f)
                lineTo(5.0f, 7.81f)
                lineToRelative(2.71f, -3.1f)
                curveToRelative(0.29f, -0.29f, 0.37f, -0.72f, 0.22f, -1.09f)
                curveToRelative(-0.15f, -0.37f, -0.52f, -0.62f, -0.92f, -0.62f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(6.09f)
                curveToRelative(-0.6f, 0.89f, -0.97f, 1.92f, -1.06f, 3.0f)
                close()
            }
        }
        .build()
        return _nfcPen!!
    }

private var _nfcPen: ImageVector? = null
