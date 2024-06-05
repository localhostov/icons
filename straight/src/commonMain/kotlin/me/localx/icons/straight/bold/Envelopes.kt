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

public val Icons.Bold.Envelopes: ImageVector
    get() {
        if (_envelopes != null) {
            return _envelopes!!
        }
        _envelopes = Builder(name = "Envelopes", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 1.0f)
                lineTo(8.5f, 1.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(12.5f)
                lineTo(24.0f, 17.0f)
                lineTo(24.0f, 4.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(20.5f, 4.0f)
                reflectiveCurveToRelative(0.04f, 0.0f, 0.05f, 0.0f)
                lineToRelative(-4.26f, 4.26f)
                curveToRelative(-0.94f, 0.95f, -2.59f, 0.95f, -3.54f, 0.0f)
                lineToRelative(-4.27f, -4.27f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.01f, 0.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(8.0f, 14.0f)
                lineTo(8.0f, 7.76f)
                lineToRelative(2.63f, 2.63f)
                curveToRelative(1.04f, 1.04f, 2.42f, 1.61f, 3.89f, 1.61f)
                reflectiveCurveToRelative(2.85f, -0.57f, 3.89f, -1.61f)
                lineToRelative(2.59f, -2.59f)
                verticalLineToRelative(6.2f)
                lineTo(8.0f, 14.0f)
                close()
                moveTo(3.0f, 19.0f)
                lineTo(19.0f, 19.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 9.5f)
                curveToRelative(0.0f, -1.76f, 1.31f, -3.2f, 3.0f, -3.45f)
                verticalLineToRelative(12.95f)
                close()
            }
        }
        .build()
        return _envelopes!!
    }

private var _envelopes: ImageVector? = null
