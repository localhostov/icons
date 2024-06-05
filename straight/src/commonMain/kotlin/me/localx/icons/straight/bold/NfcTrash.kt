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

public val Icons.Bold.NfcTrash: ImageVector
    get() {
        if (_nfcTrash != null) {
            return _nfcTrash!!
        }
        _nfcTrash = Builder(name = "NfcTrash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 19.0f)
                lineTo(11.0f, 19.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(5.88f)
                curveToRelative(-0.73f, -0.84f, -1.8f, -1.38f, -3.0f, -1.38f)
                lineTo(19.0f, 3.5f)
                curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(15.5f)
                close()
                moveTo(11.62f, 5.0f)
                lineTo(5.0f, 5.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.38f)
                lineToRelative(3.62f, -3.62f)
                close()
                moveTo(24.0f, 15.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(20.0f, 15.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(14.0f, 9.38f)
                curveToRelative(0.73f, -0.84f, 1.8f, -1.38f, 3.0f, -1.38f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.55f)
                lineToRelative(-3.0f, 3.0f)
                horizontalLineToRelative(2.55f)
                verticalLineToRelative(1.38f)
                close()
            }
        }
        .build()
        return _nfcTrash!!
    }

private var _nfcTrash: ImageVector? = null
