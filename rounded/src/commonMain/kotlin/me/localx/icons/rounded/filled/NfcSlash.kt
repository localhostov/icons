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

public val Icons.Filled.NfcSlash: ImageVector
    get() {
        if (_nfcSlash != null) {
            return _nfcSlash!!
        }
        _nfcSlash = Builder(name = "NfcSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.71f, 22.29f)
                lineToRelative(-1.54f, -1.54f)
                curveToRelative(0.52f, -0.79f, 0.84f, -1.73f, 0.84f, -2.75f)
                lineTo(23.01f, 6.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                lineTo(6.0f, 1.0f)
                curveToRelative(-1.02f, 0.0f, -1.96f, 0.31f, -2.75f, 0.84f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineTo(22.29f, 23.71f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                close()
                moveTo(14.33f, 4.0f)
                horizontalLineToRelative(3.67f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.18f, -0.03f, 0.35f, -0.07f, 0.51f)
                lineToRelative(-1.93f, -1.93f)
                lineTo(18.0f, 6.0f)
                horizontalLineToRelative(-3.67f)
                curveToRelative(-0.26f, 0.0f, -0.52f, 0.11f, -0.71f, 0.29f)
                lineToRelative(-2.96f, 2.96f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.96f, -2.96f)
                curveToRelative(0.57f, -0.57f, 1.32f, -0.88f, 2.12f, -0.88f)
                close()
                moveTo(14.0f, 12.59f)
                verticalLineToRelative(-1.59f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.18f, -0.03f, 0.35f, -0.07f, 0.51f)
                lineToRelative(-1.93f, -1.93f)
                close()
                moveTo(6.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.4f, 0.0f, 0.77f, 0.24f, 0.92f, 0.62f)
                curveToRelative(0.16f, 0.37f, 0.07f, 0.8f, -0.22f, 1.09f)
                lineToRelative(-0.74f, 0.85f)
                lineToRelative(-2.48f, -2.48f)
                curveToRelative(0.16f, -0.04f, 0.33f, -0.07f, 0.51f, -0.07f)
                close()
                moveTo(15.82f, 20.0f)
                lineToRelative(2.92f, 2.92f)
                curveToRelative(-0.24f, 0.04f, -0.49f, 0.08f, -0.74f, 0.08f)
                lineTo(6.0f, 23.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                lineTo(1.0f, 6.0f)
                curveToRelative(0.0f, -0.25f, 0.04f, -0.5f, 0.08f, -0.74f)
                lineToRelative(2.92f, 2.92f)
                verticalLineToRelative(9.82f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                lineTo(15.82f, 20.0f)
                close()
                moveTo(8.0f, 12.18f)
                verticalLineToRelative(1.82f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(1.82f)
                lineToRelative(2.0f, 2.0f)
                lineTo(6.0f, 18.0f)
                verticalLineToRelative(-7.82f)
                lineToRelative(2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _nfcSlash!!
    }

private var _nfcSlash: ImageVector? = null
