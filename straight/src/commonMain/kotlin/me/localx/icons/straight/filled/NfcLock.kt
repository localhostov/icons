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

public val Icons.Filled.NfcLock: ImageVector
    get() {
        if (_nfcLock != null) {
            return _nfcLock!!
        }
        _nfcLock = Builder(name = "NfcLock", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(19.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(12.41f, 5.0f)
                horizontalLineToRelative(4.59f)
                verticalLineToRelative(2.09f)
                curveToRelative(-2.51f, 0.42f, -4.49f, 2.4f, -4.92f, 4.91f)
                horizontalLineToRelative(-2.08f)
                lineTo(10.0f, 7.41f)
                lineToRelative(2.41f, -2.41f)
                close()
                moveTo(10.1f, 22.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.35f, 1.35f, 0.0f, 3.0f, 0.0f)
                lineTo(19.0f, 0.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(5.54f)
                reflectiveCurveToRelative(0.0f, 0.0f, -0.01f, 0.0f)
                curveToRelative(-0.82f, -0.74f, -1.85f, -1.25f, -2.99f, -1.44f)
                lineTo(19.0f, 3.0f)
                horizontalLineToRelative(-7.41f)
                lineToRelative(-3.59f, 3.59f)
                verticalLineToRelative(7.41f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 17.0f)
                lineTo(5.0f, 6.09f)
                lineToRelative(3.23f, -3.09f)
                lineTo(3.0f, 3.0f)
                lineTo(3.0f, 19.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.34f, 0.04f, 0.68f, 0.1f, 1.0f)
                close()
            }
        }
        .build()
        return _nfcLock!!
    }

private var _nfcLock: ImageVector? = null
