package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.NfcMagnifyingGlass: ImageVector
    get() {
        if (_nfcMagnifyingGlass != null) {
            return _nfcMagnifyingGlass!!
        }
        _nfcMagnifyingGlass = Builder(name = "NfcMagnifyingGlass", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 10.68f)
                verticalLineToRelative(-2.68f)
                horizontalLineToRelative(-2.55f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(2.55f)
                verticalLineToRelative(5.0f)
                curveToRelative(-1.08f, 0.0f, -2.09f, 0.25f, -3.0f, 0.68f)
                close()
                moveTo(3.0f, 19.0f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(6.79f)
                curveToRelative(1.15f, 0.34f, 2.18f, 0.97f, 3.0f, 1.81f)
                lineTo(22.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                lineTo(0.0f, 22.0f)
                lineTo(12.11f, 22.0f)
                curveToRelative(-0.84f, -0.82f, -1.47f, -1.85f, -1.81f, -3.0f)
                lineTo(3.0f, 19.0f)
                close()
                moveTo(21.79f, 23.91f)
                lineToRelative(-2.47f, -2.47f)
                curveToRelative(-0.69f, 0.36f, -1.48f, 0.57f, -2.31f, 0.57f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f)
                curveToRelative(0.0f, 0.83f, -0.21f, 1.62f, -0.57f, 2.31f)
                lineToRelative(2.47f, 2.47f)
                lineToRelative(-2.12f, 2.12f)
                close()
                moveTo(19.0f, 17.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                close()
                moveTo(11.62f, 5.0f)
                lineTo(5.0f, 5.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.0f, -1.08f, 0.25f, -2.09f, 0.68f, -3.0f)
                horizontalLineToRelative(-2.68f)
                verticalLineToRelative(-5.38f)
                lineToRelative(3.62f, -3.62f)
                close()
            }
        }
        .build()
        return _nfcMagnifyingGlass!!
    }

private var _nfcMagnifyingGlass: ImageVector? = null
