package me.localx.icons.straight.outline

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

public val Icons.Outline.NfcMagnifyingGlass: ImageVector
    get() {
        if (_nfcMagnifyingGlass != null) {
            return _nfcMagnifyingGlass!!
        }
        _nfcMagnifyingGlass = Builder(name = "NfcMagnifyingGlass", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 9.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.59f)
                lineToRelative(-2.41f, 2.41f)
                verticalLineToRelative(4.03f)
                curveToRelative(-0.29f, 0.49f, -0.54f, 1.0f, -0.71f, 1.56f)
                horizontalLineToRelative(-1.29f)
                lineTo(8.0f, 7.59f)
                lineToRelative(3.59f, -3.59f)
                horizontalLineToRelative(6.41f)
                verticalLineToRelative(5.29f)
                curveToRelative(-0.63f, -0.19f, -1.3f, -0.29f, -2.0f, -0.29f)
                close()
                moveTo(10.26f, 20.0f)
                lineTo(2.0f, 20.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                lineTo(19.0f, 2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(7.26f)
                curveToRelative(0.81f, 0.57f, 1.49f, 1.3f, 2.0f, 2.15f)
                lineTo(22.0f, 3.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.35f, 0.0f, 0.0f, 1.35f, 0.0f, 3.0f)
                lineTo(0.0f, 22.0f)
                lineTo(12.41f, 22.0f)
                curveToRelative(-0.85f, -0.51f, -1.58f, -1.19f, -2.15f, -2.0f)
                close()
                moveTo(9.23f, 4.0f)
                lineTo(4.0f, 4.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(5.29f)
                curveToRelative(-0.19f, -0.63f, -0.29f, -1.3f, -0.29f, -2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(6.0f, 7.09f)
                lineToRelative(3.23f, -3.09f)
                close()
                moveTo(22.54f, 23.96f)
                lineToRelative(-3.79f, -3.79f)
                curveToRelative(-0.79f, 0.52f, -1.74f, 0.83f, -2.75f, 0.83f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f)
                curveToRelative(0.0f, 1.02f, -0.31f, 1.96f, -0.83f, 2.75f)
                lineToRelative(3.79f, 3.79f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveTo(19.0f, 16.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.35f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.35f, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _nfcMagnifyingGlass!!
    }

private var _nfcMagnifyingGlass: ImageVector? = null
