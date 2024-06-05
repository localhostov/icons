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

public val Icons.Bold.NfcPen: ImageVector
    get() {
        if (_nfcPen != null) {
            return _nfcPen!!
        }
        _nfcPen = Builder(name = "NfcPen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.09f, 17.0f)
                lineTo(5.0f, 17.0f)
                lineTo(5.0f, 5.0f)
                horizontalLineToRelative(6.62f)
                lineToRelative(-3.62f, 3.62f)
                verticalLineToRelative(5.38f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.55f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(2.55f)
                lineTo(17.0f, 14.09f)
                lineToRelative(-2.91f, 2.91f)
                close()
                moveTo(23.36f, 13.64f)
                curveToRelative(-0.85f, -0.85f, -2.23f, -0.85f, -3.09f, 0.0f)
                lineToRelative(-7.28f, 7.28f)
                verticalLineToRelative(3.09f)
                horizontalLineToRelative(3.09f)
                lineToRelative(7.28f, -7.28f)
                curveToRelative(0.85f, -0.85f, 0.85f, -2.23f, 0.0f, -3.09f)
                close()
                moveTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                lineTo(19.0f, 12.11f)
                curveToRelative(0.85f, -0.77f, 1.93f, -1.14f, 3.0f, -1.09f)
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
            }
        }
        .build()
        return _nfcPen!!
    }

private var _nfcPen: ImageVector? = null
