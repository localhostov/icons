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

public val Icons.Bold.NfcLock: ImageVector
    get() {
        if (_nfcLock != null) {
            return _nfcLock!!
        }
        _nfcLock = Builder(name = "NfcLock", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.08f, 8.0f)
                horizontalLineToRelative(-3.63f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(2.55f)
                verticalLineToRelative(2.18f)
                curveToRelative(-0.69f, 0.16f, -1.34f, 0.45f, -1.92f, 0.82f)
                close()
                moveTo(24.0f, 15.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(17.0f, 15.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(20.0f, 18.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3.53f)
                curveToRelative(1.1f, 0.08f, 2.12f, 0.44f, 3.0f, 1.01f)
                lineTo(22.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                lineTo(0.0f, 22.0f)
                lineTo(11.0f, 22.0f)
                verticalLineToRelative(-3.0f)
                lineTo(3.0f, 19.0f)
                lineTo(3.0f, 3.5f)
                close()
                moveTo(8.0f, 8.62f)
                lineToRelative(3.62f, -3.62f)
                lineTo(5.0f, 5.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.38f)
                close()
            }
        }
        .build()
        return _nfcLock!!
    }

private var _nfcLock: ImageVector? = null
