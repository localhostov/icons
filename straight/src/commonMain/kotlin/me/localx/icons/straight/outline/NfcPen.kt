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

public val Icons.Outline.NfcPen: ImageVector
    get() {
        if (_nfcPen != null) {
            return _nfcPen!!
        }
        _nfcPen = Builder(name = "NfcPen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.12f, 11.88f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0.0f)
                lineToRelative(-7.88f, 7.88f)
                verticalLineToRelative(4.24f)
                horizontalLineToRelative(4.24f)
                lineToRelative(7.88f, -7.88f)
                curveToRelative(0.57f, -0.57f, 0.88f, -1.32f, 0.88f, -2.12f)
                reflectiveCurveToRelative(-0.31f, -1.55f, -0.88f, -2.12f)
                close()
                moveTo(21.71f, 14.71f)
                lineToRelative(-7.29f, 7.29f)
                horizontalLineToRelative(-1.41f)
                verticalLineToRelative(-1.41f)
                lineToRelative(7.29f, -7.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                curveToRelative(0.19f, 0.19f, 0.29f, 0.44f, 0.29f, 0.71f)
                reflectiveCurveToRelative(-0.1f, 0.52f, -0.29f, 0.71f)
                close()
                moveTo(11.93f, 16.0f)
                lineToRelative(-2.0f, 2.0f)
                lineTo(4.0f, 18.0f)
                lineTo(4.0f, 4.0f)
                horizontalLineToRelative(5.23f)
                lineToRelative(-3.23f, 3.09f)
                verticalLineToRelative(8.91f)
                horizontalLineToRelative(5.93f)
                close()
                moveTo(16.0f, 11.93f)
                lineTo(16.0f, 6.0f)
                horizontalLineToRelative(-3.59f)
                lineToRelative(-2.41f, 2.41f)
                verticalLineToRelative(5.59f)
                horizontalLineToRelative(-2.0f)
                lineTo(8.0f, 7.59f)
                lineToRelative(3.59f, -3.59f)
                horizontalLineToRelative(6.41f)
                verticalLineToRelative(6.03f)
                curveToRelative(-0.18f, 0.14f, -0.37f, 0.27f, -0.54f, 0.44f)
                lineToRelative(-1.46f, 1.46f)
                close()
                moveTo(2.0f, 20.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.35f, 1.35f, 0.0f, 3.0f, 0.0f)
                lineTo(19.0f, 0.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(6.11f)
                curveToRelative(-0.66f, -0.13f, -1.34f, -0.13f, -2.0f, 0.0f)
                lineTo(20.0f, 3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                lineTo(2.0f, 20.0f)
                close()
            }
        }
        .build()
        return _nfcPen!!
    }

private var _nfcPen: ImageVector? = null
