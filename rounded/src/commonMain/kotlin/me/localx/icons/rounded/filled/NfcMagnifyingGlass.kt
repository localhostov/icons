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

public val Icons.Filled.NfcMagnifyingGlass: ImageVector
    get() {
        if (_nfcMagnifyingGlass != null) {
            return _nfcMagnifyingGlass!!
        }
        _nfcMagnifyingGlass = Builder(name = "NfcMagnifyingGlass", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.71f, 22.29f)
                lineToRelative(-2.54f, -2.54f)
                curveToRelative(0.52f, -0.79f, 0.83f, -1.74f, 0.83f, -2.75f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.24f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f)
                curveToRelative(1.02f, 0.0f, 1.96f, -0.31f, 2.75f, -0.83f)
                lineToRelative(2.54f, 2.54f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                close()
                moveTo(15.0f, 10.29f)
                verticalLineToRelative(-0.29f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.26f)
                curveToRelative(-0.68f, 0.47f, -1.27f, 1.06f, -1.74f, 1.74f)
                horizontalLineToRelative(-2.26f)
                verticalLineToRelative(-3.67f)
                curveToRelative(0.0f, -0.27f, 0.1f, -0.52f, 0.29f, -0.71f)
                lineToRelative(3.33f, -3.33f)
                curveToRelative(0.19f, -0.19f, 0.44f, -0.29f, 0.71f, -0.29f)
                horizontalLineToRelative(3.67f)
                verticalLineToRelative(5.0f)
                curveToRelative(-0.7f, 0.0f, -1.37f, 0.1f, -2.0f, 0.29f)
                close()
                moveTo(10.29f, 19.0f)
                curveToRelative(0.34f, 1.15f, 0.97f, 2.18f, 1.81f, 3.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                lineTo(0.0f, 5.0f)
                curveTo(0.0f, 2.24f, 2.24f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                verticalLineToRelative(7.11f)
                curveToRelative(-0.82f, -0.84f, -1.85f, -1.47f, -3.0f, -1.81f)
                lineTo(19.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-3.67f)
                curveToRelative(-0.8f, 0.0f, -1.55f, 0.31f, -2.12f, 0.88f)
                lineToRelative(-3.33f, 3.33f)
                curveToRelative(-0.57f, 0.57f, -0.88f, 1.32f, -0.88f, 2.12f)
                verticalLineToRelative(3.67f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(1.29f)
                curveToRelative(-0.19f, 0.63f, -0.29f, 1.3f, -0.29f, 2.0f)
                lineTo(5.0f, 17.0f)
                lineTo(5.0f, 7.81f)
                lineToRelative(2.71f, -3.1f)
                curveToRelative(0.29f, -0.29f, 0.37f, -0.72f, 0.22f, -1.09f)
                curveToRelative(-0.15f, -0.37f, -0.52f, -0.62f, -0.92f, -0.62f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(5.29f)
                close()
            }
        }
        .build()
        return _nfcMagnifyingGlass!!
    }

private var _nfcMagnifyingGlass: ImageVector? = null
