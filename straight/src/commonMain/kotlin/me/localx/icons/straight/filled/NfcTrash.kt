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

public val Icons.Filled.NfcTrash: ImageVector
    get() {
        if (_nfcTrash != null) {
            return _nfcTrash!!
        }
        _nfcTrash = Builder(name = "NfcTrash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(17.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(22.0f, 3.0f)
                verticalLineToRelative(5.37f)
                curveToRelative(-0.73f, -0.83f, -1.8f, -1.37f, -3.0f, -1.37f)
                lineTo(19.0f, 3.0f)
                horizontalLineToRelative(-7.41f)
                lineToRelative(-3.59f, 3.59f)
                verticalLineToRelative(7.41f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 17.0f)
                lineTo(5.0f, 6.09f)
                lineToRelative(3.23f, -3.09f)
                lineTo(3.0f, 3.0f)
                lineTo(3.0f, 19.0f)
                lineTo(11.0f, 19.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.34f, 0.04f, 0.68f, 0.1f, 1.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.35f, 1.35f, 0.0f, 3.0f, 0.0f)
                lineTo(19.0f, 0.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                close()
                moveTo(12.41f, 5.0f)
                horizontalLineToRelative(4.59f)
                verticalLineToRelative(2.0f)
                curveToRelative(-1.86f, 0.0f, -3.43f, 1.28f, -3.87f, 3.0f)
                horizontalLineToRelative(-3.13f)
                verticalLineToRelative(-2.59f)
                lineToRelative(2.41f, -2.41f)
                close()
            }
        }
        .build()
        return _nfcTrash!!
    }

private var _nfcTrash: ImageVector? = null
