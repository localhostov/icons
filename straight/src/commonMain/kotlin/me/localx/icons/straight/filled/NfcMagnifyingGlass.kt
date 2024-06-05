package me.localx.icons.straight.filled

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
                moveTo(23.96f, 22.54f)
                lineToRelative(-2.79f, -2.79f)
                curveToRelative(0.52f, -0.79f, 0.83f, -1.74f, 0.83f, -2.75f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.24f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f)
                curveToRelative(1.02f, 0.0f, 1.96f, -0.31f, 2.75f, -0.83f)
                lineToRelative(2.79f, 2.79f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(12.41f, 5.0f)
                horizontalLineToRelative(4.59f)
                verticalLineToRelative(5.0f)
                curveToRelative(-1.91f, 0.0f, -3.63f, 0.76f, -4.89f, 2.0f)
                horizontalLineToRelative(-2.11f)
                lineTo(10.0f, 7.41f)
                lineToRelative(2.41f, -2.41f)
                close()
                moveTo(12.1f, 22.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.35f, 1.35f, 0.0f, 3.0f, 0.0f)
                lineTo(19.0f, 0.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                lineTo(22.0f, 12.11f)
                curveToRelative(-0.82f, -0.84f, -1.85f, -1.47f, -3.0f, -1.81f)
                lineTo(19.0f, 3.0f)
                horizontalLineToRelative(-7.41f)
                lineToRelative(-3.59f, 3.59f)
                verticalLineToRelative(7.41f)
                horizontalLineToRelative(2.68f)
                curveToRelative(-0.43f, 0.91f, -0.68f, 1.92f, -0.68f, 3.0f)
                lineTo(5.0f, 17.0f)
                lineTo(5.0f, 6.09f)
                lineToRelative(3.23f, -3.09f)
                lineTo(3.0f, 3.0f)
                lineTo(3.0f, 19.0f)
                horizontalLineToRelative(7.29f)
                curveToRelative(0.34f, 1.15f, 0.97f, 2.18f, 1.81f, 3.0f)
                close()
            }
        }
        .build()
        return _nfcMagnifyingGlass!!
    }

private var _nfcMagnifyingGlass: ImageVector? = null
