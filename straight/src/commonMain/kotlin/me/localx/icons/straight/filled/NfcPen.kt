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

public val Icons.Filled.NfcPen: ImageVector
    get() {
        if (_nfcPen != null) {
            return _nfcPen!!
        }
        _nfcPen = Builder(name = "NfcPen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 19.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.35f, 1.35f, 0.0f, 3.0f, 0.0f)
                lineTo(19.0f, 0.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(7.05f)
                curveToRelative(-0.18f, -0.02f, -0.36f, -0.05f, -0.54f, -0.05f)
                curveToRelative(-0.89f, 0.0f, -1.73f, 0.26f, -2.46f, 0.73f)
                lineTo(19.0f, 3.0f)
                horizontalLineToRelative(-7.41f)
                lineToRelative(-3.59f, 3.59f)
                verticalLineToRelative(7.41f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.0f, 7.41f)
                lineToRelative(2.41f, -2.41f)
                horizontalLineToRelative(4.59f)
                verticalLineToRelative(7.58f)
                lineToRelative(-4.42f, 4.42f)
                lineTo(5.0f, 17.0f)
                lineTo(5.0f, 6.09f)
                lineToRelative(3.23f, -3.09f)
                lineTo(3.0f, 3.0f)
                lineTo(3.0f, 19.0f)
                close()
                moveTo(23.26f, 12.74f)
                curveToRelative(-0.99f, -0.99f, -2.6f, -0.99f, -3.59f, 0.0f)
                lineToRelative(-7.67f, 7.67f)
                verticalLineToRelative(3.59f)
                horizontalLineToRelative(3.59f)
                lineToRelative(7.67f, -7.67f)
                curveToRelative(0.48f, -0.48f, 0.74f, -1.12f, 0.74f, -1.8f)
                reflectiveCurveToRelative(-0.26f, -1.32f, -0.74f, -1.79f)
                close()
            }
        }
        .build()
        return _nfcPen!!
    }

private var _nfcPen: ImageVector? = null
