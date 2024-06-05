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

public val Icons.Bold.NfcSlash: ImageVector
    get() {
        if (_nfcSlash != null) {
            return _nfcSlash!!
        }
        _nfcSlash = Builder(name = "NfcSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 20.88f)
                lineTo(23.0f, 4.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(4.5f, 1.0f)
                curveToRelative(-0.4f, 0.0f, -0.8f, 0.07f, -1.18f, 0.2f)
                lineTo(2.16f, 0.04f)
                lineTo(0.04f, 2.16f)
                lineTo(21.84f, 23.96f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-0.96f, -0.96f)
                close()
                moveTo(19.5f, 4.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(13.38f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(18.0f, 6.0f)
                horizontalLineToRelative(-2.55f)
                lineToRelative(-3.0f, 3.0f)
                horizontalLineToRelative(2.55f)
                verticalLineToRelative(3.88f)
                lineToRelative(-4.63f, -4.63f)
                lineToRelative(2.25f, -2.25f)
                horizontalLineToRelative(-4.5f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(13.38f)
                close()
                moveTo(9.0f, 13.95f)
                verticalLineToRelative(1.05f)
                horizontalLineToRelative(1.05f)
                lineToRelative(3.0f, 3.0f)
                lineTo(6.0f, 18.0f)
                verticalLineToRelative(-7.05f)
                lineToRelative(3.0f, 3.0f)
                close()
                moveTo(15.05f, 20.0f)
                lineToRelative(3.0f, 3.0f)
                lineTo(1.0f, 23.0f)
                lineTo(1.0f, 5.95f)
                lineToRelative(3.0f, 3.0f)
                verticalLineToRelative(11.05f)
                lineTo(15.05f, 20.0f)
                close()
            }
        }
        .build()
        return _nfcSlash!!
    }

private var _nfcSlash: ImageVector? = null
