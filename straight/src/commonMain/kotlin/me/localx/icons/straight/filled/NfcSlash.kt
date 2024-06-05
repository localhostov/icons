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
                moveTo(15.76f, 20.0f)
                lineToRelative(3.0f, 3.0f)
                lineTo(1.0f, 23.0f)
                lineTo(1.0f, 5.24f)
                lineToRelative(3.0f, 3.0f)
                verticalLineToRelative(11.76f)
                lineTo(15.76f, 20.0f)
                close()
                moveTo(6.0f, 10.24f)
                verticalLineToRelative(7.76f)
                horizontalLineToRelative(7.76f)
                lineToRelative(-3.0f, -3.0f)
                horizontalLineToRelative(-1.76f)
                verticalLineToRelative(-1.76f)
                lineToRelative(-3.0f, -3.0f)
                close()
                moveTo(23.96f, 22.54f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineToRelative(1.26f, 1.26f)
                curveToRelative(0.39f, -0.19f, 0.82f, -0.3f, 1.29f, -0.3f)
                lineTo(20.0f, 1.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                lineTo(23.0f, 21.59f)
                lineToRelative(0.96f, 0.96f)
                close()
                moveTo(9.41f, 4.0f)
                lineTo(5.41f, 4.0f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(2.0f, -2.0f)
                close()
                moveTo(15.0f, 10.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.59f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(-3.59f)
                close()
                moveTo(20.0f, 4.0f)
                horizontalLineToRelative(-6.91f)
                lineToRelative(-3.84f, 3.84f)
                lineToRelative(1.75f, 1.75f)
                verticalLineToRelative(-0.67f)
                lineToRelative(2.91f, -2.91f)
                horizontalLineToRelative(4.09f)
                verticalLineToRelative(10.59f)
                lineToRelative(2.0f, 2.0f)
                lineTo(20.0f, 4.0f)
                close()
            }
        }
        .build()
        return _nfcSlash!!
    }

private var _nfcSlash: ImageVector? = null
