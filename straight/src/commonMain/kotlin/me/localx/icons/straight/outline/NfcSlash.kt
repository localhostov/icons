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

public val Icons.Outline.NfcSlash: ImageVector
    get() {
        if (_nfcSlash != null) {
            return _nfcSlash!!
        }
        _nfcSlash = Builder(name = "NfcSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 11.24f)
                verticalLineToRelative(5.76f)
                horizontalLineToRelative(5.76f)
                lineToRelative(2.0f, 2.0f)
                lineTo(5.0f, 19.0f)
                lineTo(5.0f, 9.24f)
                lineToRelative(2.0f, 2.0f)
                close()
                moveTo(3.0f, 21.0f)
                lineTo(3.0f, 7.24f)
                lineTo(1.0f, 5.24f)
                lineTo(1.0f, 23.0f)
                lineTo(18.76f, 23.0f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(3.0f, 21.0f)
                close()
                moveTo(23.96f, 22.54f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineToRelative(1.27f, 1.27f)
                curveToRelative(0.4f, -0.19f, 0.83f, -0.31f, 1.28f, -0.31f)
                lineTo(20.0f, 1.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                lineTo(23.0f, 21.59f)
                lineToRelative(0.96f, 0.96f)
                close()
                moveTo(4.41f, 3.0f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(3.82f)
                lineToRelative(-1.91f, 1.91f)
                lineToRelative(1.18f, 1.18f)
                lineToRelative(3.09f, -3.09f)
                horizontalLineToRelative(6.41f)
                verticalLineToRelative(12.59f)
                lineToRelative(2.0f, 2.0f)
                lineTo(21.0f, 4.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(4.41f, 3.0f)
                close()
                moveTo(17.0f, 7.0f)
                horizontalLineToRelative(-3.59f)
                lineToRelative(-2.41f, 2.41f)
                verticalLineToRelative(0.17f)
                lineToRelative(6.0f, 6.0f)
                lineTo(17.0f, 7.0f)
                close()
            }
        }
        .build()
        return _nfcSlash!!
    }

private var _nfcSlash: ImageVector? = null
